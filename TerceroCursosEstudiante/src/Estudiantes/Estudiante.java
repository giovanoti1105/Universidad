package Estudiantes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Principal.*;
import Utilitarios.*;


public class Estudiante
{
	// variables tipo globales
	private int codigo;
	private String nombre;
	private String apellido;
	static Statement st ;
	static Connection conn = null;
	
	PrincipalEst objDatosPrincipales = new PrincipalEst();

	// constructor de la clase
	public Estudiante(String nombre, String apellido, int codigo)
	{
		nombre = this.nombre;
		apellido = this.apellido;
		codigo = this.codigo;
	}

	// constructor de la clase sin paso de argumentos
	public Estudiante()
	{
	}
	
	// funcion para buscar cursos
	public void buscarCurso()
	{
	}

	// funcion para asignacin de cursos
	private void asignarCursos()
	{
		
	}

	// funcion que permite validar si tiene cursos completos
	private void tieneCursosCompletos()
	{
	}

	// funcion que valida si se incluyen los cursos
	private void pensumIncluyeCursos()
	{
	}

	// funcion que calcula el promedio del estudiante
	private void calcularPromedioEstudiante()
	{
	}

	// funcion que calcula si el estudiante se encuentra a prueba
	private void estudianteEstaPrueba()
	{
	}

	// datos estudiante
	public void datosEstudiante(String nombres, String apellidos, String codigo) throws SQLException
	{
		Conexion objConexion = new Conexion(); 
		objConexion.conexion();
		Statement st = objConexion.conn.createStatement();
		try
		{
			st.executeUpdate("INSERT INTO estudiante (cod_estudiante, nomb_estudiante, apell_estudiante) "
					+ "VALUES ('"+codigo+"','"+nombres+"','"+apellidos+"' )");
		} 
		catch (Exception e)
		{ }
		
		st.close();
		objConexion.desconectar();
	}
}