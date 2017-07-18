package EntidaesFinancieras;
import java.util.Scanner;
class Cliente extends CuentaBancaria{
int idCliente;
String nombreCliente;
String direccionCliente;
String telefonoCliente;


// constructor de la clase
 public Cliente(int idCliente, String nombreCliente, String direccionCliente, int numeroCuenta, String tipoCuenta) {
        super(numeroCuenta, tipoCuenta);
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
    }
 public Cliente() {
        idCliente =0;
        nombreCliente = "";
        direccionCliente = "";
        telefonoCliente="";
        numeroCuenta=0;
        tipoCuenta="";
    }

    //<editor-fold defaultstate="collapsed" desc="Etiquetas Get and Set">
    public String getDireccionCliente() {
        return direccionCliente;
    }
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getTelefonoCliente() {
        return telefonoCliente;
    }
    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    //</editor-fold> 
    
    Scanner entrada = new Scanner(System.in);
    Cliente nuevocliente = new Cliente ();
    CuentaBancaria tipocuenta = new CuentaBancaria();
    // metodo que crea un cliente
    public void crearCliente(int idCliente, String nombreCliente, String direccionCliente,String tipoCuenta,int numeroCuenta ){
       System.out.println("Ingrese ID del cliente");
        idCliente=entrada.nextInt();
        nuevocliente.setIdCliente(idCliente);
        
        System.out.println("Ingrese el nombre del cliente");
        nuevocliente.nombreCliente=entrada.nextLine();
        nuevocliente.setNombreCliente(nombreCliente);
        
        System.out.println("Ingrese Direccion del cliente");
        nuevocliente.direccionCliente=entrada.nextLine();
        nuevocliente.setDireccionCliente(direccionCliente);
        
        System.out.println("Ingrese Telefono del cliente");
        nuevocliente.telefonoCliente=entrada.nextLine();
        nuevocliente.setTelefonoCliente(telefonoCliente);
        
        System.out.println("Ingrese Tipo de cunta");
        tipocuenta.tipoCuenta=entrada.next();
        tipocuenta.setTipoCuenta(tipoCuenta);
        
        
        System.out.println("Ingrese Numero de  cunta");
        tipocuenta.numeroCuenta=entrada.nextInt();
        tipocuenta.setNumeroCuenta(numeroCuenta);
    }
    
    public void SaldosCuentasCliente(){
        
        System.out.println("Ingrese ID del cliente");
        nuevocliente.idCliente=entrada.nextInt();
        nuevocliente.getIdCliente();
    }
public void HistoricoTransaccionesCliente(){
    
}
public void crearClienteBanco(){
    
}
    
}
