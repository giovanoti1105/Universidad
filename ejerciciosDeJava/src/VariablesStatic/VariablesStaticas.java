package VariablesStatic;

class VariablesStaticas {
	
	String nombre="oscar giovanni";
	String nombre2="luis";
	
	public void llamarvariables()
	{
		System.out.println("nombre original de la variable nombre = " + nombre);
		nombre="luis antonio";
		System.out.println("nombre cambiado de la variable nombre = " + nombre);
	}
	public static void main (String arg [])
	{
		VariablesStaticas objobjetos = new VariablesStaticas();
		objobjetos.llamarvariables();
	}
}