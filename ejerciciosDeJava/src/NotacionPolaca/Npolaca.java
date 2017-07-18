package NotacionPolaca;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.String.*;
public class Npolaca {
	public static void main (String s[]) throws IOException
	{
	    int c,c1,c2,ct,aux=0,restmp;
	    double n1,n2;
	    String res;
	    Pila p = new Pila();
	    Convertidor valor = new Convertidor();
	    Operaciones operacion = new Operaciones();
	    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("DIGITE LA EXPRECION  POLACA: ");
        System.out.flush();
        StringTokenizer exp = new StringTokenizer(entrada.readLine());
        ct=exp.countTokens();
        String expresion [] = new String [ct];
        for (c=0,c1=0;c<ct;c++,c1++)
        {
        	expresion[c1] = exp.nextToken();
        	if (expresion[c1].charAt(0)=='+' || expresion[c1].charAt(0)=='-' || expresion[c1].charAt(0)=='*' || expresion[c1].charAt(0)=='/')
        	{
        		int tp = p.pila.size();
        		String v[] = new String [tp];
        		for (c2=0;c2<tp;c2++)
        		{
        			v[c2]=p.pop(c2);
        		}
        		if (tp==3)
        		{
        			n1=valor.adoble(v[1]);
       				n2=valor.adoble(v[2]);
       				aux=1;
        		}
        		else
        		{
        			n1=valor.adoble(v[0]);
       				n2=valor.adoble(v[1]);
       				aux=0;
        		}
       			res=operacion.operacion(expresion[c1].charAt(0),n1,n2);
       			if (aux==0)
       			{
   	    			p.pila.removeAllElements();
   	    		}
       			c1=0;
       			p.push(res,aux);
         	}
        	else
        	{
        		p.push(expresion[c1],c1);
        	}
        }
        p.imprimirPila();
	}

	
	

}

