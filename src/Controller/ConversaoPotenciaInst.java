package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Model.CalculosFluxoPotFund;
import View.GraphPanel;
import View.TrianguloPotencias;
import View.FluxoPotFund;

public class ConversaoPotenciaInst implements ActionListener{

	
	GraphPanel grafico;
	List<Double> scores;
	JTextField potenciaAtiva,potenciaReativa,potenciaAparente,fatorPot;
	CalculosFluxoPotFund calculos;
	TrianguloPotencias triangulo;
	FluxoPotFund tela;
	JFrame FluxoPotFund;
	
	
	public ConversaoPotenciaInst(JFrame FluxoPotFund,GraphPanel grafico, List<Double> scores, JTextField potenciaAtiva,
			JTextField potenciaReativa, JTextField potenciaAparente, JTextField fatorPot , TrianguloPotencias triangulo) {
		super();
		this.FluxoPotFund = FluxoPotFund;
		this.grafico = grafico;
		this.scores = scores;
		this.potenciaAtiva = potenciaAtiva;
		this.potenciaReativa = potenciaReativa;
		this.potenciaAparente = potenciaAparente;
		this.fatorPot = fatorPot;
		this.triangulo = triangulo;
		calculos = new CalculosFluxoPotFund();
	}

	
	
	public void actionPerformed(ActionEvent arg0) {
		
		double tensao = CalculosFluxoPotFund.amplitudeTensao;
		double corrente = CalculosFluxoPotFund.amplitudeCorrente;
		double angulo = CalculosFluxoPotFund.angulo;
		double angulo2 = CalculosFluxoPotFund.angulo2;
		double fatorPotencia = calculos.CalculaFatorPot(angulo, angulo2);
		fatorPotencia = Double.valueOf(String.format(Locale.US,"%.2f",fatorPotencia));
		
		grafico.revalidate();
		scores.clear();
		for(double i = 0 ; i<180 ; i++){
			scores.add(calculos.CalculaPotInst(tensao, i, angulo, corrente, angulo2));
			grafico.setScores(scores);
		}
		
		potenciaAtiva.setText(String.valueOf(calculos.CalculaPotAtiv(tensao, angulo, corrente, angulo2)) + " W");
		potenciaReativa.setText(String.valueOf(calculos.CalculaPotReat(tensao, angulo, corrente, angulo2)) + " VAR");
		potenciaAparente.setText(String.valueOf(calculos.CalculaPotAparente(tensao, corrente))+ " VA");
		fatorPot.setText(String.valueOf(fatorPotencia ));
		triangulo = new TrianguloPotencias(20,20);
		triangulo.setVisible(true);
		triangulo.setBounds(852, 339, 279, 265);
		FluxoPotFund.add(triangulo);
	}

}
