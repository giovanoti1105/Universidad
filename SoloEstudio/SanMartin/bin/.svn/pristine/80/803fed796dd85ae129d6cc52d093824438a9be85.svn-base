package SegundoSemestreConvertidorMoneda;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import sun.org.mozilla.javascript.internal.ast.TryStatement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class ConvertidorMoneda extends JFrame
{

	private JPanel contentPane;
	private JTextField txtValorACambiar;
	public JComboBox cmbTipoMoneda;
	private JLabel lblValorDolares;
	private JLabel lblValorPeso;
	private JLabel lblValorEuros;

	// constructor de la clase
	public ConvertidorMoneda()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIngreseValorA = new JLabel("Ingrese Valor a cambiar");
		lblIngreseValorA.setBounds(28, 54, 153, 14);
		contentPane.add(lblIngreseValorA);

		txtValorACambiar = new JTextField();
		txtValorACambiar.setBounds(201, 51, 86, 20);
		contentPane.add(txtValorACambiar);
		txtValorACambiar.setColumns(10);

		contentPane.add(cmbTipoMoneda());

		JLabel lblSeleccioneTipoMoneda = new JLabel("Seleccione Tipo Moneda");
		lblSeleccioneTipoMoneda.setBounds(28, 116, 129, 14);
		contentPane.add(lblSeleccioneTipoMoneda);

		JLabel lbld = new JLabel("Valor Dolares");
		lbld.setBounds(41, 178, 80, 14);
		contentPane.add(lbld);

		JLabel lblp = new JLabel("Valor Pesos");
		lblp.setBounds(168, 178, 80, 14);
		contentPane.add(lblp);

		JLabel lble = new JLabel("Valor Euro");
		lble.setBounds(294, 178, 71, 14);
		contentPane.add(lble);

		lblValorDolares = new JLabel("");
		lblValorDolares.setBounds(41, 207, 71, 14);
		contentPane.add(lblValorDolares);

		lblValorPeso = new JLabel("");
		lblValorPeso.setBounds(168, 207, 61, 14);
		contentPane.add(lblValorPeso);

		lblValorEuros = new JLabel("");
		lblValorEuros.setBounds(294, 207, 71, 14);
		contentPane.add(lblValorEuros);
	}

	private Component cmbTipoMoneda()
	{

		cmbTipoMoneda = new JComboBox();
		String[] etiquetas =
		{ "Dolar", "Peso", "Euro" };
		// poblando el combobox
		for (int i = 0; i < etiquetas.length; i++)
		{
			cmbTipoMoneda.addItem(etiquetas[i]);
		}
		cmbTipoMoneda.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					ConversionMoneda objConversion = new ConversionMoneda();
					if (e.getSource() == cmbTipoMoneda)
					{
						String seleccionado = (String) cmbTipoMoneda.getSelectedItem();
						if (seleccionado == "Euro")
						{
							String cantidad = txtValorACambiar.getText();
							String resultado = objConversion.conversor(cantidad,seleccionado);
							lblValorEuros.setText(resultado);
							lblValorDolares.setText("");
							lblValorPeso.setText("");
							
						} else if (seleccionado == "Dolar")
						{
							String cantidad = txtValorACambiar.getText();
							String resultado = objConversion.conversor(cantidad,seleccionado);
							lblValorDolares.setText(resultado);
							lblValorEuros.setText("");
							lblValorPeso.setText("");
							
						} else if (seleccionado == "Peso")
						{
							String cantidad = txtValorACambiar.getText();
							String resultado = objConversion.conversor(cantidad,seleccionado);
							lblValorPeso.setText(resultado);
							lblValorDolares.setText("");
							lblValorEuros.setText("");
						}
					}
				} catch (Exception e2)
				{
					// TODO: handle exception
				}
			}
		});

		cmbTipoMoneda.setBounds(201, 113, 100, 20);

		return cmbTipoMoneda;
	}

	public static void main(String[] args)
	{
		ConvertidorMoneda frame = new ConvertidorMoneda();
		frame.setVisible(true);
	}
}
