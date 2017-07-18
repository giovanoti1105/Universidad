package MariaJuanParImpar;

public class ParImparMain
{
    static int[] ResultadoJuan;
    static int[] ResultadoMaria;
    

    public static void main(String[] args)
    {
	int numero = 0;
	Juan objJuan = new Juan();
	Maria objMaria = new Maria();
	Resultados objResultados = new Resultados();
	System.out.print(" Juan [");
	ResultadoJuan = objJuan.aleatorioJuan(numero, "Juan");
	System.out.println("]");
	System.out.print("Maria [");
	ResultadoMaria = objMaria.aleatorioMaria(numero, "Maria");
	System.out.println("]");
	System.out.println(" ******la suma dio******************");
	System.out.print(" Total [");
	objResultados.sumas();
	System.out.println("]");
	objResultados.resultados();
    }
}
