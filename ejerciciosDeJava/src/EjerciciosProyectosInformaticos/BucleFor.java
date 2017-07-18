package EjerciciosProyectosInformaticos;

public class BucleFor
{
	public static void main(String[] args)
	{
		int arrayEteros[] = new int [5];
		for (int i = 0; i < 5; i++)
		{
			arrayEteros[i]=i;
		}
		for (int i : arrayEteros)
		{
			System.out.println("ArrayEnteros [" + i + "] = " + arrayEteros[i]);
		}
		
	}

}
