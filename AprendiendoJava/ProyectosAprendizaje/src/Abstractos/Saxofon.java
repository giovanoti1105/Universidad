package Abstractos;

public class Saxofon extends Instrumento {

	private int precio;

	@Override
	public void tocar() {
		System.out.println("Tocando Saxofon");
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public void hacerMantenimiento() {
		System.out.println("Sacando brillo al saxofon ");
	}

}
