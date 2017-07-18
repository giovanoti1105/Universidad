package Varios.Guis;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brdlayout extends JFrame
{
	JButton a = new JButton("Abierto");
	JButton b = new JButton("Basico");
	JButton c = new JButton("Cerrado");
	JButton d = new JButton("Dejado");
	JButton e = new JButton("Escrito");
	JButton f = new JButton("Facil");
	JButton g = new JButton("Gastado");
	
	public Brdlayout()
	{
		super();
		setSize(210,280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout borde = new BorderLayout();
		setLayout( borde);
		add(a,borde.CENTER);
		add(b,borde.SOUTH);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new Brdlayout();
	}
	
	

}
