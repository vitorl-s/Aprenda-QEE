package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.*;


public class Fluxo_Pot_Fund extends JInternalFrame {
	/**
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
					Fluxo_Pot_Fund frame = new Fluxo_Pot_Fund();
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
	public Fluxo_Pot_Fund() {
		setBounds(100, 100, 917, 526);
		getContentPane().setLayout(null);
		
		JLabel lblInformeOsDados = new JLabel("<HTML>Informe os dados<BR>nos campos abaixo </HTML>");
		lblInformeOsDados.setBounds(705, 22, 135, 30);
		getContentPane().add(lblInformeOsDados);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(705, 76, 76, 15);
		getContentPane().add(lblAmplitude);
		
		JLabel lblAnguloDaFase = new JLabel("Ângulo fase de tensão:");
		lblAnguloDaFase.setBounds(705, 137, 165, 25);
		getContentPane().add(lblAnguloDaFase);
		
		JLabel lblCorrente = new JLabel("Corrente:");
		lblCorrente.setBounds(705, 200, 98, 25);
		getContentPane().add(lblCorrente);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(705, 103, 43, 20);
		getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(705, 162, 43, 20);
		getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(705, 224, 43, 20);
		getContentPane().add(spinner_2);

	}
}
