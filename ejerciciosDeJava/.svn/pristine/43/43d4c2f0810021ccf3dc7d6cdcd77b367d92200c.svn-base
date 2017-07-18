package Varios;
public class RangeClass
{
    // funcion de tipo array que recibe dos argumentos de tipo entero
    int[] MakeRange(int lower, int upper)
    {
	// creacion de variables tipo array
	int[] arr = new int[(upper + lower)];
	// for que recorre arreglo de acuerdo a tamaño de arrreglo
	for (int i = 0; i < arr.length; i++)
	{
	    // asignacion de campo a la posicion i = a la variable entera lower
	    // y se incrementa en 1
	    arr[i] = lower++;
	}
	return arr;
    }

    public static void main(String[] args)
    {
	int thearray[];
	// creacion de objeto theRangeClass
	RangeClass theRangeClass = new RangeClass();
	thearray = theRangeClass.MakeRange(2, 10);
	System.out.print("El array es : [");
	for (int i = 0; i < thearray.length; i++)
	{
	    System.out.print(thearray[i] + " ");
	}
	System.out.print(" ]");
    }

}
