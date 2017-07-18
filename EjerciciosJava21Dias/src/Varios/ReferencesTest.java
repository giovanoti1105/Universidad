package Varios;

import java.awt.Point;

public class ReferencesTest {
public static void main(String[] args) {
	jaberwook objnombre = new jaberwook (); 
	Point pt1, pt2;
	pt1 = new Point (100,100);
	pt2=pt1;
	pt1.x=200;
	pt1.y=200;
	System.out.println("el valor de  x en pt1 es " + pt1.x + " el valor de  y en pt1 es " + pt1.y);
	System.out.println("el valor de  x en pt2 es " + pt1.x + " el valor de  y en pt2 es " + pt1.y);
	String name = objnombre.getClass().getName();
	System.out.println(name);
	
	
}
}
