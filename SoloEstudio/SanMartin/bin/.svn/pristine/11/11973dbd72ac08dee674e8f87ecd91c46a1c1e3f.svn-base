package SegundoSemestreConvertidosCGrados;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ConvertidorCelsiusAFahrenheit
{
	private JFrame marcoPrincipal;
	private JPanel ventanaPrincipal;
	private JLabel etiquetaCentigrados;
	private JTextField campoCelcius;
	private JLabel etiquetaFH;
	private JTextField campoFH;
	private JButton botonConvertir;

	// constructor de la clase
	public ConvertidorCelsiusAFahrenheit()
	{
		try
		{
			JFrame ventanaPrincipal = getMarcoPrincipal();
			ventanaPrincipal.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			ventanaPrincipal.pack();
			ventanaPrincipal.setSize(300,300);
			ventanaPrincipal.setVisible(true);
		} 
		catch (Exception e)
		{
			e.getMessage();
			e.printStackTrace();
		}
	}

	private JFrame getMarcoPrincipal()
	{
		if(marcoPrincipal== null)
		{
			marcoPrincipal = new JFrame();
			marcoPrincipal.setTitle("Convertidor de temperaturas");
			marcoPrincipal.setSize(new Dimension(88,63));
			marcoPrincipal.setContentPane(getVentanaPrincipal());
		}
		return marcoPrincipal;
	}

	private JPanel getVentanaPrincipal()
	{
		if (ventanaPrincipal==null)
		{
			etiquetaFH = new JLabel("Fahrenheit");
			etiquetaFH.setBounds(16, 53, 79, 16);
			etiquetaCentigrados = new JLabel("Celsius");
			etiquetaCentigrados.setBounds(15,17,79,16);
			ventanaPrincipal = new JPanel();
			ventanaPrincipal.setLayout(new BorderLayout());
			ventanaPrincipal.add(etiquetaCentigrados,null);
			ventanaPrincipal.add(etiquetaFH,null);
			ventanaPrincipal.add(getCampoCelcius(),null);
			ventanaPrincipal.add(getCampoFH(),null);
			ventanaPrincipal.add(getBotonConvertir(),null);
		}
		return ventanaPrincipal;
	}
	
	private JTextField getCampoCelcius()
	{
		if (campoCelcius== null)
		{
			campoCelcius = new JTextField();
			campoCelcius.setBounds(new Rectangle(100, 100, 121,20));
		}
		return campoCelcius;
	}
	
	private JTextField getCampoFH()
	{
		if (campoFH== null)
		{
			campoFH= new JTextField();
			campoFH.setBounds(new Rectangle(114,53,121,20));
			campoFH.setEditable(false);
		}
		return campoFH;
	}
	private JButton getBotonConvertir()
	{
		try
		{
		if (botonConvertir==null)
		{
			botonConvertir = new JButton();
			botonConvertir.setBounds(new Rectangle(81, 85, 28,29));
			botonConvertir.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					String gradosCelcius = campoCelcius.getText();
					String total=convertirCelsiusAFahrenheit(gradosCelcius);
					campoFH.setText(total);
				}
			});
		}
		} catch (Exception e)
		{
		}
		return botonConvertir;
	}
	
	private String convertirCelsiusAFahrenheit(String valorCampoCelsius)
	{
		double gradosFH=0.0;
		double celsius= Double.parseDouble(valorCampoCelsius);
		gradosFH = celsius*1.8+32;
		String resultado=String.valueOf(gradosFH); 
		return resultado;
	}

	public static void main(String[] args)
	{
		new ConvertidorCelsiusAFahrenheit() ;
	}
}
