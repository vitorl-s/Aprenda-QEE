package View;




import java.util.ArrayList;
import java.util.List;




import javax.swing.*;

import Controller.ConversaoCorrenteFluxoPot;
import Controller.ConversaoPotenciaInst;
import Controller.ConversaoTensaoFluxoPot;


import java.awt.GridLayout;





public class FluxoPotFund {
	
	private JFrame FluxoPotFund;
	private JTextField tfPotenciaAtiva;
	private JTextField tfPotenciaReativa;
	private JTextField tfPotenciaAparente;
	private JTextField tfFatorPotencia;
	private JSpinner contador1;
	private TrianguloPotencias tp;

	public FluxoPotFund() {
		
		FluxoPotFund = new JFrame();
		FluxoPotFund.setVisible(true);
		FluxoPotFund.setBounds(100, 100, 1280, 670);
		FluxoPotFund.getContentPane().setLayout(null);
		
		contador1 = new JSpinner();
		JSpinner contador2 = new JSpinner();
		
		JLabel lblTenso = new JLabel("Tensão");
		lblTenso.setBounds(12, 16, 52, 15);
		FluxoPotFund.getContentPane().add(lblTenso);
		
		JLabel lblCorrente_1 = new JLabel("Corrente");
		lblCorrente_1.setBounds(12, 167, 63, 15);
		FluxoPotFund.getContentPane().add(lblCorrente_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 154, 1253, 2);
		FluxoPotFund.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(13, 37, 617, 106);
		FluxoPotFund.getContentPane().add(panel);
		
		List<Double> scores = new ArrayList<>();
		
		
		
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g1 = new GraphPanel(scores);
		panel.add(g1);
		g1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(12, 193, 618, 106);
		FluxoPotFund.getContentPane().add(panel2);
		
		List<Double> scores2 = new ArrayList<>();
		panel2.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g2 = new GraphPanel(scores2);
		panel2.add(g2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(12, 349, 618, 106);
		FluxoPotFund.getContentPane().add(panel3);
		
		List<Double> scores3 = new ArrayList<>();
		panel3.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g3 = new GraphPanel(scores3);
		panel3.add(g3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(931, 167, 323, 133);
		FluxoPotFund.getContentPane().add(panel_1);
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
		
		JButton btnGerarCorrente = new JButton("Gerar corrente");
		btnGerarCorrente.setBounds(112, 89, 144, 23);
		panel_1.add(btnGerarCorrente);
		btnGerarCorrente.addActionListener(new ConversaoCorrenteFluxoPot(g2,scores2,contador3,contador4));
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(931, 16, 323, 127);
		FluxoPotFund.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAnguloDaFase = new JLabel("Ângulo de fase");
		lblAnguloDaFase.setBounds(12, 12, 106, 15);
		panel_2.add(lblAnguloDaFase);
		
		
		contador1.setBounds(212, 39, 43, 20);
		panel_2.add(contador1);
		
		
		contador2.setBounds(22, 39, 43, 20);
		panel_2.add(contador2);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(202, 12, 106, 15);
		panel_2.add(lblAmplitude);
		
		JButton btnGerarTensão = new JButton("Gerar onda de tensão");
		btnGerarTensão.setBounds(104, 92, 159, 23);
		panel_2.add(btnGerarTensão);
		btnGerarTensão.addActionListener(new ConversaoTensaoFluxoPot(g1,scores,contador1,contador2));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 310, 1242, 2);
		FluxoPotFund.getContentPane().add(separator_1);
		
		JLabel lblPotnciaInstantnea = new JLabel("Potência Instantânea");
		lblPotnciaInstantnea.setBounds(12, 323, 153, 15);
		FluxoPotFund.getContentPane().add(lblPotnciaInstantnea);
		
		JLabel lblPotenciaAtiva = new JLabel("Potência Ativa");
		lblPotenciaAtiva.setBounds(12, 466, 101, 15);
		FluxoPotFund.getContentPane().add(lblPotenciaAtiva);
		
		tfPotenciaAtiva = new JTextField();
		tfPotenciaAtiva.setEditable(false);
		tfPotenciaAtiva.setBounds(12, 492, 117, 25);
		FluxoPotFund.getContentPane().add(tfPotenciaAtiva);
		tfPotenciaAtiva.setColumns(10);
		
		tfPotenciaReativa = new JTextField();
		tfPotenciaReativa.setEditable(false);
		tfPotenciaReativa.setColumns(10);
		tfPotenciaReativa.setBounds(165, 492, 117, 25);
		FluxoPotFund.getContentPane().add(tfPotenciaReativa);
		
		JLabel lblPotenciaReativa = new JLabel("Potencia Reativa");
		lblPotenciaReativa.setBounds(165, 466, 119, 15);
		FluxoPotFund.getContentPane().add(lblPotenciaReativa);
		
		JLabel lblPotenciaAparente = new JLabel("Potência Aparente");
		lblPotenciaAparente.setBounds(12, 528, 132, 15);
		FluxoPotFund.getContentPane().add(lblPotenciaAparente);
		
		tfPotenciaAparente = new JTextField();
		tfPotenciaAparente.setEditable(false);
		tfPotenciaAparente.setColumns(10);
		tfPotenciaAparente.setBounds(12, 554, 117, 25);
		FluxoPotFund.getContentPane().add(tfPotenciaAparente);
		
		JLabel lblFatorDePotncia = new JLabel("Fator de Potência");
		lblFatorDePotncia.setBounds(165, 528, 132, 15);
		FluxoPotFund.getContentPane().add(lblFatorDePotncia);
		
		tfFatorPotencia = new JTextField();
		tfFatorPotencia.setEditable(false);
		tfFatorPotencia.setColumns(10);
		tfFatorPotencia.setBounds(165, 554, 117, 25);
		FluxoPotFund.getContentPane().add(tfFatorPotencia);
		
		JButton btnGerarPotenciaInstantanea = new JButton("Gerar Potencia Instantanea");
		btnGerarPotenciaInstantanea.addActionListener(new ConversaoPotenciaInst(FluxoPotFund,g3,scores3,tfPotenciaAtiva,tfPotenciaReativa,tfPotenciaAparente,tfFatorPotencia,tp));
		btnGerarPotenciaInstantanea.setBounds(437, 493, 198, 23);
		FluxoPotFund.getContentPane().add(btnGerarPotenciaInstantanea);
	
		JButton btnVoltarParaO = new JButton("Voltar para o Menu Principal");
		btnVoltarParaO.setBounds(437, 554, 215, 24);
		FluxoPotFund.getContentPane().add(btnVoltarParaO);

     
}
	}
