package SegundoSemestre;

import java.util.Date;

import javax.swing.JOptionPane;

public class Reloj
{
	//Atributos de la clase
	private int hora;
	private int minuto;
	private int segundo;
	private Date fechaSistema;

	//Constructor de la clase
	public Reloj()
	{
	super();
	fechaSistema = new Date();
	//System.out.println("fechaSistema: " + fechaSistema);
	}
	
	//Métodos del objeto Método para obtener el valor de la hora
	public int obtenerHora ()
	{
	hora = fechaSistema.getHours();
	
	return (hora);
	}
	//Método para obtener el valor de los minutos
	public int obtenerMinuto ()
	{
	minuto = fechaSistema.getMinutes();
	return (minuto);
	}
	
	//Método para obtener los segundos del sistema
	public int obtenerSegundos()
	{
	segundo = fechaSistema.getSeconds();
	return (segundo);
	}
	
	//Método para mostrar la hora
	public void mostrarHora (int hora, int minuto, int segundo)
	{
	/*
	System.out.println("hora: " + hora);
	System.out.println("minuto: " + minuto);
	System.out.println("segundo: " + segundo);
	*/
	String horaSistema = "Hora del Sistema: ";
	String cadenaHora = "";
	String cadenaMinuto = "";
	String cadenaSegundo = "";
	String cadenaFormato = "";
	//Verificamos los valores de la hora
	if (hora >= 0 && hora <= 9)
	{
	cadenaHora = "0" + String.valueOf(hora);
	}
	else
	{
	if ((hora-12) >= 0 && (hora-12) <=9)
	{
	cadenaHora = "0" +
	String.valueOf(hora-12);
	}
	else
	{
	cadenaHora = String.valueOf(hora-12);
	}
	}
	
	//los de los minutos
	if (minuto >= 0 && minuto <= 9)
	{
	cadenaMinuto = "0" + minuto;
	}
	else
	{
	cadenaMinuto = String.valueOf(minuto);
	}
	//Los segundos
	if (segundo >= 0 && segundo <= 9)
	{
	cadenaSegundo = "0" + segundo;
	}
	else
	{
	cadenaSegundo = String.valueOf(segundo);
	}
	//Verificamos si es PM o AM
	if (hora >= 0 && hora <= 12)
	{
	cadenaFormato = "AM";
	}
	else
	{
	cadenaFormato = "PM";
	}
	//Armamos el display del reloj
	horaSistema = cadenaHora + ":" + cadenaMinuto + ":" + cadenaSegundo + " " + cadenaFormato;
	JOptionPane.showMessageDialog(null,horaSistema);
	}
	
	/**
	* @param args
	* Programa principal
	*/
	public static void main(String[] args)
	{
	/**************************************/
	int salir = 0;
	do
	{
	//Instanciamos el objeto y obtenemos la hora del sistema en el constructor
	Reloj relojActual = new Reloj();
	
	//Mostramos la hora al usuario
	relojActual.mostrarHora(relojActual.obtenerHora(), relojActual.obtenerMinuto(), relojActual.obtenerSegundos());
	
	//Preguntamos si se desea salir del programa. Aca observamos la utilidad de emplear la estructura
	//repeticional do-while
	
	salir = JOptionPane.showConfirmDialog (null,"¿Desea salir del reloj (S/N): ");
	} 
	while (salir == JOptionPane.NO_OPTION);
	}
	}
