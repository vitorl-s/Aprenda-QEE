package View;




import java.util.ArrayList;
import java.util.List;




import javax.swing.*;

import Controller.ConversaoCorrenteFluxoPot;
import Controller.ConversaoTensaoFluxoPot;
import Controller.VoltaMenuPrincipal;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class FluxoPotFund extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField tfPotenciaAtiva;
	private JTextField tfPotenciaReativa;
	private JTextField tfPotenciaAparente;
	private JTextField tfFatorPotencia;
	private JSpinner contador1;

	public FluxoPotFund() {
		setBounds(100, 100, 1280, 768);
		getContentPane().setLayout(null);
		
		contador1 = new JSpinner();
		JSpinner contador2 = new JSpinner();
		
		JLabel lblTenso = new JLabel("Tensão");
		lblTenso.setBounds(12, 16, 52, 15);
		getContentPane().add(lblTenso);
		
		JLabel lblCorrente_1 = new JLabel("Corrente");
		lblCorrente_1.setBounds(12, 188, 63, 15);
		getContentPane().add(lblCorrente_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 175, 1242, 2);
		getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(13, 11, 617, 153);
		getContentPane().add(panel);
		
		List<Double> scores = new ArrayList<>();
		
		
		
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g1 = new GraphPanel(scores);
		panel.add(g1);
		g1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(12, 200, 618, 176);
		getContentPane().add(panel2);
		
		List<Double> scores2 = new ArrayList<>();
		
		
		panel2.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g2 = new GraphPanel(scores2);
		panel2.add(g2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(12, 403, 618, 176);
		getContentPane().add(panel3);
		
		List<Double> scores3 = new ArrayList<>();
		
		panel3.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g3 = new GraphPanel(scores2);
		panel3.add(g3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(931, 213, 323, 153);
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
		
		JButton btnGerarCorrente = new JButton("Gerar corrente");
		btnGerarCorrente.setBounds(112, 117, 144, 23);
		panel_1.add(btnGerarCorrente);
		btnGerarCorrente.addActionListener(new ConversaoCorrenteFluxoPot(g2,scores2,contador3,contador4));
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(931, 36, 323, 127);
		getContentPane().add(panel_2);
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
		separator_1.setBounds(12, 377, 1242, 2);
		getContentPane().add(separator_1);
		
		JLabel lblPotnciaInstantnea = new JLabel("Potência Instantânea");
		lblPotnciaInstantnea.setBounds(12, 387, 153, 15);
		getContentPane().add(lblPotnciaInstantnea);
		
		JLabel lblPotenciaAtiva = new JLabel("Potência Ativa");
		lblPotenciaAtiva.setBounds(12, 590, 101, 15);
		getContentPane().add(lblPotenciaAtiva);
		
		tfPotenciaAtiva = new JTextField();
		tfPotenciaAtiva.setBounds(12, 616, 117, 25);
		getContentPane().add(tfPotenciaAtiva);
		tfPotenciaAtiva.setColumns(10);
		
		tfPotenciaReativa = new JTextField();
		tfPotenciaReativa.setColumns(10);
		tfPotenciaReativa.setBounds(169, 616, 117, 25);
		getContentPane().add(tfPotenciaReativa);
		
		JLabel lblPotenciaReativa = new JLabel("Potencia Reativa");
		lblPotenciaReativa.setBounds(169, 590, 119, 15);
		getContentPane().add(lblPotenciaReativa);
		
		JLabel lblPotenciaAparente = new JLabel("Potência Aparente");
		lblPotenciaAparente.setBounds(12, 652, 132, 15);
		getContentPane().add(lblPotenciaAparente);
		
		tfPotenciaAparente = new JTextField();
		tfPotenciaAparente.setColumns(10);
		tfPotenciaAparente.setBounds(12, 679, 117, 25);
		getContentPane().add(tfPotenciaAparente);
		
		JLabel lblFatorDePotncia = new JLabel("Fator de Potência");
		lblFatorDePotncia.setBounds(169, 652, 132, 15);
		getContentPane().add(lblFatorDePotncia);
		
		tfFatorPotencia = new JTextField();
		tfFatorPotencia.setColumns(10);
		tfFatorPotencia.setBounds(169, 679, 117, 25);
		getContentPane().add(tfFatorPotencia);
		
		JButton btnGerarPotenciaInstantanea = new JButton("Gerar Potencia Instantanea");
		btnGerarPotenciaInstantanea.setBounds(991, 440, 198, 23);
		getContentPane().add(btnGerarPotenciaInstantanea);	
		
		JButton btnVoltarParaO = new JButton("Voltar para o Menu Principal");
		btnVoltarParaO.setBounds(415, 680, 215, 24);
		getContentPane().add(btnVoltarParaO);
		
}
	}
