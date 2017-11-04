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
		setBounds(100, 100, 1280, 720);
		getContentPane().setLayout(null);
		
		JSpinner contador1 = new JSpinner();
		JSpinner contador2 = new JSpinner();
		
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
		panel.setBounds(13, 17, 557, 151);
		getContentPane().add(panel);
		
		List<Double> scores = new ArrayList<>();
		
		for(double i = 1 ; i < 90 ; i++) {
			scores.add(calculosFluxoPotFund.CalculaOndaTensao(12, i , 2.2));
			
		}
		
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g1 = new GraphPanel(scores);
		panel.add(g1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(12, 243, 558, 151);
		getContentPane().add(panel2);
		
		List<Double> scores2 = new ArrayList<>();
		
		for(double i = 1 ; i < 90 ; i ++) {
			scores2.add(calculosFluxoPotFund.CalculaOndaTensao(12, i , 2.2));
			
		}
		
		panel2.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g2 = new GraphPanel(scores2);
		panel2.add(g2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(12, 443, 558, 151);
		getContentPane().add(panel3);
		
		List<Double> scores3 = new ArrayList<>();
		
		for(double i = 1 ; i < 90 ; i ++) {
			scores3.add(calculosFluxoPotFund.CalculaOndaTensao(12, i , 2.2));
			
		}
		
		panel3.setLayout(new GridLayout(0, 1, 0, 0));
		
		GraphPanel g3 = new GraphPanel(scores2);
		panel3.add(g3);
		
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
		panel_2.setBounds(582, 42, 323, 105);
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
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("oi");
			}
		});
		btnOk.setBounds(651, 157, 117, 25);
		getContentPane().add(btnOk);
		
		JButton button = new JButton("Ok");
		button.setBounds(651, 328, 117, 25);
		getContentPane().add(button);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 399, 1400, 2);
		getContentPane().add(separator_1);
		
		JLabel lblPotnciaInstantnea = new JLabel("Potência Instantânea");
		lblPotnciaInstantnea.setBounds(12, 406, 153, 15);
		getContentPane().add(lblPotnciaInstantnea);
		
		JLabel lblPotenciaAtiva = new JLabel("Potência Ativa");
		lblPotenciaAtiva.setBounds(22, 592, 101, 15);
		getContentPane().add(lblPotenciaAtiva);
		
		tfPotenciaAtiva = new JTextField();
		tfPotenciaAtiva.setBounds(12, 612, 117, 25);
		getContentPane().add(tfPotenciaAtiva);
		tfPotenciaAtiva.setColumns(10);
		
		tfPotenciaReativa = new JTextField();
		tfPotenciaReativa.setColumns(10);
		tfPotenciaReativa.setBounds(168, 612, 117, 25);
		getContentPane().add(tfPotenciaReativa);
		
		JLabel lblPotenciaReativa = new JLabel("Potencia Reativa");
		lblPotenciaReativa.setBounds(171, 592, 119, 15);
		getContentPane().add(lblPotenciaReativa);
		
		JLabel lblPotenciaAparente = new JLabel("Potência Aparente");
		lblPotenciaAparente.setBounds(6, 649, 132, 15);
		getContentPane().add(lblPotenciaAparente);
		
		tfPotenciaAparente = new JTextField();
		tfPotenciaAparente.setColumns(10);
		tfPotenciaAparente.setBounds(12, 676, 117, 25);
		getContentPane().add(tfPotenciaAparente);
		
		JLabel lblFatorDePotncia = new JLabel("Fator de Potência");
		lblFatorDePotncia.setBounds(168, 649, 132, 15);
		getContentPane().add(lblFatorDePotncia);
		
		tfFatorPotencia = new JTextField();
		tfFatorPotencia.setColumns(10);
		tfFatorPotencia.setBounds(168, 679, 117, 25);
		getContentPane().add(tfFatorPotencia);
		
		
		

	}
}
