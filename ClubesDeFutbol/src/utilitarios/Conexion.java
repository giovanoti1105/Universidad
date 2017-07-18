package utilitarios;

import java.sql.*;

public class Conexion
{
	public Connection conn;
	public void conexion()
	{
		try
		{
			String url="jdbc:mysql://localhost:3307/bdclubes";
			String user="root";
			String pw="dycym2016";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pw);
			/*
			if (conn!=null)
			{
			//	System.out.println("Conectado");
			}
			else
				//System.out.println("Error de Conexion");
				 */
		} catch (Exception e)
		{}
	}
	
	// funcion que retorna la conexion
	public Connection getConnection ()
	{
		return conn;
	}
	public void desconectar()
	{
		conn = null;
	}
}