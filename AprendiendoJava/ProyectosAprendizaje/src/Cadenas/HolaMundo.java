package Cadenas;

import java.security.cert.Extension;

import Interfaces.Constantes;

public class HolaMundo extends Abstracto  implements Constantes{

	public void impresion() {
		LOGGER.info("Inicio");
		System.out.println("Bienvenidos soy Hola Mundo");
	}

	public static void main(String[] args) {

		HolaMundo hm = new HolaMundo();
		hm.impresion();
	}

	@Override
	void metodoUno() {
		System.out.println("Soy metodo Uno de Hola Mundo");
	}

	@Override
	void metodoDos() {
		System.out.println("Soy metodo Dos de Hola Mundo");
	}

	@Override
	void metodoTres(int varUno, int varDoss) {
		// TODO Auto-generated method stub
		
	}
}
