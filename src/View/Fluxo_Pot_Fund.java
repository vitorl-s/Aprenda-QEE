package View;




import java.util.ArrayList;
import java.util.List;
import Model.calculosFluxoPotFund;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;


public class Fluxo_Pot_Fund extends JFrame {
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Fluxo_Pot_Fund frame = new Fluxo_Pot_Fund();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public Fluxo_Pot_Fund() {
		setBounds(100, 100, 917, 526);
		getContentPane().setLayout(null);
		
		JLabel lblTenso = new JLabel("Tensão");
		lblTenso.setBounds(12, 16, 52, 15);
		getContentPane().add(lblTenso);
		
		JLabel lblCorrente_1 = new JLabel("Corrente");
		lblCorrente_1.setBounds(12, 193, 63, 15);
		getContentPane().add(lblCorrente_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 187, 883, 2);
		getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(13, 17, 460, 210);
		getContentPane().add(panel);
		
		List<Double> scores = new ArrayList<>();
		for(double i = 1 ; i < 90 ; i ++) {
			double j = calculosFluxoPotFund.calculaOndaTensao();
			scores.add();
		}
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g1 = new GraphPanel(scores);
		panel.add(g1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(582, 211, 323, 105);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSpinner contador3 = new JSpinner();
		contador3.setBounds(213, 34, 43, 20);
		panel_1.add(contador3);
		
		JSpinner contador4 = new JSpinner();
		contador4.setBounds(32, 34, 43, 20);
		panel_1.add(contador4);
		
		JLabel lblCorrente = new JLabel("Amplitude:");
		lblCorrente.setBounds(205, 7, 106, 15);
		panel_1.add(lblCorrente);
		
		JLabel label = new JLabel("Ângulo de fase");
		label.setBounds(10, 7, 106, 15);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(582, 42, 323, 122);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAnguloDaFase = new JLabel("Ângulo de fase");
		lblAnguloDaFase.setBounds(12, 12, 106, 15);
		panel_2.add(lblAnguloDaFase);
		
		JSpinner contador1 = new JSpinner();
		contador1.setBounds(212, 39, 43, 20);
		panel_2.add(contador1);
		
		JSpinner contador2 = new JSpinner();
		contador2.setBounds(22, 39, 43, 20);
		panel_2.add(contador2);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(202, 12, 106, 15);
		panel_2.add(lblAmplitude);
		
		
		

	}
}
