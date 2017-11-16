package model;

import java.util.List;

public class CalculosDistHarm implements Calculos {

	double frequenciaAngular = 120*Math.PI;
	public static double amplitude;
	public static double ordemHarmonica;
	public static double anguloFase;
	public int numeroHarmonicos = 0;
	
	// angulo = angulo onda fundamental
	// angulo2 = angulo onda harmonica 
	
	
	

	public void setNumeroHarmonicos(int numeroHarmonicos) {
		this.numeroHarmonicos = numeroHarmonicos;
	}

	public double CalculaOndaAmplitudeTensao(double tensao, double i, double angulo) {
		return tensao * Math.cos(Math.toRadians((frequenciaAngular * i) + angulo));
	}
	
	public double CalculaOndaHarmonica(double amplitude, double ordemHarmonica, double i ,double angulo2) {
		return amplitude * Math.cos(Math.toRadians((ordemHarmonica*frequenciaAngular * i) + angulo2));
	}

}
