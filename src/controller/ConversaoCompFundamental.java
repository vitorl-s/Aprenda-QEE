package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;

import model.CalculosDistHarm;
import view.GraphPanel;

public class ConversaoCompFundamental implements ActionListener {
	
	GraphPanel grafico;
	List<Double> scores;
	JSpinner amplitude,anguloFase;
	CalculosDistHarm calculos;
	
	
	public ConversaoCompFundamental(GraphPanel grafico, List<Double> scores, JSpinner amplitude, JSpinner anguloFase) {
		super();
		this.grafico = grafico;
		this.scores = scores;
		this.amplitude = amplitude;
		this.anguloFase = anguloFase;
		calculos = new CalculosDistHarm();
	}


	public void actionPerformed(ActionEvent arg0) {
		double amplitudeOnda = Double.parseDouble(amplitude.getValue().toString());
		double angulo_fase = Double.parseDouble(anguloFase.getValue().toString());
		
try{
			
			if(amplitudeOnda < 0 || amplitudeOnda > 220){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
			else if(angulo_fase <-180 || angulo_fase > 180){
				RuntimeException e2 = new RuntimeException();
				throw e2;
				
			}
			else{
					grafico.revalidate();
					scores.clear();
					for(int i = 0 ; i<180 ; i++){
						scores.add(calculos.CalculaOndaAmplitudeTensao(amplitudeOnda, i, angulo_fase));
						grafico.setScores(scores);
					}
				}
			} catch(IllegalArgumentException e1){	
				JOptionPane.showMessageDialog(null, "A Amplitude deve ficar entre 0 e 220");
			} catch(RuntimeException e2){
				JOptionPane.showMessageDialog(null, "O Ângulo de fase deve ficar entre -180 e 180");
			}
		
	}
	
}
