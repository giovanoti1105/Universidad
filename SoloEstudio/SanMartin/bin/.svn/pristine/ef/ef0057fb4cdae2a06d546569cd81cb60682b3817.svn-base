package primerSemestre;

import javax.swing.JOptionPane;

public class NumerosPrimos
{
	public static boolean esPrimo(int numero)
	{
		int n = 2;
		boolean resp = true;
		while (n < numero)
		{
			if (numero % n == 0)
				resp = false;
			n++;
		}
		return resp;
	}
	public static void main(String[] args)
	{
		int num;
		String cadNumero= JOptionPane.showInputDialog("Numero");
		num = Integer.parseInt(cadNumero);
		//cadNumero="";
		// ciclo que va desde 2 hsta el nro ingresado
		for (int n = 2; n <= num ; n++)
		{
			if (esPrimo(num))
				cadNumero+=n;
			cadNumero+=" ";
		}
		JOptionPane.showMessageDialog(null, cadNumero);
		
	}

}
