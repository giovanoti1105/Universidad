package primerSemestre;

public class RendimientoCapitalGetSet
{
	static double capital;
	static float interes;
	static int anios;
	static int totalAcumulado;
	static double interesCompuesto;
	static int capitalInicial;
	
	/**
	 * @return the capitalInicial
	 */
	public static double getcapitalInicial()
	{
		return capitalInicial;
	}
	
	/**
	 * @param totalAcumulado the totalAcumulado to set
	 */
	public void setCapitalInicial(int capitalInicial)
	{
		this.capitalInicial = capitalInicial;
	}
	
	/**
	 * @return the totalAcumulado
	 */
	public static int getTotalAcumulado()
	{
		return totalAcumulado;
	}
	/**
	 * @param totalAcumulado the totalAcumulado to set
	 */
	public void setTotalAcumulado(int totalAcumulado)
	{
		this.totalAcumulado = totalAcumulado;
	}
	/**
	 * @return the interesCompuesto
	 */
	public static double getInteresCompuesto()
	{
		return interesCompuesto;
	}
	/**
	 * @param d the interesCompuesto to set
	 */
	public void setInteresCompuesto(double interesCompuesto)
	{
		this.interesCompuesto = interesCompuesto;
	}
	/**
	 * @return the capital
	 */
	public static double getCapital()
	{
		return capital;
	}
	/**
	 * @param d the capital to set
	 */
	public void setCapital(double d)
	{
		this.capital = d;
	}
	/**
	 * @return the interes
	 */
	public static float getInteres()
	{
		return interes;
	}
	/**
	 * @param interes the interes to set
	 */
	public void setInteres(float interes)
	{
		this.interes = interes;
	}
	/**
	 * @return the anios
	 */
	public static int getAnios()
	{
		return anios;
	}
	/**
	 * @param anios the anios to set
	 */
	public void setAnios(int anios)
	{
		this.anios = anios;
	}

	// constructor
	public RendimientoCapitalGetSet()
	{
		// TODO Auto-generated constructor stub
	}
}
