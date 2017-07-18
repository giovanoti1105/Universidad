package primerSemestre;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SeleccionOperador
{
	static int numero1;
	static int numero2;

	public SeleccionOperador(int numero1, int numero2)
	{
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	int SolicitudNumeros(int numero1, int numero2)
	{
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Numero uno");
		numero1 = objScanner.nextInt();
		System.out.println("Numero dos");
		numero2 = objScanner.nextInt();
		
		// seleccion de operador
	
		char operador = ' ';
		System.out.println("Seleccione Operador + - / *");
		String cadena = objScanner.next();
		operador = cadena.charAt(0);
		String mensaje = "";
		int resultado =	0;
		switch (operador)
		{
		case '+':
			resultado = numero1 + numero2;
			System.out.println("El resultado es " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println("El resultado es " + resultado);
			break;
		case '*':
			resultado = numero1 * numero2;
			System.out.println("El resultado es " + resultado);
			break;
		case '/':
			resultado = numero1 / numero2;
			System.out.println("El resultado es " + resultado);
			break;

		default: mensaje = "No es Operador";
			break;
		}
		return resultado;
	}
	public static void main(String[] args)
	{
		SeleccionOperador objSeleccionOperador = new SeleccionOperador(numero1,numero2); 
		objSeleccionOperador.SolicitudNumeros(numero1, numero2);
	}
}
