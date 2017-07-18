package EjerciciosProyectosInformaticos;

public class ImpresionPersona
{

	public static void main(String[] args)
	{
		Persona objGrupoPersona[] = new Persona[10];
		objGrupoPersona[5] = new Persona("uno", "dos", "tres");
		Persona objPersona = new Persona("oscar", "giovanni", "5632296");
		System.out.println("Impresion de los nombres usando las variables directamente");
		System.out.println(objPersona.nombre);
		System.out.println(objPersona.apellidos);
		System.out.println(objPersona.telefono);
		System.out.println("Impresion de los nombres usando los geters");
		System.out.println(objPersona.getNombre());
		System.out.println(objPersona.getApellidos());
		System.out.println(objPersona.getTelefono());
		System.out.println("Impresion de los Arrays");
		System.out.println(objGrupoPersona[5].nombre);

	}

}
