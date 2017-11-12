package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;


import Model.CalculosFluxoPotFund;
import View.GraphPanel;


public class ConversaoTensaoFluxoPot implements ActionListener{
	

	GraphPanel grafico;
	List<Double> scores;
	JSpinner tensao,anguloTensao ,corrente,anguloCorrente;
	CalculosFluxoPotFund calculos;
	
	
	public ConversaoTensaoFluxoPot(GraphPanel grafico, List<Double> scores, JSpinner tensao, JSpinner anguloTensao) {
		super();
		this.grafico = grafico;
		this.scores = scores;
		this.tensao = tensao;
		this.anguloTensao = anguloTensao;
		calculos = new CalculosFluxoPotFund();
	}
	
	

	public void actionPerformed(ActionEvent e) {
		
		
		double amplitudeTensao = Double.parseDouble(tensao.getValue().toString());
		double angulo = Double.parseDouble(anguloTensao.getValue().toString());
		
		CalculosFluxoPotFund.amplitudeTensao = amplitudeTensao;
		CalculosFluxoPotFund.angulo = angulo;
		
		try{
			
			if(amplitudeTensao < 0 || amplitudeTensao > 220){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
			else if(angulo <-180 || angulo > 180){
				RuntimeException e2 = new RuntimeException();
				throw e2;
			}else{
					
					grafico.revalidate();
					scores.clear();
					for(int i = 0 ; i<180 ; i++){
						scores.add(calculos.CalculaOndaAmplitudeTensao(amplitudeTensao, i, angulo));
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