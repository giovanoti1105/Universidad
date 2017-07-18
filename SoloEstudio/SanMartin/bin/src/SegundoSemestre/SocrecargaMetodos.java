package SegundoSemestre;

import javax.swing.JOptionPane;

public class SocrecargaMetodos
{
	public SocrecargaMetodos() 
		{
		}
	
		//M�todos sobrecargados
		//M�todo para calcular el valor de la venta solo considerando el precio original
		public double calcularValorVenta (double precio)
		{
			double valorVenta = 0.0;
			valorVenta = precio + 5000.00;
			return (valorVenta);
		}
		
		//M�todo para calcular el valor de la venta considerando el de un impuesto sobre el producto
		public double calcularValorVenta (double precio, double impuesto)
		{
			double valorVenta = 0.0;
			valorVenta = precio + (precio *impuesto);
			return (valorVenta);
		}
		//M�todo para calcular el valor de la venta considerando un impuesto, as� como el valor del IVA
		public double calcularValorVenta (double precio, double iva, double impuesto)
		{
			double valorVenta = 0.0;
			valorVenta = precio + (precio * iva) - (precio * impuesto);
			return (valorVenta);
		}
		
		//M�todo para mostrar la impresi�n de los resultados
		public void imprimirResultadoValorVenta (double valor)
		{
			JOptionPane.showMessageDialog(null,"El valor de la venta fue de " + valor);
		}
		
		//M�todo sobrecargado para imprimir el valor considerando el impuesto
		public void imprimirResultadoValorVenta (double valor, double impuesto)
		{
			JOptionPane.showMessageDialog(null,"El valor de la venta fue de " + valor + " y de su impuesto de " + impuesto);
		}
		
		//M�todo sobrecargado para imprimir el valor considerando el impuesto
		public void imprimirResultadoValorVenta (double valor, double impuesto, double iva)
		{
			JOptionPane.showMessageDialog(null,"El valor de la venta fue de " 
												+ valor + " y de su impuesto de " 
												+ impuesto + " con un iva del " + iva);
		}
		
		public static void main(String[] args)
		{
			//Declaraci�n del objeto
			SocrecargaMetodos manejadorMetodos = new SocrecargaMetodos();
			double precio = 0.0;
			double valorVenta = 0.0;
			//Leemos el precio
			precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor neto del precio del producto: "));
			//Usamos la sobrecarga de los m�todos
			valorVenta = manejadorMetodos.calcularValorVenta(precio);
			manejadorMetodos.imprimirResultadoValorVenta (valorVenta);
			//Usamos el mismo m�todo, pero considerando el impuesto
			valorVenta = manejadorMetodos.calcularValorVenta(precio,0.10);
			manejadorMetodos.imprimirResultadoValorVenta (valorVenta,0.10);
			
			//Usamos el impuesto y el IVA
			valorVenta = manejadorMetodos.calcularValorVenta(precio,0.16,0.50);
			manejadorMetodos.imprimirResultadoValorVenta (valorVenta,0.16,0.50);
			}
	}//
