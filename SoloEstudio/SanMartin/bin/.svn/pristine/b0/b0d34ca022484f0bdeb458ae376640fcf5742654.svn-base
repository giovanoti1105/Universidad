package primerSemestre;

import javax.swing.JOptionPane;

class Hipotenusa
{
	// definicion de variables de clase
	String primerNumero;
	String segundoNumero;
	int catAdyacente;
	int catOpuesto;
	double cuadrado;
	double hipot;

	// constructor de clase
	public Hipotenusa()
	{
		super();
	}

	// funcion que realiza proceso de hallar hipotenusa
	double hallarHipotenusa(String primerNumero, String segundoNumero)
	{
		// conversion de string a enteros
		catAdyacente = Integer.parseInt(primerNumero);
		catOpuesto = Integer.parseInt(segundoNumero);
		
		// se elevan al cuadrado los dos numeros y se suman valores
		cuadrado = Math.pow(catAdyacente, 2) + Math.pow(catOpuesto, 2);
		// se halla la raiz cuadrada correspondinete a la sumatoria
		hipot = Math.sqrt(cuadrado);
		
		return hipot;
	}

	// funcion main que llama las funciones e imprime en pantalla
	public static void main(String[] args)
	{
		// objeto referencia de clase
		Hipotenusa objhipotenusa = new Hipotenusa();

		objhipotenusa.primerNumero = JOptionPane.showInputDialog("Digite el cateto adyacente");
		objhipotenusa.segundoNumero = JOptionPane.showInputDialog("Digite el cateto opuesto");
		//objhipotenusa.hallarHipotenusa(objhipotenusa.primerNumero, objhipotenusa.segundoNumero);
		JOptionPane.showMessageDialog(null, "La hipotenusa es " +objhipotenusa.hallarHipotenusa(objhipotenusa.primerNumero, objhipotenusa.segundoNumero));
	}
}
