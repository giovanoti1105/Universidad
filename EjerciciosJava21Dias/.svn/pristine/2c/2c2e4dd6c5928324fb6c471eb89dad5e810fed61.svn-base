package Varios;

public class passByReferences
{
	// funcion que recibe de argumento un array
	int onetozero(int arg[])
	{
		int count = 0;
		// se recorre el array
		for (int i = 0; i < arg.length; i++)
		{
			if (arg[i] == 1)
			{
				count++;
				arg[i] = 0;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 4, 5, 1, 1, 7 };
		passByReferences objpassByReferences = new passByReferences();
		int numOnes;
		
		System.out.print("Valor del array : [" );
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		
		numOnes = objpassByReferences.onetozero(arr);
		System.out.println("numero de unos " + numOnes);
		System.out.print("Nuevo valor del array : [" );
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ]");
	}
}
