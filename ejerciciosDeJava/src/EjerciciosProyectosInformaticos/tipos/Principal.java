package EjerciciosProyectosInformaticos.tipos;

import EjerciciosProyectosInformaticos.Personal;

public final class Principal
{
	private Principal()
	{
		super();
	}
	private void ejecuta()
	{
		Personal objUnaPersona = new Personal();
		System.out.println("Numero de personas creadas" + Personal.getNInstancias());
	}
	Personal objOtraPersoa = new Personal("james","gossing","898989");
	
	public static void main(String[] args)
	{
		Ciudadano objCiudadano = new Ciudadano ("oscar","bocanegra","7038597",33); 
		Principal objPrincipal = new Principal();
		objPrincipal.ejecuta();
		objCiudadano.iniciaAtributos();
		
	}

}
