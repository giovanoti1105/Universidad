package primerSemestre;

import javax.swing.JOptionPane;

import org.junit.runners.Parameterized.Parameters;

import com.sun.tracing.dtrace.FunctionName;

public class Subsidio
{
	// definicion de variables de clase
	final int valor = 1500;
	String cadnum;
	int consumo=0;
	double descuento=0;
	double totalPagar=0;
	
	/**
	 * @FunctionName valorCompra que recive como 
	 * @Parameters el consumo
	 * */
	private void valorCompra(int consumo)
	{
		// leer el valor de la compra
		cadnum = JOptionPane.showInputDialog("Consumo");
		consumo = Integer.parseInt(cadnum);
		totalPagar = valor * consumo;
		// validacion si el consumo es menor que 41 paga un valor de lo contrario paga otro
		if (consumo < 41)
		{
			descuento = totalPagar * 0.15;
			totalPagar = totalPagar - descuento;
			JOptionPane.showMessageDialog(null, "E valor a pagar con subsidio del 15 % es " + totalPagar);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "E valor a pagar no cubre subsidio del 15 % es " + totalPagar);
		}
		
		// TODO Auto-generated method stub
	}
	public static void main(String[] args)
	{
		int consumo=0;
		Subsidio objSubsidio = new Subsidio();
		objSubsidio.valorCompra(consumo);
	}
}