package Varios.Guis;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CambiarTitulo extends JFrame implements ActionListener
{
	JButton b1 = new JButton("Curso JavaScript");
	JButton b2 = new JButton("Curso PHP");
	
	public CambiarTitulo()
	{
		super("Barra de Titulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		FlowLayout flow = new FlowLayout ();
		setLayout(flow);
		add(b1);
		add(b2);
		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object fuente = e.getSource();
		if ( fuente==b1)
		{
			setTitle("Curso JavaScript");
		}
		else if(fuente == b2)
		{
			setTitle("Curso PHP");
		}
	}
	public static void main(String[] args)
	{
		new CambiarTitulo();
	}
	

}
