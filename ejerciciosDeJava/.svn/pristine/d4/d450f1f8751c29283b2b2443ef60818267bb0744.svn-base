package Varios.Guis;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Boxlayoutttt extends JFrame
{
	// constructor
	public Boxlayoutttt()
	{
		super();
		setSize(430,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// crear panel superior
		JPanel panelComando = new JPanel();
		BoxLayout objbox = new BoxLayout(panelComando,BoxLayout.X_AXIS );
		panelComando.setLayout(objbox);
		JButton a = new JButton("Abierto");
		JButton b = new JButton("Basico");
		JButton c = new JButton("Cerrado");
		JButton d = new JButton("Dejado");
		JButton e = new JButton("Escrito");
		JButton f = new JButton("Facil");
		JButton g = new JButton("Gastado");
		panelComando.add(a);
		panelComando.add(b);
		panelComando.add(c);
		panelComando.add(d);
		panelComando.add(e);
		panelComando.add(f);
		panelComando.add(g);
		// crear panel inferior
		JPanel panelInferior = new JPanel();
		JTextArea areatexto = new JTextArea(4,70);
		JScrollPane scroll = new JScrollPane(areatexto);
		FLayout flow = new FLayout();
		setLayout((LayoutManager) flow);
		// ponen juntos
		 add(panelComando);
		 add(panelInferior);
		 setVisible(true);
	}
	Boxlayoutttt obj = new Boxlayoutttt();
}