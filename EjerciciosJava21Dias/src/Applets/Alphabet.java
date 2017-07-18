package Applets;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.Scrollbar;

public class Alphabet extends java.applet.Applet
{
    Button a = new Button ("uno");
    Button b = new Button ("dos");
    Button c = new Button ("tres");
    FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
    FlowLayout flo = new FlowLayout(FlowLayout.CENTER,30,10);
    GridBagLayout gr = new GridBagLayout();
     
    
    public Component Lista()
    {
	List hm = new List(5, true);
	hm.add("uno");
	hm.add("dos");
	hm.add("tres");
	hm.add("cuatro");
	hm.add("cinco");
	hm.add("seis");
	hm.add("siete");
	hm.add("ocho");
	return hm;
    }
    public Component scrollbar()
    {
	Scrollbar bar = new Scrollbar(Scrollbar.HORIZONTAL,50,0,1,100); 
	return bar;
    }
    
    public void init()
    {
	setLayout(lm);
	add(a);
	add(b);
	add(c);
	add(Lista());
	add(scrollbar());
    }
}
