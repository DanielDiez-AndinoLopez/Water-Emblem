package guia;

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
					VInicio window = new VInicio();
					window.frame.setVisible(true);
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
		frame.setBounds(100, 100, 627, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel PanelJugador_1 = new JPanel();
		frame.getContentPane().add(PanelJugador_1, BorderLayout.WEST);
		PanelJugador_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		PanelJugador_1.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel panel_1 = new JPanel();
		PanelJugador_1.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Lancero:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_4);
		
		JSpinner spinner_1 = new JSpinner();
		panel_1.add(spinner_1);
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		
		JLabel lblNewLabel_2 = new JLabel("Barbaro:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_2);
		
		JSpinner spinner_2 = new JSpinner();
		panel_1.add(spinner_2);
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		
		JLabel lblNewLabel_3 = new JLabel("Espadachin:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		panel_1.add(spinner);
		spinner.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		
		JPanel PanelJugador_2 = new JPanel();
		frame.getContentPane().add(PanelJugador_2, BorderLayout.EAST);
		PanelJugador_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		PanelJugador_2.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label = new JLabel("Jugador 2");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(label);
		
		JPanel panel_4 = new JPanel();
		PanelJugador_2.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel label_1 = new JLabel("Lancero:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(label_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		panel_4.add(spinner_3);
		
		JLabel label_2 = new JLabel("Barbaro:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(label_2);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		panel_4.add(spinner_4);
		
		JLabel label_3 = new JLabel("Espadachin:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(label_3);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		panel_4.add(spinner_5);
		
		JPanel PanelMapa = new JPanel();
		PanelMapa.setBackground(Color.WHITE);
		frame.getContentPane().add(PanelMapa, BorderLayout.CENTER);
		
		
		JPanel Ajustes = new JPanel();
		FlowLayout flowLayout = (FlowLayout) Ajustes.getLayout();
		flowLayout.setVgap(20);
		frame.getContentPane().add(Ajustes, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Comenzar");
		Ajustes.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		});
		Ajustes.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("Ajustes");
		Ajustes.add(btnNewButton_2);
	}

}
