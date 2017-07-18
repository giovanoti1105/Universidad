package Applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;

public class grillas extends java.applet.Applet
{
	private Button uno;
	private Button dos;
	private Button tres;
	private Button cuatro;
	private Button cinco;
	private Button seis;
	private TextField texto;
	private GridLayout grilla;
	
	
	public grillas()
	{
		tablero();
	}
	public void tablero()
	{
		texto = new TextField();
		uno = new Button("uno");
		dos = new Button("dos");
		tres = new Button("tres");
		cuatro = new Button("cuatro");
		cinco = new Button("cinco");
		seis = new Button("seis");
		grilla = new GridLayout(3,3,30,30); 
	}
	public void init()
	{
		setLayout(grilla);
		add(texto);
		add(uno);
		add(dos);
		add(tres);
		add(cuatro);
		add(cinco);
		add(seis);
	}
}
