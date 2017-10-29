package View;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.*;


public class Fluxo_Pot_Fund extends JInternalFrame {
	/**
	 * public Cadastro(JFrame telaInicial) throws IOException{
	
	criaPainelCadastros(telaInicial);
}
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Fluxo_Pot_Fund(JInternalFrame simulacao) throws IOException{
		CriaTela(simulacao);
	}

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @return 
	 */
	public void CriaTela(JInternalFrame simulacao) throws IOException{
		setBounds(100, 100, 917, 526);
		getContentPane().setLayout(null);
		
		JLabel lblInformeOsDados = new JLabel("<HTML>Informe os dados<BR>nos campos abaixo </HTML>");
		lblInformeOsDados.setBounds(705, 22, 135, 30);
		getContentPane().add(lblInformeOsDados);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(705, 76, 76, 15);
		getContentPane().add(lblAmplitude);
		
		JLabel lblAnguloDaFase = new JLabel("Ângulo fase de tensão:");
		lblAnguloDaFase.setBounds(705, 137, 165, 15);
		getContentPane().add(lblAnguloDaFase);
		
		JLabel lblCorrente = new JLabel("Corrente:");
		lblCorrente.setBounds(705, 200, 98, 15);
		getContentPane().add(lblCorrente);
		
		JSpinner contador1 = new JSpinner();
		contador1.setBounds(705, 103, 43, 20);
		getContentPane().add(contador1);
		
		JSpinner contador2 = new JSpinner();
		contador2.setBounds(705, 162, 43, 20);
		getContentPane().add(contador2);
		
		JSpinner contador3 = new JSpinner();
		contador3.setBounds(705, 224, 43, 20);
		getContentPane().add(contador3);

	}
}
