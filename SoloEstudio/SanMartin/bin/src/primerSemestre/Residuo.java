package primerSemestre;

import java.util.Scanner;

public class Residuo
{
	public static void main(String[] args)
	{
		// definicion de variables
		int dividendo;
		int divisor;
		int residuo;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite Dividendo:");
		// lee el dato entero por teclado
		dividendo = input.nextInt();
		System.out.println("Digite Divisor:");
		// lee el dato entero por teclado
		divisor= input.nextInt();
		
		residuo = dividendo % divisor;
		System.out.println("El modulo de la division es " + residuo);
		
	}

}
