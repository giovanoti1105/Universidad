package Interfaces;

public class Humano implements InterfazAccionesGeneral{
	private String cedula;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public void razonar(){
		System.out.println("Humano razonando");
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desplazarce() {
System.out.println("El humano con cedula " +cedula +  "se esta desplazando ");		
	}

	@Override
	public void jugar() {
		System.out.println("El humano con cedula " +cedula +  "esta Jugando ");		
	}

	@Override
	public void alimentarce() {
		System.out.println("El humano con cedula " +cedula +  "se esta Alimentando ");		
	}

	@Override
	public void dormir() {
		System.out.println("El humano con cedula " +cedula +  "esta durmiendo ");		
	}
}
