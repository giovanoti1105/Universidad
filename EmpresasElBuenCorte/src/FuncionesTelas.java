
public class FuncionesTelas
{

	public FuncionesTelas()
	{
	}
	public void valorAPagar(double cantidad,double descuento,int valorTela,int porcentajeDescuento)
	{
		cantidad=cantidad*valorTela;
		descuento=(cantidad*porcentajeDescuento)/100;
	}

}
