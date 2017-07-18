package MariaJuanParImpar;

import java.util.Random;

public class Juan
{
    int i=0;
    int numeroAleatorio[] = new int[5];
    
    int [] aleatorioJuan(int numero, String Jugadoruno)
    {
	try
	{
	    Random objNumeroAleatorio = new Random();
		// si el numero es impar se almacena en posicion
		for (int i = 0; i < numeroAleatorio.length; i++)
		{
		    numero = objNumeroAleatorio.nextInt(6);
		    numeroAleatorio[i] = numero;
		    System.out.print(numeroAleatorio [ i ] + " " );
	    }
	} 
	catch (Exception e)
	{
	    System.out.println("Error");
	}
	return numeroAleatorio;
    }
}