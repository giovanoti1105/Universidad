/**
 * 
 */
package com.centrocultural.modelo;

/**
 * @author cjovalle
 *
 */
public class Libro extends Material{
	
	//Atributos
	private int paginasLibro;
	/**
	 * 
	 */
	public Libro() {
		super();
	}
	
	
	/**
	 * @param idMaterial
	 * @param tituloMaterial
	 * @param autorMaterial
	 * @param estadoMaterial
	 */
	public Libro(int idMaterial, String tituloMaterial, String autorMaterial,int estadoMaterial, int paginasLibro) {
		super(idMaterial, tituloMaterial, autorMaterial, estadoMaterial);
		this.paginasLibro = paginasLibro;
	}


	/**
	 * @param paginasLibro
	 */
	public Libro(int paginasLibro) {
		this.paginasLibro = paginasLibro;
	}


	/**
	 * @return the paginasLibro
	 */
	public int getPaginasLibro() {
		return paginasLibro;
	}
	/**
	 * @param paginasLibro the paginasLibro to set
	 */
	public void setPaginasLibro(int paginasLibro) {
		this.paginasLibro = paginasLibro;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Libro [paginasLibro=" + paginasLibro + "]";
	}	
}
