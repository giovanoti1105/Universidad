package SegundoSemestre;

import javax.swing.JOptionPane;

public class CalculoNotas
{
	//Atributos de la clase
	private EstudianteNota datosEstudiante;

	//Métodos de Encapsulamiento
	public EstudianteNota getDatosEstudiante() 
	{
	return datosEstudiante;
	}
	
	public void setDatosEstudiante(EstudianteNota datosEstudiante) 
	{
	this.datosEstudiante = datosEstudiante;
	}
	
	//Constructor de la clase
	public CalculoNotas() 
	{
	super();
	// TODO Auto-generated constructor stub
	}
	
	//MÉTODOS DE LÓGICA DE NEGOCIO
	//Método para leer el valor de la nota
	public double leerNota (String mensaje)
	{
		double nota = 0.0;
		nota = Double.parseDouble(JOptionPane.showInputDialog(null,mensaje));
		return (nota);
	}
	
	//Método para leer los datos del estudiante
	public String leerDatosEstudiante (String mensaje)
	{
		return mensaje;

	}
	
	//Método para calcular la nota del primer corte
	public double calcularNotaCorte (double nota, double porcentaje)
	{
		return porcentaje;
		
	}
	
	public double calcularNotaDefinitoria (double notaPrimerCorte, double notaSegundoCorte)
	{
		return notaSegundoCorte;
		
	}
	
	//Método para calcular la nota de empalme
	public double calcularNotaEmpalme (double notaTercerCorte, double notaCuartoCorte)
	{
		return notaCuartoCorte;
		
	}
	
	//Método para calcular la nota definitiva
	public double calcularNotaDefinitiva (double notaDefinitoria, double notaEmpalme)
	{
		return notaEmpalme;
		
	}
	
	//Método para indicar si el estudiante gano o perdió la materia
	public boolean definirSiEstudianteAprobo (double notaDefinitiva)
	{
		return false;
		
	}
	
	//Método para imprimir los resultados
	public void imprimirResultados (EstudianteNota datosEstudiante2)
	{
		
	}

	//Método principal o programa principal
	public static void main(String[] args)
	{
		
	CalculoNotas calculadorNotas = new CalculoNotas();
	calculadorNotas.datosEstudiante = new EstudianteNota();
	
	//Leemos los datos de las notas
	calculadorNotas.datosEstudiante.setNombreEstudiante (calculadorNotas.leerDatosEstudiante("Ingrese el nombre del estudiante: "));
	calculadorNotas.datosEstudiante.setApellidoEstudiante (calculadorNotas.leerDatosEstudiante("Ingrese el apellido del estudiante: "));

	//Leemos las cuatro notas
	calculadorNotas.datosEstudiante.setNotaPrimerCorte(calculadorNotas.leerNota("Ingrese la nota del primer corte (Examen): "));
	calculadorNotas.datosEstudiante.setNotaSegundoCorte(calculadorNotas.leerNota("Ingrese la nota del segundo corte	(Taller): "));
	calculadorNotas.datosEstudiante.setNotaTercerCorte(calculadorNotas.leerNota("Ingrese la nota del tercer corte (Examen final): "));
	calculadorNotas.datosEstudiante.setNotaCuartoCorte(calculadorNotas.leerNota("Ingrese la nota del cuarto corte (Proyecto final): "));

	//Calculamos las notas
	calculadorNotas.imprimirResultados(calculadorNotas.datosEstudiante);
	}
	}