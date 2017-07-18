package SegundoSemestre;

import javax.swing.JOptionPane;

public class Empleado extends Persona
{
	// Atributos de la subclase
	private double salario;
	private String codigoLaboral;
	private boolean esEmpleadoFijo;

	// Constructor de la clase
	public Empleado()
	{
		// TODO Auto-generated constructor stub
	}

	// Constructor de la subclase
	public Empleado(String nombre, String apellido, int edad, int peso, double salario, String codigoLaboral, boolean esEmpleadoFijo)
	{
		// Usamos el operador super para establecer el constructor de la
		// superclase
		super(nombre, apellido, edad, peso);
		// Definimos los atributos propios de este objeto que hereda
		this.salario = salario;
		this.codigoLaboral = codigoLaboral;
		this.esEmpleadoFijo = esEmpleadoFijo;
	}

	// M�todos de encapsulamiento
	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}

	public String getCodigoLaboral()
	{
		return codigoLaboral;
	}

	public void setCodigoLaboral(String codigoLaboral)
	{
		this.codigoLaboral = codigoLaboral;
	}

	public boolean isEsEmpleadoFijo()
	{
		return esEmpleadoFijo;
	}

	public void setEsEmpleadoFijo(boolean esEmpleadoFijo)
	{
		this.esEmpleadoFijo = esEmpleadoFijo;
	}

	// M�todos propios del empleado
	// M�todo para calcular el salario del empleado
	public double calcularSalario(boolean esEmpleadoFijo, double valorHora, int numeroHorasTrabajadas)
	{
		double salario = 0.0;
		double bono = 0.0;
		if (esEmpleadoFijo == true)
		{
			bono = 5200.00;
		} else
		{
			bono = 1200.00;
		}
		salario = numeroHorasTrabajadas * valorHora + bono;
		return (salario);
	}

	// M�todo para imprimir el sueldo del empleado
	public void imprimirAsignacionSalario(String nombre, double sueldo)
	{
		JOptionPane.showMessageDialog(null, "El empleado " + nombre + " recibe un salario de " + sueldo);
	}

	// M�todo para ingresar los datos del empleado
	public Empleado ingresarDatosEmpleado()
	{
		Empleado nuevoEmpleado = new Empleado();
		String nombre = "";
		String apellido = "";
		int edad = 0;
		double peso = 0.0;
		int numeroHoras = 0;
		double valorHora = 0.0;
		double salario = 0.0;
		boolean esEmpleadoFijo = false;
		String codigo = "";
		codigo = leerDatoTipoCadena("Ingrese el c�digo del empleado: ");
		nombre = leerDatoTipoCadena("Ingrese el nombre del empleado: ");
		apellido = leerDatoTipoCadena("Ingrese el apellido del empleado: ");
		edad = leerDatoTipoEntero("Ingrese la edad del empleado: ");
		peso = leerDatoTipoReal("Ingrese el peso del empleado: ");

		// Obtenemos los datos que no hacen parte de la clase
		numeroHoras = leerDatoTipoEntero("Ingrese el n�mero de horas trabajadas por el empleado: ");
		valorHora = leerDatoTipoReal("Ingrese el valor de la hora: ");
		esEmpleadoFijo = leerDatoTipoBooleano("�El empleado es fijo (true/false)?: ");

		// Calculamos el salario
		salario = calcularSalario(esEmpleadoFijo, valorHora, numeroHoras);

		// Definimos los datos para el constructor
		nuevoEmpleado.setNombre(nombre);
		nuevoEmpleado.setApellido(apellido);
		nuevoEmpleado.setCodigoLaboral(codigo);
		nuevoEmpleado.setEdad(edad);
		nuevoEmpleado.setPeso(peso);
		nuevoEmpleado.setSalario(salario);
		nuevoEmpleado.setEsEmpleadoFijo(esEmpleadoFijo);

		// Retornamos el objeto
		return (nuevoEmpleado);
	}

	// M�todo para imprimir el reporte de status del empleado
	public void imprimirReporteEstadoEmpleado()
	{
		// Usamos nuevamente la herencia para llamar los m�todos que imprimen
		// los datos del empleado
		imprimirDatosPersona();
		// Ahora imprimos los datos propios del estudiante
		JOptionPane.showMessageDialog(null, "El c�digo laboral del empleado es: " + codigoLaboral);
		// Asignaci�n del salario
		imprimirAsignacionSalario(nombre, salario);
		if (esEmpleadoFijo == true)
		{
			JOptionPane.showMessageDialog(null, "El empleado es un trabajador fijo de la empresa");
		} else
		{
			JOptionPane.showMessageDialog(null, "El empleado es un trabajador contratado de la empresa");
		}
	}

	// M�todo sobreescrito para definir el estado del empleado
	public void definirEstadoPersona(int edad)
	{
		String estado = "";
		if (edad < 21)
		{
			estado = "Menor de edad legal";
		} else
		{
			estado = "Mayor de edad legal";
		}
		JOptionPane.showMessageDialog(null, "La persona " + nombre + " " + apellido + " es " + estado);
	}
}
