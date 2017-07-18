package SegundoSemestre;

public class ClaseBasica
{
	// Atributos de la clase
	private int numero1;
	private int numero2;
	private int resultado;

	// Método constructor de la clase
	public ClaseBasica()
	{
		super();
	}

	// Métodos de la clase
	public int calcularSuma(int n1, int n2)
	{
		numero1 = n1;
		numero2 = n2;
		resultado = numero1 + numero2;
		return (resultado);
	}

	public void imprimirResultado(int resultado)
	{
		System.out.println("Resultado de la operación suma: " + resultado);
	}

	/**
	 * @param args
	 *            Método principal
	 */
	public static void main(String[] args)
	{

		// Declaración del objeto
		ClaseBasica objetoOperacion = new ClaseBasica();
		// Uso de los métodos
		// Asignación de datos a las variables de instancia
		objetoOperacion.numero1 = 25;
		objetoOperacion.numero2 = 34;
		// Utilización de los métodos
		objetoOperacion.resultado = objetoOperacion.calcularSuma(objetoOperacion.numero1, objetoOperacion.numero2);
		objetoOperacion.imprimirResultado(objetoOperacion.resultado);
	}
}
