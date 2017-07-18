package Applets;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CalculadoraApplet extends java.applet.Applet
{
	private TextField txtTextoArea;
	private Label lblresultado;
	private Button btnResultado;
	int numeroUno;
	int numeroDos;
	int resultado;
	
	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(int resultado)
	{
		this.resultado = resultado;
	}
	/**
	 * @return the numeroUno
	 */
	public int getNumeroUno()
	{
		return numeroUno;
	}
	/**
	 * @param numeroUno the numeroUno to set
	 */
	public void setNumeroUno(int numeroUno)
	{
		this.numeroUno = numeroUno;
	}
	/**
	 * @return the numeroDos
	 */
	public int getNumeroDos()
	{
		return numeroDos;
	}
	/**
	 * @param numeroDos the numeroDos to set
	 */
	public void setNumeroDos(int numeroDos)
	{
		this.numeroDos = numeroDos;
	}
	
	public void init()
	{
		Label nombre = new Label("Calculadora en applet",Label.RIGHT);
		add(nombre);
		getTextoArea();
		getLabelResultado();
		getBotonSuma();
		getBotonResta();
		getResultado();
		add(getTextoArea());
		add(getLabelResultado());
		add(getBotonSuma());
		add(getBotonResta());
		add(getResultado());
	}
	// funcion areaTexto
	public TextField getTextoArea()
	{
		txtTextoArea = new TextField("",20);
		return txtTextoArea;
	}
	
	// funcion label de respuesta
	public Label getLabelResultado()
	{
		lblresultado = new Label();
		lblresultado.setSize(90,90);
		
		return lblresultado;
	}
	
	// funcion boton suma
	public Button getBotonSuma()
	{
		Button btnSuma = new Button("Suma");
		btnSuma.setBackground(Color.blue);
		btnSuma.setBounds(150, 150, 150, 150);
		btnSuma.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					setNumeroUno(Integer.parseInt(txtTextoArea.getText()));
					lblresultado.setText(getNumeroUno() + " + ");
					txtTextoArea.setText("");
				} 
				catch (Exception e2)
				{ }
			}
		});
		return btnSuma;
	}
	// funcion boton resta
	public Button getBotonResta()
	{
		Button btnResta = new Button("Resta");
		btnResta.setBackground(Color.blue);
		btnResta.setBounds(150, 150, 150, 150);
		btnResta.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				txtTextoArea.setText("");
			}
		});
		return btnResta;
	}
	// funcion boton resultado
	public Button getResultado()
	{
		btnResultado = new Button("=");
		btnResultado.setBackground(Color.cyan);
		btnResultado.setBounds(150, 150, 150, 150);
		btnResultado.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(getBotonSuma() != null)
				{
					setNumeroDos(Integer.parseInt(txtTextoArea.getText()));
					
					int resultado = (getNumeroUno()+getNumeroDos());
					lblresultado.setText(String.valueOf(resultado));
					txtTextoArea.setText("");
					lblresultado.getText();
				}
			}
		});
		return btnResultado;
	}
}