package primerSemestre;

import javax.swing.JOptionPane;

class Empleado
{
	

	// constructor
	public Empleado()
	{
	}

	void pedirInformacionEmpleado()
	{
		String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
		String apellidoEmpleado = JOptionPane.showInputDialog("Ingrese el apellido del empleado");
		String valorDia = JOptionPane.showInputDialog("Valor dia empleado");
		int valorDiaEmpleado = Integer.parseInt(valorDia);
		String numeroDias = JOptionPane.showInputDialog("Numero Dias Trabajados");
		int numeroDiasTrabajados = Integer.parseInt(numeroDias);

		int totalPagar = valorDiaEmpleado * numeroDiasTrabajados;

		JOptionPane.showMessageDialog(null, "Nombre empleado " + nombreEmpleado + 
											"\n Apellido Empleado " + apellidoEmpleado + 
											"\n Valor Dia empleado" + valorDia + 
											"\n Numero de dias Trabajados" + numeroDias + 
											"\n Total a Pagar " + totalPagar);
	}
	public static void main(String[] args)
	{
		Empleado objEmpleado = new Empleado ();
		objEmpleado.pedirInformacionEmpleado();
	}
}
