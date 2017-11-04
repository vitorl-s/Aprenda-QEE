package Model;

import java.lang.Math;

public class calculosFluxoPotFund {

	
	private static double frequenciaAngular = Math.toRadians(2* Math.PI*60);
		
	public static double getFrequenciaAngular() {
		return frequenciaAngular;
	}
	public void setFrequenciaAngular(double frequenciaAngular) {
		calculosFluxoPotFund.frequenciaAngular = frequenciaAngular;
	}
		
	public static double CalculaOndaTensao(double j, double t, double k) {
		return j*Math.cos(Math.toDegrees(getFrequenciaAngular()*t)+ Math.toDegrees(k));
		
	}
	
}
