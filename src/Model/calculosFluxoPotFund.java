package Model;

public class calculosFluxoPotFund {

	private double frequenciaAngular;
	private double amplitude;
	private double tensao;
	private double corrente;
	private double anguloFase;
	private int numeroHarmonicos;
	public double getFrequenciaAngular() {
		return frequenciaAngular;
	}
	public void setFrequenciaAngular(double frequenciaAngular) {
		this.frequenciaAngular = frequenciaAngular;
	}
	public double getAmplitude() {
		return amplitude;
	}
	public void setAmplitude(double amplitude) {
		this.amplitude = amplitude;
	}
	public double getTensao() {
		return tensao;
	}
	public void setTensao(double tensao) {
		this.tensao = tensao;
	}
	public double getCorrente() {
		return corrente;
	}
	public void setCorrente(double corrente) {
		this.corrente = corrente;
	}
	public double getAnguloFase() {
		return anguloFase;
	}
	public void setAnguloFase(double anguloFase) {
		this.anguloFase = anguloFase;
	}
	public int getNumeroHarmonicos() {
		return numeroHarmonicos;
	}
	public void setNumeroHarmonicos(int numeroHarmonicos) {
		this.numeroHarmonicos = numeroHarmonicos;
	}
	
	public double CalculaOndaTensao(double amplitude, double frequenciaAngular , double t,double anguloFase) {
		return amplitude*Math.cos(Math.toDegrees(frequenciaAngular*t)+ Math.toDegrees(anguloFase));
	}
}
