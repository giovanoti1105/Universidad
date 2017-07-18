package primerSemestre;

import javax.swing.JOptionPane;

public class Clave
{
	static String clave ="Universidad";
	static String claveUsuario;
	static int numeroVeces;
	
	 static void funcionClave()
	{
		do
		{
			claveUsuario = JOptionPane.showInputDialog("Digite Clave");
			numeroVeces++;
			
		} while (!clave.equals(claveUsuario)&& numeroVeces<3);
		if (numeroVeces==3 && !clave.equals(claveUsuario))
		{
			JOptionPane.showMessageDialog(null, "Clave Errada");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
		}

	}
	public static void main(String[] args)
	{
		funcionClave();
	}


}
