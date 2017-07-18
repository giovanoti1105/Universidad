package EntidaesFinancieras;
public class Pila {
    private Nodo cab;
    // constructor
    public Pila(){
        this.cab=null;
    }
    //evalua si la pila esa vacia
    private boolean estaVacia(){
        return(cab==null);
    }
    //naexa nodo al tope o cima
    public void insertarNodo(int n){
        if(estaVacia()){
            this.cab=new Nodo();
            cab.setDato(n);
            cab.setEnlace(null);
        }else{
            Nodo nuevo=new Nodo();
            nuevo.setEnlace(cab);
            cab=nuevo;
        }
    }
    //metodo que borra nodo
    public boolean borrarNodo(){
    if(estaVacia()){
        return false;
    }else{
        Nodo nuevo;
        nuevo=cab;
        cab=cab.getEnlace();
        nuevo.setEnlace(null);
        return true;
    }
}
    // metodo de impresion 
    public String imprimirPila(){
        Nodo p;
        p=cab;
        String datosPila="";
        if(!estaVacia()){
            while(p!=null){
                datosPila +=""+p.getDato();
                p=p.getEnlace();
            }
            System.out.println("");
        }else{
            datosPila="Esta Vacia";
        }
        return datosPila;
    }
}
