package EjerciciosProyectosInformaticos;

public class EjercicioInstanceof 
{
	public EjercicioInstanceof()
	{
	}
	
	public static void main(String[] args)
	{
		EjercicioInstanceof objInstanceof = new EjercicioInstanceof();
		Distancia objDistancia = new Distancia(2);
		System.out.println(objInstanceof instanceof EjercicioInstanceof  );
	}

}
