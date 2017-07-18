package Varios;

public class BreakContinue
{
	int [] array1 = {7,4,8,1,4,1,4};
	int [] array2 = new int [array1.length];
	int count,count2=0;

	void funcionBreak()
	{
		System.out.print(" [");
		while (count < array1.length)
		{
			if (array1[count] == 1)
				break;
			array2[count] = array1[count];
			System.out.print(array2[count++] );
		}
		System.out.println(" ]");
	}
	void funcionContinue()
	{
		System.out.print(" [");
		while (count2 < array1.length)
		{
			if (array1[count2] == 1)
				continue;
			array2[count2] = array1[count2];
			System.out.print(array2[count2++] );
		}
		System.out.println(" ]");
	}
	public static void main(String[] args)
	{
		BreakContinue objBreakContinue = new BreakContinue ();
		objBreakContinue.funcionBreak();
		objBreakContinue.funcionContinue();
	}

}
