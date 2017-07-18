package primerParcial;
public class Transaccion extends Obras{

    double precioAlquilerCopia;
    double precioAlquilerOriginal;
    double precioVentaOriginal;
    double precioVentaCopia;
    double TotalAlquilerOriginal;
    double TotalAlquilerCopia;
    double TotalCompraOriginal;
    double TotalCompraCopia;
  
    
    // construtor que inicializa los atributos
    Transaccion(double pac, double pao,double pvo,double pvc,double tao,double tac,double tco,double tcc ){
        pac= precioAlquilerCopia=120.000;
        pao=precioAlquilerOriginal=150.000;
        pvo=precioVentaOriginal=450.000;
        pvc=precioVentaCopia=350.000;
        tao=TotalAlquilerOriginal=0; 
        tac=TotalAlquilerCopia=0;
        tco=TotalCompraOriginal=0;
        tcc=TotalCompraCopia=0;
        
    }
    
    //metodo que TransaccionAlquilarrealiza las operaciones para alquilar obras originales y copias
    void TransaccionAlquilar(){
        
        String OpcionTransaccion = "AlquilerOriginal";
        System.out.println("¿Desea alquilar Original o una copia?");
        
        while (OpcionTransaccion.equals("AlquilerOriginal")){
            // calcula el costo del alquiler por las copias
            TotalAlquilerOriginal=this.totalOriginalesAlquilados*this.precioAlquilerCopia;
            //llama al metodo para descargar del stock
            this.AlquilerObras();
            }
        // calcula el costo del alquiler por las copias
        TotalAlquilerCopia=this.totalCopiasAlquiladas*this.precioAlquilerCopia;
        //llama al metodo para descargar del stock
        this.AlquilerObras();
        }
    
    //metodo que realiza las operaciones para vender obras originales y copias
    void TransaccionVender (){
        
        String OpcionTransaccion = "VenderOriginal";
        
       
        // si la oocion es vender originales realiza las opciones de vender
        while (OpcionTransaccion.equals("VenderOriginal")){
            
            TotalCompraOriginal=this.totalOriginalesVendidas*this.precioVentaOriginal;
            this.AlquilerObras();
            }
        //si la opcion es vender las copias ejecuta lo siguiente.
        TotalCompraCopia=this.totalCopiasVendidas*this.precioVentaCopia;
        // llama al metodo alquiler obras para actualizar el stock de inventarios
        this.AlquilerObras();
        
    }
}