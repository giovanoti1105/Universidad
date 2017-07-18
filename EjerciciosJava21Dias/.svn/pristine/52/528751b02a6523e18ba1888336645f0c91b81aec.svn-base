package Applets;

import java.awt.Graphics;
import java.awt.Polygon;

public class Map extends java.applet.Applet
{
    public void Paint (Graphics screen)
    {
	screen.drawString("Florida", 185, 75);
	screen.drawLine(180, 80, 222, 80);
	screen.drawRect(2, 2, 345, 345);
	screen.drawRoundRect(182,61,43,24,10,8);
	int x[] = {10,234,253,261,344,336,295,259,205,211,195,191,120,94,81,12,10};
	int y[] = {12,15,25,71,209,278,310,274,188,171,174,118,56,68,49,37,12};
	int pts = x.length;
	Polygon poly = new Polygon (x,y,pts); 
	screen.drawPolygon(poly);
    }
}
