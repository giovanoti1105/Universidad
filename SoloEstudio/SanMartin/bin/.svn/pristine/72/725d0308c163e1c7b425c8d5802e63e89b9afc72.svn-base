package primerSemestre;

import java.util.Scanner;

public class esMultiplo
{

	public esMultiplo()
	{
		// TODO Auto-generated constructor stub
	}
	public static boolean funionEsMultiplo(int n1,  int n2)
	{
		if (n1%n2==0)
			return true;
		else
			return false;
	}
	public static String multiplo()
	{
		int numero;
		Scanner objScanner = new Scanner (System.in);
		System.out.println("Ingrese Multiplo");
		numero = objScanner.nextInt();
		int x;
		for (x = 1; x <= numero ; x++)
		{
			if(funionEsMultiplo(numero,x))
			{
				System.out.println(x);
			}
		}
		return "";
	}
	public static void main(String[] args)
	{
		multiplo();
	}
}