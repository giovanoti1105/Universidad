package primerSemestre;

import javax.swing.JOptionPane;

public class LogaritmoNatural
{
	public static void main(String[] args)
	{
		String numero;
		double numeroN, resultado;
		
		numero = JOptionPane.showInputDialog("numero para hallar logaritmo natural");
		numeroN = Integer.parseInt(numero);
		resultado =  Math.log(numeroN);
		
		JOptionPane.showMessageDialog(null, " El logaritmo de : " + numeroN + "es "  + resultado);
		
	}

}
