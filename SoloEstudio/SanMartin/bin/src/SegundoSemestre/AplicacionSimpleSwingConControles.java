package SegundoSemestre;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AplicacionSimpleSwingConControles extends JFrame
{
	// atributos de la clase
	private JFrame formulario;
	private JPanel ventanaPrincipal;
	private JLabel etiquetaNumero1;
	private JLabel etiquetaNumero2;
	private JLabel etiquetaRespuesta;
	private JTextField campoNumero1;
	private JTextField campoNumero2;
	private JTextField campoResultado;
	private JButton botonSumar;
	private JButton botonRestar;
	private JButton botonMultiplicar;
	private JButton botonDividir;

	// constructor de la clase
	public AplicacionSimpleSwingConControles()
	{
		// creamos un nuevo frame
		JFrame ventana = getFormulario();
		// agregamos un escuchador de evento para cuando se pulsa X
		ventana.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				// si pulsa X se cierra
				System.exit(0);
			}
		});

		// definimos el tamaño de la ventana
		ventana.setSize(600, 200);
		ventana.setVisible(true);
	}

	private JFrame getFormulario()
	{
		// mostramos la ventana y definimos su titulo
		if (formulario == null)
		{
			formulario = new JFrame();
			formulario.setTitle("Ventana basica hecha en swing");
			formulario.setSize(new Dimension(600, 300));
			formulario.setContentPane(getVentanaPrincipal());
		}
		return formulario;
	}

	private JPanel getVentanaPrincipal()
	{
		if (ventanaPrincipal == null)
		{
			etiquetaRespuesta = new JLabel();
			etiquetaRespuesta.setBounds(new Rectangle(15, 107, 76, 28));
			etiquetaRespuesta.setText("Respuesta");
			etiquetaNumero2 = new JLabel();
			etiquetaNumero2.setBounds(new Rectangle(15, 59, 75, 29));
			etiquetaNumero2.setText("Numero 2");
			etiquetaNumero1 = new JLabel();
			etiquetaNumero1.setBounds(new Rectangle(15, 16, 75, 27));
			etiquetaNumero1.setText("Numero 1");
			ventanaPrincipal = new JPanel();
			ventanaPrincipal.setLayout(null);
			ventanaPrincipal.add(etiquetaNumero1);
			ventanaPrincipal.add(etiquetaNumero2);
			ventanaPrincipal.add(etiquetaRespuesta);
			ventanaPrincipal.add(getCampoNumero1());
			ventanaPrincipal.add(getCampoNumero2());
			ventanaPrincipal.add(getCampoResultado());
			ventanaPrincipal.add(getBotonSumar());
			ventanaPrincipal.add(getBotonRestar());
			ventanaPrincipal.add(getBotonMultiplicar());
			ventanaPrincipal.add(getBotonDividir());
		}
		return ventanaPrincipal;
	}

	private JTextField getCampoNumero1()
	{
		if (campoNumero1 == null)
		{
			campoNumero1 = new JTextField();
			campoNumero1.setBounds(new Rectangle(108, 16, 164, 28));
		}
		return campoNumero1;
	}

	private JTextField getCampoNumero2()
	{
		if (campoNumero2 == null)
		{
			campoNumero2 = new JTextField();
			campoNumero2.setBounds(new Rectangle(108, 61, 164, 28));
		}
		return campoNumero2;
	}

	private JTextField getCampoResultado()
	{
		if (campoResultado == null)
		{
			campoResultado = new JTextField();
			campoResultado.setBounds(new Rectangle(108, 111, 163, 28));
		}
		return campoResultado;
	}

	private JButton getBotonSumar()
	{
		if (botonSumar==null){
			botonSumar = new JButton();
			botonSumar.setBounds(new Rectangle(303,15,102,41));
			botonSumar.setBounds(new Rectangle(307,14,102,41));
			botonSumar.setText("Sumar");
			botonSumar.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					System.out.println("actionPerformed() boton suma");
					int n1=0;
					int n2=0;
					int suma=0;
					n1=Integer.parseInt(campoNumero1.getText());
					n2=Integer.parseInt(campoNumero2.getText());
					
					suma=n1+n2;
					campoResultado.setText(String.valueOf(suma));
				}
			});
		}
		return botonSumar;
	}
	// funcion del boton Restar
	private JButton getBotonRestar()
	{
		if (botonRestar==null){
			botonRestar = new JButton();
			botonRestar.setBounds(new Rectangle(451,15,101,40));
			botonRestar.setBounds(new Rectangle(459,14,101,40));
			botonRestar.setText("Restar");
			botonRestar.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					System.out.println("actionPerformed() boton suma");
					int n1=0;
					int n2=0;
					int resta=0;
					n1=Integer.parseInt(campoNumero1.getText());
					n2=Integer.parseInt(campoNumero2.getText());
					
					resta=n1-n2;
					campoResultado.setText(String.valueOf(resta));
				}
			});
		}
		return botonRestar;
	}
	
	// funcion boton multiplicar
	private JButton getBotonMultiplicar()
	{
		if (botonMultiplicar==null){
			botonMultiplicar = new JButton();
			botonMultiplicar.setBounds(new Rectangle(302,95,101,42));
			botonMultiplicar.setBounds(new Rectangle(307,95,101,42));
			botonMultiplicar.setText("Multiplicar");
			botonMultiplicar.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					System.out.println("actionPerformed() boton Multiplicacion");
					int n1=0;
					int n2=0;
					int producto=0;
					n1=Integer.parseInt(campoNumero1.getText());
					n2=Integer.parseInt(campoNumero2.getText());
					
					producto=n1*n2;
					campoResultado.setText(String.valueOf(producto));
				}
			});
		}
		return botonMultiplicar;
	}
	// funcion boton dividir
		private JButton getBotonDividir()
		{
			if (botonDividir==null){
				botonDividir = new JButton();
				botonDividir.setBounds(new Rectangle(452,95,101,42));
				botonDividir.setBounds(new Rectangle(459,95,101,42));
				botonDividir.setText("Dividir");
				botonDividir.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent e)
					{
						System.out.println("actionPerformed() boton Dividir");
						int n1=0;
						int n2=0;
						int dividir=0;
						n1=Integer.parseInt(campoNumero1.getText());
						n2=Integer.parseInt(campoNumero2.getText());
						
						dividir=n1/n2;
						campoResultado.setText(String.valueOf(dividir));
					}
				});
			}
			return botonDividir;
		}
	

	public static void main(String[] args)
	{
		try
		{
			new AplicacionSimpleSwingConControles();
		} catch (Exception e)
		{
			e.toString();
			e.printStackTrace();
		}
		
	}

}
