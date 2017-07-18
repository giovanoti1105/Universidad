package primerSemestre;

import com.sun.tracing.dtrace.FunctionName;

public class ImporteComprasGetSet
{
	int unidadesProducto;
	int valorProducto;

	/**
	 * constructor con pasos de
	 * 
	 * @param unidadesProducto
	 *            @param valorProducto
	 * @author Giovannotti
	 */
	public ImporteComprasGetSet(int unidadesProducto, int valorProducto)
	{
		this.unidadesProducto = unidadesProducto;
		this.valorProducto = valorProducto;
	}

	/**
	 * @FunctionName getUnidadesProducto() retorna valor cantidad de unidades de
	 *               producto
	 */
	public int getUnidadesProducto()
	{
		return unidadesProducto;
	}

	/**
	 * @FunctionName setUnidadesProducto() modifica valor cantidad de unidades
	 *               de producto
	 */
	public void setUnidadesProducto(int unidadesProducto)
	{
		this.unidadesProducto = unidadesProducto;
	}

	/**
	 * @FunctionName getUnidadesProducto() retorna valor cantidad valor de
	 *               producto
	 */
	public int getValorProducto()
	{
		return valorProducto;
	}

	/**
	 * @FunctionName setUnidadesProducto() modifica valor de producto
	 */
	public void setValorProducto(int valorProducto)
	{
		this.valorProducto = valorProducto;
	}
}
