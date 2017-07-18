package Varios.Guis;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PanelPestañas extends JPanel
{
	public PanelPestañas()
	{
		super();
		
		// 1. creacion de los paneles
		JPanel jplPrincipal = new JPanel();
		JLabel lblprincipal = new JLabel("Principal");
		jplPrincipal.add(lblprincipal);
		jplPrincipal.setPreferredSize(new Dimension(410,50));
		
		JPanel jplSegundo = new JPanel();
		JLabel lblSegundo = new JLabel("Segundo");
		jplSegundo.add(lblSegundo);
		
		JPanel jplTercero = new JPanel();
		JLabel lblTercero = new JLabel("Tercero");
		jplTercero.add(lblTercero);
		
		//2. creacion del panel pestañas y se añade las pestañas
		JTabbedPane objpanel = new JTabbedPane ();
		objpanel.add("Principal",jplPrincipal);
		objpanel.add("Segundo",jplSegundo);
		objpanel.add("tercero",jplTercero);
		
		// añadir el componente @JTabbedPane
		add(objpanel);
		
		// habilitacion del uso de scrolls en pestañas
		objpanel.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}
	private static void crearYmostrarGUI()
	{
		// crear y configurar la ventana
		JFrame marco = new JFrame("Ejemplo Paneles con pestañas");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// añadir contenido a la ventana
		marco.add(new PanelPestañas(),BorderLayout.CENTER);
		
		// mostrar la ventana
		marco.pack();
		marco.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		crearYmostrarGUI();
	}
	

}
