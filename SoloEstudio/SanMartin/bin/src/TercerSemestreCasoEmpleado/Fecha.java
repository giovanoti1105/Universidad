package TercerSemestreCasoEmpleado;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha
{
	private int dia;
	private int mes;
	private int anio;

	public void Inicializar(int d,int m,int a)
	{
		dia=d;
		mes=m;	
		anio=a;
	}
	void inicializarHoy()
	{
		GregorianCalendar gc = new GregorianCalendar();
		dia= gc.get(Calendar.DAY_OF_MONTH);
		mes=gc.get(Calendar.MONTH)+1;
		anio=gc.get(Calendar.YEAR);
	}
	
	public int getDia()
	{
		return dia;
	}
	public int getMes()
	{
		return mes;
	}
	public int getAnio()
	{
		return anio;
	}
	int darDiferenciaEnMeses(Fecha fecha)
	{
		int diferenciaMeses=0;
		int otroanio=fecha.getAnio();
		int otroMes=fecha.getMes();
		int otroDia=fecha.getDia();
		diferenciaMeses = 12 * (otroanio-anio)+(otroMes-mes);
		
		// si el dia no es mayor resta un mes
		if(otroDia<dia)
			diferenciaMeses--;
		
		return diferenciaMeses;
	}
	
	@Override
	public String toString()
	{
		return "" + dia +"-" +mes+ "-" +anio;
	}
}
