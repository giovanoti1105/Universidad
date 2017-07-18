package Varios.PanelReloj;

import java.awt.*;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelReloj extends JPanel
{
	// constructor de la clase
	public PanelReloj()
	{
		super();
		String tiempoActual = getTiempo();
		JLabel tiempo = new JLabel ("Fecha : ");
		JLabel actual = new JLabel (tiempoActual);
		add(tiempo);
		add(actual);
	}
	String tiempo;

	String getTiempo()
	{
		// obtener fecha y hora actual
		Calendar objAhora = Calendar.getInstance();
		int hora = objAhora.get(Calendar.HOUR_OF_DAY);
		int minuto = objAhora.get(Calendar.MINUTE);
		int mes = objAhora.get(Calendar.MONTH);
		int dia = objAhora.get(Calendar.DAY_OF_MONTH);
		int year = objAhora.get(Calendar.YEAR);

		String nombreMes = "";
		switch (mes)
		{
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		}
		tiempo = dia + " de " + nombreMes + " de " + year + " . " + " Hora " + hora + " : " + minuto;
		return tiempo;
	}
}
