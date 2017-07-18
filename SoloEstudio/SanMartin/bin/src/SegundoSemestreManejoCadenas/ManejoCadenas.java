package SegundoSemestreManejoCadenas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oracle.jrockit.jfr.JFR;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.sun.xml.internal.ws.api.message.Message;

public class ManejoCadenas extends JFrame implements ActionListener
{
	private JPanel ventanaPrincipal;
	private JFrame formulario;
	public JTextField txtCadenaUno;
	public JTextField txtCadenaDos;
	public JTextField txtCadenaUnoInvertida;
	public JTextField txtCadenaDosInvertida;
	private JButton btnSalir;
	private JButton btnProcesarCadena;
	private JLabel lblCadenaLarga;
	

	public ManejoCadenas()
	{
		 JFrame objVentana = getFormulario();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objVentana.setVisible(true);
		objVentana.setSize(700, 300);
	}
	
	private JFrame getFormulario()
	{
		
		formulario = new JFrame();
		formulario.setTitle("Manejo de cadenas de caracteres");
		formulario.setContentPane(getVentanaPrincipal());
		return formulario;
	}
	
	private JPanel getVentanaPrincipal()
	{
		ventanaPrincipal = new JPanel();
		ventanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventanaPrincipal.setLayout(new BorderLayout(0, 0));
		ventanaPrincipal.setLayout(null);
		
		JLabel lblCadenaUno = new JLabel("Cadena No 1");
		lblCadenaUno.setBounds(28, 36, 94, 14);
		ventanaPrincipal.add(lblCadenaUno);
		
		JLabel lblCadenaDos = new JLabel("Cadena No 2");
		lblCadenaDos.setBounds(28, 77, 94, 14);
		ventanaPrincipal.add(lblCadenaDos);
		
		JLabel lblCadenaUnoInvertida = new JLabel("Cadena No 1 Invertida");
		lblCadenaUnoInvertida.setBounds(28, 119, 133, 14);
		ventanaPrincipal.add(lblCadenaUnoInvertida);
		
		JLabel lblCadenaDosInvertida = new JLabel("Cadena No 2 Invertida");
		lblCadenaDosInvertida.setBounds(28, 168, 133, 14);
		ventanaPrincipal.add(lblCadenaDosInvertida);
		
		JLabel lblCadenaMasLarga = new JLabel("Cadena mas Larga");
		lblCadenaMasLarga.setBounds(28, 217, 133, 14);
		ventanaPrincipal.add(lblCadenaMasLarga);
		
		txtCadenaUno = new JTextField();
		txtCadenaUno.setBounds(199, 33, 295, 20);
		ventanaPrincipal.add(txtCadenaUno);
		txtCadenaUno.setColumns(10);
		
		txtCadenaDos = new JTextField();
		txtCadenaDos.setText("");
		txtCadenaDos.setBounds(199, 74, 295, 20);
		ventanaPrincipal.add(txtCadenaDos);
		txtCadenaDos.setColumns(10);
		
		txtCadenaUnoInvertida = new JTextField();
		txtCadenaUnoInvertida.setBounds(199, 116, 295, 20);
		ventanaPrincipal.add(txtCadenaUnoInvertida);
		txtCadenaUnoInvertida.setColumns(10);
		
		txtCadenaDosInvertida = new JTextField();
		txtCadenaDosInvertida.setBounds(199, 165, 295, 20);
		ventanaPrincipal.add(txtCadenaDosInvertida);
		txtCadenaDosInvertida.setColumns(10);
		
		lblCadenaLarga = new JLabel("");
		lblCadenaLarga.setBounds(199, 205, 295, 26);
		ventanaPrincipal.add(lblCadenaLarga);
		
		btnProcesarCadena = new JButton("Procesar Cadena");
		btnProcesarCadena.setBounds(504, 32, 158, 23);
		ventanaPrincipal.add(btnProcesarCadena);
		btnProcesarCadena.addActionListener(this);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(504, 73, 158, 23);
		ventanaPrincipal.add(btnSalir);
		btnSalir.addActionListener(this);
		
		return ventanaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnSalir)
		{
			System.exit(0);
		}
		
		if(e.getSource()==btnProcesarCadena)
		{
			try
			{
			ProcesadorCadenas objCadenas = new ProcesadorCadenas();
			String invertida="";
			String cadenaMasLarga="";
			
			String cadenaUno = txtCadenaUno.getText();
			invertida = objCadenas.invertirCadenas(cadenaUno);
			txtCadenaUnoInvertida.setText(invertida);
			
			String cadenaDos = txtCadenaDos.getText();
			invertida = objCadenas.invertirCadenas(cadenaDos);
			txtCadenaDosInvertida.setText(invertida);
			
			cadenaMasLarga = objCadenas.cadenaMasLarga(cadenaUno, cadenaDos);
			lblCadenaLarga.setText(cadenaMasLarga);
			} 
			
			catch (Exception e2)
			{
			e2.getMessage();
				// TODO: handle exception
			}
		}
	}
	
	/**
	 * metodi principal del main.
	 */
	public static void main(String[] args)
	{
		try
		{
			new ManejoCadenas();
		} 
		catch (Exception e)
		{}
	}
}