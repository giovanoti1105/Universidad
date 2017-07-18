package primerSemestre;

import java.util.Scanner;

class TiempoMeteorologico
{
	static int temperatura;
	static int viento;
	static int humedad;
	
	void procesoTiempoMeteorologico()
	{
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Ingrese Valor Temperatura");
		temperatura = objScanner.nextInt();
		System.out.println("Ingrese Viento");
		viento = objScanner.nextInt();
		System.out.println("Ingrese Humedad");
		humedad = objScanner.nextInt();
		
		if(temperatura > 25 && viento < 10 && humedad < 33)
		{
			System.out.println("Dia Soleado");
		}
		if((temperatura >= 20 && temperatura <=30) && viento < 10 && humedad > 90 )
		{
			System.out.println("Dia Humedo");
		}
		if ((temperatura >= -5 && temperatura <=0)&& (viento <5 || viento>50)&& humedad > 50)
		{
			System.out.println("Dia Nevado");
		}
	}
	public static void main(String[] args)
	{
		TiempoMeteorologico objTiempoMeteorologico = new TiempoMeteorologico ();
		objTiempoMeteorologico.procesoTiempoMeteorologico();
	}
}