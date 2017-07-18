package Polimorfismo;

public class CuentaAhorros extends Cuenta {

	static double valores = 560;
	@Override
	public double calcuarIntereses() {
		return this.saldo*0.05;
	}
}
