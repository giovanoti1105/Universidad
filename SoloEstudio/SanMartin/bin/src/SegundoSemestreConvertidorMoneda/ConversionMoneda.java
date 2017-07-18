package SegundoSemestreConvertidorMoneda;

import java.text.DecimalFormat;

public class ConversionMoneda
{
	// constructor de la clase
	public ConversionMoneda(){}
	// funcion convierte moneda
	public String conversor(String valorConvertido, String seleccionado)
	{
		DecimalFormat formateador = new DecimalFormat("####,###.#");
		ConvertidorMoneda objConvertidor = new ConvertidorMoneda (); 
		int dolar=1900;
		int euro=2500;
		int peso=1;
		String resultado="";
		
		if (seleccionado == "Euro")
		{
			double cantidad=Double.parseDouble(valorConvertido);
			cantidad*=euro;
			resultado=String.valueOf(formateador.format(cantidad));
		}
		else if (seleccionado == "Dolar")
		{
			double cantidad=Double.parseDouble(valorConvertido);
			formateador.format(cantidad*=dolar);
			resultado=String.valueOf(formateador.format(cantidad));
		}
		else if (seleccionado == "Peso")
		{
			double cantidad=Double.parseDouble(valorConvertido);
			formateador.format(cantidad*=peso);
			resultado=String.valueOf(formateador.format(cantidad));
		}
		return resultado;
	}
}