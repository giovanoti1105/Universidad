package Cursos;

import java.awt.BorderLayout;
import Utilitarios.*;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistroCurso extends JFrame
{
	private JPanel contentPane;
	private JTextField txtCodigoCurso;
	private JTextField txtNombreCurso;
	private JTextField txtNroCreditos;
	private JTextField txtCodPensum;

	public RegistroCurso()
	{
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getPantallaPrincipal();
		getBotoRegistrar();
	}

	void getBotoRegistrar()
	{
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(273, 96, 89, 23);
		contentPane.add(btnProcesar);
		btnProcesar.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				try
				{
					insertarCursos();
					txtCodigoCurso.setText("");
					txtNombreCurso.setText("");
					txtNroCreditos.setText("");
					txtCodPensum.setText("");
				} catch (SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
	}
	
	// funcion carga pantalla principal
	void getPantallaPrincipal()
	{
		setBounds(100, 100, 450, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCodigoCurso = new JLabel("Codigo Curso");
		lblCodigoCurso.setBounds(10, 20, 103, 14);
		contentPane.add(lblCodigoCurso);

		txtCodigoCurso = new JTextField();
		txtCodigoCurso.setBounds(145, 20, 111, 20);
		contentPane.add(txtCodigoCurso);
		txtCodigoCurso.setColumns(10);

		JLabel lblNombreCurso = new JLabel("Nombre Curso");
		lblNombreCurso.setBounds(10, 40, 103, 14);
		contentPane.add(lblNombreCurso);

		txtNombreCurso = new JTextField();
		txtNombreCurso.setBounds(145, 40, 217, 20);
		contentPane.add(txtNombreCurso);
		txtNombreCurso.setColumns(10);

		JLabel lblNumeroCreditos = new JLabel("Numero Creditos");
		lblNumeroCreditos.setBounds(10, 60, 103, 14);
		contentPane.add(lblNumeroCreditos);

		txtNroCreditos = new JTextField();
		txtNroCreditos.setBounds(145, 60, 86, 20);
		contentPane.add(txtNroCreditos);
		txtNroCreditos.setColumns(10);
		
		JLabel lblCodPensum = new JLabel("Codigo Pensum");
		lblCodPensum.setBounds(10, 80, 103, 14);
		contentPane.add(lblCodPensum);
		
		txtCodPensum = new JTextField();
		txtCodPensum.setBounds(145, 80, 86, 20);
		contentPane.add(txtCodPensum);
		txtCodPensum.setColumns(10);
	}
	
	 // funcion que innserta los cursos en la base de datos usando el boton registrar
	void insertarCursos() throws SQLException
	{
		String codigo= txtCodigoCurso.getText();
		String nombreCurso = txtNombreCurso.getText();
		String numeroCreditos = txtNroCreditos.getText();
		String numeroPensum = txtCodPensum.getText();
		Conexion objConexion = new Conexion();
		//objConexion.conexion();
		//Conexion conn = null;
		objConexion.conexion();
		Statement st = objConexion.conn.createStatement();
		try
		{
			st.executeUpdate("INSERT INTO cursos (IdCURSOS, NOMB_CURSO, NRO_CREDITOS,COD_PENSUM) "
					+ "VALUES ('"+codigo+"','"+nombreCurso+"','"+numeroCreditos+"','"+numeroPensum+"' )");
			st.close();
			objConexion.desconectar();
		} 
		catch (Exception e)
		{
			e.getMessage();
			st.close();
			objConexion.desconectar();
		}
		st.close();
		objConexion.desconectar();
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					RegistroCurso frame = new RegistroCurso();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}