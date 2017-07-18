package Varios;

public class Ejemplos extends EjemploMetodos
{
	
	int [] rango(int inferior, int superior)
	{
		int [] rango = new int [(superior-inferior)+1];
		for (int i = 0; i < rango.length; i++)
		{
			rango[i] =inferior++; 
		}
		return rango;
	}
	public static void main(String[] args)
	{
		Ejemplos objEjemplos = new Ejemplos();
		Integer cantidad = new Integer(1234);
		int valorObjeto = cantidad.intValue();
		System.out.println("El valor del objeto : " + cantidad);
		System.out.println("El valor de la variable : " + valorObjeto);
		System.out.println("*************************************");
		System.out.println("funcion rango");
		int x=5,y=10;
		int rango[] = objEjemplos.rango(5,10);
			
		System.out.print("El tamaño del array es [ " );
		for (int i = 0; i < rango.length; i++)
		{
			System.out.print(rango[i] + " ");
		}
		System.out.println("] " );
		System.out.println("*************************************");
		System.out.println(variableStatic);
		System.out.println(variableStatic2);
		System.out.println(variableStatic3);
		variableStatic="dos";
		variableStatic2="dos";
		
	}

}
