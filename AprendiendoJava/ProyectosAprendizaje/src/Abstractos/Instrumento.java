package Abstractos;

abstract class Instrumento {
	
	private String tipo;
	
	public abstract void tocar();
	public abstract void hacerMantenimiento();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void saberTipo(String saberTipo) {
		System.out.println("El tipo de instrumento es  " + saberTipo);
	};
}
