package Principal;

import java.awt.EventQueue;
import Cursos.*;
import Estudiantes.*;
import Utilitarios.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class PrincipalEst extends JFrame
{
	private JPanel principal;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtCodigo;
	private JButton btnRegistrar;
	private JTextField txtCodigoRegistro;
	private JTextField txtNombreRegistro;
	private JTextField txtApellidoRegistro;
	private JTextField txtPromedioRegistro;
	private JButton btnPruebaAcademica;
	private JButton btnRegistrarCurso;
	private JButton btnCursoEnPensum;
	private JButton btnRegistrarNota;
	private JButton btnCursos;
	
	//constructor de la clase
	public PrincipalEst()
	{
		getPanelPrincipal();
		getPanelRegistroEstudiante();
		getPanelInformacionEstudiante();
		getBotones();
	}
	
	//geter carga el panel principal
	void getPanelPrincipal()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		principal = new JPanel();
		principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(principal);
		principal.setLayout(null);
	}
	
	//panel carga el registro de estudiantes
	void getPanelRegistroEstudiante()
	{
		JPanel regEstudiantes = new JPanel();
		regEstudiantes.setBorder(new TitledBorder(null, "Registro de Estudiante", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		regEstudiantes.setBounds(10, 11, 514, 92);
		principal.add(regEstudiantes);
		regEstudiantes.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 28, 37, 14);
		regEstudiantes.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(78, 26, 238, 20);
		regEstudiantes.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 64, 46, 14);
		regEstudiantes.add(lblApellido);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(78, 54, 238, 20);
		regEstudiantes.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(326, 28, 46, 14);
		regEstudiantes.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(395, 25, 86, 20);
		regEstudiantes.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(395, 53, 89, 23);
		regEstudiantes.add(btnRegistrar);
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Estudiante objDatosEstudiante = new Estudiante();
				String nombre = txtNombre.getText();
				String apellido = txtApellidos.getText();
				String codigo = txtCodigo.getText();
				try
				{
					objDatosEstudiante.datosEstudiante(nombre,apellido,codigo);
					txtNombre.setText("");
					txtApellidos.setText("");
					txtCodigo.setText("");
				} catch (SQLException e)
				{
					e.printStackTrace();
					txtNombreRegistro.setText(nombre);
					txtApellidoRegistro.setText(apellido);
					txtCodigoRegistro.setText(codigo);
				}
			}
		});
	}
	
	// funcion crea panel de informacion del estudiante
	void getPanelInformacionEstudiante()
	{
		JPanel jpInfoEstudiante = new JPanel();
		jpInfoEstudiante.setBorder(new TitledBorder(null, "Informacion Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpInfoEstudiante.setBounds(126, 114, 305, 121);
		principal.add(jpInfoEstudiante);
		jpInfoEstudiante.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 23, 46, 14);
		jpInfoEstudiante.add(lblCodigo);
		
		txtCodigoRegistro = new JTextField();
		txtCodigoRegistro.setBounds(71, 21, 210, 17);
		jpInfoEstudiante.add(txtCodigoRegistro);
		txtCodigoRegistro.setColumns(10);
		txtCodigoRegistro.setEditable(false);
		
		JLabel lblNombreRegistro = new JLabel("Nombre");
		lblNombreRegistro.setBounds(10, 49, 46, 14);
		jpInfoEstudiante.add(lblNombreRegistro);
		
		txtNombreRegistro = new JTextField();
		txtNombreRegistro.setBounds(71, 49, 210, 17);
		jpInfoEstudiante.add(txtNombreRegistro);
		txtNombreRegistro.setColumns(10);
		txtNombreRegistro.setEditable(false);
		
		JLabel lblApellidoRegistro = new JLabel("Apellido");
		lblApellidoRegistro.setBounds(10, 73, 46, 14);
		jpInfoEstudiante.add(lblApellidoRegistro);
		
		txtApellidoRegistro = new JTextField();
		txtApellidoRegistro.setBounds(71, 71, 210, 17);
		jpInfoEstudiante.add(txtApellidoRegistro);
		txtApellidoRegistro.setColumns(10);
		txtApellidoRegistro.setEditable(false);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(10, 95, 46, 14);
		jpInfoEstudiante.add(lblPromedio);
		
		txtPromedioRegistro = new JTextField();
		txtPromedioRegistro.setBounds(71, 93, 210, 17);
		jpInfoEstudiante.add(txtPromedioRegistro);
		txtPromedioRegistro.setColumns(10);
		txtPromedioRegistro.setEditable(false);
	}
	
	// funcion que almacena los botones con sus respectivos procesos
	private void getBotones()
	{
		btnPruebaAcademica = new JButton("Prueba Academica ?");
		btnPruebaAcademica.setBounds(136, 246, 161, 23);
		principal.add(btnPruebaAcademica);
		
		btnRegistrarCurso = new JButton("Registrar Curso");
		btnRegistrarCurso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RegistroCurso objReg = new RegistroCurso();
				//objReg.setLocation(null);
				objReg.setVisible(true);
			}
		});
		btnRegistrarCurso.setBounds(136, 271, 161, 23);
		principal.add(btnRegistrarCurso);
		
		btnCursoEnPensum = new JButton("Curso en Pensum ?");
		btnCursoEnPensum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Estudiante objDatosEstudiante = new Estudiante();
			}
		});
		btnCursoEnPensum.setBounds(136, 296, 161, 23);
		principal.add(btnCursoEnPensum);
		
		btnRegistrarNota = new JButton("Registrar Nota");
		btnRegistrarNota.setBounds(307, 246, 124, 23);
		principal.add(btnRegistrarNota);
		
		btnCursos = new JButton("Ver Cursos");
		btnCursos.setBounds(307, 271, 124, 23);
		principal.add(btnCursos);
	}

	/**
	 * menu principal ejecuta la ventana
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					PrincipalEst frame = new PrincipalEst();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}