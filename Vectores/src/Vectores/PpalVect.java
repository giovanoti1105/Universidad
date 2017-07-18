package Vectores;

import Vectores.ventanaPrincipal.*;

public class PpalVect
{
	// constructor de la clase
	public PpalVect(){}

	// cuncion que calcula la suma de los vectores
	public static void CalculoVectores(String vect1, String vect2)
	{
		String [] cadUno = vect1.split(",");
		String [] cadDos = vect2.split(",");
		int i = 0;
		int v1=2;
		int v2=2;
		int total =	0;
		String total2;
		int vec1[] = new int [3];
		int vec2[] = new int [3]; 
		
		// recorrido vector 1
		for (i = 0; i <= v1; i++)
		{
			vec1[i] = Integer.parseInt(cadUno[i]);
			System.out.print(vec1[i]);
		}
		
		// recorrido vector 2
		for (i = 0; i <= v2; i++)
		{
			vec2[i] = Integer.parseInt(cadUno[i]);
			System.out.print(vec2[i]);
		}
		
		// sumatoria vectores
		int size = Math.max(cadUno.length,cadUno.length);
		int []resultado = new int [size];
		int j=0;
		int a=0;
		
		// sumatoria vectores resultado
		for (i=0;i<3; i++)
		{
			resultado[i]= vec1[i]+vec2[i];
		}
		// impresion por pantalla
		
		for (int k = 0; k < resultado.length; k++)
		{
			total = resultado[k];
			total2= String.valueOf(total);
			ventanaPrincipal.txtResultado.setText(total2);
		}
		ventanaPrincipal.txtPrimerVector.setText("");
		ventanaPrincipal.txtSegundoVector.setText("");
	}
}
