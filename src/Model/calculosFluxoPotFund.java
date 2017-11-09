package Model;

import java.lang.Math;





public class calculosFluxoPotFund  {

	
	private static double frequenciaAngular = Math.toRadians(2* Math.PI*60);
	private double amplitudeTensao;
	private double angulo;
	private double amplitudeCorrente;
	private double angulo2;
	
	// angulo = ângulo da tensão
	// angulo2 = ângulo da corrente
	
	public double getAmplitudeTensao() {
		return amplitudeTensao;
	}
	public void setAmplitudeTensao(double amplitudeamplitudeTensao) {
		this.amplitudeTensao = amplitudeamplitudeTensao;
	}
	public double getAngulo() {
		return angulo;
	}
	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	public double getAmplitudeCorrente() {
		return amplitudeCorrente;
	}
	public void setAmplitudeCorrente(double amplitudeCorrente) {
		this.amplitudeCorrente = amplitudeCorrente;
	}
	public double getAngulo2() {
		return angulo2;
	}
	public void setAngulo2(double angulo2) {
		this.angulo2 = angulo2;
	}

	public static double getFrequenciaAngular() {
		return frequenciaAngular;
	}
	public void setFrequenciaAngular(double frequenciaAngular) {
		calculosFluxoPotFund.frequenciaAngular = frequenciaAngular;
	}
		
	public double CalculaOndaAmplitudeTensao(double amplitudeTensao, double i, double angulo) {
		return amplitudeTensao * Math.cos(getFrequenciaAngular()*i+ angulo*(Math.PI/180));
		
	}
	
	public double CalculaOndaCorrente(double amplitudeCorrente, double i, double angulo2){
		return amplitudeCorrente * Math.cos(getFrequenciaAngular()*i+ angulo2*(Math.PI/180));
	}
	
	public double CalculaPotInst(double amplitudeTensao, double i, double angulo,double corrente,double angulo2){
		return CalculaOndaAmplitudeTensao(amplitudeTensao,i, angulo) *  CalculaOndaCorrente(corrente,i,angulo2) ;
	}
	
	public double CalculaPotAtiv(double amplitudeamplitudeTensao, double angulo , double amplitudeCorrente, double angulo2){	
		return Math.round(amplitudeamplitudeTensao*amplitudeCorrente*Math.cos(Math.toDegrees(angulo)- Math.toDegrees(angulo2)));
	}
	
	public double CalculaPotReat(double amplitudeTensao, double angulo ,double amplitudeTensaoCorrente,double angulo2){
		return Math.round(amplitudeTensao*amplitudeTensaoCorrente*Math.sin(Math.toDegrees(angulo)- Math.toDegrees(angulo2)));
	}
	
	public static double CalculaPotAparente(double amplitudeTensao, double amplitudeTensaoCorrente){
		return amplitudeTensao*amplitudeTensaoCorrente;
	}
	
}