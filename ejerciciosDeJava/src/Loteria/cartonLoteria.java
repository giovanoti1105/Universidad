package Loteria;

/**
*
* @author oscar_giovanni
* 
*/
public class cartonLoteria
{
    // constructor
    int numero = 0;
    int numeroFila = 0;

    int[][] numerosCartonLoteria(int[][] numeroCarton)
    {
	numeroCarton = new int[9][5];
	for (int i = 0; i < numeroCarton.length; i++)
	{
	    for (int j = 0; j < numeroCarton[i].length; j++)
	    {
		numero++;
		System.out.print(numero + " ");
	    }
	    System.out.println(" ");
	}
	return numeroCarton;
    }

    public static void main(String[] args)
    {
	int[][] valores = null;
	cartonLoteria numeroCartonLoteria = new cartonLoteria();
	System.out.println(numeroCartonLoteria.numerosCartonLoteria(valores));
    }
}
