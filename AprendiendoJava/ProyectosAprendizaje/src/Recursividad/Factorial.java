package Recursividad;

public class Factorial {

	int factorial(int fact) {
		System.out.println("Ingresa " + fact);
		if (fact > 0) {
			int valor = fact * factorial(fact - 1);
			System.out.println("Valor " + fact);
			return valor;
		} else
			return 1;
	}

	public static void main(String[] args) {

		Factorial re = new Factorial();
		int f = re.factorial(4);
		System.out.println("El factorial de 4 es " + f);

	}

}
