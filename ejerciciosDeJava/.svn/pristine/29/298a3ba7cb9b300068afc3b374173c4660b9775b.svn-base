package MariaJuanParImpar;

import java.util.Scanner;

public class SolucionCompleta
{

	public static void main(String[] args)
	{
		int juan = 0;
		int maria = 0;
		int totalMaria = 0;
		int totaljuan = 0;
		int totalNumeroJuegos;
		int numeroJuegos = 1;
		int cantidadIntentos;

		// importamos objeto scanner
		Scanner in = new Scanner(System.in);
		totalNumeroJuegos = in.nextInt();
		while (numeroJuegos <= totalNumeroJuegos)
		{

			System.out.print("Juan " + (
			juan = (int) (Math.random() * 6)));
			System.out.println(" Maria " + (
			maria = (int) (Math.random() * 6)));


			cantidadIntentos = ((juan + maria) % 2);
			// int total
			if (cantidadIntentos == 0)
				totalMaria++;
			else
				totaljuan++;
			// aumenta el while que controla cantidad de juegos
			numeroJuegos++;
		}
		if (totaljuan == totalMaria)
			System.out.println("Hay empate");



		else if (totaljuan > totalMaria)
			System.out.println("Gano Juan con " + ( totaljuan) + " Juegos de " + totalNumeroJuegos);


		else
			System.out.println("Gano Maria con " + ( totalMaria) + " Juegos de " + totalNumeroJuegos);
	}
}