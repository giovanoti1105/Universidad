package VentanaPrincipal;

import java.awt.CheckboxGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import FuncionesJuego.ProcesoJuego;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame
{

	private JPanel contentPane;
	private JTextField txtResultadoJuan;
	public JTextField txtResultadoMaria;
	private ButtonGroup grupoBotonesJuan, grupoBotonesMaria;
	public JTextField txtCantidadJuegos;
	public  JRadioButton rdbtnImparJuan;
	public JRadioButton rdbtnParJuan;
	public JRadioButton rdbtnParMaria;
	public JRadioButton rdbtnImparMaria;
	public JLabel lblResultado;
	

	/**
	 * constructor de la clase inicia los controles de la ventana
	 */
	public VentanaPrincipal()
	{
		setTitle("PARES IMPARES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreJuan = new JLabel("Juan");
		lblNombreJuan.setBounds(26, 36, 46, 14);
		contentPane.add(lblNombreJuan);
		
		JLabel lblNombreMaria = new JLabel("Maria");
		lblNombreMaria.setBounds(26, 61, 46, 14);
		contentPane.add(lblNombreMaria);
		
		CheckboxGroup chkboxJuan = new CheckboxGroup();
		
		JLabel lblCantidadDeJuegos = new JLabel("Cantidad de Juegos");
		lblCantidadDeJuegos.setBounds(292, 32, 121, 14);
		contentPane.add(lblCantidadDeJuegos);
		
		JLabel lblJuan = new JLabel("Juan");
		lblJuan.setBounds(26, 142, 46, 14);
		contentPane.add(lblJuan);
		
		txtResultadoJuan = new JTextField();
		txtResultadoJuan.setBounds(78, 139, 306, 20);
		contentPane.add(txtResultadoJuan);
		txtResultadoJuan.setColumns(10);
		
		txtResultadoMaria = new JTextField();
		txtResultadoMaria.setBounds(78, 167, 306, 20);
		contentPane.add(txtResultadoMaria);
		txtResultadoMaria.setColumns(10);
		
		JLabel lblMaria = new JLabel("Maria");
		lblMaria.setBounds(26, 170, 38, 14);
		contentPane.add(lblMaria);
		
		JLabel lblGanador = new JLabel("Ganador");
		lblGanador.setBounds(78, 218, 66, 14);
		contentPane.add(lblGanador);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(146, 218, 395, 14);
		lblResultado.setVisible(true);
		contentPane.add(lblResultado);
		
		JLabel lblAnuncioResultado = new JLabel("Resultado");
		lblAnuncioResultado.setBounds(176, 114, 80, 14);
		contentPane.add(lblAnuncioResultado);
		
		rdbtnParJuan = new JRadioButton("Par",true);
		rdbtnParJuan.setBounds(78, 32, 55, 23);
		rdbtnParJuan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProcesoJuego objProcesos = new ProcesoJuego ();
				objProcesos.definicionJuan(rdbtnParJuan);
			}
		});
		contentPane.add(rdbtnParJuan);
		
		rdbtnImparJuan = new JRadioButton("Impar");
		rdbtnImparJuan.setBounds(147, 32, 66, 23);
		rdbtnImparJuan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProcesoJuego objProcesos = new ProcesoJuego ();
				objProcesos.definicionJuan(rdbtnImparJuan);
			}
		});
		contentPane.add(rdbtnImparJuan);
   	    grupoBotonesJuan  = new ButtonGroup();
   	    grupoBotonesJuan.add(rdbtnImparJuan);
   	    grupoBotonesJuan.add(rdbtnParJuan);
   	 
		rdbtnParMaria = new JRadioButton("Par");
		rdbtnParMaria.setBounds(78, 57, 55, 23);
		rdbtnParMaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProcesoJuego objProcesos = new ProcesoJuego ();
				objProcesos.definicionMaria(rdbtnParMaria);
			}
		});
		contentPane.add(rdbtnParMaria);
		
		rdbtnImparMaria = new JRadioButton("Impar",true);
		rdbtnImparMaria.setBounds(147, 57, 66, 23);
		rdbtnImparMaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProcesoJuego objProcesos = new ProcesoJuego ();
				objProcesos.definicionMaria(rdbtnImparMaria);
			}
		});
		contentPane.add(rdbtnImparMaria);
		grupoBotonesMaria  = new ButtonGroup();
		grupoBotonesMaria.add(rdbtnImparMaria);
		grupoBotonesMaria.add(rdbtnParMaria);
		
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProcesoJuego objProcesos = new ProcesoJuego ();
				String numeroDeJuegos = txtCantidadJuegos.getText();
				objProcesos.procedimientoJuego(numeroDeJuegos);
			}
		});
		btnJugar.setBounds(311, 89, 73, 23);
		contentPane.add(btnJugar);
		
				txtCantidadJuegos = new JTextField();
				txtCantidadJuegos.setBounds(311, 58, 55, 20);
				contentPane.add(txtCantidadJuegos);
				txtCantidadJuegos.setColumns(10);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		VentanaPrincipal frame = new VentanaPrincipal();
		frame.setVisible(true);
	}
}
