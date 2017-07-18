package primerSemestre;

import javax.swing.JOptionPane;

public class ImporteCompras extends ImporteComprasGetSet
{
	static int unidadesProducto;
	static int valorProducto;
	

	public ImporteCompras()
	{
		super(unidadesProducto, valorProducto);
	}

	public void CalculoImporteCompra(int unidadesProducto, int valorProducto)
	{
		ImporteComprasGetSet objImporteComprasGetSet = new ImporteComprasGetSet(unidadesProducto, valorProducto);
		int valorTotal;
		int descuento;
		unidadesProducto = getUnidadesProducto();
		valorProducto = getValorProducto();

		if (unidadesProducto > 100)
		{
			valorTotal = (int) (valorProducto * unidadesProducto);
			descuento = (int) (valorTotal * 0.35);
			valorTotal = valorTotal - descuento;
			JOptionPane.showMessageDialog(null, "cantidad de unidades : " + unidadesProducto + 
					"\n Valor Total a Pagar con descuento del 35%  " + valorTotal);
		}
		else if (unidadesProducto > 25 && unidadesProducto <= 100)
		{
			valorTotal = (int) (valorProducto * unidadesProducto);
			descuento = (int) (valorTotal * 0.18);
			valorTotal = valorTotal - descuento;
			JOptionPane.showMessageDialog(null, "cantidad de unidades : " + unidadesProducto + 
					"\n Valor Total a Pagar con descuento del 18%  " + valorTotal);
		}
		else if (unidadesProducto > 15 && unidadesProducto <= 24)
		{
			
			valorTotal = (int) (valorProducto * unidadesProducto);
			descuento = (int) (valorTotal * 0.08);
			valorTotal = valorTotal - descuento;
			JOptionPane.showMessageDialog(null, "cantidad de unidades : " + unidadesProducto + 
					"\n Valor Total a Pagar con descuento del 8%  " + valorTotal);
		}
		else
		{
			valorTotal = (int) (valorProducto * unidadesProducto);
			JOptionPane.showMessageDialog(null, "cantidad de unidades : " + unidadesProducto + 
					"\n Valor Total a Pagar " + valorTotal);
			
		}
		
	}

	public static void main(String[] args)
	{
		int cantidadArticulos;
		int valorProducto;
		ImporteCompras objImporteCompras = new ImporteCompras();
		String articulos = JOptionPane.showInputDialog("Ingrese Cantidad de Articulos");
		cantidadArticulos = Integer.parseInt(articulos);
		String strvalorProducto = JOptionPane.showInputDialog("Ingrese Valor Producto");
		valorProducto = Integer.parseInt(strvalorProducto); 
		objImporteCompras.CalculoImporteCompra(cantidadArticulos, valorProducto);	
	}
}