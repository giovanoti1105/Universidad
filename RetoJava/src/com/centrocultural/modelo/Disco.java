/**
 * 
 */
package com.centrocultural.modelo;

/**
 * @author cjovalle
 *
 */
public class Disco extends Material{

	/**
	 * 
	 */
	private String discCasaDisquera;
	
	public Disco() {
		super();	
	}	
	
	/**
	 * @param discCasaDisquera
	 */
	public Disco(String discCasaDisquera) {
		super();
		this.discCasaDisquera = discCasaDisquera;
	}
	
	public Disco(int idMaterial, String tituloMaterial, String autorMaterial,int estadoMaterial,String discCasaDisquera) {
		super(idMaterial, tituloMaterial, autorMaterial, estadoMaterial);
		this.discCasaDisquera = discCasaDisquera;
	}


	/**
	 * @return the discCasaDisquera
	 */
	public String getDiscCasaDisquera() {
		return discCasaDisquera;
	}

	/**
	 * @param discCasaDisquera the discCasaDisquera to set
	 */
	public void setDiscCasaDisquera(String discCasaDisquera) {
		this.discCasaDisquera = discCasaDisquera;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Disco [discCasaDisquera=" + discCasaDisquera + "]";
	}

	/**
	 * @param idMaterial
	 * @param tituloMaterial
	 * @param autorMaterial
	 * @param estadoMaterial
	 */
		
}
