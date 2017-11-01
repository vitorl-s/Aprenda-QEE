package View;



import java.awt.EventQueue;

import javax.swing.*;


public class Fluxo_Pot_Fund extends JInternalFrame {
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fluxo_Pot_Fund simulacao = new Fluxo_Pot_Fund();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public Fluxo_Pot_Fund() {
		setBounds(100, 100, 917, 526);
		getContentPane().setLayout(null);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(637, 22, 76, 15);
		getContentPane().add(lblAmplitude);
		
		JLabel lblAnguloDaFase = new JLabel("Ângulo de fase");
		lblAnguloDaFase.setBounds(761, 22, 106, 15);
		getContentPane().add(lblAnguloDaFase);
		
		JLabel lblCorrente = new JLabel("Amplitude:");
		lblCorrente.setBounds(637, 201, 76, 15);
		getContentPane().add(lblCorrente);
		
		JSpinner contador1 = new JSpinner();
		contador1.setBounds(647, 49, 43, 20);
		getContentPane().add(contador1);
		
		JSpinner contador2 = new JSpinner();
		contador2.setBounds(771, 49, 43, 20);
		getContentPane().add(contador2);
		
		JSpinner contador3 = new JSpinner();
		contador3.setBounds(647, 228, 43, 20);
		getContentPane().add(contador3);
		
		JLabel lblTenso = new JLabel("Tensão");
		lblTenso.setBounds(12, 16, 52, 15);
		getContentPane().add(lblTenso);
		
		JLabel label = new JLabel("Ângulo de fase");
		label.setBounds(761, 201, 106, 15);
		getContentPane().add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(771, 228, 43, 20);
		getContentPane().add(spinner);
		
		JLabel lblCorrente_1 = new JLabel("Corrente");
		lblCorrente_1.setBounds(12, 193, 63, 15);
		getContentPane().add(lblCorrente_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 187, 883, 2);
		getContentPane().add(separator);

	}
}
