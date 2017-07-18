package Varios;

public class contadorInstancias
{
	private static int numInstancias = 0;

	protected static int getCuenta()
	{
		return numInstancias;
	}

	private static void addInstancia()
	{
		numInstancias++;
	}
	contadorInstancias()
	{
		contadorInstancias.addInstancia();
	}
	public static void main(String[] args)
	{
		System.out.println("Empezamos con " + contadorInstancias.getCuenta() + " Instancias");
		for (int i = 0; i < 500; i++)
		{
			new contadorInstancias();
			System.out.println("creadas " + contadorInstancias.getCuenta()+ " Instancias");
			
		}
	}
	
}
