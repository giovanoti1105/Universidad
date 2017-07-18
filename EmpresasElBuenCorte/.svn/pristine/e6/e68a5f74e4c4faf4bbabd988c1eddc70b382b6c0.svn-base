import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Principal extends JFrame
{
	private JPanel contentPane;
	private JRadioButton rdbtnTelasPremium;
	private JRadioButton rdbtnTelasPremier;
	private JRadioButton rdbtnTelasRostingtong;
	
	public JTextField txtCantidad;
	private JTable tablePremium;
	private JTable tablePremier;
	private JTable tableRostington;
	private JLabel lblTotalVenta;
	public JTextField txtTotalVentaPremium;
	private JLabel lblDescuento;
	public JTextField txtDescuentoPremium;
	private JLabel lblDescuento_1;
	public JTextField txtDescuentoPremier;
	private JLabel lblTotalVenta_1;
	public JTextField txtTotalVentaPremier;
	private JLabel lblDescuento_2;
	public JTextField txtDescuentoRostington;
	private JLabel lblTotalVenta_2;
	public JTextField txtTotalVentaRostington;
	private JLabel lblTotalAPagar;
	public JTextField txtTotalPagar;

	public Principal()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblEmpresasElBuen = new JLabel("EMPRESAS EL BUEN CORTE");
		lblEmpresasElBuen.setFont(new Font("Tahoma", Font.PLAIN, 23));
		JLabel lblSeleccioneTipoDe = new JLabel("Seleccione Tipo de Tela");

		getrdbtnTelasPremium();
		rdbtnTelasPremier();
		rdbtnTelasRostingtong();
		getCantidad();

		ButtonGroup grupoRadioButton = new ButtonGroup();
		grupoRadioButton.add(rdbtnTelasPremium);
		grupoRadioButton.add(rdbtnTelasPremier);
		grupoRadioButton.add(rdbtnTelasRostingtong);
		JLabel lblIngreseCantidad = new JLabel("Ingrese Cantidad");

		getTablePremium();
		getTablePremier();
		getTableRostington();
		lblTotalVenta = new JLabel("Total Venta");
		txtTotalVentaPremium = new JTextField();
		txtTotalVentaPremium.setEnabled(false);
		txtTotalVentaPremium.setEditable(false);
		txtTotalVentaPremium.setColumns(10);
		lblDescuento = new JLabel("Descuento");
		txtDescuentoPremium = new JTextField();
		txtDescuentoPremium.setEditable(false);
		txtDescuentoPremium.setEnabled(false);
		txtDescuentoPremium.setColumns(10);
		lblDescuento_1 = new JLabel("Descuento");
		txtDescuentoPremier = new JTextField();
		txtDescuentoPremier.setEnabled(false);
		txtDescuentoPremier.setEditable(false);
		txtDescuentoPremier.setColumns(10);
		lblTotalVenta_1 = new JLabel("Total Venta");
		txtTotalVentaPremier = new JTextField();
		txtTotalVentaPremier.setEnabled(false);
		txtTotalVentaPremier.setEditable(false);
		txtTotalVentaPremier.setColumns(10);
		lblDescuento_2 = new JLabel("Descuento");
		txtDescuentoRostington = new JTextField();
		txtDescuentoRostington.setEnabled(false);
		txtDescuentoRostington.setEditable(false);
		txtDescuentoRostington.setColumns(10);
		lblTotalVenta_2 = new JLabel("Total Venta");
		txtTotalVentaRostington = new JTextField();
		txtTotalVentaRostington.setEnabled(false);
		txtTotalVentaRostington.setEditable(false);
		txtTotalVentaRostington.setColumns(10);
		lblTotalAPagar = new JLabel("TOTAL A PAGAR");
		txtTotalPagar = new JTextField();
		txtTotalPagar.setColumns(10);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnTelasPremier)
								.addComponent(rdbtnTelasRostingtong)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnTelasPremium)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(tableRostington, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(tablePremier, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(tablePremium, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblTotalVenta_2)
											.addGap(18)
											.addComponent(txtTotalVentaRostington))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblDescuento)
											.addGap(18)
											.addComponent(txtDescuentoPremium, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblTotalVenta, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblDescuento_1))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(txtDescuentoPremier, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
												.addComponent(txtTotalVentaPremium)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblTotalVenta_1)
												.addComponent(lblDescuento_2))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(txtDescuentoRostington, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
												.addComponent(txtTotalVentaPremier)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblTotalAPagar)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(txtTotalPagar))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(94)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblEmpresasElBuen)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(lblSeleccioneTipoDe, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
									.addComponent(lblIngreseCantidad)
									.addGap(3)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblEmpresasElBuen)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSeleccioneTipoDe)
						.addComponent(lblIngreseCantidad)
						.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtTotalVentaPremium, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTotalVenta))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnTelasPremium)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(tablePremium, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDescuento)
								.addComponent(txtDescuentoPremium, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(20)
					.addComponent(rdbtnTelasPremier)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tablePremier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDescuento_1)
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTotalVenta_1)
								.addComponent(txtTotalVentaPremier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(2))
						.addComponent(txtDescuentoPremier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addComponent(rdbtnTelasRostingtong)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tableRostington, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDescuento_2)
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTotalVenta_2)
								.addComponent(txtTotalVentaRostington, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(txtDescuentoRostington, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblTotalAPagar)
						.addComponent(txtTotalPagar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getCantidad()
	{
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		return txtCantidad;
	}

	public JRadioButton getrdbtnTelasPremium()
	{
		rdbtnTelasPremium = new JRadioButton("Telas Premium");
		rdbtnTelasPremium.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				String cantidad=txtCantidad.getText();
				ProcesosTelas objTelas = new ProcesosTelas();
				objTelas.onClickBotonTelasPremium(cantidad, txtDescuentoPremium, txtTotalVentaPremium,txtTotalPagar);
				txtDescuentoRostington.setText("");
				txtDescuentoPremier.setText("");
				txtTotalVentaRostington.setText("");
				txtTotalVentaPremier.setText("");
			}
		});
		return rdbtnTelasPremium;
	}

	private JRadioButton rdbtnTelasPremier()
	{
		rdbtnTelasPremier = new JRadioButton("Telas Premier");
		rdbtnTelasPremier.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				String cantidad=txtCantidad.getText();
				ProcesosTelas objTelas = new ProcesosTelas();
				objTelas.onClickBotonTelaspremier(cantidad, txtDescuentoPremier, txtTotalVentaPremier,txtTotalPagar);
				txtDescuentoPremium.setText("");
				txtDescuentoRostington.setText("");
				txtTotalVentaPremium.setText("");
				txtTotalVentaRostington.setText("");
			}
		});
		return rdbtnTelasPremier;
	}

	private JRadioButton rdbtnTelasRostingtong()
	{
		rdbtnTelasRostingtong = new JRadioButton("Telas RostingTong");
		rdbtnTelasRostingtong.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				String cantidad=txtCantidad.getText();
				ProcesosTelas objTelas = new ProcesosTelas();
				objTelas.onClickBotonTelasRostingtong(cantidad, txtDescuentoRostington, txtTotalVentaRostington,txtTotalPagar);
				txtDescuentoPremium.setText("");
				txtDescuentoPremier.setText("");
				txtTotalVentaPremium.setText("");
				txtTotalVentaPremier.setText("");
			}
		});
		return rdbtnTelasRostingtong;
	}

	private JTable getTablePremium()
	{
		Object rowData[][] =
		{
		{ "1 - 500", "$ 10.000" },
		{ "500-1000", "$ 6.000" },
		{ "1000 en adelante", "$ 2.500" } };
		Object rowColumNames[] =
		{ "columna1 ", "Columna2" };
		tablePremium = new JTable(rowData, rowColumNames);
		tablePremium.setEnabled(false);
		return tablePremium;
	}

	private JTable getTablePremier()
	{
		Object rowData[][] =
		{
		{ "1 - 500", "$ 8.000" },
		{ "500-1000", "$ 4.500" },
		{ "1000 en adelante", "$ 2.000" } };
		Object rowColumNames[] =
		{ "columna1 ", "Columna2" };
		tablePremier = new JTable(rowData, rowColumNames);
		tablePremier.setEnabled(false);
		return tablePremier;
	}
	private JTable getTableRostington()
	{
		Object rowData[][] =
			{
			{ "1 - 500", "$ 6.500" },
			{ "500-1000", "$ 3.000" },
			{ "1000 en adelante", "$ 1.500" } };
			Object rowColumNames[] =
			{ "columna1 ", "Columna2" };
			tableRostington = new JTable(rowData, rowColumNames);
			tableRostington.setEnabled(false);
		
		return tableRostington;
		
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
