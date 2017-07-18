package primerSemestre;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Edad
{
	static int mayor;
	static int menor;
	static int [] edad = new int [5];
	static int i;
	public void cargar()
	{
		String num;
		String edades="";
		int suma=0;
		for (i = 0; i < edad.length; i++)
		{
			num=JOptionPane.showInputDialog("Ventas");
			edad[i]=Integer.parseInt(num);
			edades+=edad[i];
			suma+=edad[i]/2;
	}
		JOptionPane.showMessageDialog(null, edades + " \n Promedio Ventas = " +  suma);
	}
	public void menorElemento()
	{
		menor=edad[0];
		for (int f = 1; f < edad.length; f++)
		{
			if(edad[f]<menor)
				menor=edad[f];
		}
		System.out.println("menor " + menor);
	}
	public void mayorElemento()
	{
		mayor=edad[0];
		for (int h = 0; h < edad.length; h++)
		{
			if(edad[h]>mayor)
				mayor=edad[h];
		}
		System.out.println("mayor " + mayor);
	}
	
	public static void main(String[] args)
	{
		Edad objEdad = new Edad();
		objEdad.cargar();
		objEdad.mayorElemento();
		objEdad.menorElemento();
	}
}
