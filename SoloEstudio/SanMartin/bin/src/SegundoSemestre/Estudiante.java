package SegundoSemestre;

import javax.swing.JOptionPane;

public class Estudiante extends Persona
{

	//Atributos de la clase
	private String carnet;
	private double promedioNotas;
	private int numeroMaterias;
	public Estudiante()
	{
	}
	
	//Constructor sobrecargado
	public Estudiante(String nombre, String apellido, int edad, double
	peso, String carnet, int numeroMaterias, double promedioNotas)
	{
		//Usamos el operador super para establecer el constructor de la superclase
		super(nombre, apellido, edad, peso);
		
		//Definimos los atributos propios de este objeto que hereda
		this.carnet = carnet;
		this.numeroMaterias = numeroMaterias;
		this.promedioNotas = promedioNotas;
	}
	
	//Métodos de encapsulamiento
	public String getCarnet() {
	return carnet;
	}
	public void setCarnet(String carnet) {
	this.carnet = carnet;
	}
	public double getPromedioNotas() {
	return promedioNotas;
	}
	public void setPromedioNotas(double promedioNotas) {
	this.promedioNotas = promedioNotas;
	}
	public int getNumeroMaterias() {
	return numeroMaterias;
	}
	public void setNumeroMaterias(int numeroMaterias) {
	this.numeroMaterias = numeroMaterias;
	}

	//Métodos propios del estudiante Método para calcular el promedio del estudiante
	public double calcularPromedio (double acumulado, int numeroMaterias)
	{
		double promedio = 0.0;
		promedio = acumulado/numeroMaterias;
		return (promedio);
	}
	
	//Método para leer los datos de las notas del estudiante
	public double leerNotasEstudiante (int numeroAsignaturas)
	{
		double nota = 0.0;
		double acumulado = 0.0;
		int i = 0;
		//Utilizamos un ciclo para leer las notas de las materias suscritas por el estudiante
		for (i = 0; i < numeroAsignaturas; i++)
			{
			nota = leerDatoTipoReal("Ingrese la nota de la materia " + (i+1));
			acumulado = acumulado + nota;
			}
		
		//Obtenemos el promedio
		promedioNotas = calcularPromedio(acumulado,numeroAsignaturas);
		return (promedioNotas);
	}
	
	//Método para ingresar los datos del estudiante
	public Estudiante ingresarDatosEstudiante ()
	{
		Estudiante nuevoEstudiante = new Estudiante ();
		String nombre = "";
		String apellido = "";
		String carnet = "";
		int edad = 0;
		double peso = 0.0;
		int numeroMaterias = 0;
		double promedio = 0.0;
		carnet = leerDatoTipoCadena ("Ingrese el carnet del estudiante: ");
		nombre = leerDatoTipoCadena ("Ingrese el nombre del estudiante: ");
		apellido = leerDatoTipoCadena ("Ingrese el apellido del estudiante: ");
		edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
		peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
		numeroMaterias = leerDatoTipoEntero ("Ingrese el número de materias vistas por el estudiante: ");
		//Leemos las materias del estudiante
		promedio = leerNotasEstudiante(numeroMaterias);
		//Obtenemos los datos que no hacen parte de la clase Definimos los datos para el constructor
		nuevoEstudiante.setNombre(nombre);
		nuevoEstudiante.setApellido(apellido);
		nuevoEstudiante.setCarnet(carnet);
		nuevoEstudiante.setEdad(edad);
		nuevoEstudiante.setPeso(peso);
		nuevoEstudiante.setNumeroMaterias(numeroMaterias);
		nuevoEstudiante.setPromedioNotas(promedio);
		
		//Retornamos el objeto
		return (nuevoEstudiante);
	}
	
	//Método para imprimir el estado del estudiante
	public void imprimirReporteNotasEstudiante ()
	{
		//Usamos nuevamente la herencia para llamar los métodos que imprimen los datos del estudianet
		imprimirDatosPersona();
		//Ahora imprimos los datos propios del estudiante
		JOptionPane.showMessageDialog(null,"El carnet del estudiante es: " + carnet);
		JOptionPane.showMessageDialog(null,"El número de materias del estudiante es: " + numeroMaterias);
		JOptionPane.showMessageDialog(null,"El promedio del estudiante es: " + promedioNotas);
	}
}
