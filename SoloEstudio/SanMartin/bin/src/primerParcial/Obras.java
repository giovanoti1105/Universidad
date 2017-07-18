package primerParcial;
//importacion de libreras y clases propias
public class Obras {
    // definicion de atributos
    
    int stockCopiasParaVenta=30;
    int stockOriginalesParaVenta=30;
    int stockCopiasParaAlquiler=30;
    int stockOriginalesParaAlquiler=30;
    int totalCopiasVendidas;
    int totalOriginalesVendidas;
    int totalCopiasAlquiladas;
    int totalOriginalesAlquilados;
    int totalCopiasDevueltas;
    int totalOriginalesDevueltos;
        
    // metodo para solicitar copias
    void ContarObras(){
        if (stockCopiasParaVenta>0){
            VentaObras();
            }else{
            System.out.println("no hay Copias para la venta Cantidad :" +  stockCopiasParaVenta );
            }
        if (stockOriginalesParaVenta>0){
            VentaObras();
            }else{
            System.out.println("no hay Originales para la venta Cantidad :" +  stockOriginalesParaVenta );
            }
        if (stockCopiasParaAlquiler>0){
            AlquilerObras();
            DevolucionObra();
            }else{
            System.out.println("no hay Copias para Alquiler Cantidad :" +  stockCopiasParaAlquiler );
            }
        if (stockOriginalesParaAlquiler>0){
            AlquilerObras();
            DevolucionObra();
            }else{
            System.out.println("no hay Originales para Alquiler Cantidad :" +  stockOriginalesParaAlquiler );
            }
    }
    
    // metodo para alquler de obras controla el stock de almacenamiento
        void AlquilerObras(){
            stockCopiasParaAlquiler-=totalCopiasAlquiladas;
            stockOriginalesParaAlquiler-=totalOriginalesAlquilados;
            
        }
        // metodo para venta de obras controla el stock de almacenamiento
        void VentaObras(){
            stockCopiasParaVenta-=totalCopiasVendidas;
            stockOriginalesParaVenta-=totalOriginalesVendidas;
            
        }
        // metodo para controlar el stock cuando devuelve una obra
        void DevolucionObra(){
            stockCopiasParaAlquiler+=totalCopiasDevueltas;
            stockOriginalesParaAlquiler+=totalOriginalesDevueltos;
        }
}