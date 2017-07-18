package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import Ventanas.Clubes;
import Ventanas.competiciones;
import Ventanas.jugadores;
import Ventanas.temporadas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame
{

	private JPanel contentPane;

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
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClubes = new JButton("Clubes");
		btnClubes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Clubes objclubes = new Clubes(); 
				objclubes.setVisible(true);
			}
		});
		btnClubes.setBounds(30, 155, 121, 23);
		contentPane.add(btnClubes);
		
		JButton btnCompeticiones = new JButton("Competiciones");
		btnCompeticiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				competiciones objCompeticiones = new competiciones();
				objCompeticiones.setVisible(true);
			}
		});
		btnCompeticiones.setBounds(30, 53, 121, 23);
		contentPane.add(btnCompeticiones);
		
		JButton btnTemporadas = new JButton("Temporadas");
		btnTemporadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temporadas objtemporadas = new temporadas();
				objtemporadas.setVisible(true);
			}
		});
		btnTemporadas.setBounds(30, 87, 121, 23);
		contentPane.add(btnTemporadas);
		
		JButton btnJugadores = new JButton("Jugadores");
		btnJugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jugadores objtemporadas = new jugadores();
				objtemporadas.setVisible(true);
			}
		});
		btnJugadores.setBounds(30, 121, 121, 23);
		contentPane.add(btnJugadores);
		
		JButton btnPersonas = new JButton("Personas");
		btnPersonas.setBounds(161, 121, 112, 23);
		contentPane.add(btnPersonas);
		
		JButton btnFederaciones = new JButton("Federaciones");
		btnFederaciones.setBounds(161, 155, 112, 23);
		contentPane.add(btnFederaciones);
		
		JButton btnEntrenadores = new JButton("Entrenadores");
		btnEntrenadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEntrenadores.setBounds(161, 53, 112, 23);
		contentPane.add(btnEntrenadores);
		
		JButton btnEspecialidades = new JButton("Especialidades");
		btnEspecialidades.setBounds(161, 87, 112, 23);
		contentPane.add(btnEspecialidades);
		
		JLabel lblBienvenidosAlRegistro = new JLabel("Bienvenidos Al Registro de Clubes");
		lblBienvenidosAlRegistro.setBounds(59, 11, 199, 14);
		contentPane.add(lblBienvenidosAlRegistro);
	}
}
