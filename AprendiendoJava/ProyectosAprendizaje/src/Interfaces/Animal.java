package Interfaces;

public class Animal implements InterfazAccionesGeneral {

	private String raza;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void cazar() {
		System.out.println("Animal de raza " + raza + " Esta cazando");
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void desplazarce() {
		System.out.println("El Animal de raza  " + raza + "se esta desplazando ");
	}

	@Override
	public void jugar() {
		System.out.println("El Animal de raza  " + raza + "esta Jugando ");
	}

	@Override
	public void alimentarce() {
		System.out.println("El Animal de raza  " + raza + " se esta Alimentando");

	}

	@Override
	public void dormir() {
		System.out.println("El Animal de raza  " + raza + " esta durmiendo");
	}

}
