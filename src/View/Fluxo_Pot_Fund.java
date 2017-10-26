package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.*;


public class Fluxo_Pot_Fund extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtAmplitude;
	private JTextField textField;
	private JTextField textField_1;

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
		setBounds(100, 100, 307, 481);
		getContentPane().setLayout(null);
		
		JLabel lblInformeOsDados = new JLabel("<HTML>Informe os dados<BR>nos campos abaixo <BR> e depois clique no botão</HTML>");
		lblInformeOsDados.setBounds(54, 12, 176, 65);
		getContentPane().add(lblInformeOsDados);
		
		txtAmplitude = new JTextField();
		txtAmplitude.setBounds(55, 135, 165, 25);
		getContentPane().add(txtAmplitude);
		txtAmplitude.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(55, 238, 165, 25);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(55, 326, 165, 25);
		getContentPane().add(textField_1);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(55, 108, 98, 25);
		getContentPane().add(lblAmplitude);
		
		JLabel lblAnguloDaFase = new JLabel("Ângulo fase de tensão:");
		lblAnguloDaFase.setBounds(54, 202, 165, 25);
		getContentPane().add(lblAnguloDaFase);
		
		JLabel lblCorrente = new JLabel("Corrente:");
		lblCorrente.setBounds(55, 297, 98, 25);
		getContentPane().add(lblCorrente);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(80, 400, 117, 25);
		getContentPane().add(btnOk);

	}
}
