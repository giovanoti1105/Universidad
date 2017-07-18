package TercerSemestreCasoEmpleado;

import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Empleado
{
	String nombre;
	String apellido;
	int sexo;
	String imagen;
	Fecha fechaIngreso;
	Fecha fechaNacimiento;
	double salario;
	DecimalFormat formateador = new DecimalFormat("'$ ' ###,###.###");
	Fecha objFecha;
	
	void inicializar(String nombre,String apellido, String tipoSexo, Fecha fechaIn, Fecha fechaNaimiento, double s)
	{
		fechaIngreso = fechaIn;
		fechaNacimiento = fechaNaimiento;
		salario=s;
		VentanaEmpleado.txtNombre.setText(nombre);
		VentanaEmpleado.txtApellido.setText(apellido);
		VentanaEmpleado.txtSexo.setText(tipoSexo);
		VentanaEmpleado.txtFechaIngreso.setText(String.valueOf(fechaIngreso));
		VentanaEmpleado.txtFechaNacimiento.setText(String.valueOf(fechaNaimiento));
		VentanaEmpleado.txtSalario.setText(String.valueOf(formateador.format(salario)));
		
	}
	
	void cambiarFechaIngreso(Date NuevaFechaIngreso)
	{
		
	}
	void cambiarImagen(String NuevaImagen)
	{
		
	}
	void ActualizarSalario(double salario)
	{
		 salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Nuevo Salario"));
		 setSalario(salario);
		 VentanaEmpleado.txtSalario.setText(String.valueOf(formateador.format(getSalario())));
	}
	int darAntiguedad()
	{
		Fecha hoy = new Fecha();
		hoy.inicializarHoy();
		// calcula diferencia en años
		int antiguedad=fechaIngreso.darDiferenciaEnMeses(hoy)/12;
		return antiguedad;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	int darEdad()
	{
		// obtiene la fecha actual
		Fecha hoy = new Fecha ();
		hoy.inicializarHoy();
		// calcula la diferencia de años
		int edad=fechaNacimiento.darDiferenciaEnMeses(hoy);
		
		return edad/12;
	}
	String darFechaIngreso()
	{
		String fecha = fechaIngreso.toString();
		return fecha;
	}
	
	String darFechaNacimiento()
	{
		String fecha = fechaNacimiento.toString();
		return fecha;
	}
	
	String getImagen()
	{
		return imagen;
	}

	double darPrestaciones()
	{
		int antiguedad = darAntiguedad();
		double salarios= getSalario();
		double prestaciones = ((double) (antiguedad*salarios))/12;
		return prestaciones;
	}
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	double getSalario()
	{
		return salario;
	}
	
	int getSexo()
	{
		return sexo;
	}
}