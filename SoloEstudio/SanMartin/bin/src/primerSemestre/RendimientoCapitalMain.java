package primerSemestre;

import javax.swing.JOptionPane;

public class RendimientoCapitalMain extends RendimientoCapital
{
	public RendimientoCapitalMain ()
	{
		super();
	}
	public static void main(String[] args)
	{
		RendimientoCapital objRendimientoCapital = new RendimientoCapital();
		int capital =0;
		int anios=0;
		float interes=0;
		int []aniosx;
		objRendimientoCapital.SolicitudDatos(capital,anios,interes);
		objRendimientoCapital.CalculoRendimientoCapital(capital, anios, interes);
	}
}
