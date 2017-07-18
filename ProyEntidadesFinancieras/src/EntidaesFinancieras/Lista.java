package EntidaesFinancieras;
public class Lista {
    private Nodo primero;
    private Nodo ultimo;
// constructor de la clase
    public Lista() {
        this.primero = null;
        this.ultimo = null;
    }
    //se anexa nodo al inicio de la lista
    public void anexarInicioLista(int dato){
        Nodo nuevo;
        nuevo= new Nodo();
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            nuevo.setEnlace(primero);
            primero=nuevo;
        }
    }
    //se anexa nodo al inicio de la lista
    public void anexarFinalLista(int dato){
        Nodo nuevo;
        nuevo=new Nodo();
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.setEnlace(nuevo);
            ultimo=nuevo;
            ultimo.setEnlace(null);
        }
    }
    // se evalua si lista esta vacia
    public boolean esVacia(){
        return (primero==null);
    }
    public boolean buscarNodo(int dato){
        boolean encontro=false;
        Nodo p=primero;
        while(p.getEnlace()!=null && encontro== false)
        {
            if(p.getDato()==dato)
                encontro=true;
            p=p.getEnlace();
        }
        return encontro;
    }
    // metodo que almacena en un string
    public String imprimirLista(){
        String str="";
        if(!esVacia()){
            Nodo p=primero;
            while(p.getEnlace()!=null){
                str+=p.getDato()+"";
                p=p.getEnlace();
            }
            }else{
            str="Lista Vacia";
        }
        return str;
        }
    //validacion de la lista

}