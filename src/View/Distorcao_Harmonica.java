package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import javax.swing.JLabel;

import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Distorcao_Harmonica extends JInternalFrame {

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
					Distorcao_Harmonica frame = new Distorcao_Harmonica();
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
	public Distorcao_Harmonica() {
		setBounds(100, 100, 916, 529);
		getContentPane().setLayout(null);
		
		JLabel lblSelecioneAOrdem = new JLabel("Harmônicos:");
		lblSelecioneAOrdem.setBounds(751, 47, 88, 15);
		getContentPane().add(lblSelecioneAOrdem);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pares", "Ímpares"}));
		comboBox.setBounds(751, 74, 85, 24);
		getContentPane().add(comboBox);
		
		JLabel lblNmeroDeHarmnicos = new JLabel("Número de harmônicos");
		lblNmeroDeHarmnicos.setBounds(569, 47, 163, 15);
		getContentPane().add(lblNmeroDeHarmnicos);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(579, 75, 35, 23);
		getContentPane().add(spinner);
		
		JLabel lblOrdemHarmnica = new JLabel("Ordem Harmônica");
		lblOrdemHarmnica.setBounds(569, 110, 126, 15);
		getContentPane().add(lblOrdemHarmnica);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(579, 137, 35, 24);
		getContentPane().add(spinner_1);
		
		JLabel lblngulo = new JLabel("Ângulo de fase");
		lblngulo.setBounds(751, 110, 106, 15);
		getContentPane().add(lblngulo);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(761, 139, 35, 24);
		getContentPane().add(spinner_3);

	}
}
