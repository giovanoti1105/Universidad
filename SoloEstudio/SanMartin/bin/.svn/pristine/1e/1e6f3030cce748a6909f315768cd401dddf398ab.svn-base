package primerSemestre;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class RendimientoCapital extends RendimientoCapitalGetSet
{
	DecimalFormat formateador = new DecimalFormat("##,###,###");

	public RendimientoCapital()
	{
		super();
	}

	public void SolicitudDatos(int capital, int anios, float interes)
	{
		String capitalstr = JOptionPane.showInputDialog("Ingrese el capital");
		setCapital(capital = Integer.parseInt(capitalstr));
		// System.out.println(getCapital());

		String aniosstr = JOptionPane.showInputDialog("Ingrese años");
		setAnios(anios = Integer.parseInt(aniosstr));
		// System.out.println(getAnios());

		String interestr = JOptionPane.showInputDialog("Ingrese Interes");
		setInteres(interes = Float.parseFloat(interestr));
		// System.out.println(getInteres());
	}

	public void CalculoRendimientoCapital(int capital, int anios, double interes)
	{
		System.out.println(" Año " + " Capital Inicial " + " interes " + "    Total Acumulado");
		for (int x = 1; x <= getAnios(); x++)
		{
			// calcula el interes que se genero en el año se almacena en interes
			setInteresCompuesto(interes = ((int) (getCapital() * getInteres()) / 100));
			//System.out.println("Interes " + getInteresCompuesto());

			// almacena el valor del capital pagado al final
			setTotalAcumulado((int) (getCapital() + getInteresCompuesto()));
			//System.out.println("Acumulado" + getTotalAcumulado());

			// calculo del capital inicial
			setCapital(getCapital() + getInteresCompuesto());
			
			System.out.println("  " + x + " :     " + formateador.format(getCapital())+ 
					"     : " + formateador.format(getInteresCompuesto()) + "   :     " + formateador.format(getTotalAcumulado()));
		}
	}

	public void CalculoCapital()
	{
		System.out.println(getCapital());
	}
}
