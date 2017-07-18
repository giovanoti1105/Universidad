package SegundoSemestreCalculoNotas;

import java.util.Scanner;

import javax.swing.JOptionPane;

import SegundoSemestreListadoEmpleados.ArregloEmpleados;

public class CalculoNotas
{
	// constructor de la clase
	public CalculoNotas()
	{
	}

	// creacion de objeto array tipo estudiante
	Estudiante objNuevoEstudiante[];
	

	public Estudiante ingresoEstudiante(int numeroEmpleado)
	{
		String nombre = "";
		String apellido = "";
		int edad = 0;
		double nota = 0;
		Scanner objScanner = new Scanner(System.in);

		System.out.println("ingrese el nombre del empleado");
		nombre = objScanner.next();
		System.out.println("ingrese el Apellido del empleado");
		apellido = objScanner.next();
		System.out.println("ingrese edad del empleado");
		edad = objScanner.nextInt();
		System.out.println("ingrese nota del empleado");
		nota = objScanner.nextDouble();

		Estudiante objNuevoEstudiante = new Estudiante();
		objNuevoEstudiante.setNombre(nombre);
		objNuevoEstudiante.setApellido(apellido);
		objNuevoEstudiante.setEdad(edad);
		objNuevoEstudiante.setNotaFinal(nota);
		return objNuevoEstudiante;
	}

	// metodo para leer el arreglo de empleados
	public Estudiante[] leerArregloEstudiantes(int numeroEmpleado)
	{
		int i = 0;
		try
		{
			objNuevoEstudiante = new Estudiante[numeroEmpleado];
			for (i = 0; i < numeroEmpleado; i++)
			{
				Estudiante empleado = ingresoEstudiante(i);
				// se agrega un nuevo empleado
				objNuevoEstudiante[i] = empleado;
			}
		} catch (ArrayIndexOutOfBoundsException errorDesbordamiento)
		{
			JOptionPane.showMessageDialog(null, "Error Desbordamiento" + errorDesbordamiento.getMessage());
			errorDesbordamiento.printStackTrace();

		}
		return objNuevoEstudiante;
	}

	// metodo para imresion del arreglo estudiantes

	public void ImpresionDeRegistros(Estudiante[] objListadoEstudiante)
	{
		int i = 0;
		try
		{
			for (i = 0; i < objListadoEstudiante.length; i++)
			{
				Estudiante estudiante = objListadoEstudiante[i];
				imprimirDatosEstudiante(estudiante);
			}

		} catch (ArrayIndexOutOfBoundsException errorDesbordamiento)
		{
			JOptionPane.showMessageDialog(null, "Error Desbordamiento" + errorDesbordamiento.getMessage());
		}
	}

	// metodo para imprimir los datos del estudiante
	private void imprimirDatosEstudiante(Estudiante registro)
	{
		String datos="";
		datos = "Nombre : " + registro.getNombre() + "\n" +
				"Apellido : " + registro.getApellido() + "\n" +
				"Edad : " + registro.getEdad() + "\n" +
				"Nota Final : " + registro.getNotaFinal() + "\n" ;
		JOptionPane.showMessageDialog(null, datos);
	}
	
	private double PromedioGeneral()
	{
		Estudiante objNuevoEstudiante = new Estudiante();
		int numero=0;
		double promedio = 0;
		leerArregloEstudiantes(numero);
		promedio += objNuevoEstudiante.getNotaFinal();
		double total = promedio/2; 
		//JOptionPane.showMessageDialog(null, "El promedio es " + promedio);
		return total;
	}

	public static void main(String[] args)
	{
		CalculoNotas objNotas = new CalculoNotas();
		Estudiante [] listaEstudiantes=null;
		int numeroEstudiantes=0;
		
		numeroEstudiantes = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese nro Estudiantes"));
		// leemos el arreglo de empleados
		listaEstudiantes = objNotas.leerArregloEstudiantes(numeroEstudiantes);
		//impresion del arreglo estudiantes
		objNotas.ImpresionDeRegistros(listaEstudiantes);
		JOptionPane.showMessageDialog(null, "El promedio es " + objNotas.PromedioGeneral());
	}
}