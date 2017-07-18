package NotacionPolaca;
import java.util.Enumeration;
import java.util.Vector;
import javax.xml.soap.Node;
public class Pila {
    private Pila element;
    private  Node next;
Vector pila= new Vector(); 
public void push (String s, int i)
	{
		pila.insertElementAt(s,i);
	}
	public String pop (int c)
	{
		String s = String.valueOf(pila.get(c));
		return s;
	}
	public void imprimirPila()
	{
		Enumeration elementos = pila .elements();
		while (elementos.hasMoreElements())
			System.out.println ("Resultado: "+elementos.nextElement());
	}
}