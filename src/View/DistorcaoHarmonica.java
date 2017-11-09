package view;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;



import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.calculosFluxoPotFund;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class DistorcaoHarmonica extends JFrame {

	
	private static final long serialVersionUID = 1L;

	
	public DistorcaoHarmonica() {
		setBounds(100, 100, 1200, 800);
		getContentPane().setLayout(null);
		
		JPanel painelGraficoTensao = new JPanel();
		painelGraficoTensao.setBounds(13, 39, 558, 165);
		getContentPane().add(painelGraficoTensao);
		
		List<Double> scores = new ArrayList<>();
		for(double i = 1 ; i < 90 ; i ++) {
			scores.add(15*Math.cos(Math.toDegrees(8*i)+Math.toDegrees(45)));
		}
		painelGraficoTensao.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g1 = new GraphPanel(scores);
		painelGraficoTensao.add(g1);
		
		JPanel panel = new JPanel();
		panel.setBounds(722, 304, 273, 224);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(13, 255, 558, 150);
		getContentPane().add(panel2);
		
		List<Double> scores2 = new ArrayList<>();
		
		for(double i = 1 ; i < 90 ; i ++) {
			scores2.add(i);
			
		}
		
		panel2.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g2 = new GraphPanel(scores2);
		panel2.add(g2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(13, 405, 558, 150);
		getContentPane().add(panel3);
		
		List<Double> scores3 = new ArrayList<>();
		
		for(double i = 1 ; i < 90 ; i ++) {
			scores3.add(i);
			
		}
		
		panel3.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g3 = new GraphPanel(scores2);
		panel3.add(g3);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(13, 585, 558, 176);
		getContentPane().add(panel4);
		
		List<Double> scores4 = new ArrayList<>();
		
		for(double i = 1 ; i < 90 ; i ++) {
			scores4.add(i);
			
		}
		
		panel4.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g4 = new GraphPanel(scores2);
		panel4.add(g4);
		
		JLabel lblOrdemHarmnica = new JLabel("Ordem Harmônica");
		lblOrdemHarmnica.setBounds(145, 11, 85, 14);
		panel.add(lblOrdemHarmnica);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(20, 36, 35, 24);
		panel.add(spinner_1);
		
		JLabel lblngulo = new JLabel("Ângulo de fase");
		lblngulo.setBounds(10, 11, 72, 14);
		panel.add(lblngulo);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(155, 36, 35, 24);
		panel.add(spinner_3);
		
		JLabel label = new JLabel("Ângulo de fase");
		label.setBounds(10, 159, 72, 14);
		panel.add(label);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(20, 184, 35, 24);
		panel.add(spinner_2);
		
		JLabel label_1 = new JLabel("Ordem Harmônica");
		label_1.setBounds(145, 159, 85, 14);
		panel.add(label_1);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(155, 184, 35, 24);
		panel.add(spinner_4);
		
		JLabel lblComponenteFundamental = new JLabel("Componente Fundamental");
		lblComponenteFundamental.setBounds(13, 11, 126, 14);
		getContentPane().add(lblComponenteFundamental);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(13, 215, 1099, 2);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(13, 559, 1099, 2);
		getContentPane().add(separator_1);
		
		JLabel lblHarmnicos = new JLabel("Harmônicos");
		lblHarmnicos.setBounds(13, 230, 55, 14);
		getContentPane().add(lblHarmnicos);
		
		JLabel lblResultante = new JLabel("Resultante");
		lblResultante.setBounds(23, 566, 52, 14);
		getContentPane().add(lblResultante);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(657, 255, 35, 24);
		getContentPane().add(spinner);
		
		JLabel lblNmeroDeHarmnicos = new JLabel("Número de harmônicos");
		lblNmeroDeHarmnicos.setBounds(647, 230, 109, 14);
		getContentPane().add(lblNmeroDeHarmnicos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(941, 255, 85, 24);
		getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pares", "Ímpares"}));
		
		JLabel lblSelecioneAOrdem = new JLabel("Harmônicos:");
		lblSelecioneAOrdem.setBounds(938, 228, 88, 14);
		getContentPane().add(lblSelecioneAOrdem);

	}
}
