package primerSemestre;

import javax.swing.JOptionPane;

public class AdivinaNumero
{
	static int numComputador;
	static int numero;
	static boolean gano;
	
	public static int numeroComputador()
	{
		return (int) (Math.random()*15);
	}
	
	public static void main(String[] args)
	{
		int resultado=0;
		int numeroAleatorio=0;
		String nombre="";
		String cadNumero="";
		int cont=1;
		
		// funciones de tipo clse
		nombre = JOptionPane.showInputDialog("Digite Nombre");
		numeroAleatorio = numeroComputador();
		// inicializo variable gano con falso
		gano= false;
		//se ejecuta hasta que el contador llegue a 3
		while (cont<=3)
		{
			cadNumero = JOptionPane.showInputDialog("Digite un Numero");
			numero = Integer.parseInt(cadNumero);
			if(numero > numeroAleatorio)
				System.out.println("numero es menor");
			else if (numero < numeroAleatorio)
				System.out.println("numero mayor");
			else if ((numero == numeroAleatorio))
			{
				gano=true;
				cont=3;
			}
			cont++;
		}
		if(gano)
			JOptionPane.showMessageDialog(null, nombre + " Gano");
		else 
			JOptionPane.showMessageDialog(null, nombre + " perdio");
		System.exit(0);
		
		
	}

}
