package Varios;
public class PassByReference
{
    // metodo que pasa por parametro una variable entera de tipo arreglo
    int oneToZero(int arg[])
    {
	int count=0;
	for (int i = 0; i < arg.length; i++)
	{
	    if(arg[i] == 1)
	    {
		count++;
		arg[i] = 0;
	    }
	}
	return count;
    }
    public static void main(String[] args)
    {
	//cracion variable array con numeros asignados
	int arr[] = {1,3,4,5,1,1,7};
	// creacion de objeto test
	PassByReference test = new PassByReference();
	int numOnes;
	// impresion del primer array
	System.out.print("Valor del array : [");
	for (int i = 0; i < arr.length; i++)
	{
	    System.out.print(arr[i] + " ");
	}
	System.out.print("]");
	//asignacion a numOnes el valor que contiene arr dentro del metodo oneToZero
	numOnes = test.oneToZero(arr);
	// impresion de la cantidad de numeros 1 en el vector
	System.out.print("\n Cantidad de numeros uno : " + numOnes);
	System.out.print("\n Nuevos valores del array : [");
	for (int i = 0; i < arr.length; i++)
	    {
	    System.out.print(arr[i] + " ");
	    }
	System.out.print("]");
    }
}
