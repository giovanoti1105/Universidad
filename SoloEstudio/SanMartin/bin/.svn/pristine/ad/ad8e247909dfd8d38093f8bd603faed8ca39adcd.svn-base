package SegundoSemestre;

import javax.swing.JOptionPane;

public class FigurasGeometricas
{
		//Atributos de la clase
		private double areaCuadrado;
		private double areaCirculo;
		private double constantePI = 3.141592654;

		//Método constructor de la clase
		public FigurasGeometricas()
		{
		super();
		}

		//Métodos de lógica de la clase
		//Método para calcular el área del cuadrado
		public double calcularAreaCuadrado (double base, double altura)
		{
		//Variables locales del método
		areaCuadrado = 0.0;
		areaCuadrado = base * altura;
		return (areaCuadrado);
		}

		//Método para calcular el área del círculo
		public double calcularAreaCircunferencia (double radio)
		{
		areaCirculo = 0.0;
		areaCirculo = constantePI * Math.pow(radio,2);
		return (areaCirculo);
		}
		
		//Método para leer los datos
		public double leerValorReal (String mensaje)
		{
		double valor = 0.0;
		valor = Double.parseDouble(JOptionPane.showInputDialog(null,mensaje));
		return (valor);
		}
		
		/**
		* @param args
		* Aplicación principal
		*/
		public static void main(String[] args)
		{
		/*Capturamos los datos de entrada, necesarios
		* para el procesamiento de los métodos
		*/
		//Instanciamos el objeto
		FigurasGeometricas objfiguras = new FigurasGeometricas();

		//Variables locales al main
		double base = 0.0;
		double altura = 0.0;
		double radio = 0.0;
		double areaCuadrado = 0.0;
		double areaCirculo = 0.0;
		
		//Procedemos a realizar la lectura de los datos
		base = objfiguras.leerValorReal ("Ingrese el valor de la base del paralelogramo: ");
		altura = objfiguras.leerValorReal ("Ingrese el valor de la altura del paralelogramo: ");
		radio = objfiguras.leerValorReal ("Ingrese el valor del radio de la circunferencia: ");
		
		//Ejecutamos los métodos para realizar los cálculos
		areaCuadrado = objfiguras.calcularAreaCuadrado(base,altura);
		JOptionPane.showMessageDialog(null,"El área del paralelogramo es: " + areaCuadrado);
		//Método para calcular el área del círculo
		areaCirculo = objfiguras.calcularAreaCircunferencia(radio);
		JOptionPane.showMessageDialog(null,"El área de la circunferencia es: " + areaCirculo);
		}
		}//Fin de la clase
