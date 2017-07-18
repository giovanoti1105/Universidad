package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utilitarios.Conexion;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class jugadores extends JFrame
{

	private JPanel contentPane;
	private JTextField txtCodigoPersona;
	private JTextField txtFechaInicio;
	private JTextField txtPesoJugador;
	private JTextField txtAlturaJugador;
	
	void insertarJugadores () throws SQLException
	{
		String codigoPersona = txtCodigoPersona.getText();
		String fechaInicioCarrera = txtFechaInicio.getText();
		String pesoJugador = txtPesoJugador.getText();
		String alturaJugador = txtAlturaJugador.getText();
		Conexion objConexion = new Conexion(); 
		objConexion.conexion();
		Statement st = objConexion.conn.createStatement();
		try
		{
			st.executeUpdate("INSERT INTO jugador (cod_persona,fec_inicio_carrera, peso_jugador, altura_jugador) "
					+ "VALUES ('"+codigoPersona+"','"+fechaInicioCarrera+"','"+pesoJugador+"','"+alturaJugador+"' )");
			st.close();
			objConexion.desconectar();
			JOptionPane.showMessageDialog(null, "Registro Exitoso : ");
		} 
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error al insertar causa : " + e);
			st.close();
			objConexion.desconectar();
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
					jugadores frame = new jugadores();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jugadores()
	{
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoPersona = new JLabel("Codigo persona");
		lblCodigoPersona.setBounds(34, 48, 93, 14);
		contentPane.add(lblCodigoPersona);
		
		JLabel lblFechaInicioCarrera = new JLabel("Fecha Inicio Carrera");
		lblFechaInicioCarrera.setBounds(34, 73, 114, 14);
		contentPane.add(lblFechaInicioCarrera);
		
		JLabel lblPesoJugador = new JLabel("Peso Jugador");
		lblPesoJugador.setBounds(34, 98, 93, 14);
		contentPane.add(lblPesoJugador);
		
		JLabel lblAlturaJugador = new JLabel("Altura Jugador");
		lblAlturaJugador.setBounds(34, 133, 93, 14);
		contentPane.add(lblAlturaJugador);
		
		txtCodigoPersona = new JTextField();
		txtCodigoPersona.setBounds(157, 45, 86, 20);
		contentPane.add(txtCodigoPersona);
		txtCodigoPersona.setColumns(10);
		
		txtFechaInicio = new JTextField();
		txtFechaInicio.setBounds(157, 70, 86, 20);
		contentPane.add(txtFechaInicio);
		txtFechaInicio.setColumns(10);
		
		txtPesoJugador = new JTextField();
		txtPesoJugador.setText("");
		txtPesoJugador.setBounds(157, 95, 86, 20);
		contentPane.add(txtPesoJugador);
		txtPesoJugador.setColumns(10);
		
		txtAlturaJugador = new JTextField();
		txtAlturaJugador.setText("");
		txtAlturaJugador.setBounds(157, 130, 86, 20);
		contentPane.add(txtAlturaJugador);
		txtAlturaJugador.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(298, 129, 89, 23);
		contentPane.add(btnProcesar);
	}

}
