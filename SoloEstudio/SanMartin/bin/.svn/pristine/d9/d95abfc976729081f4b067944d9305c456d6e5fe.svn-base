package SegundoSemestre;

import javax.swing.JOptionPane;

public class ValidacionDatos
{
	public ValidacionDatos() 
	{
		// TODO Auto-generated constructor stub
	}
	
	//Método para garantizar la lectura del valor numérico
	public int leerNumeroEntero (String mensaje)
	{
		int valor = 0;
		try
		{
		valor = Integer.parseInt (JOptionPane.showInputDialog(null,mensaje));
		}
		catch (Exception errorLectura)
		{
			//Manejo de la excepción
			JOptionPane.showMessageDialog(null,"Sólo puede ingresar valores numéricos");
			JOptionPane.showMessageDialog(null,"Error en la	MV: " + errorLectura.getMessage());
			errorLectura.printStackTrace();
			//Valor a retornar en caso del error
			return (0);
		}
		return (valor);
		}
		//Método que emplea un ciclo do-while (repita-mientras), para
		//garantizar la lectura del dato en un rango específico.
		//Si el dato está fuera de este rango, el sistema genera un mensaje
		//de advertencia para el usuario y obliga nuevamente a ejecutar
		//la lectura del valor. No se sale del ciclo, hasta que el usuario
		//ha ingresado el dato correcto, por lo que al final, al capturar
		//dicho dato correctamente, puede regresar el resultado
		public int leerValorNumericoRango (String mensaje, int valorMenor, int valorMayor)
		{
			//Variable local
			int numero = 0;
			try
			{
				do
					{
					//Llemos operativamente el dato
					numero = leerNumeroEntero(mensaje);
					//Preguntamos si es un número válido
					if (numero < valorMenor || numero >	valorMayor)
						{
						JOptionPane.showMessageDialog (null,"El número ingresado no puede ser menor a " 
														+ valorMenor + " o mayor a " + valorMayor);
						}
					//Obligamos a la lectura, en caso de cumplirse esta condición
					}
				while (numero < valorMenor || numero > valorMayor);
				}
			catch (Exception errorValidacion)
			{
				//Excepción manejada en el método
				JOptionPane.showMessageDialog(null,"Error en el ingreso de datos");
				JOptionPane.showMessageDialog(null,"Error capturado en la MV: " + errorValidacion.toString());
				errorValidacion.printStackTrace();
				
				//Valor de retorno en caso de error
				return (0);
			}
		return (numero);
		}
		/**
		* @param args
		*/
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			ValidacionDatos validador = new ValidacionDatos();
			int numero = 0;
			try
			{
				//Leemos el número
				numero = validador.leerValorNumericoRango("Ingrese un valor numérico entre 1 y 100" ,1,100);
				//Lo imprimimos una vez fue capturado
				JOptionPane.showMessageDialog(null,"El número ingresado es: " + numero);
			}
			catch (Exception errorMain)
			{
				JOptionPane.showMessageDialog(null,"Error en el programa principal: " + errorMain.getMessage());
				errorMain.printStackTrace();
			}
		}
	}