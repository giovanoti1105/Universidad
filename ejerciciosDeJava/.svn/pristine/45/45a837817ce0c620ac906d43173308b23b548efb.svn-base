package Varios.Guis;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class OtraBarra extends JFrame
{
	public OtraBarra()
	{
		super("Barra de Erramientas");
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
		// preparar interface usuario
		JTextArea editar = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(editar);
		BorderLayout borde = new BorderLayout();
		setLayout(borde);
		add("North", barra);
		add("Center", scroll);
		pack();
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new OtraBarra();
	}
}
