package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.CalculosDistHarm;

public class ConversaoNumeroHarmonicos implements ActionListener {

	JPanel g1,g2,g3,g4,g5,g6,menuEsquerda,menuDireita;
	JComboBox paridade;
	JSpinner numeroHarmonicos;
	CalculosDistHarm calculos;
	
	public ConversaoNumeroHarmonicos(JPanel menuEsquerda , JPanel menuDireita,JPanel g1, JPanel g2, JPanel g3, JPanel g4, 
			JPanel g5, JPanel g6, JComboBox paridade, JSpinner numeroHarmonicos) {
		super();
		this.menuEsquerda = menuEsquerda;
		this.menuDireita = menuDireita;
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
		this.g4 = g4;
		this.g5 = g5;
		this.g6 = g6;
		this.paridade = paridade;
		this.numeroHarmonicos = numeroHarmonicos;
	}

	public void actionPerformed(ActionEvent e) {
		
		int numHarm = Integer.parseInt(numeroHarmonicos.getValue().toString());
		
		try{
		
			if(numHarm == 1){
				g1.setVisible(true);
			} else if (numHarm == 2){
				g1.setVisible(true);
				g2.setVisible(true);
			} else if(numHarm == 3){
				g1.setVisible(true);
				g2.setVisible(true);
				g3.setVisible(true);
			} else if(numHarm == 4){
				g1.setVisible(true);
				g2.setVisible(true);
				g3.setVisible(true);
				g4.setVisible(true);
			} else if(numHarm == 5){
				g1.setVisible(true);
				g2.setVisible(true);
				g3.setVisible(true);
				g4.setVisible(true);
				g5.setVisible(true);
			} else if (numHarm == 6){
				g1.setVisible(true);
				g2.setVisible(true);
				g3.setVisible(true);
				g4.setVisible(true);
				g5.setVisible(true);
				g6.setVisible(true);
			} else if (numHarm >= 7 || numHarm < 0){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			} if (numHarm <= 3)
				menuEsquerda.setVisible(true);
			  else if(numHarm > 3){
				menuEsquerda.setVisible(true);
				menuDireita.setVisible(true);
			  }
		} catch(IllegalArgumentException e1) {
			JOptionPane.showMessageDialog(null, "O Número de Harmônicos deve estar entre 0 e 6");
			}
	}
}
