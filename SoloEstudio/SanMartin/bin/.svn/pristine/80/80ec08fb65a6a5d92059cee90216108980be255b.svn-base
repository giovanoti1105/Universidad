package SegundoSemestreManejoVentanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaIngresoDatos extends JFrame implements ActionListener
{
	// constructor de la clase
	public VentanaIngresoDatos()
	{
		JButton btnBoton= new JButton("Mostrar la ventana");
		getContentPane().add(btnBoton,"center");
		setSize(400, 100);
		btnBoton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String respuesta = JOptionPane.showInputDialog(this,"Ingrese Nombre : ","Manejo de ventas para JOptionPane",JOptionPane.DEFAULT_OPTION);
		// desplegamos respuesta 
		JOptionPane.showMessageDialog(null,"El usuario ingreso" +  respuesta,
				"manejo ventanas para ingreso datos",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void main(String[] args)
	{
		try
		{
			new VentanaIngresoDatos().setVisible(true);
			
		} catch (Exception e)
		{
			e.toString();
		}
	}
	
	

}
