package EjerciciosProyectosInformaticos.Interface;
import EjerciciosProyectosInformaticos.Interface.Circulo;;

public class Main
{
	public static void main(String[] args)
	{
		InterfaceDibujable objDibujable = new Circulo();
		objDibujable.Dibuja();
		objDibujable = new Cuadrado();
		objDibujable.Dibuja();
		objDibujable = new Triangulo();
		objDibujable.Dibuja();
	}
}