package MariaJuanParImpar;

class Resultados
{
    int totalPar = 0;
    int totalImpar = 0;
    int SumaPosicionesJuanYMaria[] = new int[5];

    // funcion que realiza todos los resultados
    int[] sumas()
    {
	try
	{
	    ParImparMain objResultados = new ParImparMain();
	    // creamos los arreglos donde se almacenaran los resutados
	    int ResultadoJuegoJuan[] = ParImparMain.ResultadoJuan;
	    int ResultadoJuegoMaria[] = ParImparMain.ResultadoMaria;

	    // suma de los vectores de cada posicion
	    for (int i = 0; i < SumaPosicionesJuanYMaria.length; i++)
	    {
		SumaPosicionesJuanYMaria[i] = ResultadoJuegoJuan[i] + ResultadoJuegoMaria[i];
		System.out.print(SumaPosicionesJuanYMaria[i] + " ");
	    }
	} 
	catch (Exception e)
	{
	    System.out.println("Error");
	}
	return SumaPosicionesJuanYMaria;
    }

    void resultados()
    {
	int[] variable = sumas();
	for (int j = 0; j < variable.length; j++)
	{
	    if (variable[j] % 2 == 0)
		totalPar++;
	    else
		totalImpar++;
	}

	if (totalPar > totalImpar)
	{
	    System.out.println("\n Total Impares [" + totalImpar + "]");
	    System.out.println("Total Pares     [" + totalPar + "]");
	    System.out.println("\n El ganador es quien eligio los PARES");
	} 
	else
	{
	    System.out.println("Total Impares [" + totalImpar + "]");
	    System.out.println("Total Pares   [" + totalPar + "]");
 	    System.out.println("\n El ganador es quien eligio los IMPARES");
	}
    }
}