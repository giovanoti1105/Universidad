package SegundoSemestreEditorTextoBasico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.text.*;

public class EditorTextoBasico extends JFrame implements ActionListener
{
	// atributos
	private Style estiloRojo, estiloVerde, estiloAzul;
	private JTextPane texto;
	
	/**constructor de la clase
	 * 
	 */
	public EditorTextoBasico()
	{
		setLayout(new BorderLayout());
		add(crearMenu(),BorderLayout.NORTH);
		JTextPane texto = crearEditor();
		//ubicado en el centro del frame
		add(texto,BorderLayout.CENTER);
	}
	
	private JMenuBar crearMenu()
	{
		JMenuBar menu = new JMenuBar();
		JMenu estilo = new JMenu("Estilo");
		menu.add(estilo);
		// opcion del color rojo
		JMenuItem mi = new JMenuItem("Rojo");
		estilo.add(mi);
		// agregamos el manejador de eventos
		mi.addActionListener(this);
		
		// opcion del color verde
		mi = new JMenuItem("Verde");
		estilo.add(mi);
		mi.addActionListener(this);
		
		mi = new JMenuItem("Azul");
		estilo.add(mi);
		mi.addActionListener(this);
		
		return menu;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// obtenemos el valor del color seleccionado
		Style estilo=null;
		String color=(String) e.getActionCommand();
		// preguntamos color escogido
		if(color.equals("Rojo"))
		{
			estilo=estiloRojo;
		}
		else if (color.equals("Azul"))
		{
			estilo=estiloAzul;
		}
		else if(color.equals("Verde"))
		{
			estilo=estiloVerde;
		}
	}
	
	// metodo para crear editor de texto
	private JTextPane crearEditor()
	{
		StyleContext sc = crearEstilos();
		DefaultStyledDocument doc = new DefaultStyledDocument(sc);
		texto = new JTextPane(doc);
		return(texto);
	}
	
	// metodo para crear los estilos
	private StyleContext crearEstilos()
	{
		StyleContext sc = new StyleContext ();
		estiloRojo = sc.addStyle(null, null);
		StyleConstants.setForeground(estiloRojo, Color.red);
		estiloVerde = sc.addStyle(null, null);
		StyleConstants.setForeground(estiloVerde, Color.green);
		estiloAzul = sc.addStyle(null, null);
		StyleConstants.setForeground(estiloAzul, Color.blue);
		return(sc);
	}

	/**funcion main donde se carga el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			
		
		JFrame ventana = new JFrame("tutorial");
		ventana.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent evt)
			{
				System.exit(0);
			}
		});
		ventana.getContentPane().add(new EditorTextoBasico(),
		BorderLayout.CENTER);
		ventana.setSize(800, 600);
		ventana.setVisible(true);
		
		} catch (Exception e)
		{
		}

	}

}
