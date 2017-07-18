package ConvertidorArchivos;

import java.io.*;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class LibroExcel
{
	Workbook archivo = null;
	WritableWorkbook libro = null;

	public void cargarArchivo(String direccion)
	{
		try
		{
			File directorio = new File(direccion);
			File[] archivos = directorio.listFiles();

			for (int i = 0; i < archivos.length; i++)
			{
				FileReader fileR = new FileReader(archivos[i]);
				BufferedReader linea = new BufferedReader(fileR);
				libro = Workbook.createWorkbook(new File(archivos[i] + ".xls"));
				lineaLlena(linea);
			}
		} 
		catch (Exception e)
		{
			e.getMessage();
			try
			{
				libro.write();
				libro.close();
			} catch (Exception e2)
			{}
		}
	}

	void crearExcel(int i, String[] linea)
	{
		WritableSheet hoja = null;
		try
		{
			if (i == 0)
			{
				hoja = libro.createSheet("HojaEjemplo", 0);
			} else
			{
				hoja = libro.getSheet(0);
			}
			for (int j = 0; j < linea.length; j++)
			{
				hoja.addCell(new jxl.write.Label(j, i, linea[j]));
			}
		} 
		catch (Exception e)
		{}
	}

	public void lineaLlena(BufferedReader linea) throws Exception
	{
		String lineas = "";
		int n = 0;
		try
		{
			while (lineas != null)
			{
				lineas = linea.readLine().toString();
				crearExcel(n, lineas.trim().split(";"));
				n = n + 1;
			}
			libro.write();
			libro.close();
			
		} catch (Exception e)
		{
			libro.write();
			libro.close();
		}
	}

	public static void main(String[] args)
	{
		LibroExcel obj = new LibroExcel();
		String dir = "D:\\GIOVANNI\\archivos";
		obj.cargarArchivo(dir);
	}
}