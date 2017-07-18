package Varios;

public class ScopeTest
{
	// variable de instancia
	int test= 20;
	void printTest()
	{
		int test=10;
		System.out.println("valor de variable " + this.test);
	}
	public static void main(String[] args)
	{
		ScopeTest objScopertest = new ScopeTest();
		objScopertest.printTest();
	}

}
