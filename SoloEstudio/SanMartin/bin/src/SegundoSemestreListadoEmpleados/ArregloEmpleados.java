package SegundoSemestreListadoEmpleados;
import javax.swing.JOptionPane;

public class ArregloEmpleados
{
	// Atributos de la clase
	Empleado[] arregloEmpleados;

	// constructor de la clase
	public ArregloEmpleados()
	{
	}
	// metodo para leer los datos de cada empleado
	public Empleado leerDatosEmpleado (int numero)
	{
		String nombre=JOptionPane.showInputDialog(null,"Ingrese Nombre Empleado" + numero);
		String apellido=JOptionPane.showInputDialog(null,"Ingrese Apellido Empleado" + numero);
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Edad Empleado" + numero));
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Sueldo del Empleado" + numero));
		
		Empleado nuevoEmpleado = new Empleado();
		nuevoEmpleado.setNombre(nombre);
		nuevoEmpleado.setApellido(apellido);
		nuevoEmpleado.setEdad(edad);
		nuevoEmpleado.setSalario(salario);
		
		return (nuevoEmpleado);
	}
	
	// funcion para leer el arreglo de empleados
	public Empleado[] leerArregloEmpleados(int numeroEmpleados)
	{
		try
		{
			arregloEmpleados = new Empleado[numeroEmpleados];
			
			for (int i = 0; i < numeroEmpleados; i++)
			{
				Empleado empleado = leerDatosEmpleado(i);
				arregloEmpleados[i]= empleado;
			}
			
		} catch (ArrayIndexOutOfBoundsException error)
		{
			JOptionPane.showMessageDialog(null, "Error de Desbordamiento" + error.getMessage());
		}
		return arregloEmpleados;
	}
	
	// funcion imprimir el arreglo de empleados
	public void imprimirArregloEmpeados(Empleado[] listadoEmpleados)
	{
		try
		{
			for (int i = 0; i < listadoEmpleados.length; i++)
			{
				Empleado empleado = listadoEmpleados[i];
				imprimirDatosEmpleado(empleado);
			}
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}
	public void imprimirDatosEmpleado(Empleado registro)
	{
		String datos="";
		datos = "Nomre: " + registro.getNombre() + "\n"+
				"Apellido: " + registro.getApellido() + "\n"+
				"Edad: " + registro.getEdad() + "\n"+
				"Salario: " + registro.getSalario();
		JOptionPane.showMessageDialog(null, datos);
	}
	public static void main(String[] args)
	{
		ArregloEmpleados manejadorEmpleados = new ArregloEmpleados();
		Empleado[] listaEmpleados = null;
		int numeroEmpleados=0;
		numeroEmpleados=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Numero Empleados"));
		
		// leer el arreglo de empleados
		listaEmpleados=manejadorEmpleados.leerArregloEmpleados(numeroEmpleados);
		
		// impresion del arreglo de empleados
		manejadorEmpleados.imprimirArregloEmpeados(listaEmpleados);
	}
}