package NotacionPolaca;
public class Operaciones {
	public String operacion (char o, double n1, double n2)
	{
		double res=0;
		if (o=='+')
			res = n1+n2;
		if (o=='-')
			res = n1-n2;
		if (o=='*')
			res = n1*n2;
		if (o=='/')
		{
			if (n2==0)
				System.out.println ("PROBLEMAS! Divicion entre 0");
			else
				res = n1/n2;
		}
		String resultado = String.valueOf(res);
		return resultado;
	}
}
