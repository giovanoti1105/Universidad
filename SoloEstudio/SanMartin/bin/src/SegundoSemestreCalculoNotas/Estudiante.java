package SegundoSemestreCalculoNotas;

public class Estudiante
{
	// constructor de la clase
	public Estudiante(){
		
	}
	// creacion de las funciones privadas
	private String nombre;
	private String apellido;
	private int edad;
	private double notaFinal;
	
	//metodos get set 
	public String getNombre(){
		return nombre;
	}
	public void setNombre (String nombre){
		this.nombre=nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public double getNotaFinal(){
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal){
		this.notaFinal= notaFinal;
	}
}