package Abstractos;

public class Procesos {

	public void iniciar() {
		
		Guitarra miGuitarra = new Guitarra();
		miGuitarra.setNombre("Guitarra electrica");
		miGuitarra.setTipo("Acutica");
		miGuitarra.tocar();
		miGuitarra.saberTipo(miGuitarra.getTipo());
		System.out.println();
		Saxofon miSaxofon = new Saxofon();
		miSaxofon.setPrecio(250);
		miSaxofon.tocar();
		System.out.println(miSaxofon.getPrecio());
		miSaxofon.hacerMantenimiento();
		
		
	}
}
