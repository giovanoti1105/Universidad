package Applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;

public class Inner extends Applet{
	Button one = new Button("Uno");
	Button dos = new BlueButton("Dos");
	
	public void init(){
		add(one);
		add(dos);
	}
	class BlueButton extends Button{
		BlueButton(String label){
			super(label);
			this.setBackground(Color.blue);
		}
	}
}
