package View;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Simular_Controller;



public class Simular_View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JInternalFrame simulacao;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simular_View frame = new Simular_View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Simular_View() {
		setTitle("APRENDA QEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemvindo = new JLabel("Bem-Vindo(a) ao Aprenda QEE!");
		lblBemvindo.setBounds(11, 37, 364, 31);
		contentPane.add(lblBemvindo);
		
		JLabel lblSelecione = new JLabel("Por favor, selecione uma das simulações desejadas!");
		lblSelecione.setBounds(11, 80, 371, 15);
		contentPane.add(lblSelecione);
		
		JButton btnFluxoPotFund = new JButton("Fluxo de Potência Fundamental");
		btnFluxoPotFund.addActionListener(new Simular_Controller(simulacao));
		btnFluxoPotFund.setBounds(152, 207, 256, 46);
		contentPane.add(btnFluxoPotFund);
		
		JButton btnDistorHarm = new JButton("Distorção Harmônica");
		btnDistorHarm.setBounds(152, 275, 256, 46);
		contentPane.add(btnDistorHarm);
		
		JButton btnFluxoPotHarm = new JButton("Fluxo de potência Harmônico");
		btnFluxoPotHarm.setBounds(152, 343, 256, 46);
		contentPane.add(btnFluxoPotHarm);
		
	}

}
