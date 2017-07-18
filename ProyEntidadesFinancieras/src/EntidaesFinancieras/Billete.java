package EntidaesFinancieras;

import java.util.Date;
import java.util.Scanner;

public class Billete {
    // variables de la clase
    
    private int numeroSerieBillete;
    private int valorDenominacionBillete;
    private Date fechaCreacionBillete;
    int cantidadbillete;
    
    // constructor de la clase
    public Billete(int numeroSerieBillete, int valorDenominacionBillete, Date fechaCreacionBillete, int cantidadbillete) {
        this.numeroSerieBillete = numeroSerieBillete;
        this.valorDenominacionBillete = valorDenominacionBillete;
        this.fechaCreacionBillete = fechaCreacionBillete;
        this.cantidadbillete=cantidadbillete;
    }
    // constructor de billetes 
    public Billete(){
            numeroSerieBillete=0;
            valorDenominacionBillete=0;
            fechaCreacionBillete=null;
            cantidadbillete=0;
        }
    
    //<editor-fold defaultstate="collapsed" desc="funciones get y set">
     public int getNumeroSerieBillete() {
        return numeroSerieBillete;
    }
    public void setNumeroSerieBillete(int numeroSerieBillete) {
        this.numeroSerieBillete = numeroSerieBillete;
    }
    public int getValorDenominacionBillete() {
        return valorDenominacionBillete;
    }
    public void setValorDenominacionBillete(int valorDenominacionBillete) {
        this.valorDenominacionBillete = valorDenominacionBillete;
    }
     public Date getFechaCreacionBillete() {
        return fechaCreacionBillete;
    }
    public void setFechaCreacionBillete(Date fechaCreacionBillete) {
        this.fechaCreacionBillete = fechaCreacionBillete;
    }
    //</editor-fold>
    
    //objeto de billete para uso de las variables y metodos
    Billete billete = new Billete();
    public int crearBillete(int numeroSerieBillete, int valorDenominacionBillete){
        // creacion del objeto que permite indexar a la siguiente linea
        Scanner entrada = new Scanner(System.in);
        // menu para solicitar los datos del billete a crear
        if (numeroSerieBillete==10000 || numeroSerieBillete==20000 || numeroSerieBillete==50000)
        {
        System.out.println("serie del billete");
        numeroSerieBillete=entrada.nextInt();
        billete.setNumeroSerieBillete(numeroSerieBillete);
        
        System.out.println("denominacion del billete");
        valorDenominacionBillete=entrada.nextInt();
        billete.setValorDenominacionBillete(valorDenominacionBillete);
        
        System.out.println("fecha de creacion del billete");
        //fechaCreacionBillete=entrada.next();
        billete.setFechaCreacionBillete(fechaCreacionBillete);
                }else{
            System.out.println("Error los valores de billes a crear son de 10.000 , 20.000 y 50.000");
        }
        return numeroSerieBillete;
    }
    // metodos de la clase
    public int BilleteDeDiezMil()
    {
        if(billete.numeroSerieBillete==10000)
        {
            billete.getNumeroSerieBillete();
            billete.getValorDenominacionBillete();
            billete.getNumeroSerieBillete();
            cantidadbillete+=numeroSerieBillete;
        }
        return numeroSerieBillete;
    }
    
    public void BilleteDeVeinteMil()
    {
        if(billete.numeroSerieBillete==20000)
        {
            billete.getNumeroSerieBillete();
            billete.getValorDenominacionBillete();
            billete.getNumeroSerieBillete();
            cantidadbillete+=numeroSerieBillete;
        }
    }
    public void BilleteDeCincuentaMil()
    {
        if(billete.numeroSerieBillete==50000)
        {
            billete.getNumeroSerieBillete();
            billete.getValorDenominacionBillete();
            billete.getNumeroSerieBillete();
            cantidadbillete+=numeroSerieBillete;
        }
    }
}