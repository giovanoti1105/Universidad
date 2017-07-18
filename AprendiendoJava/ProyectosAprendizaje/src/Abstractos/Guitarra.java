package Abstractos;

public class Guitarra extends Instrumento{

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void tocar() {
		System.out.println(nombre + " Esta siendo tocada en la clase Guitarra");		
	}

	@Override
	public void hacerMantenimiento() {
		System.out.println("Afinando a las cuerdas de la guitarra " + nombre);
		
	}
	
	
}
