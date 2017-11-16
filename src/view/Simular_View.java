package View;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.AcaoBotaoSimulacao1;
import Controller.AcaoBotaoSimulacao2;






public class Simular_View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Simular_View frame = new Simular_View();
		frame.setVisible(true);
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
		btnFluxoPotFund.addActionListener(new AcaoBotaoSimulacao1());
		btnFluxoPotFund.setBounds(152, 207, 256, 46);
		contentPane.add(btnFluxoPotFund);
		
		JButton btnDistorHarm = new JButton("Distorção Harmônica");
		btnDistorHarm.addActionListener(new AcaoBotaoSimulacao2());
		btnDistorHarm.setBounds(152, 275, 256, 46);
		contentPane.add(btnDistorHarm);
		
	}

}
