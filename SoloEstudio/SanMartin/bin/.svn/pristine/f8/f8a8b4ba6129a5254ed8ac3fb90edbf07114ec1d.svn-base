package SegundoSemestre;

import javax.swing.JOptionPane;

public class MatrizEmpleados
{
	// atributos de la clase
	private Object[][] MatrizEmpleados;

	// constructor de la clase
	public MatrizEmpleados()
	{
	}

	// metodos deencapsulamiento
	public Object[][] getMatrizEmpleados()
	{
		return MatrizEmpleados;
	}

	public void setMatrizEmpleados(Object[][] matrizEmpleados)
	{
		this.MatrizEmpleados = matrizEmpleados;
	}

	// metodo para leer losdatos de la matriz
	public Object[][] leerMatrizEmpleados(int filas, int columnas)
	{
		int i = 0;
		int j = 0;
		String nombre = "";
		int edad = 0;
		double salario = 0.0;
		try
		{
			// creamos la matriz
			MatrizEmpleados = new Object[filas][columnas];
			// filas
			for (i = 0; i < filas; i++)
			{
				System.out.println("Filas" + i);
				// columnas
				for (j = 0; j < columnas; j++)
				{
					System.out.println("Columnas " + j);
					if (j == 0)
					{
						// almacenamos el nombre
						nombre = JOptionPane.showInputDialog(null, "Ingrese nombre empleado");
						MatrizEmpleados[i][j] = new String(nombre);
					} else if (j == 1)
					{
						// almacenamos la edad
						edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Edad"));
						MatrizEmpleados[i][j] = new Integer(edad);
					} else if (j == 2)
					{
						salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Salario"));
						MatrizEmpleados[i][j] = new Double(salario);
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException errorDesbordamiento)
		{
			JOptionPane.showMessageDialog(null, "Error desbordamiento " + errorDesbordamiento.getLocalizedMessage());
			errorDesbordamiento.printStackTrace();
			Object[][] matrizLimpia = new Object[3][3];
			for (i = 0; i < 3; i++)
			{
				for (j = 0; j < 3; j++)
				{
					matrizLimpia[i][j] = null;
				}
			}
			return (matrizLimpia);
		}
		return MatrizEmpleados;
	}

	// metodo para imprimir los datos de la matriz de empleados
	public void imprimirDatosMatrizEmpleados(Object[][] matrizDatos, int filas, int columnas)
	{
		int i = 0;
		int j = 0;
		Object valor = null;
		String nombre = "";
		int edad = 0;
		double salario = 0.0;
		try
		{
			// filas
			for (i = 0; i < filas; i++)
			{
				// columnas
				for (j = 0; j < columnas; j++)
				{
					// recuperamos el valor como objeto
					valor = matrizDatos[i][j];
					if (j == 0)
					{
						nombre = (String) valor;
						JOptionPane.showMessageDialog(null, "Nombre Empleado [" + i + "][" + j + "]:" + nombre);
					} else if (j == 1)
					{
						Integer dato=null;
						dato=(Integer) valor;
						edad=dato.intValue();
						JOptionPane.showMessageDialog(null, "Edad Empleado [" + i + "][" + j + "]:" + edad);
					}
					else if (j == 2)
					{
						Double dato = null;
						dato=(Double) valor;
						salario=(Double) valor;
						JOptionPane.showMessageDialog(null, "Edad Empleado [" + i + "][" + j + "]:" + edad);
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException errorDesbordamiento)
		{
			JOptionPane.showMessageDialog(null, "Error desbordamiento " + errorDesbordamiento.getLocalizedMessage());
			errorDesbordamiento.printStackTrace();
		}
	}
	public int leerDimension (String mensaje)
	{
		int dimension =0;
		dimension= Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
		return dimension;
	}
	public static void main(String[] args)
	{
		MatrizEmpleados manejadorMatriz = new MatrizEmpleados ();
		int filas=0;
		int columnas=0;
		Object[][] hojaEmpleados=null;
		filas = manejadorMatriz.leerDimension("Ingrese Cantidad filas");
		columnas = manejadorMatriz.leerDimension("Ingrese Cantidad Columnas");
		// leemos la matriz
		hojaEmpleados= manejadorMatriz.leerMatrizEmpleados(filas, columnas);
		// impresion de la matriz
		manejadorMatriz.imprimirDatosMatrizEmpleados(hojaEmpleados, filas, columnas);
	}
}