package TercerSemestreCasoEmpleado;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.ResultSet;

public class consultasDAO
{
	DatosEmpleados datos = new DatosEmpleados();
	String tabla = "empleado";
	String strTabla="";
	String strTipoCampoLlave = "cadena";
	String strCampoLLave = "CODIGO";
	String strArrayCamposLlave[];
	int intArrayCamposLlave[];
	int intTotalRegistros = 0, intFilaActual = 0;
	 ResultSet rs;
	 Statement st;
	 String strOrdenarPor = "";
	ConexionBD conexion = new ConexionBD();

	ResultSet consulta(ResultSet rs) throws SQLException
	{
		conexion.Conexion();
		Statement stm = conexion.getConnection().createStatement();
		try
		{
			rs = (ResultSet) stm.executeQuery("SELECT * FROM " + tabla + " WHERE " + strCampoLLave + "='" + strArrayCamposLlave[intFilaActual] + "'");
			//rs = (ResultSet) stm.executeQuery("SELECT * FROM " + tabla);
		} 
		catch (Exception e)
		{
			System.out.println(e);
			conexion.desconectar();
			rs.close();
		}
		return rs;
	}
	
	

	// se mueve a la primera fila y devuelve true si se pudo, false sino se pudo
	// ir a la primera fila
	public boolean primero(ResultSet rs)
	{
		try
		{
			intFilaActual = 0;
			if (strTipoCampoLlave.equals("cadena"))
				rs = consulta(rs);
			if (rs.next())
				return true;
			return false;
		} catch (SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	// se mueve a la anterior fila y devuelve true si se pudo, false sino se
	// pudo
	public boolean anterior()
	{
		try
		{
			intFilaActual--;
			if (intFilaActual < 0)
				intFilaActual = 0;
			if( strTipoCampoLlave.equals("cadena"))
				rs = consulta(rs);
			if (rs.last())
				return true;
				return false;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	// se mueve a la siguiente fila y devuelve true si se pudo, false sino se
	// pudo ir a la siguiente fila
	public boolean siguiente()
	{
		try
		{
			intFilaActual++;
            if(intFilaActual>intTotalRegistros-1)
                intFilaActual = intTotalRegistros-1;
            if( strTipoCampoLlave.equals("cadena"))
            	rs = consulta(rs);
			if(rs.next())
				return true;
			return false;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	//permite especificar el campo por el que se van a ordenar los registros
    public  void ordenarPor(String campo)
    {
        strOrdenarPor = campo;
    }
	
	//Ejecuta un SELECT y devuelve el Resultset con los resultados
    public ResultSet ejecutarConsulta(String cadSQ) throws SQLException
    {
        rs = null;
        if( ! strOrdenarPor.equals("") )
            cadSQ += " ORDER BY " +strOrdenarPor;
             
        try
        {
            rs = (ResultSet) st.executeQuery(cadSQ);
            return rs;
       }
       catch(SQLException sqlex)
       {
            sqlex.printStackTrace();
            return rs;
       }
    }
 
    public  void obtenerCamposLlave()
    {
        obtenerCamposLlave(tabla);
    }
    
    // obtiene el campo llave de la tabla
    public  void obtenerCamposLlave(String tabla)
    {
        int c=0;
        try
        {
            rs = ejecutarConsulta("SELECT * FROM " + tabla);
            while(rs.next())
                c++;
            intTotalRegistros = c;
            strArrayCamposLlave = new String[intTotalRegistros];
            intArrayCamposLlave = new int[intTotalRegistros];
             
            cerrar(rs);     //Cerrar consulta anterior
            //Ejecutar nuevamente la consulta
            rs = ejecutarConsulta("SELECT * FROM " + tabla);
            rs.next();      //Moverse al primer registro
            c=0;
            do
            {           //determina el tipo del campo llave y en base a eso guarda en el array correspondiente
                if( strTipoCampoLlave.equals("cadena") )                
                    strArrayCamposLlave[c] = rs.getString(strCampoLLave);
                else
                    intArrayCamposLlave[c] = rs.getInt(strCampoLLave);
                     
                c++;
            }while( rs.next() );
        }
        catch(SQLException sqlex)
        {
        sqlex.printStackTrace();
        }
    }
 // Cierra un objeto Resultset
    public static void cerrar(ResultSet rs)
    {   
        try
        {
            rs.close();
        } 
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
     
    // cierra un objeto Statemet
    public static void cerrar(Statement st)
    {
        try
        {
            st.close();
        } 
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
 
    // Cierra un objeto Connection
    public static void cerrar(Connection con)
    {   
        try
        {
            con.close();
        } 
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
  //Permite especificar cual es el campo llave de la tabla
    public  void setCampoLlave(String campo)
    {
        strCampoLLave = campo;
    }
     
    //Permite especificar cual es el campo llave y su tipo, de la tabla
    public  void setCampoLlave(String campo, String tipo)
    {
        strCampoLLave = campo;
        strTipoCampoLlave = tipo;
    }
     
    public void setTipoCampoLlave(String tipo)
    {
        strTipoCampoLlave = tipo;
    }
     
    //Especifica la tabla sobre la k se va a trabajar
    public  void setTabla(String tabla)
    {
        try
        {
            strTabla = tabla;
            st=conexion.conn.createStatement();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
	
}
