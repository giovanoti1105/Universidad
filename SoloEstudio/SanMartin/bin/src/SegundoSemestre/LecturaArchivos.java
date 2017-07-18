package SegundoSemestre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import SegundoSemestreListadoCiudades.CiudadesColombia;

public class LecturaArchivos
{

	public LecturaArchivos()
	{}
	
	public static void Archivos() throws IOException
	{
		try
		{
		String lineaArchivo = ("D://PROYECTOS_JAVA/PROY_ECLIPSE/SoloEstudio/SanMartin/bin/Archivos/Ciudades.txt");
		File archivo = new File(lineaArchivo);
		// creacion del objeto que vamos a leer
		FileReader lectorArchivo  = new FileReader(archivo);
		BufferedReader br = new BufferedReader(lectorArchivo);
		CiudadesColombia objciudad = new CiudadesColombia();
		int i=0;
		String aux="";
		String [] ciudades = new String [20];
		
		for (i = 0; i < ciudades.length; i++)
		{
			aux=br.readLine();
			ciudades[i]=aux;
		}
		objciudad.cmbCiudad.setSelectedItem(ciudades);

		br.close();
		} catch (NullPointerException e)
		{
			e.getMessage();
		}
	}
	public static void main(String[] args) throws IOException
	{
		Archivos();
	}
}
