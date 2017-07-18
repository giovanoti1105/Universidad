/**
 * 
 */
package com.centrocultural.modelo;

/**
 * @author cjovalle
 *
 */
public class Material {

	//atributos de la clase	
	private int idMaterial;
	private String tituloMaterial;
	private String autorMaterial;
	private int estadoMaterial;
	
	/**
	 * Constructor de la clase
	 */
	public Material() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idMaterial
	 * @param tituloMaterial
	 * @param autorMaterial
	 * @param estadoMaterial
	 */
	public Material(int idMaterial, String tituloMaterial,
			String autorMaterial, int estadoMaterial) {
		this.idMaterial = idMaterial;
		this.tituloMaterial = tituloMaterial;
		this.autorMaterial = autorMaterial;
		this.estadoMaterial = estadoMaterial;
	}

	/**
	 * @return the idMaterial
	 */
	public int getIdMaterial() {
		return idMaterial;
	}

	/**
	 * @param idMaterial the idMaterial to set
	 */
	public void setIdMaterial(int idMaterial) {
		this.idMaterial = idMaterial;
	}

	/**
	 * @return the tituloMaterial
	 */
	public String gettituloMaterial() {
		return tituloMaterial;
	}

	/**
	 * @param tituloMaterial the tituloMaterial to set
	 */
	public void settituloMaterial(String tituloMaterial) {
		this.tituloMaterial = tituloMaterial;
	}

	/**
	 * @return the autorMaterial
	 */
	public String getAutorMaterial() {
		return autorMaterial;
	}

	/**
	 * @param autorMaterial the autorMaterial to set
	 */
	public void setAutorMaterial(String autorMaterial) {
		this.autorMaterial = autorMaterial;
	}

	/**
	 * @return the estadoMaterial
	 */
	public int getEstadoMaterial() {
		return estadoMaterial;
	}

	/**
	 * @param estadoMaterial the estadoMaterial to set
	 */
	public void setEstadoMaterial(int estadoMaterial) {
		this.estadoMaterial = estadoMaterial;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Material [idMaterial=" + idMaterial + ", tituloMaterial="
				+ tituloMaterial + ", autorMaterial=" + autorMaterial
				+ ", estadoMaterial=" + estadoMaterial + "]";
	}
}
