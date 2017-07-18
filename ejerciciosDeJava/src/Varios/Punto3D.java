package Varios;

import java.awt.Point;

public class Punto3D extends Point
{
	public int z;
	/** constructor que inicializa las 3 variables
	 * @param x @param y @param z
	 * x,y son de la superclase Point  
	 */
	
	public Punto3D(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	public void move(int x, int y, int z)
	{
		this.z=z;
		super.move(x,y);
	}
	public void translate (int x, int y, int z)
	{
		this.z=+z;
		super.translate(x,y);
	}
	

}
