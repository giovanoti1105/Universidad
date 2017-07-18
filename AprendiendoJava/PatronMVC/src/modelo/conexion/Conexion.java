package modelo.conexion;

import java.sql.*;

import Interfaces.Constantes;


/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */
public class Conexion implements Constantes{
   static String bd = "bd_ejemplos";
   static String login = "admin";
   static String password = "c4p3r1t4";
   static String url = "jdbc:mysql://localhost/"+bd;

   Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            //System.out.println("Conección a base de datos "+bd+" OK");
            LOGGER.info("Conección a base de datos "+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
         LOGGER.error("Conección a base de datos "+e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}