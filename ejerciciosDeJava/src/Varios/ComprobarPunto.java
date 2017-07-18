package Varios;

import java.awt.Point;

public class ComprobarPunto
{
	public static void main(String[] args)
	{
		Point objuno = new Point(11,22);
		Punto3D objDos = new Punto3D(7, 6, 64);
		System.out.println("El punto 2d esta en " + objuno.x + ";" + objuno.y);
		System.out.println("siendo movido a  (11,22)");
		objuno.move(4, 13);
		System.out.println("El punto 2d esta en " + objuno.x + ";" + objuno.y);
		objuno.translate(-10, -10);
		System.out.println("El punto 2d esta en " + objuno.x + ";" + objuno.y);
		System.out.println("El punto 3d esta en " + objDos.x + ";" + objDos.y + ";" + objDos.z);
		System.out.println("siendo movido a  (10,22,71)");
		objDos.move(10, 22, 71);
		System.out.println("El punto 3d esta en " + objDos.x + ";" + objDos.y + ";" + objDos.z);
		System.out.println("siendo movido a 20 unidades");
		objDos.translate(-20,-20,-20);
		System.out.println("El punto 3d esta en " + objDos.x + ";" + objDos.y + ";" + objDos.z);
		
		
	}

}
