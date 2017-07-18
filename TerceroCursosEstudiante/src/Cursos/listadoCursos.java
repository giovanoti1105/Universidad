package Cursos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import Utilitarios.Conexion;

public class listadoCursos extends JFrame
{
	private JPanel contentPane;
	private JTable table;
	private Vector columnas;
	private Vector filas;
	private Vector fila;
	
	// CONSTRUCTOR DE LA CLASE
	public listadoCursos()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getTabla();
		
	}
	
	// FUNCION TABLA
	void getTabla()
	{
		columnas = new Vector();
		columnas.add("Columna A");
		columnas.add("Columna B");
		columnas.add("Columna C");
		filas = new Vector();
		fila = new Vector();
		fila.add("X");
		fila.add("Y");
		fila.add("Z");
		filas.add(fila);
		table = new JTable(filas,columnas);
		contentPane.add(table);
		table.setVisible(true);
	}
		
	
	//funcion para llenar filas de la tabla
	public void cargandoTabla()
	{
		/*
		Conexion objConexion = new Conexion(); 
		objConexion.conexion();
		Statement st = objConexion.conn.createStatement();

		try
		{
//			st.executeUpdate("select (idCURSOS,NOMB_CURSO,NRO_CREDITOS,COD_PENSUM) from cursos"
	//				+ "VALUES ('"+codigo+"','"+nombres+"','"+apellidos+"' )");
		} 
		catch (Exception e)
		{ }
	*/	
//		st.close();
	//	objConexion.desconectar();
	}
	
	// FUNCION PRINCIPAL LLAMA AL FORMULARIO
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					listadoCursos frame = new listadoCursos();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
