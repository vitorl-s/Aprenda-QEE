package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JSeparator;

public class Fluxo_Pot_Harmonico extends JInternalFrame {

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
					Fluxo_Pot_Harmonico frame = new Fluxo_Pot_Harmonico();
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
	public Fluxo_Pot_Harmonico() {
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ordem Harmonica");
		lblNewLabel.setBounds(530, 165, 126, 15);
		getContentPane().add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(540, 192, 39, 20);
		getContentPane().add(spinner);
		
		JLabel lblAmplitudeCorrente = new JLabel("Amplitude");
		lblAmplitudeCorrente.setBounds(688, 165, 71, 15);
		getContentPane().add(lblAmplitudeCorrente);
		
		JLabel lblHarmonicoDaCorrente = new JLabel("Harmonico");
		lblHarmonicoDaCorrente.setBounds(789, 165, 75, 15);
		getContentPane().add(lblHarmonicoDaCorrente);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(698, 192, 39, 20);
		getContentPane().add(spinner_1);
		
		JLabel lblCorrente = new JLabel("Corrente");
		lblCorrente.setBounds(12, 165, 71, 15);
		getContentPane().add(lblCorrente);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(799, 192, 39, 20);
		getContentPane().add(spinner_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 153, 866, 2);
		getContentPane().add(separator);
		
		JLabel lblTenso = new JLabel("Tensão");
		lblTenso.setBounds(12, 12, 70, 15);
		getContentPane().add(lblTenso);
		
		JLabel lblAmplitude = new JLabel("Amplitude");
		lblAmplitude.setBounds(793, 12, 71, 15);
		getContentPane().add(lblAmplitude);
		
		JLabel lblnguloDeFase = new JLabel("Ângulo de fase");
		lblnguloDeFase.setBounds(661, 12, 106, 15);
		getContentPane().add(lblnguloDeFase);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(671, 39, 39, 20);
		getContentPane().add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(786, 39, 39, 20);
		getContentPane().add(spinner_4);

	}
}
