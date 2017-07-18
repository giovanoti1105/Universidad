package SegundoSemestreListadoCiudades;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class CiudadesColombia extends JFrame implements ActionListener
{
	private JPanel contentPane;
	public JComboBox cmbCiudad;

	public CiudadesColombia()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Archivos objCiudades = new Archivos();
		cmbCiudad = new JComboBox();
		cmbCiudad.setBounds(181, 35, 28, 20);
		contentPane.add(cmbCiudad);
		cmbCiudad.addActionListener(this);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(49, 38, 76, 14);
		contentPane.add(lblCiudad);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setBounds(51, 76, 97, 14);
		contentPane.add(lblDepartamento);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Archivos objArchivos = new Archivos (); 
		if(e.getSource()==cmbCiudad)
		{
			String[] arraytamano;
			arraytamano=objArchivos.Archivos(25);
			cmbCiudad.addItem(arraytamano);
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					CiudadesColombia frame = new CiudadesColombia();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
