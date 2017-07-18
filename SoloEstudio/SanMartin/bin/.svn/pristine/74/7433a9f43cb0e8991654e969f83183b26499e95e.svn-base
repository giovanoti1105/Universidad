package primerSemestre;

import java.util.Scanner;

public class VolumenEsfera
{
	public int valorEsfera(double valorRadio)
	{
		int totalValor=0;
		if(valorRadio > 0)
		{
			totalValor = (int) ((4/3)* Math.PI * Math.pow(valorRadio, 3)); 
			System.out.println("El valor de la esfera es de " + totalValor);
		}
		else
		{
			System.out.println("Mensaje Errado");
		}
		return totalValor;
	}
	public static void main(String[] args)
	{
		int valorRadio;
		VolumenEsfera objRadio = new VolumenEsfera();
		Scanner objEscaner = new Scanner(System.in);
		System.out.println("Ingrese valor del Radio");
		valorRadio = objEscaner.nextInt();
		objRadio.valorEsfera(valorRadio);
	}
}
