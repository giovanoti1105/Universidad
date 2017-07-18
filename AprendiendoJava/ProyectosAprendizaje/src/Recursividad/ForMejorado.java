package Recursividad;

import java.util.ArrayList;
import java.util.List;

public class ForMejorado {
	
	public static void main(String[] args) {
		List<String> paises = new ArrayList<String>();
		
		paises.add("Colombia");
		paises.add("argentina");
		paises.add("Brasil");
		paises.add("Venezuela");
		paises.add("Chile");
		
		for (String pais : paises) {
			System.out.println(pais);
		}
	}

}
