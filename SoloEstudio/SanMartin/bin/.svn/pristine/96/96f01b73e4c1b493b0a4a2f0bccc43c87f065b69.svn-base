package SegundoSemestreListadoCiudades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JComboBox;

public class Archivos
{
	public Archivos(){}

	public String []Archivos(int fila)
	{
		CiudadesColombia objciudad = new CiudadesColombia();
		String [] ciudades = new String [fila];
		try
		{
			String lineaArchivo = ("D://PROYECTOS_JAVA/PROY_ECLIPSE/SoloEstudio/SanMartin/bin/Archivos/Ciudades.txt");
			File archivo = new File(lineaArchivo);
			// creacion del objeto que vamos a leer
			FileReader lectorArchivo  = new FileReader(archivo);
			BufferedReader br = new BufferedReader(lectorArchivo);
			String lineas=""; // se  usa para guardar toda la lectura del archivo
			
			String aux=br.readLine();
			
			while (lineas!=null)
			{
				int i=0;
				lineas=br.readLine();
				for (i = 0; i < ciudades.length; i++)
				{
					ciudades[i]=aux;
				}
				//objciudad.cmbCiudad.setSelectedItem(ciudades);
			}
			br.close();
		return ciudades;
			} catch (FileNotFoundException e)
			{
				return ciudades;
			}
		catch (Exception e) {
			return ciudades;
		}
		}
}
