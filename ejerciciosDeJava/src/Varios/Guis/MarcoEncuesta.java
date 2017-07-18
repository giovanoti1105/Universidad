package Varios.Guis;

import javax.swing.JFrame;

public class MarcoEncuesta extends JFrame
{
	public MarcoEncuesta()
	{
		super("Encuesta");
		setSize(290,140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AsistenteEncuesta asis = new AsistenteEncuesta ();
		add(asis);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MarcoEncuesta objmarco = new MarcoEncuesta();
	}
	

}
