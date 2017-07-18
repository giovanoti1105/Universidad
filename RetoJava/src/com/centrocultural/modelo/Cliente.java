/**
 * 
 */
package com.centrocultural.modelo;

import java.util.Vector;

/**
 * @author cjovalle
 *
 */
public class Cliente {
	
	//atributos
	private int cliId;
	private String cliNombresApellidos;
	private Vector <Prestamo> cliPrestamos;
	/**
	 * 
	 */
	public Cliente() {
		cliPrestamos =  new Vector();
	}
	/**
	 * @param cliId
	 * @param cliNombresApellidos
	 */
	public Cliente(int cliId, String cliNombresApellidos) {
		this.cliId = cliId;
		this.cliNombresApellidos = cliNombresApellidos;
		//crea el vector de sus prestamos vacio - inicialmente
		cliPrestamos =  new Vector();
	}	
	
	/**
	 * @return the cliId
	 */
	public int getCliId() {
		return cliId;
	}
	/**
	 * @param cliId the cliId to set
	 */
	public void setCliId(int cliId) {
		this.cliId = cliId;
	}
	/**
	 * @return the cliNombresApellidos
	 */
	public String getCliNombresApellidos() {
		return cliNombresApellidos;
	}
	/**
	 * @param cliNombresApellidos the cliNombresApellidos to set
	 */
	public void setCliNombresApellidos(String cliNombresApellidos) {
		this.cliNombresApellidos = cliNombresApellidos;
	}
	/**
	 * @return the cliPrestamos
	 */
	public Vector<Prestamo> getCliPrestamos() {
		return cliPrestamos;
	}
	/**
	 * @param cliPrestamos the cliPrestamos to set
	 */
	public void setCliPrestamos(Vector<Prestamo> cliPrestamos) {
		this.cliPrestamos = cliPrestamos;
	}	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [cliId=" + cliId + ", cliNombresApellidos="
				+ cliNombresApellidos + "]";
	}
	/**
	 * @param cliId
	 * @param cliNombresApellidos
	 * @param cliPrestamos
	 */
	public Cliente(int cliId, String cliNombresApellidos,
			Vector<Prestamo> cliPrestamos) {
		this.cliId = cliId;
		this.cliNombresApellidos = cliNombresApellidos;
		this.cliPrestamos = cliPrestamos;
	}	
}
