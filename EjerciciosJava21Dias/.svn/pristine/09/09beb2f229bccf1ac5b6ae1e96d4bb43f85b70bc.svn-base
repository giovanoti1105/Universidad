package Varios;

public class CopyArrayWhile
{
	public static void main(String[] args)
	{
		// creacion de arrays
		int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
		float[] array2 = new float[array1.length];

		// impresion de linea impresion
		System.out.print("Array: [ ");
		// for que recorre el array 1
		for (int i = 0; i < array1.length; i++)
		{
			// impresion de cada posicion del array1
			System.out.print(array1[i] + " ");
		}
		System.out.println("]");





		// impresion del array 2 por medio de while
		System.out.print("[ ");
		int count = 0;
		while (count < array1.length && array1[count] != 1)
		{
			array2[count] = (float) array1[count];
			System.out.print(array2[count++] + " ");
		}
		System.out.print("]");
	}

}
