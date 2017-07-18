package Polimorfismo;

public class Principal {
	
	
	public static void main(String[] args) {
		CuentaAhorros cAho = new CuentaAhorros();
		cAho.saldo = 5000;
		System.out.println(cAho.calcuarIntereses());
		CuentaCorriente crte = new CuentaCorriente();
		crte.saldo = 5000;
		System.out.println(crte.calcuarIntereses());
		
		System.out.println(CuentaAhorros.valores);
	}
}
