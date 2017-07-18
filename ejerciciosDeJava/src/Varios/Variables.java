package Varios;

class Variables {
	static int uno = 2;
	String dos;
	boolean activa;

	static void variablesUno() {
		//uno = 1234;
		System.out.println("El valor de uno en variables uno es " + uno);
	}

	public static void main(String[] args) {
		variablesUno();
		System.out.println("Fuera del meto el valor de variables es  " + uno);
	}
}
