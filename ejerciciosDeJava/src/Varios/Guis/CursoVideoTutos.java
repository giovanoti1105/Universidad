package Varios.Guis;

import java.awt.FlowLayout;

import javax.swing.*;

public class CursoVideoTutos extends JFrame
{
	public CursoVideoTutos()
	{
		super("Curso Videotutoriales");
		setSize(300, 500);
		//pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout objFlow = new FlowLayout();
		setLayout(objFlow);
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pausa = new JButton("Pausa");
		JLabel labelNombre = new JLabel("Direccion Web",JLabel.RIGHT);
		JTextField txtNombre = new JTextField("Escribe aqui",20);
		JCheckBox java = new JCheckBox("Curso Java ",true);
		JCheckBox net = new JCheckBox("Curso .Net ",false);
		JCheckBox php = new JCheckBox("Curso php ",false);
		JComboBox cursos = new JComboBox();
		ButtonGroup objCheckbox = new ButtonGroup();
		add(play);
		add(stop);
		add(pausa);
		add(labelNombre);
		add(txtNombre);
		objCheckbox.add(java);
		objCheckbox.add(php);
		objCheckbox.add(net);
		add(java);
		add(php);
		add(net);
		cursos.addItem("Curso Java");
		cursos.addItem("Curso .net");
		cursos.addItem("Curso php");
		cursos.setEditable(false);
		add(cursos);
		JTextArea objAreaTexto = new JTextArea (8,10);
		add(objAreaTexto);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		CursoVideoTutos objPantalla = new CursoVideoTutos();
	}
}
