package Varios.Guis;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class RecogeDatos extends JFrame
{
	private JLabel etiquetaNmobre = new JLabel("Nombre: ", SwingConstants.RIGHT);
	private JTextField nombre;
	private JLabel etiquetaUrl = new JLabel("URL : ", SwingConstants.RIGHT);
	private JTextField url;
	private JLabel etiquetaTipo = new JLabel("Tipo : ", SwingConstants.RIGHT);
	private JTextField tipo;

	public RecogeDatos()
	{
		super("Recogida de Datos");
		setSize(400, 105);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// nombre del sitio
		String respuesta1 = JOptionPane.showInputDialog(null, "Escriba el nombre del sitio");
		nombre = new JTextField(respuesta1, 20);
		// direccion del sitio
		String respuesta2 = JOptionPane.showInputDialog(null, "Escriba la direccion del sitio");
		url = new JTextField(respuesta2, 20);
		// tipo del sitio
		String[] opciones =
		{ "Personal", "Empresarial", "Gubernamental" };
		int respuesta3 = JOptionPane.showOptionDialog(null, "Que tipo de sitio es ?", "Tipo de Sitio", 
														0, JOptionPane.QUESTION_MESSAGE, null, opciones, 
														opciones[1]);
		url = new JTextField(respuesta2, 20);
		tipo = new JTextField(opciones[respuesta3], 20);
		setLayout(new GridLayout(3, 2));
		add(etiquetaNmobre);
		add(nombre);
		add(etiquetaUrl);
		add(url);
		add(etiquetaTipo);
		add(tipo);
		setLookAndFeel();
		setVisible(true);

	}

	private void setLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel(
			// UIManager.getSystemLookAndFeelClassName());
					UIManager.getCrossPlatformLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e)
		{
			System.out.println("No se ha podido cnfigurar look an feel" + e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		new RecogeDatos();
	}
}