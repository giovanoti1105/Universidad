package TercerSemestreCasoEmpleado;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaEmpleado extends JFrame
{
	static JPanel PanelPrincipal;
	static JTextField txtNombre;
	static JTextField txtApellido;
	static JTextField txtSexo;
	static JTextField txtFechaNacimiento;
	static JTextField txtFechaIngreso;
	static JTextField txtSalario;
	static JTextField txtCalculaEdad;
	static JTextField txtCalculaAntiguedad;
	static JTextField txtCalcularPrestaciones;
	static Empleado objInicializar = new Empleado();
	static Fecha objFechas = new Fecha(); 

	// constructor de la clase 
	public VentanaEmpleado()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 450);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		JPanel PnlDatosPersonales = new JPanel();
		PnlDatosPersonales.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(102, 51, 0)));
		PnlDatosPersonales.setBounds(10, 11, 642, 156);
		PanelPrincipal.add(PnlDatosPersonales);
		PnlDatosPersonales.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 31, 46, 14);
		PnlDatosPersonales.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 56, 46, 14);
		PnlDatosPersonales.add(lblApellido);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(10, 81, 46, 14);
		PnlDatosPersonales.add(lblSexo);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setBounds(10, 106, 136, 14);
		PnlDatosPersonales.add(lblFechaDeNacimiento);
		
		JLabel lblFechaDeIngreso = new JLabel("Fecha de Ingreso");
		lblFechaDeIngreso.setBounds(10, 131, 114, 14);
		PnlDatosPersonales.add(lblFechaDeIngreso);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(156, 28, 234, 20);
		PnlDatosPersonales.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setEditable(false);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(156, 53, 234, 20);
		PnlDatosPersonales.add(txtApellido);
		txtApellido.setColumns(10);
		txtApellido.setEditable(false);
		
		txtSexo = new JTextField();
		txtSexo.setBounds(156, 78, 86, 20);
		PnlDatosPersonales.add(txtSexo);
		txtSexo.setColumns(10);
		txtSexo.setEditable(false);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(156, 103, 86, 20);
		PnlDatosPersonales.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setEditable(false);
		
		txtFechaIngreso = new JTextField();
		txtFechaIngreso.setBounds(156, 128, 86, 20);
		PnlDatosPersonales.add(txtFechaIngreso);
		txtFechaIngreso.setColumns(10);
		txtFechaIngreso.setEditable(false);
		
		JPanel pnlSalario = new JPanel();
		pnlSalario.setBorder(new TitledBorder(null, "Salario", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(153, 102, 51)));
		pnlSalario.setBounds(10, 178, 642, 56);
		PanelPrincipal.add(pnlSalario);
		pnlSalario.setLayout(null);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(156, 28, 46, 14);
		pnlSalario.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(212, 25, 171, 20);
		pnlSalario.add(txtSalario);
		txtSalario.setColumns(10);
		txtSalario.setEditable(false);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double salario=0;
				objInicializar.ActualizarSalario(salario);
			}
		});
		btnModificar.setBounds(427, 24, 89, 23);
		pnlSalario.add(btnModificar);
		
		JPanel pnlCalculos = new JPanel();
		pnlCalculos.setBorder(new TitledBorder(null, "Calculos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(102, 51, 0)));
		pnlCalculos.setBounds(10, 245, 642, 107);
		PanelPrincipal.add(pnlCalculos);
		pnlCalculos.setLayout(null);
		
		JButton btnCalcularEdad = new JButton("Calcular Edad");
		btnCalcularEdad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String edad =String.valueOf(objInicializar.darEdad());
				txtCalculaEdad.setText(edad + " Años");
			}
		});
		btnCalcularEdad.setBounds(135, 26, 147, 23);
		pnlCalculos.add(btnCalcularEdad);
		
		txtCalculaEdad = new JTextField();
		txtCalculaEdad.setBounds(292, 27, 183, 20);
		pnlCalculos.add(txtCalculaEdad);
		txtCalculaEdad.setColumns(10);
		
		JButton btnCalcularantiguedad = new JButton("CalcularAntiguedad");
		btnCalcularantiguedad.setBounds(135, 51, 147, 23);
		pnlCalculos.add(btnCalcularantiguedad);
		btnCalcularantiguedad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String antiguedad =String.valueOf(objInicializar.darAntiguedad());
				txtCalculaAntiguedad.setText(antiguedad);
			}
		});
		txtCalculaAntiguedad = new JTextField();
		txtCalculaAntiguedad.setBounds(292, 51, 183, 22);
		pnlCalculos.add(txtCalculaAntiguedad);
		txtCalculaAntiguedad.setColumns(10);
		
		JButton btnCalcularPrestaciones = new JButton("Calcular Prestaciones");
		btnCalcularPrestaciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String prestaciones =String.valueOf(objInicializar.darPrestaciones());
				txtCalcularPrestaciones.setText(prestaciones);
			}
		});
		btnCalcularPrestaciones.setBounds(135, 76, 147, 23);
		pnlCalculos.add(btnCalcularPrestaciones);
		
		txtCalcularPrestaciones = new JTextField();
		txtCalcularPrestaciones.setBounds(292, 77, 183, 20);
		pnlCalculos.add(txtCalcularPrestaciones);
		txtCalcularPrestaciones.setColumns(10);
		
		JPanel pnlPuntosExtencion = new JPanel();
		pnlPuntosExtencion.setBorder(new TitledBorder(null, "Puntos de Extencion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(102, 51, 0)));
		pnlPuntosExtencion.setBounds(10, 364, 642, 45);
		PanelPrincipal.add(pnlPuntosExtencion);
		pnlPuntosExtencion.setLayout(null);
		
		JButton btnBotonUno = new JButton("Boton 1");
		btnBotonUno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Opcion uno funcionando");
			}
		});
		btnBotonUno.setBounds(151, 11, 89, 23);
		pnlPuntosExtencion.add(btnBotonUno);
		
		JButton btnBotonDos = new JButton("Boton 2");
		btnBotonDos.setBounds(261, 11, 89, 23);
		btnBotonDos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Opcion Dos funcionando");
			}
		});
		pnlPuntosExtencion.add(btnBotonDos);
	}
	
	public static void main(String[] args)
	{
		Fecha fechaIngreso = new Fecha();
				try
				{
					//final String fechanacimiento=objProcesos.darFechaIngreso();
					String fecha="";
					
					fechaIngreso.Inicializar(4,3,1997);
					Fecha fechaNaimiento = new Fecha();
					fechaNaimiento.Inicializar(21,4,1979);
					VentanaEmpleado frame = new VentanaEmpleado();
					objInicializar.inicializar("oscar","giovanni","M",fechaIngreso,fechaNaimiento,2500000);
					frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
	}
	
}
