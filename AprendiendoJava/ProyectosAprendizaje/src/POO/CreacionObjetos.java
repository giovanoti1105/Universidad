package POO;

import java.util.ArrayList;
import java.util.List;

public class CreacionObjetos {
	
	
	public static void main(String[] args) {
		Persona objPersona = new Persona();
		Alumno objAlumno = new Alumno(); 
		
		objPersona.setApellidos("Garcia fuentes");
		objPersona.setNombres("Leonardo");
		objPersona.setEdad(25);
		objPersona.sueldo = 250000;
		System.out.println(objPersona.NombreCompleto());
		
		List<Persona> LtPersona;
		LtPersona=new ArrayList<>();
		LtPersona.add(objPersona);
		System.out.println("Cantidad " + LtPersona.size());
		
		objAlumno.setNombres("Oscar Giovanni");
		objAlumno.setNota(4.5);
		System.out.println(objAlumno.getNombres());
		System.out.println(objAlumno.getNota());
	}

}
