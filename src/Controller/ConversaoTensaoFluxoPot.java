package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JSpinner;


import Model.calculosFluxoPotFund;
import View.GraphPanel;


public class ConversaoTensaoFluxoPot implements ActionListener{
	

	GraphPanel grafico;
	List<Double> scores;
	JSpinner tensao,anguloTensao ,corrente,anguloCorrente;
	calculosFluxoPotFund calculos;
	
	
	public ConversaoTensaoFluxoPot(GraphPanel grafico, List<Double> scores, JSpinner tensao, JSpinner anguloTensao) {
		super();
		this.grafico = grafico;
		this.scores = scores;
		this.tensao = tensao;
		this.anguloTensao = anguloTensao;
		calculos = new calculosFluxoPotFund();
	}
	
	

	public void actionPerformed(ActionEvent e) {
		calculosFluxoPotFund.amplitudeTensao = Double.parseDouble(tensao.getValue().toString());
		calculosFluxoPotFund.angulo = Double.parseDouble(anguloTensao.getValue().toString());
		
		double aux = calculosFluxoPotFund.amplitudeTensao;
		double aux2 = calculosFluxoPotFund.angulo;
			
		grafico.revalidate();
		scores.clear();
		for(int i = 0 ; i<180 ; i++){
			scores.add(calculos.CalculaOndaAmplitudeTensao(aux, i, aux2));
			grafico.setScores(scores);
		}	
	}
}
