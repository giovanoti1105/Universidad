package EjerciciosProyectosInformaticos.Abstract;

public class Main
{
	public static void main(String[] args)
	{
		String mensaje="";
		Figura objFigura = new Circulo();
		objFigura.dibujate(mensaje);
		objFigura = new Triangulo();
		objFigura.dibujate(mensaje);
		objFigura = new Cuadrado();
		objFigura.dibujate(mensaje);
		Triangulo objTriangulo = new Triangulo ();
		objTriangulo.conexion();
		
	}
	

}
