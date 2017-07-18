package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import utilitarios.Conexion;

import java.sql.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Clubes extends JFrame
{
	private JPanel contentPane;
	private JTextField txtNombreClub;
	private JTextField txtCodigoClub;
	private JTextField txtNumeroSocios;
	static Statement st ;
	private JTextField txtCodFed;

	/**
	 * Create the frame.
	 */
	public Clubes()
	{
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDelClub = new JLabel("Nombre del Club");
		lblNombreDelClub.setBounds(29, 37, 99, 14);
		contentPane.add(lblNombreDelClub);
		
		txtNombreClub = new JTextField();
		txtNombreClub.setBounds(138, 34, 191, 20);
		contentPane.add(txtNombreClub);
		txtNombreClub.setColumns(10);
		
		JLabel lblCodigoClub = new JLabel("Codigo Club");
		lblCodigoClub.setBounds(29, 62, 76, 14);
		contentPane.add(lblCodigoClub);
		
		txtCodigoClub = new JTextField();
		txtCodigoClub.setBounds(138, 59, 191, 20);
		contentPane.add(txtCodigoClub);
		txtCodigoClub.setColumns(10);
		
		JLabel lblNumeroSocios = new JLabel("Numero Socios");
		lblNumeroSocios.setBounds(29, 122, 99, 14);
		contentPane.add(lblNumeroSocios);
		
		txtNumeroSocios = new JTextField();
		txtNumeroSocios.setBounds(138, 119, 70, 20);
		contentPane.add(txtNumeroSocios);
		txtNumeroSocios.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try
				{
					insertarclubes ();
					txtCodigoClub.setText("");
					txtNombreClub.setText("");
					txtCodFed.setText("");
					txtNumeroSocios.setText("");
					JOptionPane.showMessageDialog(null, "Registro Exitoso : ");
					
				} catch (Exception e)
				{
				}
				
			}
		});
		btnProcesar.setBounds(218, 118, 89, 23);
		contentPane.add(btnProcesar);
		
		JLabel lblVentanaParaInsertar = new JLabel("Ventana para Insertar clubes a la Base de Datos");
		lblVentanaParaInsertar.setBounds(82, 11, 315, 14);
		contentPane.add(lblVentanaParaInsertar);
		
		JLabel lblCodigoFederacion = new JLabel("Codigo Fed");
		lblCodigoFederacion.setBounds(29, 87, 86, 14);
		contentPane.add(lblCodigoFederacion);
		
		txtCodFed = new JTextField();
		txtCodFed.setBounds(138, 84, 86, 20);
		contentPane.add(txtCodFed);
		txtCodFed.setColumns(10);
	}
	
	
	
	void insertarclubes () throws SQLException
	{
		String codigoClubes= txtCodigoClub.getText();
		String nombreClub = txtNombreClub.getText();
		String numeroSocios = txtNumeroSocios.getText();
		
		Conexion objConexion = new Conexion(); 
		objConexion.conexion();
		Statement st = objConexion.conn.createStatement();
		try
		{
			st.executeUpdate("INSERT INTO club (nombre_club, codigo_club, num_socios) "
					+ "VALUES ('"+codigoClubes+"','"+nombreClub+"','"+numeroSocios+"' )");
			st.close();
			objConexion.desconectar();
			
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
					Clubes frame = new Clubes();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}