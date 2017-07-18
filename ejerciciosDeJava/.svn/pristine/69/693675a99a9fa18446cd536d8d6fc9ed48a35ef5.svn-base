package Varios.paratienda;

import java.util.*;

public class Escaparate
{
	private LinkedList catalogo = new LinkedList();

	public void addArticulo(String id, String nombre, String precio, String cantidad)
	{
		Articulos objArticulos = new Articulos(id, nombre, precio, cantidad);
		catalogo.add(objArticulos);
	}

	public Articulos getArticulos(int i)
	{
		return  (Articulos) catalogo.get(i);
	}

	public int getSize()
	{
		return catalogo.size();
	}

	public void sort()
	{
		Collections.sort(catalogo);
	}
}
