package Varios;
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random r1,r2;
		// creacion de objeto sin argumentos 
		r1 = new Random ();
		System.out.println("El valor del primer random es " + r1.nextDouble());
		// creacion del segundo objeto
		r2 = new Random (890987);
		System.out.println("El valor del segundo random es " + r2.nextDouble());
		jaberwook objetoUno = new jaberwook ();
		objetoUno.setColor("Azul"); 
		System.out.println("Objeto de color :" + objetoUno.getColor() );
		objetoUno.feedjaberwook();
	}

}
