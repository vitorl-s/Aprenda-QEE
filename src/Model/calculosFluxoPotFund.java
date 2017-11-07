package Model;

import java.lang.Math;

import javax.swing.JSpinner;

public class calculosFluxoPotFund {

	
	private static double frequenciaAngular = Math.toRadians(2* Math.PI*60);
	
		
	public static double getFrequenciaAngular() {
		return frequenciaAngular;
	}
	public void setFrequenciaAngular(double frequenciaAngular) {
		calculosFluxoPotFund.frequenciaAngular = frequenciaAngular;
	}
		
	public static double CalculaOndaTensao(JSpinner tensao, double t, JSpinner anguloTensao) {
		double Vrms = Double.parseDouble( tensao.getValue().toString());
		double Angulo =   Double.parseDouble (anguloTensao.getValue().toString());
		return Vrms * Math.cos(getFrequenciaAngular()*t+ Angulo*(Math.PI/180));
		
	}
	
	public static double CalculaOndaCorrente(JSpinner corrente, double t, JSpinner anguloCorrente){
		double Irms = Double.parseDouble( corrente.getValue().toString());
		double Angulo =   Double.parseDouble (anguloCorrente.getValue().toString());
		return Irms * Math.cos(getFrequenciaAngular()*t+ Angulo*(Math.PI/180));
	}
	
	public static double CalculaPotInst(JSpinner tensao, double t, JSpinner angulo,JSpinner corrente,JSpinner angulo2){
		return CalculaOndaTensao(tensao,t, angulo) *  CalculaOndaCorrente(corrente,t,angulo2) ;
	}
	
	public static double CalculaPotAtiv(JSpinner tensao, JSpinner anguloTensao ,JSpinner corrente,JSpinner anguloCorrente){
		double Tensao = Double.parseDouble( tensao.getValue().toString());
		double Angulo =   Double.parseDouble (anguloTensao.getValue().toString());
		double Corrente = Double.parseDouble( corrente.getValue().toString());
		double Angulo2 =   Double.parseDouble (anguloCorrente.getValue().toString());
		return Tensao*Corrente*Math.cos(Math.toDegrees(Angulo)- Math.toDegrees(Angulo2));
	}
	
	public static double CalculaPotReat(JSpinner tensao, JSpinner anguloTensao ,JSpinner corrente,JSpinner anguloCorrente){
		double Tensao = Double.parseDouble( tensao.getValue().toString());
		double Angulo =   Double.parseDouble (anguloTensao.getValue().toString());
		double Corrente = Double.parseDouble( corrente.getValue().toString());
		double Angulo2 =   Double.parseDouble (anguloCorrente.getValue().toString());
		return Tensao*Corrente*Math.sin(Math.toDegrees(Angulo)- Math.toDegrees(Angulo2));
	}
	
	public static double CalculaPotAparente(JSpinner tensao, JSpinner corrente){
		double Tensao = Double.parseDouble( tensao.getValue().toString());
		double Corrente = Double.parseDouble( corrente.getValue().toString());
		return Tensao*Corrente;
	}
	
}
