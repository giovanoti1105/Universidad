import java.text.DecimalFormat;
import java.text.Format;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class ProcesosTelas
{
	String mensaje = "Vamos bien, vamos Bien";
	

	public ProcesosTelas()
	{
	}
	public void onClickBotonTelasPremium(String cantidad, JTextField txtDescuentoPremium, JTextField txtTotalVentaPremium, JTextField txtTotal)
	{
		double cantidadSolicitada=Double.parseDouble(cantidad);
		double descuento=0;
		DecimalFormat formateador = new DecimalFormat("'$' ###,###.##");
		
			if(cantidadSolicitada>=1 && cantidadSolicitada<=500)
			{
				txtDescuentoPremium.setText("0.0");
				cantidadSolicitada=cantidadSolicitada*10000;
				txtTotalVentaPremium.setText(String.valueOf(formateador.format(cantidadSolicitada)));
				txtTotal.setText((String.valueOf(formateador.format(cantidadSolicitada))));
			}
			else if (cantidadSolicitada>=501 && cantidadSolicitada<=1000)
			{
				cantidadSolicitada=cantidadSolicitada*6000;
				descuento=(cantidadSolicitada*40)/100;
				txtDescuentoPremium.setText(String.valueOf(formateador.format(descuento)));
				txtTotalVentaPremium.setText(String.valueOf(formateador.format(cantidadSolicitada)));
				txtTotal.setText(String.valueOf(formateador.format(cantidadSolicitada-descuento)));
			}
			else
			{
				cantidadSolicitada=cantidadSolicitada*2500;
				descuento=(cantidadSolicitada*40)/100;
				txtDescuentoPremium.setText(String.valueOf(formateador.format(descuento)));
				txtTotalVentaPremium.setText(String.valueOf(formateador.format(cantidadSolicitada)));
				txtTotal.setText(String.valueOf(formateador.format(cantidadSolicitada-descuento)));
			}
	}
	public void onClickBotonTelaspremier(String cantidad, JTextField txtDescuentoPremier, JTextField txtTotalVentaPremier, JTextField txtTotal)
	{
		double cantidadSolicitada=Double.parseDouble(cantidad);
		double descuento=0;
		DecimalFormat formateador = new DecimalFormat("'$' ###,###.##");
		
		if(cantidadSolicitada>=1 && cantidadSolicitada<=500)
		{
			txtDescuentoPremier.setText("0.0");
			cantidadSolicitada=cantidadSolicitada*8000;
			txtTotalVentaPremier.setText(String.valueOf(formateador.format(cantidadSolicitada)));
			txtTotal.setText((String.valueOf(formateador.format(cantidadSolicitada))));
		}
		else if (cantidadSolicitada>=501 && cantidadSolicitada<=1000)
		{
			txtDescuentoPremier.setText("0.0");
			cantidadSolicitada=cantidadSolicitada*4500;
			txtTotalVentaPremier.setText(String.valueOf(formateador.format(cantidadSolicitada)));
			txtTotal.setText(String.valueOf(formateador.format(cantidadSolicitada-descuento)));
		}
		else
		{
			cantidadSolicitada=cantidadSolicitada*1500;
			descuento=(cantidadSolicitada*60)/100;
			txtDescuentoPremier.setText(String.valueOf(formateador.format(descuento)));
			txtTotalVentaPremier.setText(String.valueOf(formateador.format(cantidadSolicitada)));
			txtTotal.setText(String.valueOf(formateador.format(cantidadSolicitada-descuento)));
		}
	}
	public void onClickBotonTelasRostingtong(String cantidad, JTextField txtDescuentoRostington, JTextField txtTotalVentaRostington, JTextField txtTotal)
	{
		double cantidadSolicitada=Double.parseDouble(cantidad);
		double descuento=0;
		DecimalFormat formateador = new DecimalFormat("'$' ###,###.##");
		
		if(cantidadSolicitada>=1 && cantidadSolicitada<=500)
		{
			txtDescuentoRostington.setText("0.0");
			cantidadSolicitada=cantidadSolicitada*8000;
			txtTotalVentaRostington.setText(String.valueOf(formateador.format(cantidadSolicitada)));
			txtTotal.setText((String.valueOf(formateador.format(cantidadSolicitada))));
		}
		else if (cantidadSolicitada>=501 && cantidadSolicitada<=1000)
		{
			txtDescuentoRostington.setText("0.0");
			cantidadSolicitada=cantidadSolicitada*4500;
			txtTotalVentaRostington.setText(String.valueOf(formateador.format(cantidadSolicitada)));
			txtTotal.setText(String.valueOf(formateador.format(cantidadSolicitada-descuento)));
		}
		else
		{
			cantidadSolicitada=cantidadSolicitada*1500;
			descuento=(cantidadSolicitada*65)/100;
			txtDescuentoRostington.setText(String.valueOf(formateador.format(descuento)));
			txtTotalVentaRostington.setText(String.valueOf(formateador.format(cantidadSolicitada)));
			txtTotal.setText(String.valueOf(formateador.format(cantidadSolicitada-descuento)));
		}
	}
}