package SegundoSemestre;

import javax.swing.JOptionPane;

public class ImplementacionDoWhile
{
	private float limite;

	// Constructor de la clase
	public ImplementacionDoWhile()
	{
		// TODO Auto-generated constructor stub
	}

	// Métodos de lógica de negocio Método para mostrar un for que imprime
	// números
	// hasta un límite dado
	public void mostrarDoWhileImpresion(int limite)
	{
		// Contador del ciclo para (for)
		int i = 0;
		JOptionPane.showMessageDialog(null, "Ejemplo de for de impresión");
		do
		{
			JOptionPane.showMessageDialog(null, "Número: " + i);
			i--;
		} while (i > limite);
	}

	// Método para mostrar un for que recibe datos, los procesa y los muestra al
	// usuario
	public void mostrarDoWhileLecturaDatos(int limite)
	{
		// Contador del ciclo para (for)
		int i = 0;
		int dato = 0;
		int suma = 0;
		JOptionPane.showMessageDialog(null, "Ejemplo de for de lectura y procesamiento de datos");
		do
		{
			dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número: "));
			suma += dato;
			i++;
			// Es igual a suma = suma + dato;
			JOptionPane.showMessageDialog(null, "El dato ingresado fue: " + dato);
		} while (i < limite);
		// fin del while
		// Resultado final
		JOptionPane.showMessageDialog(null, "La suma de los datos fue de " + suma);
	}

	public static void main(String[] args)
	{
		int limite = 0;
		// Instanciamos el objeto
		ImplementacionDoWhile cicloDoWhile = new ImplementacionDoWhile();
		// Leemos el valor límite hasta el cual trabajará el do-while
		cicloDoWhile.mostrarDoWhileLecturaDatos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor límite para el ciclo for (para): ")));
		// Leemos el valor límite hasta el cual trabajará el do-while Ejecutamos
		// los for de impresión
		cicloDoWhile.mostrarDoWhileImpresion(limite);
		// For de lectura
		cicloDoWhile.mostrarDoWhileLecturaDatos(limite);
	}
}