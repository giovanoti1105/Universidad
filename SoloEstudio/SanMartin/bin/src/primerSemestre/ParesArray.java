package primerSemestre;

import java.util.Scanner;

import com.sun.jndi.toolkit.ctx.Continuation;

public class ParesArray
{
	// constructor
	public ParesArray(int x, int y)
	{
		x = 0;
		y = 0;
	}

	static void RecorridoArray(int x, int y)
	{
		int posicion = 0;
		int numeroPar;
		int[][] pares = new int[x][y];

		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				numeroPar = (int) (Math.random() * 10);
				if (numeroPar % 2 == 0)
				{
					pares[i][j] = (int) numeroPar;
					continue;
				} else
				{
					continue;
				}
			}
		}

	}

	public static void main(String[] args)
	{
		int x = 4;
		int y = 5;
		/*
		 * Scanner objScanner = new Scanner(System.in);
		 * System.out.println("Ingrese X : "); x = objScanner.nextInt();
		 * System.out.println("Ingrese Y : "); y = objScanner.nextInt();
		 */

		// ParesArray objParesArray = new ParesArray(x, y);
		ParesArray.RecorridoArray(x, y);

	}
}