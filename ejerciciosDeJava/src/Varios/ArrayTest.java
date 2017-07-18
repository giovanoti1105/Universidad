package Varios;
public class ArrayTest {
	String firstNames [] = {"oscar","giovanni","luis","antonio"};
	String lastNames[] = new String [firstNames.length];

	void printnames ()
	{
		for (int i = 0; i <= lastNames.length; i++) 
		{
		System.out.println(firstNames[i] + " " + lastNames[i]);
		}
	}
	public static void main(String[] args) {
		try {
			ArrayTest a = new ArrayTest();
			a.lastNames[0]="bocanegra";
			a.lastNames[1]="hurtado";
			a.lastNames[2]="bocanegra";
			a.lastNames[3]="hurtado";
			a.printnames();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
	}
}
