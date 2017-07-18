package Applets;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

public class Crosshair extends java.applet.Applet
{
    GridLayout gr = new GridLayout ();
    MyCanvas can = new MyCanvas ();
    
    public void init ()
    {
	setLayout(gr);
	add(can);
    }
}
class MyCanvas extends java.applet.Applet
{
    public void paint (Graphics g)
    {
	int x = size().width / 2;
	int y = size().height / 2;
	g.setColor(Color.blue);
	g.drawLine(x-10, y, x-2, y);
	g.drawLine(x+10, y, x+2, y);
	g.drawLine(x, y-10, x, y-2);
	g.drawLine(x, y+10, x, y+2);
    }
}