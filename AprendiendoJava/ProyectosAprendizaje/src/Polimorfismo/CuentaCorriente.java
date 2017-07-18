package Polimorfismo;

public class CuentaCorriente extends Cuenta {

	
	final double valoresFinales = 560;
	
	
	@Override
	public double calcuarIntereses() {
		return this.saldo * 0.10;
	}
}
