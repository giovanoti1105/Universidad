package Varios;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class posFijoInFijo  
{
	static int x = 10;
	static int y= 10;
	static int z= 30;
	static int w= 40;
	
	static int rest1 = x++ + z;
	static int rest2 = y++ + z;
	
	public static void main (String arg[])
	{
		GregorianCalendar date= new GregorianCalendar(); 
		if (rest1 == w && rest2 == w	 )
		{
			System.out.println("el resultado es igual a Z que es : " +Calendar.DAY_OF_YEAR);
		}
		else
		{
			System.out.println("restultado 1 postfijo = " + rest1);
			System.out.println("restultado 1 prefijo = " + rest2);
			System.out.println("valor x = " + x);
			System.out.println("valor y = " + y);
		}
	}
}
