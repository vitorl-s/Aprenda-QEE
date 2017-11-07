package View;




import java.util.ArrayList;
import java.util.List;
import Model.calculosFluxoPotFund;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Fluxo_Pot_Fund extends JFrame {
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame frame;
	private JTextField tfPotenciaAtiva;
	private JTextField tfPotenciaReativa;
	private JTextField tfPotenciaAparente;
	private JTextField tfFatorPotencia;
	

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
		setBounds(100, 100, 1280, 800);
		getContentPane().setLayout(null);
		
		JSpinner contador1 = new JSpinner();
		JSpinner contador2 = new JSpinner();
		
		JLabel lblTenso = new JLabel("Tensão");
		lblTenso.setBounds(12, 16, 52, 15);
		getContentPane().add(lblTenso);
		
		JLabel lblCorrente_1 = new JLabel("Corrente");
		lblCorrente_1.setBounds(12, 200, 63, 15);
		getContentPane().add(lblCorrente_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 187, 1242, 2);
		getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(13, 11, 557, 176);
		getContentPane().add(panel);
		
		List<Double> scores = new ArrayList<>();
		
		
		
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g1 = new GraphPanel(scores);
		panel.add(g1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(12, 219, 558, 176);
		getContentPane().add(panel2);
		
		List<Double> scores2 = new ArrayList<>();
		
		
		panel2.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g2 = new GraphPanel(scores2);
		panel2.add(g2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(12, 443, 558, 176);
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
		btnGerarCorrente.setBounds(112, 117, 125, 25);
		panel_1.add(btnGerarCorrente);
		btnGerarCorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				g2.revalidate();
				scores2.clear();
				for(double i = 1 ; i < 90 ; i++) {
					
					scores2.add(calculosFluxoPotFund.CalculaOndaCorrente(contador3, i , contador4));
					g2.setScores(scores2);
				}
			}
		});
		
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
		btnGerarTensão.setBounds(104, 92, 144, 24);
		panel_2.add(btnGerarTensão);
		btnGerarTensão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g1.revalidate();
				scores.clear();
				for(double i = 1 ; i < 90 ; i++) {
					
					scores.add(calculosFluxoPotFund.CalculaOndaTensao(contador1, i , contador2));
					g1.setScores(scores);
				}
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 404, 1242, 2);
		getContentPane().add(separator_1);
		
		JLabel lblPotnciaInstantnea = new JLabel("Potência Instantânea");
		lblPotnciaInstantnea.setBounds(12, 417, 153, 15);
		getContentPane().add(lblPotnciaInstantnea);
		
		JLabel lblPotenciaAtiva = new JLabel("Potência Ativa");
		lblPotenciaAtiva.setBounds(12, 630, 101, 15);
		getContentPane().add(lblPotenciaAtiva);
		
		tfPotenciaAtiva = new JTextField();
		tfPotenciaAtiva.setBounds(12, 648, 117, 25);
		getContentPane().add(tfPotenciaAtiva);
		tfPotenciaAtiva.setColumns(10);
		
		tfPotenciaReativa = new JTextField();
		tfPotenciaReativa.setColumns(10);
		tfPotenciaReativa.setBounds(169, 648, 117, 25);
		getContentPane().add(tfPotenciaReativa);
		
		JLabel lblPotenciaReativa = new JLabel("Potencia Reativa");
		lblPotenciaReativa.setBounds(169, 630, 119, 15);
		getContentPane().add(lblPotenciaReativa);
		
		JLabel lblPotenciaAparente = new JLabel("Potência Aparente");
		lblPotenciaAparente.setBounds(12, 684, 132, 15);
		getContentPane().add(lblPotenciaAparente);
		
		tfPotenciaAparente = new JTextField();
		tfPotenciaAparente.setColumns(10);
		tfPotenciaAparente.setBounds(12, 699, 117, 25);
		getContentPane().add(tfPotenciaAparente);
		
		JLabel lblFatorDePotncia = new JLabel("Fator de Potência");
		lblFatorDePotncia.setBounds(167, 684, 132, 15);
		getContentPane().add(lblFatorDePotncia);
		
		tfFatorPotencia = new JTextField();
		tfFatorPotencia.setColumns(10);
		tfFatorPotencia.setBounds(169, 699, 117, 25);
		getContentPane().add(tfFatorPotencia);
		
		JButton btnGerarPotenciaInstantanea = new JButton("Gerar Potencia Instantanea");
		btnGerarPotenciaInstantanea.setBounds(991, 440, 183, 35);
		getContentPane().add(btnGerarPotenciaInstantanea);	
		btnGerarPotenciaInstantanea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g3.revalidate();
				scores3.clear();
				for(double i = 1 ; i < 90 ; i++) {
					scores3.add((calculosFluxoPotFund.CalculaOndaTensao(contador1, i , contador2) * calculosFluxoPotFund.CalculaOndaCorrente(contador3, i , contador4)) );
					g3.setScores(scores3);
				}
				tfPotenciaAtiva.setText(String.valueOf((calculosFluxoPotFund.CalculaPotAtiv(contador1, contador2 ,contador3,contador4))));
			}
		});
	}
}
