package Proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VInicio extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VInicio VentanaInicio = new VInicio();
					VentanaInicio.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(600, 300, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel PanelJugador_1 = new JPanel();
		PanelJugador_1.setForeground(Color.BLACK);
		frame.getContentPane().add(PanelJugador_1, BorderLayout.WEST);
		PanelJugador_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		PanelJugador_1.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblJugador1 = new JLabel("Jugador 1");
		panel.add(lblJugador1);
		lblJugador1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador1.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel panel_1 = new JPanel();
		PanelJugador_1.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel J1TipoLancero = new JLabel("Lancero:");
		J1TipoLancero.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(J1TipoLancero);
		
		JSpinner J1Lanceros = new JSpinner();
		panel_1.add(J1Lanceros);
		J1Lanceros.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		
		JLabel J1TipoBarbaro = new JLabel("Barbaro:");
		J1TipoBarbaro.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(J1TipoBarbaro);
		
		JSpinner J1Barbaro = new JSpinner();
		panel_1.add(J1Barbaro);
		J1Barbaro.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		
		JLabel J1TipoEspadachin = new JLabel("Espadachin:");
		J1TipoEspadachin.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(J1TipoEspadachin);
		
		JSpinner J1Espadachin = new JSpinner();
		panel_1.add(J1Espadachin);
		J1Espadachin.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		
		JPanel PanelJugador_2 = new JPanel();
		PanelJugador_2.setForeground(Color.BLACK);
		frame.getContentPane().add(PanelJugador_2, BorderLayout.EAST);
		PanelJugador_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		PanelJugador_2.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblJugador2 = new JLabel("Jugador 2");
		lblJugador2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador2.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(lblJugador2);
		
		JPanel panel_4 = new JPanel();
		PanelJugador_2.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel J2TipoLancero = new JLabel("Lancero:");
		J2TipoLancero.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(J2TipoLancero);
		
		JSpinner J2Lancero = new JSpinner();
		J2Lancero.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		panel_4.add(J2Lancero);
		J2Lancero.getToolTipText();
		
		JLabel J2TipoBarbaro = new JLabel("Barbaro:");
		J2TipoBarbaro.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(J2TipoBarbaro);
		
		JSpinner J2Barbaro = new JSpinner();
		J2Barbaro.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		panel_4.add(J2Barbaro);
		
		JLabel J2TipoEspadachin = new JLabel("Espadachin:");
		J2TipoEspadachin.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(J2TipoEspadachin);
		
		JSpinner J2Espadachin = new JSpinner();
		J2Espadachin.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		panel_4.add(J2Espadachin);
		
		
		JPanel Ajustes = new JPanel();
		FlowLayout flowLayout = (FlowLayout) Ajustes.getLayout();
		flowLayout.setVgap(20);
		frame.getContentPane().add(Ajustes, BorderLayout.SOUTH);
		
		JButton bAceptar = new JButton("Comenzar");
		Ajustes.add(bAceptar);
		bAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				VMapa mapa = new VMapa();
				mapa.setVisible(true);
				
				
				
			}
			
		});
		
		
		JButton bCancelar = new JButton("Cancelar");
		Ajustes.add(bCancelar);
		bCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();			
			}
		});
	
		
		JButton bAjustes = new JButton("Ajustes");
		Ajustes.add(bAjustes);
		bAjustes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// En caso de que tengamos tiempo para añadir mas configuraciones al juego.
				
			}
		});
		
		
		//Fallo
		
		JPanel PanelMapa = new JPanel();
		PanelMapa.setBackground(Color.WHITE);
		frame.getContentPane().add(PanelMapa, BorderLayout.CENTER);
		PanelMapa.setLayout(new GridLayout(10,0,10,0));
		
		JLabel Casillas = new JLabel();
		Casillas.setForeground(Color.black);
		
		PanelMapa.add(Casillas);
		
		
	}
	//Metodo de comprobacion de los Spinners para que la suma de 15 como maximo.
	public boolean comprobacion(){
		
		
		
		return false;
	}

}
