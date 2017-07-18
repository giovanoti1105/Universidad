package Varios;
public class ScopeTest
{
    int test =10;
    void PrintTest ()
    {
	int test =20;
	System.out.println("Valor de test: " + this.test);
	this.test=50;
	System.out.println("Valor de test: " + this.test);
    }
    public static void main(String[] args)
    {
	ScopeTest test = new ScopeTest();
	test.PrintTest();
    }
}