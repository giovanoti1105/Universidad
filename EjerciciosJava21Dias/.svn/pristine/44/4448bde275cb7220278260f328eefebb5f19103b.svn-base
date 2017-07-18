package Applets;

import java.awt.Button;
import java.awt.Event;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class passwordGridBagLayout extends java.applet.Applet implements ActionListener
{
	private TextField txt1;
	private TextField txt2;
	private Button btn1;
	
	void buildConstraints(GridBagConstraints gbc,int gx,int gy, int gw, int gh, int wx,int wy)
	{
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbc.weightx=wx;
		gbc.weighty=wy;
	}
	public void init()
	{
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		setLayout(gridbag);
		
		// etiqueta nombre
		buildConstraints(constraints, 0, 0, 1, 1, 10, 40);
		constraints.fill= GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.EAST; 
		Label lbl1 = new Label ("Nombre",Label.LEFT); 
		gridbag.setConstraints(lbl1, constraints);
		add(lbl1);
		
		//campo de texto nombre
		buildConstraints(constraints, 1, 0, 1, 1, 90, 0);
		constraints.fill= GridBagConstraints.HORIZONTAL;
		txt1 = new TextField (); 
		gridbag.setConstraints(txt1, constraints);
		add(txt1);
		
		// etiqueta de contraseña
		buildConstraints(constraints, 0, 1, 1, 1, 0, 40);
		constraints.fill= GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.EAST;
		Label lbl2 = new Label ("Contraseña",Label.LEFT); 
		gridbag.setConstraints(lbl2, constraints);
		add(lbl2);
		
		//campo de contraseña
		buildConstraints(constraints, 1, 1, 1, 1, 90, 0);
		constraints.fill= GridBagConstraints.HORIZONTAL;
		txt2 = new TextField (); 
		txt2.setEchoChar('*');
		gridbag.setConstraints(txt2, constraints);
		add(txt2);
		
		//boton OK
		buildConstraints(constraints, 0,2,2,1,0,20);
		constraints.fill= GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.CENTER;
		btn1 = new Button ("Ok"); 
		btn1.addActionListener(this);
		gridbag.setConstraints(btn1, constraints);
		add(btn1);
		
		setVisible(true);
	}
	 public void actionPerformed(ActionEvent e)

     {
		if(txt2.getText().equals("uno"))
		{
			JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Ingrese de nuevo su contraseña");
		}
	}
}