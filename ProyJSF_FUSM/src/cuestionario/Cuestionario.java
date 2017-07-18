package cuestionario;

public class Cuestionario
{
	private String nombre;
	private String correo;
	private String[] aficiones;
	private boolean quieroOpinar;
	private String fumador;
	private String sistema;
	private String[] comidas;
	private String estado;
	private String[] lenguajes;

	// ATRIBUTO: nombre
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nuevoValor)
	{
		nombre = nuevoValor;
	}

	// ATRIBUTO: correo
	public String getCorreo()
	{
		return correo;
	}

	public void setCorreo(String nuevoValor)
	{
		correo = nuevoValor;
	}

	// ATRIBUTO: aficiones
	public String[] getAficiones()
	{
		return aficiones;
	}

	public void setAficiones(String[] nuevoValor)
	{
		aficiones = nuevoValor;
	}

	// ATRIBUTO: quieroOpinar
	public boolean getQuieroOpinar()
	{
		return quieroOpinar;
	}

	public void setQuieroOpinar(boolean nuevoValor)
	{
		quieroOpinar = nuevoValor;
	}

	// ATRIBUTO: listaAficiones
	public String getListaAficiones()
	{
		return concatenate(aficiones);
	}

	// ATRIBUTO: fumador
	public String getFumador()
	{
		return fumador;
	}

	public void setFumador(String nuevoValor)
	{
		fumador = nuevoValor;
	}

	// ATRIBUTO: sistema
	public String getSistema()
	{
		return sistema;
	}

	public void setSistema(String nuevoValor)
	{
		sistema = nuevoValor;
	}

	// ATRIBUTO: comidas
	public String[] getComidas()
	{
		return comidas;
	}

	public void setComidas(String[] nuevoValor)
	{
		comidas = nuevoValor;
	}

	// ATRIBUTO: listaComidas
	public String getListaComidas()
	{
		return concatenate(comidas);
	}

	// ATRIBUTO: estado
	public String getEstado()
	{
		return estado;
	}

	public void setEstado(String nuevoValor)
	{
		estado = nuevoValor;
	}

	// ATRIBUTO: lenguajes
	public String[] getLenguajes()
	{
		return lenguajes;
	}

	public void setLenguajes(String[] nuevoValor)
	{
		lenguajes = nuevoValor;
	}

	// ATRIBUTO: listaLenguajes
	public String getListaLenguajes()
	{
		return concatenate(lenguajes);
	}

	// ATRIBUTO: opinar
	public String opinar()
	{
		if (quieroOpinar)
		{
			return "test";
		} else
		{
			return "mostrarInformacion";
		}
	}

	// metodo para concetenar los elementos de las etiquetas de seleccion
	private static String concatenate(Object[] valores)
	{
		if (valores == null)
			return "";
		StringBuffer r = new StringBuffer();
		for (int i = 0; i < valores.length; ++i)
		{
			if (i > 0)
				r.append(',');
			r.append(valores[i].toString());
		}
		return r.toString();
	}

}
