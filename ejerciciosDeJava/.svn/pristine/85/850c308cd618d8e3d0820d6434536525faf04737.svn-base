package Varios.paratienda;

import java.util.*;

public class Articulos implements Comparable
{
	// definicion de variables
	private String id;
	private String nombre;
	private double detalle;
	private int cantidad;
	private double precio;
	
	public Articulos(String idIn, String nombreIn, String detalleIn, String cantIn)
	{
		id = idIn;
		nombre = nombreIn;
		detalle = Double.parseDouble(detalleIn);
		cantidad = Integer.parseInt(cantIn);
		
		if(cantidad > 400)
			precio = detalle*.50;
		else if (cantidad > 200)
			precio = detalle*.60;
		else
			precio = detalle*.70;
			precio = Math.floor(precio*100+.5)/100;
	}
	
	@Override
	public int compareTo(Object obj)
	{
		Articulos objTemp = (Articulos) obj;
		if (this.precio < objTemp.precio)
			return 1;
		else if (this.precio > objTemp.precio)
			return -1;
		return 0;
	}

	public String getId()
	{
		return id;
	}

	public String getNombre()
	{
		return nombre;
	}

	public double getDetalle()
	{
		return detalle;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	public double getPrecio()
	{
		return precio;
	}

	
}
