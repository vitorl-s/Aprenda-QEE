package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;

import model.CalculosFluxoPotFund;
import view.GraphPanel;

public class ConversaoCorrenteFluxoPot implements ActionListener{
	
	GraphPanel grafico;
	List<Double> scores;
	JSpinner corrente,anguloCorrente;
	CalculosFluxoPotFund calculos;
	
	
	public ConversaoCorrenteFluxoPot(GraphPanel grafico, List<Double> scores, JSpinner corrente, JSpinner anguloCorrente) {
		super();
		this.grafico = grafico;
		this.scores = scores;
		this.corrente = corrente;
		this.anguloCorrente = anguloCorrente;
		calculos = new CalculosFluxoPotFund();
	}
	
	

	public void actionPerformed(ActionEvent e) {
		double amplitudeCorrente = Double.parseDouble(corrente.getValue().toString());
		double angulo2 = Double.parseDouble(anguloCorrente.getValue().toString());
		
		CalculosFluxoPotFund.amplitudeCorrente = amplitudeCorrente;
		CalculosFluxoPotFund.angulo2 = angulo2;
		
		try{
			
			if(amplitudeCorrente < 0 || amplitudeCorrente > 100){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
			else if(angulo2 <-180 || angulo2 > 180){
				RuntimeException e2 = new RuntimeException();
				throw e2;
			}else{
					grafico.revalidate();
					scores.clear();
					for(int i = 0 ; i<180 ; i++){
						scores.add(calculos.CalculaOndaCorrente(amplitudeCorrente, i, angulo2));
						grafico.setScores(scores);
					}
				}
			}catch(IllegalArgumentException e1){	
				JOptionPane.showMessageDialog(null, "A amplitude da corrente deve ficar entre 0 e 100");
		} catch(RuntimeException e2){
			JOptionPane.showMessageDialog(null, "O ângulo da corrente deve ficar entre -180 e 180 graus");
		}
		
	}
}