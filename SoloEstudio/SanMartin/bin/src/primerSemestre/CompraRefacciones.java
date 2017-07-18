package primerSemestre;

import javax.swing.JOptionPane;


public class CompraRefacciones
{
	int[] totalPagar = new int[3];

	/**
	 * @param valor
	 * @return valores en un array
	 */
	int [] formaPago(int valor)
	{
		if (valor <= 1000000)
		{
			JOptionPane.showMessageDialog(null, "El valor a pagar es " + valor);
		} 
		else
		{
			try
			{
			for (int i = 0; i < totalPagar.length; i++)
			{
			totalPagar [0]= (int) (valor * 0.58);
			totalPagar [1]= (int) (valor * 0.25);
			totalPagar [2]= (int) (valor * 0.17);
			}
			JOptionPane.showMessageDialog(null, "El valor a pagar es \n"
					+ " \n pago directo por la empresa 58% total de la compra" +totalPagar [0]
					+ "\n pago directo por entidad financiera 25% total de la compra " +totalPagar [1]
					+ "\n pago directo por credito fabricante 17% total de la compra " +totalPagar [2]);
		    }
		
		 catch (Exception e)
		{
			 e.getMessage();
		}
		}
		return totalPagar;
	}

	public static void main(String[] args)
	{
		int valorCompra;
		String strValorCompra = JOptionPane.showInputDialog("Ingrese Valor de la compra");
		valorCompra = Integer.parseInt(strValorCompra);
		
		CompraRefacciones objCompraRefacciones = new CompraRefacciones (); 
		objCompraRefacciones.formaPago(valorCompra);		
	}
}
