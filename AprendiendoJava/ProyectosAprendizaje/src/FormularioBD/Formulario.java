package FormularioBD;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.apache.log4j.Logger;
import Cadenas.HolaMundo;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Formulario extends JFrame {
	
	private static final Logger logger = Logger.getLogger(Formulario.class);
	private JPanel contentPane;
	private JTextField descripcion;
	private JTextField precio;
	private JTextField codigo;
	private JLabel labelResultado;
	private JButton btnConsultaPorCdigo;
	private JLabel lblIngreseCdigoDe;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					logger.info("Inicio formulario " + e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblDescripcinDelArtculo = new JLabel("Descripción del artículo:");
		lblDescripcinDelArtculo.setBounds(23, 38, 193, 14);
		contentPane.add(lblDescripcinDelArtculo);
		descripcion = new JTextField();
		descripcion.setBounds(247, 35, 193, 20);
		contentPane.add(descripcion);
		descripcion.setColumns(10);
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(23, 74, 95, 14);
		contentPane.add(lblPrecio);
		precio = new JTextField();
		precio.setBounds(247, 71, 107, 20);
		contentPane.add(precio);
		precio.setColumns(10);
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelResultado.setText("");
				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_ejemplos", "admin", "c4p3r1t4");
					System.out.println("Conectando : " + conexion);
					Statement comando = conexion.createStatement();
					comando.executeUpdate("insert into articulos(nombre,precio,codigo) values ('" + descripcion.getText() + "'," + precio.getText() + "," + codigo.getText() + ")");
					logger.info("Registros insertados " + descripcion.getText() + precio.getText() + codigo.getText());
					conexion.close();
					labelResultado.setText("se registraron los datos");
					descripcion.setText("");
					precio.setText("");

					
				} catch (SQLException ex) {
					setTitle(ex.toString());
					logger.error("Falla de conexion " + ex);
				}
			}
		});
		btnAlta.setBounds(247, 118, 89, 23);
		contentPane.add(btnAlta);
		labelResultado = new JLabel("resultado");
		labelResultado.setBounds(361, 122, 229, 14);
		contentPane.add(labelResultado);
		btnConsultaPorCdigo = new JButton("Consulta por código");
		btnConsultaPorCdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelResultado.setText("");
				descripcion.setText("");
				precio.setText("");
				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_ejemplos", "admin", "c4p3r1t4");
					Statement comando = conexion.createStatement();
					ResultSet registro = comando
							.executeQuery("select * from articulos where codigo=" + codigo.getText());
					if (registro.next() == true) {
						descripcion.setText(registro.getString("descripcion"));
						precio.setText(registro.getString("precio"));
						//codigo.setText(registro.getString("codigo"));
						
					} else {
						labelResultado.setText("No existe un artículo con dicho código");
					}
					conexion.close();
				} catch (SQLException ex) {
					setTitle(ex.toString());
					logger.error("Error en consulta " + ex.getMessage());
				}
			}
		});
		btnConsultaPorCdigo.setBounds(23, 212, 177, 23);
		contentPane.add(btnConsultaPorCdigo);
		lblIngreseCdigoDe = new JLabel("Ingrese código de articulo a consultar:");
		lblIngreseCdigoDe.setBounds(10, 179, 243, 14);
		contentPane.add(lblIngreseCdigoDe);
		codigo = new JTextField();
		codigo.setBounds(247, 176, 86, 20);
		contentPane.add(codigo);
		codigo.setColumns(10);
		cargarDriver();
	}

	private void cargarDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception ex) {
			setTitle(ex.toString());
		}
	}
}
