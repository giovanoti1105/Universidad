package Varios;

public class DoTest
{
	int xx=0;
	public static void main(String[] args)
	{
		int x=1;
		
		do
		{
			System.out.println("Looping, round " + x);
			x++;
		} while (x<=10);
	}
}