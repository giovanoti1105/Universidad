package Listas;
import java.util.Properties;

public class Apntadores {
	
	static String valorClase;
	
	void imprimiendo(String valor){
		this.valorClase = valor;
		System.out.println("El valor del metodo es " + valorClase);
	}
	
	
public static void main(String[] args) {
	
	Apntadores ap = new Apntadores();
	System.out.println("valor antes de pasar por el metodo " + valorClase);
	ap.imprimiendo("Ingresando el resultado");
	System.out.println("El valor de la variable fuera del metodo es " + ap.valorClase);
	
	
}	

}
