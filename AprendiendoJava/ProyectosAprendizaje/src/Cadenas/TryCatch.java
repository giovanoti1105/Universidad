package Cadenas;

public class TryCatch {
	public static void main(String[] args) {
		
		try {
			String nombre = "Oscar";
			int numero = Integer.parseInt(nombre);
			throw new Exception();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
