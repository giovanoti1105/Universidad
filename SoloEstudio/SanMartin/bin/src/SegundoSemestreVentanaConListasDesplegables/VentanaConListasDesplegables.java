package SegundoSemestreVentanaConListasDesplegables;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaConListasDesplegables extends JPanel
{
	private static final long serialVersionUID = 2L;
	private JComboBox combo;
	private JFrame ventana;
	private JPanel panelVentana;
	private JLabel respuesta;
	static String[] etiquetas =
	{ "Archivo", "Edicion", "Refactorizar", "Navegar", "Busqueda", "Proyecto", "Correr", "Ventana", "Ayuda" };

	// constructor de la clase
	public VentanaConListasDesplegables()
	{
		JFrame ventana = getFrameVentana();
		ventana.setSize(new Dimension(300, 300));
		ventana.setVisible(true);
	}

	private JComboBox getCombo()
	{
		combo = new JComboBox();
		// poblamos el combo con el arreglo de etiquetas
		for (int i = 0; i < etiquetas.length; i++)
		{
			combo.addItem(etiquetas[i]);
			combo.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent arg0)
				{
					Object valor = combo.getSelectedItem();
					String etiqueta = (String)valor;
					respuesta.setText("el texto seleccionado es " + etiqueta);
					
				}
			});
		}
		return combo;
	}

	// funcion que ejecuta el frame
	private JFrame getFrameVentana()
	{
		if (ventana == null)
		{
			ventana = new JFrame();
			ventana.setTitle("combo");
			ventana.setContentPane(getPanel());
		}
		return ventana;
	}
	private JPanel getPanel()
	{
		if (panelVentana==null)
		{
			panelVentana = new JPanel();
			setLayout(new GridLayout(2, 1));
			panelVentana.add(getCombo());
			respuesta = new JLabel();
			panelVentana.add(respuesta);
		}
		
		return panelVentana;
	}

	public static void main(String[] args)
	{
		new VentanaConListasDesplegables();
	}
}