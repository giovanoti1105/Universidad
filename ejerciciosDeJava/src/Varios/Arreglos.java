package Varios;

class Arreglos {
	// definicion de variables
	static Arreglos uno;
	Arreglos dos;
	static String paises [] = new String [3];
public static void main(String[] args) {
	paises[0]="colombia";
	paises[1]="chile";
	paises[2]="uruguay";
	
	System.out.println(paises[1]);
	System.out.println("cantidad del arreglo  " + paises.length);
	// nueva variable para la posicion 1
	System.out.println("\n se cambia el valor de la variabe 1 ingresando el pais africa \n");
	paises[1]="Africa";
	System.out.println("nuevo valor en la posicion [1]" + paises[1]);
	System.out.println("******************");
	System.out.println("Variable de tipo " + uno);
}
}
