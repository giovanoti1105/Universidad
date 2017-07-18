/**
 * 
 */
package com.centrocultural.modelo;

import java.util.Vector;

/**
 * @author cjovalle
 *
 */
public class Prestamo {

	//atributos
	
	//utilizamos atributos enteros para el manejo de fechas
	//posteriormente usaremos un atributo mas adecuado
	private int prestFinicdia;
	private int prestFinicMes;
	private int prestFinicAnnio;
	
	private int prestFindia;
	private int prestFinMes;
	private int prestFinAnnio;
	
	//el prestamo tiene un grupo de productos o materiales (discos, libros a ambos)
	//como pueden ser varios lo mas adecuado es usar un Vector
	private Vector <Material> prestMateriales;
	
	public Prestamo() {
		
	}

	/**
	 * @param prestFinicdia
	 * @param prestFinicMes
	 * @param prestFinicAnnio
	 * @param prestFindia
	 * @param prestFinMes
	 * @param prestFinAnnio
	 * @param prestMateriales
	 */
	public Prestamo(int prestFinicdia, int prestFinicMes, int prestFinicAnnio,
			int prestFindia, int prestFinMes, int prestFinAnnio,
			Vector<Material> prestMateriales) {
		this.prestFinicdia = prestFinicdia;
		this.prestFinicMes = prestFinicMes;
		this.prestFinicAnnio = prestFinicAnnio;
		this.prestFindia = prestFindia;
		this.prestFinMes = prestFinMes;
		this.prestFinAnnio = prestFinAnnio;
		this.prestMateriales = prestMateriales;
	}

	/**
	 * @return the prestFinicdia
	 */
	public int getPrestFinicdia() {
		return prestFinicdia;
	}

	/**
	 * @param prestFinicdia the prestFinicdia to set
	 */
	public void setPrestFinicdia(int prestFinicdia) {
		this.prestFinicdia = prestFinicdia;
	}

	/**
	 * @return the prestFinicMes
	 */
	public int getPrestFinicMes() {
		return prestFinicMes;
	}

	/**
	 * @param prestFinicMes the prestFinicMes to set
	 */
	public void setPrestFinicMes(int prestFinicMes) {
		this.prestFinicMes = prestFinicMes;
	}

	/**
	 * @return the prestFinicAnnio
	 */
	public int getPrestFinicAnnio() {
		return prestFinicAnnio;
	}

	/**
	 * @param prestFinicAnnio the prestFinicAnnio to set
	 */
	public void setPrestFinicAnnio(int prestFinicAnnio) {
		this.prestFinicAnnio = prestFinicAnnio;
	}

	/**
	 * @return the prestFindia
	 */
	public int getPrestFindia() {
		return prestFindia;
	}

	/**
	 * @param prestFindia the prestFindia to set
	 */
	public void setPrestFindia(int prestFindia) {
		this.prestFindia = prestFindia;
	}

	/**
	 * @return the prestFinMes
	 */
	public int getPrestFinMes() {
		return prestFinMes;
	}

	/**
	 * @param prestFinMes the prestFinMes to set
	 */
	public void setPrestFinMes(int prestFinMes) {
		this.prestFinMes = prestFinMes;
	}

	/**
	 * @return the prestFinAnnio
	 */
	public int getPrestFinAnnio() {
		return prestFinAnnio;
	}

	/**
	 * @param prestFinAnnio the prestFinAnnio to set
	 */
	public void setPrestFinAnnio(int prestFinAnnio) {
		this.prestFinAnnio = prestFinAnnio;
	}

	/**
	 * @return the prestMateriales
	 */
	public Vector<Material> getPrestMateriales() {
		return prestMateriales;
	}

	/**
	 * @param prestMateriales the prestMateriales to set
	 */
	public void setPrestMateriales(Vector<Material> prestMateriales) {
		this.prestMateriales = prestMateriales;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prestamo [prestFinicdia=" + prestFinicdia + ", prestFinicMes="
				+ prestFinicMes + ", prestFinicAnnio=" + prestFinicAnnio
				+ ", prestFindia=" + prestFindia + ", prestFinMes="
				+ prestFinMes + ", prestFinAnnio=" + prestFinAnnio
				+ ", prestMateriales=" + prestMateriales + "]";
	}

}
