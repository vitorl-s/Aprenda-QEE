package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
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
		try{
			
			if(calculosFluxoPotFund.amplitudeTensao < 0 || calculosFluxoPotFund.amplitudeTensao > 220){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
			else if(calculosFluxoPotFund.angulo <-180 || calculosFluxoPotFund.angulo > 180){
				RuntimeException e2 = new RuntimeException();
				throw e2;
			}else{
					double aux = calculosFluxoPotFund.amplitudeTensao;
					double aux2 = calculosFluxoPotFund.angulo;
					grafico.revalidate();
					scores.clear();
					for(int i = 0 ; i<180 ; i++){
						scores.add(calculos.CalculaOndaAmplitudeTensao(aux, i, aux2));
						grafico.setScores(scores);
					}
				}
			}catch(IllegalArgumentException e1){	
				JOptionPane.showMessageDialog(null, "A amplitude da tensão deve ficar entre 0 e 220");
		} catch(RuntimeException e2){
			JOptionPane.showMessageDialog(null, "O ângulo da tensão deve ficar entre -180 e 180 graus");
		}
		
	}
}
