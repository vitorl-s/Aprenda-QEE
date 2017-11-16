package view;


import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;



import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import controller.ConversaoCompFundamental;
import controller.ConversaoHarmonicosDistHarm;
import controller.ConversaoNumeroHarmonicos;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class DistorcaoHarmonica extends JFrame {

	
	private static final long serialVersionUID = 1L;

	
	public DistorcaoHarmonica() {
		setBounds(100, 100, 1240, 690);
		getContentPane().setLayout(null);
		
		JPanel painelGraficoTensao = new JPanel();
		painelGraficoTensao.setBounds(13, 28, 514, 87);
		getContentPane().add(painelGraficoTensao);
		
		List<Double> scores = new ArrayList<>();
		painelGraficoTensao.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g1 = new GraphPanel(scores);
		painelGraficoTensao.add(g1);
		
		JPanel panel = new JPanel();
		panel.setBounds(301, 139, 201, 380);
		getContentPane().add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(13, 152, 201, 97);
		getContentPane().add(panel2);
		panel2.setVisible(false);
		
		List<Double> scores2 = new ArrayList<>();
				
		panel2.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g2 = new GraphPanel(scores2);
		panel2.add(g2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(13, 260, 201, 97);
		getContentPane().add(panel3);
		panel3.setVisible(false);
		
		List<Double> scores3 = new ArrayList<>();
		
		panel3.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g3 = new GraphPanel(scores3);
		panel3.add(g3);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(13, 378, 201, 97);
		getContentPane().add(panel4);
		panel4.setVisible(false);
		
		List<Double> scores4 = new ArrayList<>();
		
		panel4.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g4 = new GraphPanel(scores4);
		panel4.add(g4);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(505, 152, 201, 97);
		getContentPane().add(panel5);
		panel5.setVisible(false);
		
		List<Double> scores5 = new ArrayList<>();
		
		panel5.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g5 = new GraphPanel(scores5);
		panel5.add(g5);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(505, 260, 201, 97);
		getContentPane().add(panel6);
		panel6.setVisible(false);
		
		List<Double> scores6 = new ArrayList<>();
		
		panel6.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g6 = new GraphPanel(scores6);
		panel6.add(g6);
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(505, 378, 201, 97);
		getContentPane().add(panel7);
		panel7.setVisible(false);
		
		List<Double> scores7 = new ArrayList<>();
		
		panel7.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g7 = new GraphPanel(scores7);
		panel7.add(g7);
		
		JPanel panel8 = new JPanel();
		panel8.setBounds(13, 539, 514, 97);
		getContentPane().add(panel8);
		
		List<Double> scores8 = new ArrayList<>();
		
		panel8.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g8 = new GraphPanel(scores8);
		panel8.add(g8);
	
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1061, 231, 126, 196);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(793, 139, 201, 380);
		getContentPane().add(panel_1);
		panel_1.setVisible(false);
		
		
		JLabel lblSelecioneAOrdem = new JLabel("Harmônicos:");
		lblSelecioneAOrdem.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSelecioneAOrdem.setBounds(10, 11, 85, 14);
		panel_2.add(lblSelecioneAOrdem);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 85, 24);
		panel_2.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pares", "Ímpares"}));
		
		JLabel lblNmeroDeHarmnicos = new JLabel("Número de harmônicos");
		lblNmeroDeHarmnicos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNmeroDeHarmnicos.setBounds(6, 81, 120, 14);
		panel_2.add(lblNmeroDeHarmnicos);
		
		JSpinner numHarmonicos = new JSpinner();
		numHarmonicos.setBounds(10, 106, 35, 24);
		panel_2.add(numHarmonicos);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ConversaoNumeroHarmonicos(panel,panel_1,panel2, panel3, panel4,  panel5, panel6, panel7, comboBox,numHarmonicos));
		btnOk.setBounds(6, 158, 89, 23);
		panel_2.add(btnOk);

		
		JLabel lblOrdemHarmnica = new JLabel("Ordem Harmônica");
		lblOrdemHarmnica.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOrdemHarmnica.setBounds(105, 11, 85, 14);
		panel.add(lblOrdemHarmnica);
		
		JSpinner angulo1 = new JSpinner();
		angulo1.setBounds(10, 36, 39, 24);
		panel.add(angulo1);
		
		JLabel lblngulo = new JLabel("Ângulo de fase");
		lblngulo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblngulo.setBounds(10, 11, 85, 14);
		panel.add(lblngulo);
		
		JSpinner ordem1 = new JSpinner();
		ordem1.setBounds(155, 36, 35, 24);
		panel.add(ordem1);
		
		JLabel label = new JLabel("Ângulo de fase");
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(10, 135, 85, 14);
		panel.add(label);
		
		JSpinner angulo2 = new JSpinner();
		angulo2.setBounds(10, 160, 39, 24);
		panel.add(angulo2);
		
		JLabel label_1 = new JLabel("Ordem Harmônica");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_1.setBounds(105, 135, 96, 14);
		panel.add(label_1);
		
		JSpinner ordem2 = new JSpinner();
		ordem2.setBounds(155, 160, 35, 24);
		panel.add(ordem2);
		
		JLabel label_2 = new JLabel("Ângulo de fase");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setBounds(10, 264, 72, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Ordem Harmônica");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(105, 264, 85, 14);
		panel.add(label_3);
		
		JSpinner angulo3 = new JSpinner();
		angulo3.setBounds(10, 289, 39, 24);
		panel.add(angulo3);
		
		JSpinner ordem3 = new JSpinner();
		ordem3.setBounds(155, 289, 35, 24);
		panel.add(ordem3);
		
		JLabel lblAmplitude = new JLabel("Amplitude");
		lblAmplitude.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAmplitude.setBounds(68, 320, 63, 14);
		panel.add(lblAmplitude);
		
		JLabel label_10 = new JLabel("Amplitude");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_10.setBounds(68, 63, 63, 14);
		panel.add(label_10);
		
		JSpinner amplitude1 = new JSpinner();
		amplitude1.setBounds(73, 83, 39, 24);
		panel.add(amplitude1);
		
		JLabel label_11 = new JLabel("Amplitude");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_11.setBounds(68, 191, 63, 14);
		panel.add(label_11);
		
		JSpinner amplitude2 = new JSpinner();
		amplitude2.setBounds(73, 216, 39, 24);
		panel.add(amplitude2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 201, 116);
		panel.add(scrollPane_1);
		
		JSpinner amplitude3 = new JSpinner();
		amplitude3.setBounds(73, 345, 39, 24);
		panel.add(amplitude3);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 118, 201, 129);
		panel.add(scrollPane_4);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 249, 201, 129);
		panel.add(scrollPane_5);
		
		JLabel lblComponenteFundamental = new JLabel("Componente Fundamental");
		lblComponenteFundamental.setBounds(13, 11, 150, 14);
		getContentPane().add(lblComponenteFundamental);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(13, 126, 1204, 2);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(13, 522, 1201, 2);
		getContentPane().add(separator_1);
		
		JLabel lblHarmnicos = new JLabel("Harmônicos");
		lblHarmnicos.setBounds(13, 128, 86, 14);
		getContentPane().add(lblHarmnicos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 126, 196);
		panel_2.add(scrollPane);
		
		
		
		JLabel label_4 = new JLabel("Ordem Harmônica");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(105, 11, 85, 14);
		panel_1.add(label_4);
		
		JSpinner angulo4 = new JSpinner();
		angulo4.setBounds(10, 36, 39, 24);
		panel_1.add(angulo4);
		
		JLabel label_5 = new JLabel("Ângulo de fase");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_5.setBounds(10, 11, 72, 14);
		panel_1.add(label_5);
		
		JSpinner ordem4 = new JSpinner();
		ordem4.setBounds(155, 36, 35, 24);
		panel_1.add(ordem4);
		
		JLabel label_6 = new JLabel("Ângulo de fase");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_6.setBounds(10, 135, 72, 14);
		panel_1.add(label_6);
		
		JSpinner angulo5 = new JSpinner();
		angulo5.setBounds(10, 160, 39, 24);
		panel_1.add(angulo5);
		
		JLabel label_7 = new JLabel("Ordem Harmônica");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_7.setBounds(105, 135, 85, 14);
		panel_1.add(label_7);
		
		JSpinner ordem5 = new JSpinner();
		ordem5.setBounds(155, 160, 35, 24);
		panel_1.add(ordem5);
		
		JLabel label_8 = new JLabel("Ângulo de fase");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_8.setBounds(10, 264, 72, 14);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Ordem Harmônica");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_9.setBounds(105, 264, 85, 14);
		panel_1.add(label_9);
		
		JSpinner angulo6 = new JSpinner();
		angulo6.setBounds(10, 289, 39, 24);
		panel_1.add(angulo6);
		
		JSpinner ordem6 = new JSpinner();
		ordem6.setBounds(155, 289, 35, 24);
		panel_1.add(ordem6);
		
		JLabel label_12 = new JLabel("Amplitude");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_12.setBounds(68, 320, 63, 14);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("Amplitude");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_13.setBounds(68, 63, 63, 14);
		panel_1.add(label_13);
		
		JSpinner amplitude4 = new JSpinner();
		amplitude4.setBounds(73, 83, 39, 24);
		panel_1.add(amplitude4);
		
		JLabel label_14 = new JLabel("Amplitude");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_14.setBounds(68, 191, 63, 14);
		panel_1.add(label_14);
		
		JSpinner amplitude5 = new JSpinner();
		amplitude5.setBounds(73, 216, 39, 24);
		panel_1.add(amplitude5);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 201, 116);
		panel_1.add(scrollPane_2);
		
		JSpinner amplitude6 = new JSpinner();
		amplitude6.setBounds(73, 345, 39, 24);
		panel_1.add(amplitude6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 118, 201, 129);
		panel_1.add(scrollPane_3);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 249, 201, 129);
		panel_1.add(scrollPane_6);
		
		JLabel lblResultante = new JLabel("Resultante");
		lblResultante.setBounds(13, 524, 76, 14);
		getContentPane().add(lblResultante);
		
		JButton gerar4 = new JButton("Gerar");
		gerar4.addActionListener(new ConversaoHarmonicosDistHarm(g5,scores5,ordem4,angulo4,amplitude4));
		gerar4.setBounds(716, 166, 67, 23);
		getContentPane().add(gerar4);
		
		JButton gerar5 = new JButton("Gerar");
		gerar5.addActionListener(new ConversaoHarmonicosDistHarm(g6,scores6,ordem5,angulo5,amplitude5));
		gerar5.setBounds(716, 275, 67, 23);
		getContentPane().add(gerar5);
		
		JButton gerar6 = new JButton("Gerar");
		gerar6.addActionListener(new ConversaoHarmonicosDistHarm(g7,scores7,ordem6,angulo6,amplitude6));
		gerar6.setBounds(716, 393, 67, 23);
		getContentPane().add(gerar6);
		
		JButton gerar1 = new JButton("Gerar");
		gerar1.addActionListener(new ConversaoHarmonicosDistHarm(g2,scores2,ordem1,angulo1,amplitude1));
		gerar1.setBounds(224, 166, 67, 23);
		getContentPane().add(gerar1);
		
		JButton gerar2 = new JButton("Gerar");
		gerar2.addActionListener(new ConversaoHarmonicosDistHarm(g3,scores3,ordem2,angulo2,amplitude2));
		gerar2.setBounds(224, 275, 67, 23);
		getContentPane().add(gerar2);
		
		JButton gerar3 = new JButton("Gerar");
		gerar3.addActionListener(new ConversaoHarmonicosDistHarm(g4,scores4,ordem3,angulo3,amplitude3));
		gerar3.setBounds(224, 393, 67, 23);
		getContentPane().add(gerar3);
		
		JButton button_5 = new JButton("Ampliar");
		button_5.setBounds(716, 200, 67, 23);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Ampliar");
		button_6.setBounds(716, 309, 67, 23);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("Ampliar");
		button_7.setBounds(716, 427, 67, 23);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("Ampliar");
		button_8.setBounds(224, 427, 67, 23);
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("Ampliar");
		button_9.setBounds(224, 309, 67, 23);
		getContentPane().add(button_9);
		
		JButton button_10 = new JButton("Ampliar");
		button_10.setBounds(224, 200, 67, 23);
		getContentPane().add(button_10);
		
		JSpinner amplitude = new JSpinner();
		amplitude.setBounds(704, 64, 39, 24);
		getContentPane().add(amplitude);
		
		JSpinner anguloFase = new JSpinner();
		anguloFase.setBounds(793, 64, 39, 24);
		getContentPane().add(anguloFase);
		
		JLabel lblAmplitude_1 = new JLabel("Amplitude");
		lblAmplitude_1.setBounds(704, 28, 61, 14);
		getContentPane().add(lblAmplitude_1);
		
		JLabel lblAnguloDeFase = new JLabel("Angulo de Fase");
		lblAnguloDeFase.setBounds(793, 28, 96, 14);
		getContentPane().add(lblAnguloDeFase);
		
		JButton btnGerarOnda = new JButton("Gerar onda ");
		btnGerarOnda.addActionListener(new ConversaoCompFundamental(g1,scores, amplitude, anguloFase));
		btnGerarOnda.setBounds(970, 65, 126, 23);
		getContentPane().add(btnGerarOnda);
			
	
	}
}
