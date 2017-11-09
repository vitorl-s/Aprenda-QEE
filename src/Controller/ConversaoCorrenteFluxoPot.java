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
		double aux = Double.parseDouble(corrente.getValue().toString());
		calculos.setAmplitudeTensao(aux);
		double aux2 = Double.parseDouble(anguloCorrente.getValue().toString());
		calculos.setAngulo(aux2);
			
		grafico.revalidate();
		scores.clear();
		for(int i = 0 ; i<180 ; i++){
			scores.add(calculos.CalculaOndaCorrente(aux, i, aux2));
			grafico.setScores(scores);
		}	
	}
}
