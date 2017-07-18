package EntidaesFinancieras;
public class  cola {
    private Nodo primero;
    private Nodo ultimo;
    // constructor
    public cola(){
        this.primero=null;
        this.ultimo=null;
    }
    //metodo que evalua si esta vacia
    public boolean estaVacia(){
        boolean r=false;
        if(primero==null){
            r=true;
        }
        return r;
    }
    //metodo que anexa nodo al final de la cola
    public void insertarNodoCola(int x){
        Nodo p;
        p = new Nodo();
        if(estaVacia()){
            primero=p;
            ultimo=primero;
        }else{
            ultimo.setEnlace(p);
            ultimo=p;
        }
    }
    public int eliminarNodoCola(){
        int aux=0;
        if(!estaVacia()){
            Nodo q=primero;
            aux=primero.getDato();
            primero=primero.getEnlace();
        }
        return aux;
    }
    public String imprimirCola(){
        Nodo p = primero;
        String lst="";
        if(!estaVacia()){
            while(p!=null){
                lst+=""+p.getEnlace();
                p=p.getEnlace();
            }
        }else{
            lst="La cola esta vacia";
        }
        return lst;
    }
    
}