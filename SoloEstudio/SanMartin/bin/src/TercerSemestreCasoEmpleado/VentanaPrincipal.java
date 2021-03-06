package TercerSemestreCasoEmpleado;

// librerias
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import TercerSemestreCasoEmpleado.componentesPaginaPrincipal;

public class VentanaPrincipal extends JFrame
{
	private static final long serialVersionUID = 1L;
	// variables de clase
	private JFrame FrameventanaPrincipal;
	private JPanel panelContenedorPrincipal;
	private JPanel panelDatosPersonales;
	private JPanel panelSalario;
	private JPanel panelCalculos;

	// constructor de la clase
	public VentanaPrincipal()
	{
		FrameventanaPrincipal = new JFrame();
		FrameventanaPrincipal.add(PanelPrincipal());
		FrameventanaPrincipal.setSize(new Dimension(700, 490));
		FrameventanaPrincipal.setVisible(true);
	}

	// panel que contiene los paneles
	private JPanel PanelPrincipal()
	{
		if (panelContenedorPrincipal == null)
		{
			panelContenedorPrincipal = new JPanel();
			panelContenedorPrincipal.setLayout(null);
			panelContenedorPrincipal.add(getPanelDatosPersonales());
			panelContenedorPrincipal.add(getPanelSalario());
			panelContenedorPrincipal.add(getPanelCalculos());
		}
		return panelContenedorPrincipal;
	}

	// creacion de panel que contiene los datos personales
	private JPanel getPanelDatosPersonales()
	{
		if (panelDatosPersonales == null)
		{
				panelDatosPersonales = new JPanel();
				panelDatosPersonales.setLayout(null);
				panelDatosPersonales.setBounds(0, 0, 684, 200);
				//panelDatosPersonales.setBackground(Color.blue);
				TitledBorder titulo = BorderFactory.createTitledBorder("Empleados");
				panelDatosPersonales.setBorder(titulo);
				componentesPaginaPrincipal.ComponentesDatosPrincipales(panelDatosPersonales);
		}
		return panelDatosPersonales;
	}

	// creacion de panel que contiene el salario
	private JPanel getPanelSalario()
	{
		if (panelSalario == null)
		{
			panelSalario = new JPanel();
			panelSalario.setLayout(null);
			panelSalario.setBounds(0, 198, 684, 100);
			//panelSalario.setBackground(Color.red);
			TitledBorder titulo = BorderFactory.createTitledBorder("Salario");
			panelSalario.setBorder(titulo);
			componentesPaginaPrincipal.ComponentesDatosSalario(panelSalario);
		}
		return panelSalario;
	}

	// creacion de panel que contiene los calculos
	private JPanel getPanelCalculos()
	{
		if (panelCalculos == null)
		{
			panelCalculos = new JPanel();
			panelCalculos.setLayout(null);
			panelCalculos.setBounds(0, 298, 684, 150);
			//panelCalculos.setBackground(Color.cyan);
			TitledBorder titulo = BorderFactory.createTitledBorder("C�lculos");
			panelCalculos.setBorder(titulo);
			componentesPaginaPrincipal.ComponentesDatosCalculos(panelCalculos);
		}
		return panelCalculos;
	}

	public static void main(String[] args)
	{
		// se crea objeto que carga el combo
		new VentanaPrincipal();
	}
}
