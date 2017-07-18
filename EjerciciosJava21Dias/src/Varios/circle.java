package Varios;

public class circle
{
	public static float PI = 3.141516F;
	
	public static float area(float r)
	{
		float resultado = PI * r* r;
		return resultado;
		
	}
	public static void main(String[] args)
	{
		float area=3;
		System.out.println(area(area));
	}
}
