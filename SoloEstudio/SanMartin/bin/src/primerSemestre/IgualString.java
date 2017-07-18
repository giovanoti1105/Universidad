package primerSemestre;

import java.util.Scanner;

public class IgualString
{
	static String primero;
	static String segundo;

	public static boolean FuncionVerificaIgualdad(String uno, String dos)
	{
		if (uno.equals(dos))
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		Scanner objScanner = new Scanner(System.in);
		System.out.println("nombre uno");
		primero = objScanner.next();
		System.out.println("nombre dos");
		segundo = objScanner.next();
		boolean resultado ;
		FuncionVerificaIgualdad(primero, segundo);
		resultado = FuncionVerificaIgualdad(primero, segundo);
		System.out.println("Resultado es " + resultado);

		

	}

}
