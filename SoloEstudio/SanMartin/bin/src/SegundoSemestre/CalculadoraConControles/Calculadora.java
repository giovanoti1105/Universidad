package SegundoSemestre.CalculadoraConControles;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame implements ActionListener
{
	private JPanel ventanaPrincipal;
	private JFrame formulario;
	public JTextField txtcampoNumero1;
	public JTextField txtcampoNumero2;
	public JTextField txtcampoRespuesta;
	public JButton btnSumar;
	public JButton btnRestar;
	public JButton btnMultiplicar;
	public JButton btnDividir;
	private JLabel lblNumeroUno;
	private JLabel lblNumeroDos;
	private JLabel lblRespuesta;
	/**
	 * Constructor de la clase
	 */
	public Calculadora()
	{
		// creacion de un nuevo frame
		JFrame ventana = getFormulario();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// definicion del tamaño de la ventana
		ventana.setSize(600, 200);
		ventana.setVisible(true);
	}

	private JFrame getFormulario()
	{
		if (formulario == null)
		{
			formulario = new JFrame();
			formulario.setTitle("Ventana Calculadora");
			formulario.setSize(600, 300);
			formulario.setContentPane(getVentanaPrincipal());
		}
		return formulario;
	}

	// funcion que inicializa el panel donde van los complementos
	private JPanel getVentanaPrincipal()
	{
		if (ventanaPrincipal == null)
		{
			ventanaPrincipal = new JPanel();
			ventanaPrincipal.setLayout(null);
			lblNumeroUno = new JLabel("Numero 1: ");
			lblNumeroUno.setBounds(5, 9, 53, 14);
			ventanaPrincipal.add(lblNumeroUno);
			lblNumeroDos = new JLabel("Numero 2:");
			lblNumeroDos.setBounds(5, 37, 50, 14);
			ventanaPrincipal.add(lblNumeroDos);
			lblRespuesta = new JLabel("Respuesta");
			lblRespuesta.setBounds(5, 68, 51, 14);
			ventanaPrincipal.add(lblRespuesta);
			btnSumar = new JButton("Sumar");
			btnSumar.setBounds(286, 5, 79, 23);
			btnSumar.addActionListener(this);
			btnRestar = new JButton("Restar");
			btnRestar.setBounds(433, 5, 79, 23);
			btnRestar.addActionListener(this);
			btnMultiplicar = new JButton("Multiplicar");
			btnMultiplicar.setBounds(286, 33, 79, 23);
			btnMultiplicar.addActionListener(this);
			btnDividir = new JButton("Dividir");
			btnDividir.setBounds(433, 33, 79, 23);
			btnDividir.addActionListener(this);
			txtcampoNumero1 = new JTextField();
			txtcampoNumero1.setBounds(81, 6, 195, 20);
			txtcampoNumero1.setColumns(10);
			txtcampoNumero2 = new JTextField();
			txtcampoNumero2.setBounds(81, 34, 195, 20);
			txtcampoNumero2.setColumns(10);
			txtcampoRespuesta = new JTextField();
			txtcampoRespuesta.setBounds(81, 65, 195, 20);
			txtcampoRespuesta.setColumns(10);
			ventanaPrincipal.add(txtcampoNumero1);
			ventanaPrincipal.add(txtcampoNumero2);
			ventanaPrincipal.add(txtcampoRespuesta);
			ventanaPrincipal.add(btnSumar);
			ventanaPrincipal.add(btnRestar);
			ventanaPrincipal.add(btnMultiplicar);
			ventanaPrincipal.add(btnDividir);
		}
		return ventanaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			Calculos objCalculos = new Calculos();
			String textoUno = txtcampoNumero1.getText();
			String textoDos = txtcampoNumero2.getText();
			String respuesta = "";

			if (e.getSource() == btnSumar)
			{
				respuesta=objCalculos.onClickBtnSuma(textoUno, textoDos);
				txtcampoRespuesta.setText(respuesta);
			}
			if (e.getSource() == btnRestar)
			{
				respuesta=objCalculos.onClickBtnResta(textoUno, textoDos);
				txtcampoRespuesta.setText(respuesta);
			}
			if (e.getSource() == btnMultiplicar)
			{
				respuesta=objCalculos.onClickBtnMultiplicacion(textoUno, textoDos);
				txtcampoRespuesta.setText(respuesta);
			}
			if (e.getSource() == btnDividir)
			{
				respuesta=objCalculos.onClickBtnDivision(textoUno, textoDos);
				txtcampoRespuesta.setText(respuesta);
			}
		} catch (Exception e2)
		{
		}
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
		try
		{
			new Calculadora();
		} catch (Exception errorMain)
		{
			errorMain.toString();
			errorMain.printStackTrace();
		}
}
		});
	}
}