package Herencia;

public class Procesos {

	public void iniciar() {

		Humano adulto = new Humano();
		adulto.setNombre("Oscar");
		adulto.comer(adulto.getNombre());
		adulto.dormir();
		System.out.println();
		Hombre padre = new Hombre();
		padre.setNombre("Jorge");
		padre.comer(padre.getNombre());
		padre.dormir();
		padre.afeitarse();
		
		System.out.println();
		Mujer mujer = new Mujer();
		mujer.setNombre("Monica");
		mujer.comer(mujer.getNombre());
		mujer.dormir();
		mujer.maquillando(mujer.getNombre());
		
	}
}
