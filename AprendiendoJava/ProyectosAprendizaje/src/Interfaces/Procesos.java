package Interfaces;

public class Procesos {

	public void iniciar() {
		
		Animal miOso = new Animal();
		miOso.setRaza("Oso Pardo");
		miOso.cazar();
		miOso.desplazarce();
		miOso.jugar();
		System.out.println();
		Humano objHumano = new Humano ();
		objHumano.setCedula("123456");
		objHumano.alimentarce();
		objHumano.desplazarce();
		objHumano.dormir();
		System.out.println();
		Hombre oscar = new Hombre();
		oscar.setNombre("Oscar");
		oscar.setCedula("998877");
		oscar.razonar();
		oscar.desplazarce();
		
	}

}
