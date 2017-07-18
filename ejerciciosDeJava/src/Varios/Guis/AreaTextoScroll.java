package Varios.Guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaTextoScroll extends JFrame
{
	JScrollPane scrollpane;

	public AreaTextoScroll()
	{
		super("Area Texto Scroll");
		setSize(500, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea comentarios = new JTextArea(8, 40);
		FlowLayout objflowlayout = new FlowLayout();
		setLayout(objflowlayout );
		add(comentarios);
		setVisible(true);
		scrollpane = new JScrollPane(comentarios);
		getContentPane().add(scrollpane,BorderLayout.CENTER);
	}
	public static void main(String[] args)
	{
		new AreaTextoScroll();
	}

}
