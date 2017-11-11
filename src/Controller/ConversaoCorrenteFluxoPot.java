package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;

import Model.calculosFluxoPotFund;
import View.GraphPanel;

public class ConversaoCorrenteFluxoPot implements ActionListener{
	
	GraphPanel grafico;
	List<Double> scores;
	JSpinner corrente,anguloCorrente;
	calculosFluxoPotFund calculos;
	
	
	public ConversaoCorrenteFluxoPot(GraphPanel grafico, List<Double> scores, JSpinner corrente, JSpinner anguloCorrente) {
		super();
		this.grafico = grafico;
		this.scores = scores;
		this.corrente = corrente;
		this.anguloCorrente = anguloCorrente;
		calculos = new calculosFluxoPotFund();
	}
	
	

	public void actionPerformed(ActionEvent e) {
		calculosFluxoPotFund.amplitudeCorrente = Double.parseDouble(corrente.getValue().toString());
		calculosFluxoPotFund.angulo2 = Double.parseDouble(anguloCorrente.getValue().toString());
		
		try{
			
			if(calculosFluxoPotFund.amplitudeCorrente < 0 || calculosFluxoPotFund.amplitudeCorrente > 100){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
			else if(calculosFluxoPotFund.angulo2 <-180 || calculosFluxoPotFund.angulo2 > 180){
				RuntimeException e2 = new RuntimeException();
				throw e2;
			}else{
					double aux = calculosFluxoPotFund.amplitudeCorrente;
					double aux2 = calculosFluxoPotFund.angulo2;
					grafico.revalidate();
					scores.clear();
					for(int i = 0 ; i<180 ; i++){
						scores.add(calculos.CalculaOndaCorrente(aux, i, aux2));
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
