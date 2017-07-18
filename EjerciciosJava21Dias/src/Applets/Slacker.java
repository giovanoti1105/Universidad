package Applets;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;

public class Slacker extends java.applet.Applet
{
    String note = "esto es una nota de inicio" + "to be clicked. plase creacion boton ";
    Font lf = new Font("Helvetica", Font.BOLD, 14);
    GridLayout layout = new GridLayout();
    Label lbluno = new Label("Primer label");
	Label lbldos = new Label("segundo label");
	Label lbltres = new Label("tercer label");
	Label lblcuatro = new Label("cuarto label");
	Label lblcinco = new Label("quinto label");
	Button btnuno = new Button("uno");
	Button btndos = new Button("dos");
	Button btntres = new Button("tres");
	Button btncuatro = new Button("cuatro");
	Button btncinco = new Button("cinco");
	CheckboxGroup grupo = new CheckboxGroup(); 
	Checkbox chk1 = new Checkbox("checkboks uno ",grupo,true);
	Checkbox chk2 = new Checkbox("checkboks dos ",grupo,false);
	Checkbox chk3 = new Checkbox("checkboks tres ",grupo,false);
	Checkbox chk4 = new Checkbox("checkboks cuatro ",grupo,false);
	Checkbox chk5 = new Checkbox("checkboks cinco ",grupo,false);
	Choice objlista = new Choice();
	List listas = new List();
	
    public void init()
    {
	setFont(lf);
	setLayout(layout);
	add(chk1);
	//add(lblcinco);
	//add(lblcuatro);
	//add(lbldos);
	//add(btncinco);
	//add(btndos);
	//add(btncuatro);
	//add(chk1);
	//add(chk2);
	//add(chk3);
	//add(chk4);
	//add(chk5);
	objlista.addItem("uno");
	objlista.addItem("dos");
	
    }
}
