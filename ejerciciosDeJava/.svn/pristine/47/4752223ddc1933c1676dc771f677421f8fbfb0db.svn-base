package Varios.Guis;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.plaf.ProgressBarUI;

public class BarraProgreso extends JFrame
{
	JProgressBar actual;
	int num = 0;

	public BarraProgreso()
	{
		super("Barra de Progreso");
		setSize(205, 68);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		actual = new JProgressBar(0, 2000);
		actual.setValue(0);
		actual.setStringPainted(true);
		add(actual);
	}

	public void iterate()
	{
		while (num < 2000)
		{
			actual.setValue(num);
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
			}
			num += 95;
		}
	}

	public static void main(String[] args)
	{
		BarraProgreso marco = new BarraProgreso();
		marco.setVisible(true);
		marco.iterate();

	}

}