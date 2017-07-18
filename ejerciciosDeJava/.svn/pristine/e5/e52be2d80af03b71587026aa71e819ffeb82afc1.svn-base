package Varios.Guis;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AsistenteEncuesta extends JPanel implements ActionListener
{
	int cartaActual=0;
	CardLayout cartas = new CardLayout ();
	PanelEncuesta[] pregunta = new PanelEncuesta[3];

	// constructor de la clase
	public AsistenteEncuesta()
	{
		super ();
		setSize(240,140);
		
		// configuracion de la encuesta
		String pregunta1 = "¿Cual es tu genero?";
		String []respuesta1 = {"Hombre","Mujer","No Contesto"};
		pregunta[0] = new PanelEncuesta(pregunta1,respuesta1,2);
		String pregunta2 = "¿Cual es tu Edad?";
		String []respuesta2 = {"Menos de 25","26 a 40","Mas de 40"};
		pregunta[1] = new PanelEncuesta(pregunta2,respuesta2,1);
		String pregunta3 = "¿Cuantas veces haces ejercicio?";
		String []respuesta3 = {"Nunca","1-3 Veces","mas de 3"};
		pregunta[2] = new PanelEncuesta(pregunta3,respuesta3,1);
		pregunta[2].setPreguntaFinal(true);
		for (int i = 0; i < pregunta.length; i++)
		{
			pregunta[i].botonSiguiente.addActionListener(this);
			pregunta[i].botonFinal.addActionListener(this);
			add(pregunta[i],"Carta" + 1);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		cartaActual++;
		if (cartaActual >= pregunta.length)
		{
			System.exit(0);
		}
		cartas.show(this, "Carta" + cartaActual);
	}
}


class PanelEncuesta extends JFrame
{
	JLabel pregunta;
	JRadioButton [] respuesta;
	JButton botonSiguiente = new JButton("Siguiente");
	JButton botonFinal = new JButton("Final");
	
	public PanelEncuesta(String pre, String [] resp, int def)
	{
		super();
		setSize(160,110);
		pregunta = new JLabel(pre);
		respuesta = new JRadioButton[resp.length];
		ButtonGroup grupo = new ButtonGroup();
		JPanel sub1 = new JPanel();
		JLabel prelabel1 = new JLabel(pre);
		sub1.add(prelabel1);
		JPanel sub2 = new JPanel();
		for (int i = 0; i < resp.length; i++)
		{
			if (def == i)
			{
				respuesta[i] = new JRadioButton(resp[i],true);
			}
			else
			{
				respuesta[i] = new JRadioButton(resp[i],true);
			}
			grupo.add(respuesta[i]);
			sub2.add(respuesta[i]);
		}
		JPanel sub3 = new JPanel();
		botonSiguiente.setEnabled(true);
		sub3.add(botonSiguiente);
		botonFinal.setEnabled(false);
		sub3.add(botonFinal);
		GridLayout grid = new GridLayout();
		setLayout(grid);
		add(sub1);
		add(sub2);
		add(sub3);
	}
	void setPreguntaFinal(boolean preguntaFinal)
	{
		if (preguntaFinal)
		{
			botonSiguiente.setEnabled(false);
			botonFinal.setEnabled(true);
		}
	}
	
}
