package Varios;

public class EvenSteven
{
	// funcion que valida si el numero es ivisible por 2
	void evenCheck(int Val)
	{
		System.out.println("Val is " + Val + ".");
		if (Val % 2 == 0)
		{
			System.out.println("Steven !");
		}
	}
	// funcion de impresion 
	public static void main(String[] args)
	{
		EvenSteven obje = new EvenSteven();
		obje.evenCheck(0);
		obje.evenCheck(2);
		obje.evenCheck(54);
		obje.evenCheck(77);
		obje.evenCheck(1456);
	}
}
