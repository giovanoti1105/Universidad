package TercerSemestreCasoEmpleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.mysql.jdbc.ResultSet;

public class componentesPaginaPrincipal
{
	//Objeto de la clase que nos ayuda a navegar por los registros de la tabla
    
	static JTextArea jtNombre;
	static JTextArea jtApellido;
	static JTextArea jtSexo;
	static JTextArea jtFechaNacimiento;
	static JTextArea jtSalario;
	static consultasDAO consultas = new consultasDAO();
	static ResultSet rs;
	static DatosEmpleados datos = new DatosEmpleados();
	ConexionBD bd = new ConexionBD(); 
	
    
	// funcion que carga los controladores del panel de datos principales
	static void ComponentesDatosPrincipales(JPanel panelDatosPersonales)
	{
		// componentes para el panel de datos personales
		JLabel nombre = new JLabel("Nombre:");
		nombre.setBounds(20, 30, 100, 20);
		panelDatosPersonales.add(nombre);
		
		JLabel apellido = new JLabel("Apellido:");
		apellido.setBounds(20, 60, 100, 20);
		panelDatosPersonales.add(apellido);

		JLabel sexo = new JLabel("Sexo:");
		sexo.setBounds(20, 90, 100, 20);
		panelDatosPersonales.add(sexo);

		JLabel fechaNacimiento = new JLabel("Fecha de Nacimiento:");
		fechaNacimiento.setBounds(20, 120, 150, 20);
		panelDatosPersonales.add(fechaNacimiento);

		JLabel fechaIngreso = new JLabel("Fecha de Ingreso:");
		fechaIngreso.setBounds(20, 150, 100, 20);
		panelDatosPersonales.add(fechaIngreso);

		jtNombre = new JTextArea();
		jtNombre.setBounds(220, 30, 200, 20);
		panelDatosPersonales.add(jtNombre);
		
		JButton btnSiguiente = new JButton(">>");
		btnSiguiente.setBounds(450, 30, 60, 20);
		panelDatosPersonales.add(btnSiguiente);
		btnSiguiente.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
					consultas.siguiente();
					rellenarCampos();
			}
		});

		jtApellido = new JTextArea();
		jtApellido.setBounds(220, 60, 200, 20);
		panelDatosPersonales.add(jtApellido);
		
		JButton btnAnterior = new JButton("<<");
		btnAnterior.setBounds(450, 60, 60, 20);
		panelDatosPersonales.add(btnAnterior);
		btnAnterior.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				consultas.anterior();
				rellenarCampos();
			}
		});

		jtSexo = new JTextArea();
		jtSexo.setBounds(220, 90, 200, 20);
		panelDatosPersonales.add(jtSexo);

		jtFechaNacimiento = new JTextArea();
		jtFechaNacimiento.setBounds(220, 120, 200, 20);
		panelDatosPersonales.add(jtFechaNacimiento);

		JTextArea jtFechaIngreso = new JTextArea();
		jtFechaIngreso.setBounds(220, 150, 200, 20);
		panelDatosPersonales.add(jtFechaIngreso);
	}

	// funcion que carga los controladores del panel de salario
	static void ComponentesDatosSalario(JPanel panelDatosSalario)
	{
		JLabel salario = new JLabel("Salario:");
		salario.setBounds(100, 30, 100, 20);
		panelDatosSalario.add(salario);

		jtSalario = new JTextArea();
		jtSalario.setBounds(160, 30, 150, 20);
		jtSalario.setEditable(false);
		panelDatosSalario.add(jtSalario);
		JButton btnSalario = new JButton("Modificar");
		btnSalario.setBounds(350, 30, 100, 20);
		panelDatosSalario.add(btnSalario);
		btnSalario.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
				} 
				catch (Exception e2)
				{
				}
			}
		});
	}

	// funcion que carga los controladores del panel de calculos
	static void ComponentesDatosCalculos(JPanel panelDatosCalculos)
	{
		JButton btnCalcularEdad = new JButton("Calcular Edad");
		btnCalcularEdad.setBounds(100, 30, 200, 20);
		panelDatosCalculos.add(btnCalcularEdad);

		JButton btnCalcularAntiguedad = new JButton("Calcular Antiguedad");
		btnCalcularAntiguedad.setBounds(100, 60, 200, 20);
		panelDatosCalculos.add(btnCalcularAntiguedad);

		JButton btnCalcularPrestaciones = new JButton("Calcular Prestaciones");
		btnCalcularPrestaciones.setBounds(100, 90, 200, 20);
		panelDatosCalculos.add(btnCalcularPrestaciones);

		JTextArea jtCalcularEdad = new JTextArea();
		jtCalcularEdad.setBounds(320, 30, 150, 20);
		jtCalcularEdad.setEditable(false);
		panelDatosCalculos.add(jtCalcularEdad);

		JTextArea jtCalculaAntiguedad = new JTextArea();
		jtCalculaAntiguedad.setBounds(320, 60, 150, 20);
		jtCalculaAntiguedad.setEditable(false);
		panelDatosCalculos.add(jtCalculaAntiguedad);

		JTextArea jtCalculaPrestaciones = new JTextArea();
		jtCalculaPrestaciones.setBounds(320, 90, 150, 20);
		jtCalculaPrestaciones.setEditable(false);
		panelDatosCalculos.add(jtCalculaPrestaciones);
	}
	public static void rellenarCampos()
    {
        try
		{
        	jtNombre.setText(consultas.rs.getString("SEM3_NOMBRE_EMPLEADO"));
        	jtApellido.setText(consultas.rs.getString("SEM3_APELLIDO_EMPLEADO"));
			jtSexo.setText(consultas.rs.getString("SEM3_SEXO_EMPLEADO"));
			jtFechaNacimiento.setText(consultas.rs.getString("SEM3_FECHA_NACIMIENTO_EMPLEADO"));
			jtSalario.setText(consultas.rs.getString("SEM3_SALARIO_EMPLEADO"));
		} 
        catch (Exception e)
		{
			System.out.println(e);
		}
    }
	//Recibe un numero entero y lo devuelve como Cadena (String)
    private static String aCadena(String string)
    {
        return String.valueOf(string);
    }
     
    //Recibe un numero decimal y lo devuelve como Cadena (String)
    private String aCadena(float num)
    {
        return String.valueOf(num);
    }
        
        
	
	
     
    
}
