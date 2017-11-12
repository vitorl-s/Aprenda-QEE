package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;

import org.w3c.dom.ranges.RangeException;

import Model.CalculosDistHarm;
import View.GraphPanel;

public class ConversaoHarmonicosDistHarm implements ActionListener{

	GraphPanel grafico;
	List<Double> scores;
	JSpinner amplitude,ordemHarmonica,anguloFase;
	CalculosDistHarm calculos;
	
	public ConversaoHarmonicosDistHarm(GraphPanel grafico, List<Double> scores, JSpinner ordemHarmonica,
			JSpinner anguloFase,JSpinner amplitude) {
		super();
		this.grafico = grafico;
		this.scores = scores;
		this.ordemHarmonica = ordemHarmonica;
		this.anguloFase = anguloFase;
		this.amplitude = amplitude;
		calculos = new CalculosDistHarm();
	}
	
	
	
	public void actionPerformed(ActionEvent arg0) throws IndexOutOfBoundsException {
		
		
		
		double amplitudeOnda = Double.parseDouble(amplitude.getValue().toString());
		double angulo_fase = Double.parseDouble(anguloFase.getValue().toString());
		double ordem_harmonica = Double.parseDouble(ordemHarmonica.getValue().toString());
		
		try{
			
			if(amplitudeOnda < 0 || amplitudeOnda > 220){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
			else if(angulo_fase <-180 || angulo_fase > 180){
				Exception e2 = new Exception();
				
			}
			else if (ordem_harmonica < 0 || ordem_harmonica > 15){
				Exception e3 = new Exception();
			}
			else{
					grafico.revalidate();
					scores.clear();
					for(int i = 0 ; i<90 ; i++){
						scores.add(calculos.CalculaOndaHarmonica(amplitudeOnda,ordem_harmonica,i,angulo_fase));
						grafico.setScores(scores);
					}
				}
			} catch(IllegalArgumentException e1){	
				JOptionPane.showMessageDialog(null, "A amplitude deve ficar entre 0 e 220");
		} catch(Exception e2){
			JOptionPane.showMessageDialog(null, "O ângulo de Fase deve ficar entre -180 e 180 graus");
		}
		
	}
		
}