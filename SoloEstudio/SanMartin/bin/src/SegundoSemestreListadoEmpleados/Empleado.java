package SegundoSemestreListadoEmpleados;

public class Empleado
{
	// definicion de atributos
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;

	// creacion del constructor de la clase
	public Empleado()
	{
	}

	// funciones get y set
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double salario)
	{
		this.salario=salario;
	}
}
