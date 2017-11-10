package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
		
		double aux = calculosFluxoPotFund.amplitudeCorrente;
		double aux2 = calculosFluxoPotFund.angulo2;
		
		grafico.revalidate();
		scores.clear();
		for(int i = 0 ; i<180 ; i++){
			scores.add(calculos.CalculaOndaCorrente(aux, i, aux2));
			grafico.setScores(scores);
		}	
	}
}
