package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import utilitarios.Conexion;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class competiciones extends JFrame
{

	private JPanel contentPane;
	private JTextField txtNombreCompeticion;
	
	public competiciones()
	{
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreCompeticion = new JLabel("Nombre Competicion");
		lblNombreCompeticion.setBounds(10, 58, 133, 14);
		contentPane.add(lblNombreCompeticion);
		
		txtNombreCompeticion = new JTextField();
		txtNombreCompeticion.setBounds(147, 55, 245, 20);
		contentPane.add(txtNombreCompeticion);
		txtNombreCompeticion.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					insertarCompeticiones();
					txtNombreCompeticion.setText("");
				} 
				catch (Exception e2)
				{
				}
			}
		});
		btnProcesar.setBounds(303, 86, 89, 23);
		contentPane.add(btnProcesar);
		
		JLabel lblIngreseElNuevo = new JLabel("Ingrese el nuevo nombre de la competicion a Registrar");
		lblIngreseElNuevo.setBounds(69, 11, 323, 14);
		contentPane.add(lblIngreseElNuevo);
	}
	
	
	void insertarCompeticiones () throws SQLException
	{
		String NombreCompeticion = txtNombreCompeticion.getText();
		Conexion objConexion = new Conexion(); 
		objConexion.conexion();
		Statement st = objConexion.conn.createStatement();
		try
		{
			st.executeUpdate("INSERT INTO competicion (nombre_competicion) "
					+ "VALUES ('"+NombreCompeticion+"' )");
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
					competiciones frame = new competiciones();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
