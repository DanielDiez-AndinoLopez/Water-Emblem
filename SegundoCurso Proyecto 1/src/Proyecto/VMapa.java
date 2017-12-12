package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
		
		

	}
}
