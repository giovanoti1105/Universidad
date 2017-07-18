package Varios.paratienda;

public class Regalos
{
	public static void main(String[] args)
	{
		Escaparate objAlmacen = new Escaparate();
		
		objAlmacen.addArticulo("c01", "ZAPATILLAS", "9.99", "150");
		objAlmacen.addArticulo("c02", "BOLSA DEPORTIVA", "12.50", "82");
		objAlmacen.addArticulo("c03", "GORRA", "10.49", "800");
		objAlmacen.addArticulo("d01", "CAMISETA", "16.99", "90");
		objAlmacen.sort();
		
		for (int i = 0; i < objAlmacen.getSize(); i++)
		{
			Articulos objMostrar = (Articulos) objAlmacen.getArticulos(i);
			System.out.println("\n Articulos ID : " + objMostrar.getId() +
					"\n Nombre : " + objMostrar.getNombre() +
					"\n Precio Detalle " + objMostrar.getDetalle() + 
					"\n Precio " + objMostrar.getPrecio() + " e " +
					"\n Cantidad " + objMostrar.getCantidad());
			
		}
	}

}
