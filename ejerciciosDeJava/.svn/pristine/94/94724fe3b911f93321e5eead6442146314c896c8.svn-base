package Varios;

public class Imprimir
{
	int x = 1;
	int y = 2;

	// funcion que imprime las variables de clase Imprimir
	void imprimiendo()
	{
		System.out.println("el valor de X es " + x + "\n el valor de Y es : " + y);
	}
}

class subImprimir extends Imprimir
{
	int z = 3;

	@Override
	void imprimiendo()
	{
		super.imprimiendo();
		System.out.println("el valor de Z es " + z);
	}

	public static void main(String[] args)
	{
		subImprimir objsubImprimir = new subImprimir();
		objsubImprimir.imprimiendo();
	}
}
