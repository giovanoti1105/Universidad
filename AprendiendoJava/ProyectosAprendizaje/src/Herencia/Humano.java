package Herencia;

public class Humano {
	
	private String nombre;
	
	public void comer(String nombre){
		System.out.println(nombre + " Esta comiendo desde la clase humano");
	}
	
	public void dormir(){
		System.out.println(nombre + " Esta Durmiendo desde la clase humano");
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
