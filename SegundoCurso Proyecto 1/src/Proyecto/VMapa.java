package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VMapa extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VMapa VentanaMapa = new VMapa();
					VentanaMapa.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VMapa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(600, 300, 800, 500);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel Marcador = new JPanel();
		frame.getContentPane().add(Marcador, BorderLayout.NORTH);
		
		JLabel Nombre_Jugador1 = new JLabel("Jugador 1");
		Marcador.add(Nombre_Jugador1, BorderLayout.EAST);
		
		JLabel Nombre_Jugador2 = new JLabel("Jugador 2");
		Marcador.add(Nombre_Jugador2, BorderLayout.WEST);
		
		JLabel Temporizador = new JLabel("Temporizador:");
		Marcador.add(Temporizador, BorderLayout.NORTH);
		
		JLabel Temporizador_Num = new JLabel();
		Marcador.add(Temporizador_Num, BorderLayout.NORTH);
		
		JPanel Mapa = new JPanel(new GridLayout(10,10,5,5));
		Mapa.setBackground(Color.WHITE);
		frame.getContentPane().add(Mapa, BorderLayout.CENTER);
		
		//Poner los JLabel de cada parte del mapa con los datos de la clase casilla
		
		
		
		
		JPanel Opciones = new JPanel();
		Opciones.setBackground(Color.GRAY);
		frame.getContentPane().add(Opciones, BorderLayout.SOUTH);
		
		JButton Atacar = new JButton();
		

	}
}
