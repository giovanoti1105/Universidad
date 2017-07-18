package Varios;
import java.util.Scanner;

public class EvenSteven {

	void evenCheck(int val) {
		System.out.println("el numero es : " + val + " . ");
		if (val % 2 == 0) {
			System.out.println("la variables es positiva par");
		} else
			System.out.println("la variables impar positiva");
	}

	public static void main(String[] args) {
		EvenSteven e = new EvenSteven();
		e.evenCheck(4);
		e.evenCheck(1);
		e.evenCheck(2);
		e.evenCheck(3);
		
	}
}