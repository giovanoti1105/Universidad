package FuncionesJuego;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import sun.org.mozilla.javascript.internal.ast.TryStatement;
import VentanaPrincipal.VentanaPrincipal;

public class ProcesoJuego
{
	// creacion del objeto que permite interactuar con atributos y funciones de
	// la ventana principal
	VentanaPrincipal objVentanaPrincipal = new VentanaPrincipal();
	int maria;
	int juan;

	/**
	 * @return the maria
	 */
	public int getMaria()
	{
		return maria;
	}

	/**
	 * @param maria the maria to set
	 */
	public void setMaria(int maria)
	{
		this.maria = maria;
	}

	/**
	 * @return the juan
	 */
	public int getJuan()
	{
		return juan;
	}

	/**
	 * @param juan the juan to set
	 */
	public void setJuan(int juan)
	{
		this.juan = juan;
	}

	/**
	 * funcion que define si el radiobuton seleccionado es par o impar del
	 * usuario juan
	 * 
	 * @param juan
	 * @return juan
	 */
	public void definicionJuan(JRadioButton BotonJuan)
	{
		if (objVentanaPrincipal.rdbtnParJuan.isSelected())
			 setJuan(0);
		else if (objVentanaPrincipal.rdbtnImparJuan.isSelected())
			setJuan(1);
	}

	/**
	 * funcion que define si el radiobuton seleccionado es par o impar del
	 * usuario maria
	 * 
	 * @param maria
	 * @return maria
	 */
	public void definicionMaria(JRadioButton BotonMaria)
	{
		if (objVentanaPrincipal.rdbtnParMaria.isSelected())
			setMaria(0);
		else if (objVentanaPrincipal.rdbtnImparMaria.isSelected())
			setMaria(0);
	}

	public void procedimientoJuego(String intentos)
	{
		try{
		int juan;
		int maria;
		int totalMaria = 0;
		int totaljuan = 0;
		int totalNumeroJuegos;
		int numeroJuegos = 1;
		int cantidadIntentos;
		// importamos objeto lo agregamos a la variable parceada entera
		// totalNumeroJuegos
		
		totalNumeroJuegos = Integer.parseInt(intentos);
		
		while (numeroJuegos <= totalNumeroJuegos)
		{
			juan = (int) (Math.random() * 6);
			maria = (int) (Math.random() * 6);

			cantidadIntentos = ((juan + maria) % 2);
			// int total
			if (cantidadIntentos == 0)
				totalMaria++;
			else
			// aumenta el while que controla cantidad de juegos
			numeroJuegos++;
		}
		String ganoJuan;
		String ganoMaria;
		String mensaje;

		if (totaljuan == totalMaria)
			objVentanaPrincipal.lblResultado.setText("Empate");

		else if (totaljuan > totalMaria)
		{
			ganoJuan = "Gano Juan con " + (totaljuan) + " Juegos de " + totalNumeroJuegos;
			objVentanaPrincipal.lblResultado.setText(ganoJuan);
		}
		else
		{
			ganoMaria = "Gano Maria con " + (totalMaria) + " Juegos de " + totalNumeroJuegos;
			JOptionPane.showMessageDialog(null, "Gano Maria");
			objVentanaPrincipal.lblResultado.setText(ganoMaria);
		}
	}
	catch (NullPointerException e)
	{
		e.getMessage();
	}
	}
}
