package Cursos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class Cursos extends JFrame
{
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombreR;
	private JLabel lblApellidos;
	private JTextField txtApellidoR;
	private JLabel lblCodigoCurso;
	private JTextField txtNombreCursoR;
	private JTable tblCursosRegistrados;
	/**
	 * Create the frame.
	 */
	public Cursos()
	{
		getPantallaCursos();
	}
	
	// funcion que carga la pantalla principal
	public void getPantallaCursos()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 11, 64, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(84, 8, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 36, 66, 14);
		contentPane.add(lblNombre);
		
		txtNombreR = new JTextField();
		txtNombreR.setBounds(84, 33, 223, 20);
		contentPane.add(txtNombreR);
		txtNombreR.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 61, 46, 14);
		contentPane.add(lblApellidos);
		
		txtApellidoR = new JTextField();
		txtApellidoR.setBounds(84, 58, 223, 20);
		contentPane.add(txtApellidoR);
		txtApellidoR.setColumns(10);
		
		lblCodigoCurso = new JLabel("Codigo Curso");
		lblCodigoCurso.setBounds(10, 100, 80, 14);
		contentPane.add(lblCodigoCurso);
		
		JComboBox cmbCodigoCursoR = new JComboBox();
		cmbCodigoCursoR.setBounds(119, 97, 28, 20);
		contentPane.add(cmbCodigoCursoR);
		
		JLabel lblNombreCurso = new JLabel("Nombre Curso");
		lblNombreCurso.setBounds(10, 124, 97, 14);
		contentPane.add(lblNombreCurso);
		
		txtNombreCursoR = new JTextField();
		txtNombreCursoR.setEditable(false);
		txtNombreCursoR.setBounds(119, 121, 235, 20);
		contentPane.add(txtNombreCursoR);
		txtNombreCursoR.setColumns(10);
		
		tblCursosRegistrados = new JTable();
		tblCursosRegistrados.setEnabled(false);
		tblCursosRegistrados.setBorder(new LineBorder(new Color(0, 0, 0)));
		tblCursosRegistrados.setBounds(10, 172, 414, 78);
		contentPane.add(tblCursosRegistrados);
		tblCursosRegistrados.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Cursos frame = new Cursos();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
