package Model;

import java.lang.Math;

public class CalculosFluxoPotFund implements Calculos {

	
	private static double frequenciaAngular = 120 *Math.PI;
	public static double amplitudeTensao;
	public static double angulo;
	public static double amplitudeCorrente;
	public static double angulo2;
	public static double coordX,coordY;
	 
	
	// angulo = ângulo da tensão
	// angulo2 = ângulo da corrente
	
	
	
	public static double getFrequenciaAngular() {
		return frequenciaAngular;
	}
	public void setFrequenciaAngular(double frequenciaAngular) {
		CalculosFluxoPotFund.frequenciaAngular = frequenciaAngular;
	}
	
	
		
	public double CalculaOndaAmplitudeTensao(double tensao, double i, double angulo) {
		return tensao * Math.cos(Math.toRadians((getFrequenciaAngular() * i) + angulo));
	}
	
	public double CalculaOndaCorrente(double amplitudeCorrente, double i, double angulo2){
		return amplitudeCorrente * Math.cos(Math.toRadians(getFrequenciaAngular()*i)+ angulo2);
	}
	
	public double CalculaPotInst(double amplitudeTensao, double i, double angulo,double corrente,double angulo2){
		return CalculaOndaAmplitudeTensao(amplitudeTensao,i, angulo) *  CalculaOndaCorrente(corrente,i,angulo2) ;
	}
	
	public double CalculaPotAtiv(double amplitudeTensao, double angulo , double amplitudeCorrente, double angulo2){	
		return Math.round(amplitudeTensao*amplitudeCorrente*Math.cos(Math.toRadians(angulo -angulo2)));
	}
	
	public double CalculaPotReat(double amplitudeTensao, double angulo ,double amplitudeCorrente,double angulo2){
		return Math.round(amplitudeTensao*amplitudeCorrente*Math.sin(Math.toRadians(angulo - angulo2)));
	}
	
	public double CalculaPotAparente(double amplitudeTensao, double amplitudeCorrente){
		return Math.round(amplitudeTensao*amplitudeCorrente);
	}
	
	public double CalculaFatorPot(double angulo, double angulo2){
		if(angulo == angulo2){
			return 1;
		}
		return Math.cos(Math.toRadians(angulo-angulo2));
	}

	public double CalculaOndaHarmonica(double amplitudeTensao, int ordemHarmonica, double angulo) {
		return 0;
	}
	
	public double CalculaOndaDistorcida(int numeroHarmonicos) {
		return 0;
	}
	
}