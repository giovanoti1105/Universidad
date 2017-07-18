package Varios.Guis;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class CajasChequeo extends JFrame
{
	public CajasChequeo()
	{
		super("Cajas de Chequeo");
		formulario();
		try
		{
			UIManager.setLookAndFeel(
			//UIManager.getSystemLookAndFeelClassName());
			UIManager.getCrossPlatformLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
			
		} catch (Exception e)
		{
			System.out.println("No se ha podido cnfigurar look an feel" + e.getMessage());
			e.printStackTrace();
		}
	}

	private void formulario()
	{
		setSize(345, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JCheckBox objcursoJava = new JCheckBox("Curso de Java", true);
		JCheckBox objCursoNet = new JCheckBox("Curso de . Net", false);
		JCheckBox objCursoHtml = new JCheckBox("Curso de Html", false);
		JCheckBox objCursoPhp = new JCheckBox("Curso de Php", false);
		FlowLayout objFlowLayout = new FlowLayout();
		ButtonGroup objGrupoChecks = new ButtonGroup();
		objGrupoChecks.add(objcursoJava);
		objGrupoChecks.add(objCursoNet);
		objGrupoChecks.add(objCursoPhp);
		objGrupoChecks.add(objCursoHtml);
		setLayout(objFlowLayout);
		add(objcursoJava);
		add(objCursoNet);
		add(objCursoHtml);
		add(objCursoPhp);
		setVisible(true);

	}

	public static void main(String[] args)
	{
		new CajasChequeo();
	}
}
