package primerSemestre;

import javax.swing.JOptionPane;

public class Divisible
{
	private void numeroDivisible(int numeroUno,int numeroDos)
	{
		try
		{
		String cadenaNumero;
		// leer numero por consola
		cadenaNumero = JOptionPane.showInputDialog("Ingrese numero 1");
		numeroUno = Integer.parseInt(cadenaNumero);
		cadenaNumero = JOptionPane.showInputDialog("Ingrese numero 2");
		numeroDos = Integer.parseInt(cadenaNumero);
		if (numeroDos == 0 )
			JOptionPane.showMessageDialog(null, "Error al dividir por cero ");
		if(numeroUno % numeroDos == 0)
			JOptionPane.showMessageDialog(null, "SI divisible ");
		else
			JOptionPane.showMessageDialog(null, "NO es divisible ");
	
	} catch (Exception e)
	{
	}
	}

	public static void main(String[] args)
	{
		int numeroUno=0;
		int numeroDos=0;
		
		Divisible objDivisible = new Divisible();
		objDivisible.numeroDivisible(numeroUno, numeroDos);
	}
}