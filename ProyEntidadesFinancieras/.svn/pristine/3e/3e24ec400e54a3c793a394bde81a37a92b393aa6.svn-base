package EntidaesFinancieras;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class CajeroAutomatico extends Transaccion{
    int codigoCajero;
    String ubicacionCaj[]={"bogota","Cali","Medellin"};
    boolean estadoCajero;
    int solicitudbillete;
    double cantidad;
    
    public CajeroAutomatico(int codigoCajero, String ubicacionCajero, boolean estadoCajero, int fechaTransaccion, int horaTransaccion, int saldoCuenta) {
        super(fechaTransaccion, horaTransaccion, saldoCuenta);
        this.codigoCajero = codigoCajero;
        //this.ubicacionCajero = ubicacionCajero;
        this.estadoCajero = estadoCajero;
    }
    //  constructor para el objeto de cajero automatico
    public CajeroAutomatico() {
        
        this.codigoCajero = codigoCajero;
        //this.ubicacionCajero = ubicacionCajero;
        this.estadoCajero = estadoCajero;
    }
   Banco asignacionbanco = new Banco();
    Billete pedirbillete = new Billete();
    CajeroAutomatico ubicacion = new CajeroAutomatico();
    Transaccion transaccion = new Transaccion();
public void UbicacionCajero(){
     for(int i=0;i<ubicacionCaj.length;i++)
    {
        if(estadoCajero!=false)
        {
            switch (ubicacionCaj[i]){
                case "bogota":
                    codigoCajero=001;
                    System.out.println("Ubicacion Bogota");
                case "Cali":
                    codigoCajero=002;
                    System.out.println("Ubicacion Cali");
                case "Medellin":
                    codigoCajero=003;
                    System.out.println("Ubicacion Medellin");
            }
        }else
            System.out.println("Lo sentimos todos los cajeros ocupados");
    }
 }
public void AlquilerCajero(){
    while(ubicacion.estadoCajero!=true)
    {
        System.out.println("Ubicacion Cajero"+ubicacion.ubicacionCaj);
        System.out.println("Codigo Cajero"+ubicacion.codigoCajero);
        System.out.println("Asignacion a banco"+asignacionbanco.getCodigoBanco());
    }
}
public void AsignarCajero(){
    asignacionbanco.CrearBanco(codigoCajero);
    UbicacionCajero();
    
    
}
public void PedirBiiletes(){
    
    while (pedirbillete.cantidadbillete!=0 && solicitudbillete<pedirbillete.cantidadbillete )
    {
        compartimientodiez();
        
        
    }
}
public void compartimientodiez(){
    pedirbillete.BilleteDeDiezMil();
    pedirbillete.cantidadbillete++;
}
public void Compartimientoveinte(){
    pedirbillete.BilleteDeVeinteMil();
    pedirbillete.cantidadbillete++;
}
public void Compartimientocincuenta(){
    pedirbillete.BilleteDeCincuentaMil();
    pedirbillete.cantidadbillete++;
}
public void FilaingresoClientes(){
}
public void TipoTransaccionRealizar(){
   
        
    }

public void DevolverCajero(){
}
public void billetesDisponibles(){
}
}
