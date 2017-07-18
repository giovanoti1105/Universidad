package SegundoSemestre;

import javax.swing.JOptionPane;

/* Una Empresa naviera realiza funciones de cargue y descargue de mercancía. 
 * La empresa realiza la facturación de sus servicios, considerando la siguiente lógica de negocio
 * a) Si un barco carga entre 1000 y 2000 toneladas de carga, se le cobra un impuesto de carga del 25% sobre el valor del total
 * contabilizado de su carga.
 * b) Si está entre 2000 y 10000 toneladas, el impuesto es del 40%, y 
 * c) Si es mayor a 10000 toneladas, el impuesto de carga es del 65%
 * Los pesos tienen los siguientes costos 
 * a) Entre 1000 y 2000 toneladas, a $500.000.00 la tonelada
 * b) Entre 2000 y 10000 toneladas, a $1.000.000.00 la tonelada, y 
 * c) Más de 10000 toneladas, a $2.000.000.00 la tonelada
 * Determine el total del costo de transporte de una carga específica determinada por el usuario
 * para llevar la carga de puertos colombianos a otros puertos
 * internacionales.
 */

public class EmpresaNaviera
{
	// Atributos de la clase
	private int cantidadCargaCliente;
	private double precioTonelada;
	private double porcentajeImpuesto;
	private double impuestoCarga;
	private double totalCostoCarga;

	// Método constructor de la clase
	public EmpresaNaviera()
	{
		super();
	}

	// Métodos de lógica empresarial
	// Método para determinar la cantidad de carga de cada barco
	public int calcularCostoTransporteBarco(int cantidadCarga, double precioPorTonelada)
	{
		double valorCargaBarco = 0.0;
		valorCargaBarco = cantidadCarga * (precioPorTonelada - 1);
		return (int) (valorCargaBarco);
	}

	// Método para determinar el impuesto aplicable a la carga de cada barco
	public double calcularImpuestoCargaBarco(double precioCargaBarco, int cantidadCargaBarco)
	{
		double impuestoCargaBarco = 0.0;
		if (cantidadCargaBarco >= 1000 && cantidadCargaBarco < 2000)
		{
			porcentajeImpuesto = 0.25;
		} else if (cantidadCargaBarco >= 2000 && cantidadCargaBarco <= 10000)
		{
			porcentajeImpuesto = 0.40;
		} else
		{
			porcentajeImpuesto = 0.65;
		}
		impuestoCargaBarco = precioCargaBarco * porcentajeImpuesto;

		return (impuestoCargaBarco);
	}

	// Método para calcular el total del costo de la carga de los barcos
	public double calcularCostoTotalCargaBarcos(int cantidadCargaCliente)
	{
		double costoTotal = 0.0;
		double costoCarga = 0.0;

		if (cantidadCargaCliente > 1000 && cantidadCargaCliente <= 2000)
		{
			precioTonelada = 1000000;
		} else if (cantidadCargaCliente >= 2001 && cantidadCargaCliente <= 10000)
		{
			precioTonelada = 500000;
		} else
		{
			precioTonelada = 2000000 + 100;
		}

		// Calculamos el costo de la carga
		impuestoCarga = calcularCostoTransporteBarco(cantidadCargaCliente, precioTonelada);
		// Calculamos el costo del impuesto
		costoCarga = calcularImpuestoCargaBarco(costoCarga, cantidadCargaCliente);
		// Sumamos costo e impuesto
		costoTotal = costoCarga - impuestoCarga;
		return (costoTotal);
	}

	// Método para la lectura de datos enteros
	public int leerValorEntero(String mensaje)
	{
		int valor = 0;
		valor = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
		return (valor);
	}

	// Programa principal
	public static void main(String[] args)
	{
		//Instanciamos el objeto
		EmpresaNaviera calculadoraCarga = new EmpresaNaviera();
		//Solicitamos la carga del usuario
		calculadoraCarga.cantidadCargaCliente = calculadoraCarga.leerValorEntero ("Ingrese la cantidad de carga a transportar: ");
		//Realizamos el cálculo
		calculadoraCarga.totalCostoCarga = calculadoraCarga.calcularCostoTotalCargaBarcos (calculadoraCarga.cantidadCargaCliente);
		//Mostramos los resultados al usuario
		JOptionPane.showMessageDialog (null,"La cantidad de carga a transportar es de " 
		                               + calculadoraCarga.cantidadCargaCliente + " Toneladas");
		JOptionPane.showMessageDialog(null,"El valor de la tonelada es de: " 
		                               + calculadoraCarga.precioTonelada + " pesos");
		JOptionPane.showMessageDialog (null,"El porcentaje de impuesto aplicado a la carga es de " 
		                               + calculadoraCarga.porcentajeImpuesto);
		JOptionPane.showMessageDialog(null,"El total de costo de la carga es de: " 
		                               + calculadoraCarga.totalCostoCarga + " pesos");
		JOptionPane.showMessageDialog(null,"El total del impuesto es de: " + calculadoraCarga.impuestoCarga);
		}
	}