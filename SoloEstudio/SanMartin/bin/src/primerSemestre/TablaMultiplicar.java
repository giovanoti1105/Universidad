package primerSemestre;

import javax.swing.JOptionPane;

public class TablaMultiplicar
{
	
	static int mdo;
	static int mdor;
	static int prod;
	static String salida;
	static String aux;
	public TablaMultiplicar()
	{
		mdor=0;
		aux="";
		salida="";
	}
	public static void main(String[] args)
	{
		String aux= JOptionPane.showInputDialog("Tabla de multiplicar a imprimir");
		mdo = Integer.parseInt(aux);
		while (mdor<=10)
		{
			prod= mdo * mdor;
			aux = mdo + " x " + mdor + " = " + prod + "\n";
			salida += aux;
			mdor++;
		}
		JOptionPane.showMessageDialog(null, salida);
		
		
	}
	

}
