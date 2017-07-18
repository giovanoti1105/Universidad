package EntidaesFinancieras;

import java.util.Scanner;

class CuentaBancaria {
    int numeroCuenta;
String tipoCuenta;
int fechaAperturaCuenta;

//<editor-fold defaultstate="collapsed" desc="funciones get y set">
    public int getFechaAperturaCuenta() {
        return fechaAperturaCuenta;
    }
    public void setFechaAperturaCuenta(int fechaAperturaCuenta) {
        this.fechaAperturaCuenta = fechaAperturaCuenta;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    //</editor-fold>

// constructor de la clase
public CuentaBancaria(int numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }
public CuentaBancaria() {
        numeroCuenta = 0;
        tipoCuenta = "";
    }

Cliente nuevocliente = new Cliente();

//metodos de la clase
public void DatosCuentas(){
    if (nuevocliente.idCliente != 0)
    {
        nuevocliente.getIdCliente();
        nuevocliente.getNombreCliente();
        nuevocliente.getDireccionCliente();
        nuevocliente.getTelefonoCliente();
        nuevocliente.getNumeroCuenta();
        nuevocliente.getNumeroCuenta();
    }
}
public  void CuentasCliente(){
    
    if (nuevocliente.idCliente != 0)
    {
        
    }
    
}
public void CrearCuenta(){
    CuentaBancaria nuevacuenta = new CuentaBancaria();
    Scanner entrada = new Scanner(System.in);
    String ctaCrte="cuenta corriente";
    String ctaAhorros="cuenta ahorros";
    
    if(ctaCrte.equals("cuenta corriente"))
    {
        System.out.println("Ingrese Numero de la cuenta corriente");
        numeroCuenta=entrada.nextInt();
        nuevacuenta.setNumeroCuenta(numeroCuenta);
    }
    if(ctaAhorros.equals("cuenta Ahorros"))
            {
                System.out.println("Ingrese Numero de la cuenta Ahorros");
                numeroCuenta=entrada.nextInt();
                nuevacuenta.setNumeroCuenta(numeroCuenta);
            }
    }
}