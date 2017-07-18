package Varios;
public class CopyArrayWhile 
{
	public static void main(String[] args) 
	{
		// creacion de variables de tipo array array1 con valores fijos y array2 de acuerdo al tamaño de array1 
		int array1[]= {7,4,8,1,4,1,4};
		float array2[] = new float [array1.length];
		
		// impresion del array 1 
		System.out.print("array1: [");
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.print(array1[i] + " ");
		}
		System.out.println("]");

		// impresion del array 2 
		System.out.print("array2: [");
		int count=0;
		while (count<array1.length && array1[count] !=1) 
		{
			array2[count] = (float)array1[count];
			System.out.print(array2[count++] + " ");
		}
		System.out.println(" ] ");
	}
}