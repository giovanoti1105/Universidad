package primerSemestre;

import java.util.Scanner;

public class TotalPagar
{
	void totalPagado(int valor, int cantidad)
	{
		final int IVA = 16;
		int total = valor * cantidad;
		int totalPagar = (total * IVA / 100) + total;
		System.out.println("El valor a pagar es " + totalPagar);
	}

	public static void main(String[] args)
	{
		TotalPagar objTotalPagar = new TotalPagar();
		int cantidad;
		int valor;
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Ingrese Cantidad de articulos");
		cantidad = objScanner.nextInt();
		System.out.println("Ingrese Valor Producto");
		valor = objScanner.nextInt();
		objTotalPagar.totalPagado(valor, cantidad);
	}
}
