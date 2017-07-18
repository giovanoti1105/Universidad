package Vectores;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import Vectores.PpalVect;

public class ventanaPrincipal extends JFrame
{
	Panel pnPrincipal = new Panel(new GridLayout(0, 2));
	Label lblprimerVector = new Label("Primer vector");
	Label lblsegundoVector = new Label("Segundo vector");
	Label lblResultado = new Label("Resultado");
	static TextField txtPrimerVector;
	static TextField txtSegundoVector;
	static TextField txtResultado;
	Label lblAlumno = new Label("Alumno Andres Nova");
	JButton botonProcesar;
	FlowLayout flowLayout1 = new FlowLayout();

	// constructor de la clase
	ventanaPrincipal()
	{
		getFrame();
		getPael();
		getBotonProcesar();
	}

	// funcion que contiene la ventana principal
	void getFrame()
	{
		JFrame VentanaVectores = new JFrame("Vectores");
		VentanaVectores.setVisible(true);
		VentanaVectores.setSize(300, 300);
		VentanaVectores.setDefaultCloseOperation(EXIT_ON_CLOSE);
		VentanaVectores.add(pnPrincipal);
	}

	//funcion carga el panel con sus componenetes
	void getPael()
	{
		pnPrincipal.setLayout(null);
		lblprimerVector.setBounds(50, 32, 100, 20);
		txtPrimerVector = new TextField();
		txtPrimerVector.setBounds(150, 32, 100, 20);
		lblsegundoVector.setBounds(50, 62, 100, 20);
		txtSegundoVector = new TextField();
		txtSegundoVector.setBounds(150, 62, 100, 20);
		lblResultado.setBounds(50, 92, 100, 20);
		txtResultado = new TextField();
		txtResultado.setBounds(150, 92, 100, 20);
		lblAlumno.setBounds(50, 182, 180, 20);
		pnPrincipal.add(lblprimerVector);
		pnPrincipal.add(lblsegundoVector);
		pnPrincipal.add(txtPrimerVector);
		pnPrincipal.add(txtSegundoVector);
		pnPrincipal.add(lblResultado);
		pnPrincipal.add(txtResultado);
		pnPrincipal.add(lblAlumno);
	}

	// funcion boton procesar
	public void getBotonProcesar()
	{
		botonProcesar = new JButton();
		botonProcesar.setBounds(50, 132, 150, 20);
		botonProcesar.setText("Procesar");
		pnPrincipal.add(botonProcesar);
		botonProcesar.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				String vectorUno = txtPrimerVector.getText();
				String vectorDos = txtSegundoVector.getText();
				try
				{
					PpalVect.CalculoVectores(vectorUno, vectorDos);
				} 
				catch (Exception e)
				{}
			}
		});
	}

	// metodo main procesa la ventana
	public static void main(String[] args)
	{
		new ventanaPrincipal();
	}
}
