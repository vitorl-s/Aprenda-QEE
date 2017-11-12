package Model;

import java.lang.Math;
import Controller.*;





public class calculosFluxoPotFund  {

	
	private static double frequenciaAngular = 120 *Math.PI;
	public static double amplitudeTensao;
	public static double angulo;
	public static double amplitudeCorrente;
	public static double angulo2;
	 
	
	// angulo = ângulo da tensão
	// angulo2 = ângulo da corrente
	
	
	public static double getFrequenciaAngular() {
		return frequenciaAngular;
	}
	public void setFrequenciaAngular(double frequenciaAngular) {
		calculosFluxoPotFund.frequenciaAngular = frequenciaAngular;
	}
		
	public double CalculaOndaAmplitudeTensao(double Tensao, double i, double angulo) {
		amplitudeTensao = Tensao;
		return Tensao * Math.cos(Math.toRadians((getFrequenciaAngular() * i) + angulo));
	}
	
	public double CalculaOndaCorrente(double amplitudeCorrente, double i, double angulo2){
		return amplitudeCorrente * Math.cos(Math.toRadians(getFrequenciaAngular()*i)+ angulo2);
	}
	
	public double CalculaPotInst(double amplitudeTensao, double i, double angulo,double corrente,double angulo2){
		return CalculaOndaAmplitudeTensao(amplitudeTensao,i, angulo) *  CalculaOndaCorrente(corrente,i,angulo2) ;
	}
	
	public double CalculaPotAtiv(double amplitudeTensao, double angulo , double amplitudeCorrente, double angulo2){	
		return Math.round(amplitudeTensao*amplitudeCorrente*Math.cos(Math.toDegrees(angulo)- Math.toDegrees(angulo2)));
	}
	
	public double CalculaPotReat(double amplitudeTensao, double angulo ,double amplitudeTensaoCorrente,double angulo2){
		return Math.round(amplitudeTensao*amplitudeTensaoCorrente*Math.sin(Math.toDegrees(angulo)- Math.toDegrees(angulo2)));
	}
	
	public double CalculaPotAparente(double amplitudeTensao, double amplitudeTensaoCorrente){
		return Math.round(amplitudeTensao*amplitudeTensaoCorrente);
	}
	
	public double CalculaFatorPot(double angulo, double angulo2){
		return Math.cos(Math.toRadians(angulo)- Math.toRadians(angulo2));
	}
	
}