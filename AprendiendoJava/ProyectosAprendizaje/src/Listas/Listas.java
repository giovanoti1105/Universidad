package Listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	
	
	public static void main(String[] args) {
	
		List<Integer> numeros;
		
		numeros=new ArrayList<>();
		numeros.add(1);
		numeros.add(15);
		numeros.add(21);
		
		System.out.println(numeros.get(0));
		System.out.println(numeros.get(1));
		System.out.println(numeros.get(2));
		System.out.println(numeros.size());
		numeros.remove(2);
		System.out.println(numeros.size());
		
		
	}

}
