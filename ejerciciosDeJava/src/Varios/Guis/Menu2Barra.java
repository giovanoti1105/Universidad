package Varios.Guis;

import java.awt.BorderLayout;

import javax.swing.*;


public class Menu2Barra extends JFrame
{
	public Menu2Barra()
	{
		super("Barra de Herramientas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// crear iconos
		ImageIcon iconoanterior = new ImageIcon("D:/PROY_PROGRAMACION/EJERCICIOS_JAVA/ejerciciosDeJava/Images/anterior.jpg");
		JButton anterior = new JButton(iconoanterior);
		ImageIcon iconoasp = new ImageIcon("D:/PROY_PROGRAMACION/EJERCICIOS_JAVA/ejerciciosDeJava/Images/asp.jpg");
		JButton asp = new JButton(iconoasp);
		ImageIcon iconoayuda = new ImageIcon("D:/PROY_PROGRAMACION/EJERCICIOS_JAVA/ejerciciosDeJava/Images/ayuda.jpg");
		JButton ayuda = new JButton(iconoayuda);
		ImageIcon iconoexplorer = new ImageIcon("D:/PROY_PROGRAMACION/EJERCICIOS_JAVA/ejerciciosDeJava/Images/explorer.jpg");
		JButton explorer = new JButton(iconoexplorer);
		ImageIcon iconoface = new ImageIcon("D:/PROY_PROGRAMACION/EJERCICIOS_JAVA/ejerciciosDeJava/Images/face.jpg");
		JButton face = new JButton(iconoface);
		
		// añadir botones a la barra de herramientas
		JToolBar barra = new JToolBar();
		barra.add(anterior);
		barra.add(asp);
		barra.add(ayuda);
		barra.add(explorer);
		barra.add(face);
		// creacion de menu
		JMenuItem jmenuAbrir = new JMenuItem ("Abrir");
		JMenuItem jmenuSalvar = new JMenuItem ("Salvar");
		JMenuItem jmenuAlta = new JMenuItem ("Alta");
		JMenuItem jmenuBaja = new JMenuItem ("Baja");
		JMenu objJmenu = new JMenu("Ejemplo de menu");
		objJmenu.add(jmenuAbrir);
		objJmenu.add(jmenuSalvar);
		objJmenu.addSeparator();
		objJmenu.add(jmenuAlta);
		objJmenu.add(jmenuBaja);
		JMenu objJmenu2 = new JMenu("Ejemplo de menu dos");
		JMenuBar menuBar = new JMenuBar ();
		menuBar.add(objJmenu);
		menuBar.add(objJmenu2);
		
		// preparar interface usuario
				JTextArea editar = new JTextArea(8, 40);
				JScrollPane scroll = new JScrollPane(editar);
				BorderLayout borde = new BorderLayout();
				setLayout(borde);
				add("North", barra);
				add("Center", scroll);
				setJMenuBar(menuBar);
				pack();
				setVisible(true);
	}
	public static void main(String[] args)
	{
		new Menu2Barra();
	}
}
