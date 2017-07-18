package Varios;

import java.awt.print.Printable;
import java.security.Principal;

public class ArrayTest {
	// definicion de variables de clase
	String[] firstName = { "oscar", "giovanni", "luis", "antonio" };
	String[] lastName = new String[firstName.length];

	// funcion que imprime los nombres
	void printNames() {
		int i=0;
		for (i = 0; i < firstName.length; i++) {
			System.out.println(firstName[i] + " " + lastName[i] );
		}
	}
	public static void main(String[] args) {
		ArrayTest objArray = new ArrayTest ();
		objArray.printNames();
		System.out.println("*********************");
		objArray.lastName[0]= "Bocanegra";
		objArray.lastName[1]= "Hurtado";
		objArray.lastName[2]= "Bocanegra";
		objArray.lastName[3]= "Capera";
		objArray.printNames();
		
	}
}
