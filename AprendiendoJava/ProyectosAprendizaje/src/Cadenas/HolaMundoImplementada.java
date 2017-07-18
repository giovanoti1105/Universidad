package Cadenas;

public class HolaMundoImplementada extends HolaMundo {

	public static void main(String[] args) {
		HolaMundoImplementada hm = new HolaMundoImplementada();
		LOGGER.info("Vengo de Hola Mundo");
		hm.impresion();
		hm.metodoUno();
	}
}
