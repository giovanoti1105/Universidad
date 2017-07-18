package TercerSemestreCasoEmpleado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD
{
	public Connection conn;
	// funcion que hace la conexion de la base de datos
	public void Conexion() throws SQLException
	{
		try
		{
			String url = "jdbc:mysql://";
			String host = "localhost:3307";
			String bd = "/fundacionuniversitariasanmartin";
			String conexion = url + host + bd;
			String user = "root";
			String pw = "dycym2016";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(conexion, user, pw);
			/**
			 * if (conn!=null) { System.out.println("Conectado"); } else
			 * System.out.println("Error de Conexion");
			 **/
		} catch (Exception e)
		{
			conn.close();
		} 
	}
	public Connection getConnection(){
        return conn;
    }
     
    public void desconectar(){
        conn = null;
    }
}
