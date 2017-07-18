package EntidaesFinancieras;

import java.util.Date;
import java.util.Scanner;
public class Banco{
    int codigoBanco;
    String nombreBanco;
    String direccionPrincipalBanco;
    String telefonoBanco;
    
     //constructor de la clase
        public Banco(int codigoBanco, String nombreBanco, String direccionPrincipalBanco, String telefonoBanco, int numeroCuenta, String tipoCuenta) {
        //super(numeroCuenta, tipoCuenta);
        this.codigoBanco = codigoBanco;
        this.nombreBanco = nombreBanco;
        this.direccionPrincipalBanco = direccionPrincipalBanco;
        this.telefonoBanco = telefonoBanco;
    }
        //constructor de la clase
        public Banco() {
        //super(numeroCuenta, tipoCuenta);
        this.codigoBanco = 0;
        this.nombreBanco = "";
        this.direccionPrincipalBanco = "";
        this.telefonoBanco = "";
    }
        // constructor billetes 
       
    //<editor-fold defaultstate="collapsed" desc="funciones get y set">
    public void setCodigoBanco(int codigoBanco){
        this.codigoBanco=codigoBanco;
    }
    public int getCodigoBanco(){
        return codigoBanco;
    }
    public void setNombreBanco (String nombreBanco){
        this.nombreBanco=nombreBanco;
    }
    public String getNombreBanco(){
        return nombreBanco;
    }
    public void setDireccionPrincipalBanco(String direccionPrincipalBanco){
        this.direccionPrincipalBanco=direccionPrincipalBanco;
    }
    public String getdireccionPrincipalBanco(){
        return direccionPrincipalBanco;
    }
    public void setTelefonoBanco(String telefonoBanco){
        this.telefonoBanco=telefonoBanco;
    }
    public String gettelefonoBanco(){
        return telefonoBanco;
    }
   

   
    //</editor-fold>
    
    public void CrearBanco(int codigoBanco){
        Scanner nuevoBanco = new Scanner(System.in);
        Banco nuevobanco = new Banco();
        if (codigoBanco==codigoBanco){
        
        System.out.println("codigo del Banco");
        codigoBanco=nuevoBanco.nextInt();
        nuevobanco.setCodigoBanco(codigoBanco);
        
        System.out.println("Nombre del Banco");
        String nombre=nuevoBanco.next();
        nuevobanco.setNombreBanco(nombreBanco);
        
        System.out.println("Direccion del Banco");
        String direccion=nuevoBanco.next();
        nuevobanco.setDireccionPrincipalBanco(direccionPrincipalBanco);
        
        System.out.println("Telefono del Banco");
        String telefono=nuevoBanco.next();
        nuevobanco.setTelefonoBanco(telefonoBanco);
        }else 
            System.out.println("Error Banco ya existe");
    }
    public void agregarCuenta(){
    }
    
    
        
    }