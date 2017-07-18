package SegundoSemestre;

public class ClaseBasica
{
	// Atributos de la clase
	private int numero1;
	private int numero2;
	private int resultado;

	// M�todo constructor de la clase
	public ClaseBasica()
	{
		super();
	}

	// M�todos de la clase
	public int calcularSuma(int n1, int n2)
	{
		numero1 = n1;
		numero2 = n2;
		resultado = numero1 + numero2;
		return (resultado);
	}

	public void imprimirResultado(int resultado)
	{
		System.out.println("Resultado de la operaci�n suma: " + resultado);
	}

	/**
	 * @param args
	 *            M�todo principal
	 */
	public static void main(String[] args)
	{

		// Declaraci�n del objeto
		ClaseBasica objetoOperacion = new ClaseBasica();
		// Uso de los m�todos
		// Asignaci�n de datos a las variables de instancia
		objetoOperacion.numero1 = 25;
		objetoOperacion.numero2 = 34;
		// Utilizaci�n de los m�todos
		objetoOperacion.resultado = objetoOperacion.calcularSuma(objetoOperacion.numero1, objetoOperacion.numero2);
		objetoOperacion.imprimirResultado(objetoOperacion.resultado);
	}
}
