package Varios.Guis;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gridlayo extends JFrame
{
	JButton a = new JButton("Abierto");
	JButton b = new JButton("Basico");
	JButton c = new JButton("Cerrado");
	JButton d = new JButton("Dejado");
	JButton e = new JButton("Escrito");
	JButton f = new JButton("Facil");
	JButton g = new JButton("Gastado");
	
	public Gridlayo()
	{
		super();
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		GridLayout grilla = new GridLayout (3,3,10,10);
		panel.setLayout(grilla);
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		panel.add(e);
		panel.add(f);
		panel.add(g);
		add(panel);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new Gridlayo ();
	}
	

}
