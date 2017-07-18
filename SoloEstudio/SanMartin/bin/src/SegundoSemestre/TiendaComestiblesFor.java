package SegundoSemestre;

import javax.swing.JOptionPane;

public class TiendaComestiblesFor
{
		//Atributos de la clase
		private int totalComestibles;
		private double iva = 0.16;
		private double totalFactura;
		
		//Métodos de Encapsulamiento de la clase
		public int getTotalComestibles() 
		{
		return totalComestibles;
		}
		
		public void setTotalComestibles(int totalComestibles) 
		{
		this.totalComestibles = totalComestibles;
		}
		
		public double getIva() 
		{
		return iva;
		}
		
		public void setIva(double iva) 
		{
		this.iva = iva;
		}
		
		public double getTotalFactura() 
		{
		return totalFactura;
		}
		
		public void setTotalFactura(double totalFactura) 
		{
		this.totalFactura = totalFactura;
		}
		
		//Métodos de lógica de negocio de la clase (mundo del problema)
		//Método para leer valores numéricos enteros
		public int leerValorEntero (String mensaje)
		{
			int numero = 0;
			numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
			return (numero);
		}
		
		//Método para leer valores numéricos reales
		public double leerValorReal (String mensaje)
		{
			double numero = 0.0;
			numero =Double.parseDouble(JOptionPane.showInputDialog(null,mensaje));
			return (numero);
		}
		
		//Método para leer cadenas de caracteres
		public String leerCadenasCaracteres (String mensaje)
		{
			String cadena = "";
			cadena = JOptionPane.showInputDialog(null,mensaje);
			return (cadena);
		}
		
		//Método para calcular el iva de un producto cualquiera
		public double calcularIVAProducto (double precio, double iva)
		{
			double valorIva = 0.0;
			valorIva = precio + (precio * iva);
			return (valorIva);
		}
		
		//Método para calcular el total de la venta de un producto en particular
		public double calcularTotalProducto (double precio, int numeroItems)
		{
			double totalProductos = 0.0;
			totalProductos = precio * numeroItems;
			return (totalProductos);
		}
		
		//Método para realizar la compra de los productos en la caja
		public double comprarProductosCaja (int totalComestibles)
		{ 
			//Variables locales de ayuda
			int i = 0; //contador de productos
			double precio = 0.0; //Precio que se digita en la caja
			int totalItemsProducto = 0; //Total de ítems del producto a comprar
			String nombre = ""; //Nombre del producto registrado en la caja
			double precioSinIva = 0.0; //Precio de una referencia de productos sin iva
			double precioConIva = 0.0; //Precio de una referencia de productos con iva
			double totalVenta = 0.0; //Total de la venta obtenido
			double precioRetencion = 0.0;
			
		/*
		* Solicitamos el total de productos que vamos a comprar Para ello empleamos un ciclo for (para) que nos permita
		* ingresar el total de los productos y dentro de cada iteración del ciclo leer el total de las referencias de cada uno
		* de ellos.
		*
		* Por ejemplo, si el usuario va a comprar 10 productos, el Sistema solicita que indique el nombre de dicho producto,
		* el precio individual y el total de elementos por dicha referencia
		*
		* Ej:
		*
		* Leer 4 productos en la caja.
		*
		* Botellas de vino 5 unidades precio: $ 10.000.00
		* Cajas de Galletas 8 unidades precio: $ 5000.00
		* Paquetes de pan 10 unidades precio: $ 1000.00
		* Latas de atún 6 unidades precio: $ 2500.00
		* */
			
		//Comenzamos a registrar productos en la caja
		for (i = 0; i < totalComestibles; i++)
		{
			
		//Leemos el nombre del producto
		nombre = leerCadenasCaracteres("Ingrese el nombre del producto: ");
		//Leemos su precio
		precio = leerValorReal("Ingrese el precio individual del producto: ");
		//Leemos el número de ítems para dicho producto
		totalItemsProducto = leerValorEntero("Ingrese el número de ítems para el producto " + nombre);
		//Calculamos el valor sin iva
		precioSinIva = calcularTotalProducto(precio,totalItemsProducto);
		//Calculamos el iva del precio de la referencia
		//usando el porcentaje del 16% definido en el atributo
		//de la clase
		precioConIva = calcularIVAProducto(precioSinIva,iva);
		// calculamos la retencion del precio de cada producto
		precioRetencion = calcularRetencionProducto(precio);
		//Vamos sumando al total de la factura
		totalVenta = totalVenta + precioConIva;
		//Vamos mostrando el producto calculado
		JOptionPane.showMessageDialog(null,"El producto comprado es: " + nombre);
		//El número de productos y el valor del producto
		JOptionPane.showMessageDialog(null,"Se compraron " + totalItemsProducto + " del producto a un precio de " + precio);
		//El precio del subtotal sin iva
		JOptionPane.showMessageDialog(null,"El precio sin iva de la subventa fue de " + precioSinIva);
		//El precio del subtotal con iva
		JOptionPane.showMessageDialog(null,"El precio con iva de la subventa fue de " + precioConIva);
		//El precio de la Retencion
		JOptionPane.showMessageDialog(null,"El precio con retencion es de " + precioRetencion);
		
		//Seguimos iterando
		
		
		}
		return (totalVenta);
		}
		
		/**
		* Constructor de la clase El constructor vacio, recordemos permite la
		* instanciación de los objetos de la clase, tarea que le facilita a la aplicación principal o método
		* main poder hacer uso de los métodos de lógica implementados para caracterizar el comportamiento
		* de la clase Java
		*/
		
		private double calcularRetencionProducto(double precio)
		{
			double valorCalculado = 0;
			if (precio >= 1000 && precio <= 5000)
				valorCalculado =  precio -(precio * 0.03);
			if (precio >= 5001 && precio <= 10000)
				valorCalculado =  precio - (precio * 0.03);
			if (precio >= 10001)
				valorCalculado =  precio - (precio * 0.08);
			return valorCalculado;
		}
		
		private double descuentos(int valorTotal)
		{
			double descuento=0.0;
			if (getTotalFactura()> 150000)
			{
				descuento= getTotalFactura() - (getTotalFactura()*0.20);
			}
			return descuento;
		}
		
		
		public TiendaComestiblesFor()
		{
		// TODO Auto-generated constructor stub
		}
		
		
		public static void main(String[] args)
		{
			int totalFactutaDescuentos=0;

			//Instanciamos el objeto
			TiendaComestiblesFor tiendaBarrio = new	TiendaComestiblesFor();
		//Solicitamos el total de comestibles a comprar
		tiendaBarrio.totalComestibles = tiendaBarrio.leerValorEntero("Ingrese el número total de comestibles a comprar: ");
		//Realizamos la compra en la caja
		tiendaBarrio.totalFactura = tiendaBarrio.comprarProductosCaja(tiendaBarrio.totalComestibles);
		//Imprimimos el total de la factura
		JOptionPane.showMessageDialog(null,"El total de la venta es de: " + tiendaBarrio.totalFactura);
		JOptionPane.showMessageDialog(null,"Descuento de 20 % por compra superior a 150.000: " 
											+ tiendaBarrio.descuentos(totalFactutaDescuentos));
		}
}