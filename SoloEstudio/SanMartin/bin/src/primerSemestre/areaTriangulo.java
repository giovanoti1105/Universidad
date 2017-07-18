package primerSemestre;

public class areaTriangulo
{
	public static void main(String[] args)
	{
		double a = 3.0;
		double b = 3.7;
		double c = 4.5;
		
		// definir la variable double
		double semiperimetro = (a+b+c)/2;
		double area = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
		System.out.println("El valor del area del triangulo es " + area); 
	}
}
