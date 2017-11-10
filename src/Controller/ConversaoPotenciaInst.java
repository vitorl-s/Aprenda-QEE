package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


import javax.swing.JTextField;

import Model.calculosFluxoPotFund;
import View.GraphPanel;

public class ConversaoPotenciaInst implements ActionListener{

	
	GraphPanel grafico;
	List<Double> scores;
	JTextField potenciaAtiva,potenciaReativa,potenciaAparente,fatorPot;
	calculosFluxoPotFund calculos;
	
	public ConversaoPotenciaInst(GraphPanel grafico, List<Double> scores, JTextField potenciaAtiva,
			JTextField potenciaReativa, JTextField potenciaAparente, JTextField fatorPot) {
		super();
		this.grafico = grafico;
		this.scores = scores;
		this.potenciaAtiva = potenciaAtiva;
		this.potenciaReativa = potenciaReativa;
		this.potenciaAparente = potenciaAparente;
		this.fatorPot = fatorPot;
		calculos = new calculosFluxoPotFund();
	}

	
	
	public void actionPerformed(ActionEvent arg0) {
		
		double tensao = calculosFluxoPotFund.amplitudeTensao;
		double corrente = calculosFluxoPotFund.amplitudeCorrente;
		double angulo = calculosFluxoPotFund.angulo;
		double angulo2 = calculosFluxoPotFund.angulo2;
		
		
		for(double i = 0 ; i<180 ; i++){
			scores.add(calculos.CalculaPotInst(tensao, i, angulo, corrente, angulo2));
			grafico.setScores(scores);
		}
		potenciaAtiva.setText(String.valueOf(calculos.CalculaPotAtiv(tensao, angulo, corrente, angulo2)) + " W");
		potenciaReativa.setText(String.valueOf(calculos.CalculaPotReat(tensao, angulo, corrente, angulo2)) + " VAR");
		potenciaAparente.setText(String.valueOf(calculos.CalculaPotAparente(tensao, corrente))+ " VA");
		fatorPot.setText(String.valueOf(calculos.CalculaFatorPot(angulo, angulo2)));
	}

}
