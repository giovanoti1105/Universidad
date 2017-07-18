package Loteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

/**
 * @author oscar_giovanni clase que permite cargar un archivo de sistema
 */

public class cargaDeArchivo
{
	String[] datos = null;
	String linea;
	int[][] matriz = null;
	int cantidadElementos = 0;

	// funcion que cargara el archivo y retornara la matriz con los datos
	// cargados en resultadosganadores.txt
	int[][] cargaDeArchivoMatriz(String rutaArchivo)
    {
    	int nFil=0;
    	int nCol=0;
	rutaArchivo="G:\\archvos\\resultadosganadores.txt";
	try
	{
	    File objArchivo = new File(rutaArchivo); // cargando archivo
	    FileReader frArchivo = new FileReader(objArchivo); // carga objeto Filereader
	    BufferedReader objbfcarga = new BufferedReader(frArchivo);// creacion de bufer de lectura
	    
	    //calcular las dimensiones de la matriz
	    linea = objbfcarga.readLine();
	    StringTokenizer st = new StringTokenizer (linea, " ");
	    nCol = st.countTokens(); // indica la cantidad de columnas
	    
	    while (linea != null)
	    {
	    	System.out.println(linea);
		    nFil++;
	    	linea=objbfcarga.readLine();
	    }
	    matriz= new int [nFil][nCol];
	    // Rellenando la matriz
	    System.out.println("**************************");
	    System.out.println("la matriz es de dimension " + nFil + " * " + nCol);
	    int numerocasilla;
		// recorremos matriz para asignar valores
		for (int i = 0; i < matriz[i].length; i++)
	    {	
		for (int j=0 ; j < nCol; j++)
		{
		    numerocasilla =Integer.parseInt((String) st.nextElement());
		    matriz[i][j] = numerocasilla; 
		    System.out.print(matriz[i][j] + " ");
		}
		linea=objbfcarga.readLine();
	    }
		System.out.println("la matriz es de dimension " + nFil + " * " + nCol);
		//objbfcarga.close();
		//frArchivo.close();
	}
	catch (Exception e)
	{
	}
	return matriz;
    }
	public static void main(String[] args)
	{
		String ruta =null;
		cargaDeArchivo objfunciones = new cargaDeArchivo();
		System.out.println(objfunciones.cargaDeArchivoMatriz(ruta));
	}
}
