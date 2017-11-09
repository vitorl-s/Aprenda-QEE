package View;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JPanel;

public class FluxoPotHarmonico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public FluxoPotHarmonico() {
		setTitle("Simulacao Fluxo Potencia Harmonico");
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
		
		JPanel panel = new JPanel();
		panel.setBounds(620, 25, 268, 116);
		getContentPane().add(panel);
		
		JLabel lblnguloDeFase = new JLabel("Ângulo de fase");
		panel.add(lblnguloDeFase);
		
		JLabel lblAmplitude = new JLabel("Amplitude");
		panel.add(lblAmplitude);
		
		JSpinner spinner_4 = new JSpinner();
		panel.add(spinner_4);
		
		JSpinner spinner_3 = new JSpinner();
		panel.add(spinner_3);
		
		JPanel painelGraficoTensao = new JPanel();
		painelGraficoTensao.setBounds(13, 17, 460, 210);
		getContentPane().add(painelGraficoTensao);
		
		List<Double> scores = new ArrayList<>();
		for(double i = 1 ; i < 90 ; i ++) {
			scores.add(15*Math.cos(Math.toDegrees(8*i)+Math.toDegrees(45)));
		}
		painelGraficoTensao.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g1 = new GraphPanel(scores);
		painelGraficoTensao.add(g1);

	}
}
