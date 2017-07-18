package primerSemestre;

import javax.swing.JOptionPane;

public class OperadoresArimeticos
{

	public OperadoresArimeticos()
	{
	}

	public static void main(String[] args)
	{
		char operador = ' ';
		String cadena = JOptionPane.showInputDialog("Digite Operador");
		operador = cadena.charAt(0);
		String mensaje = "";
		switch (operador)
		{
		case '+':
			mensaje = "Operador Suma";
			break;
		case '-':
			mensaje = "Operador Rest";
			break;
		case '*':
			mensaje = "Operador Multiplicacion";
			break;
		case '/':
			mensaje = "Operador Division";
			break;

		default: mensaje = "No es Operador";
			break;
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
