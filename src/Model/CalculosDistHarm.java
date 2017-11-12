package Model;

public class CalculosDistHarm implements Calculos {

	double frequenciaAngular = 120*Math.PI;
	public static double amplitude;
	public static double ordemHarmonica;
	public static double anguloFase;
	
	public double CalculaOndaCorrente(double amplitudeCorrente, double i, double angulo2) {
		return 0;
	}

	public double CalculaPotInst(double amplitudeTensao, double i, double angulo, double corrente, double angulo2) {
		return 0;
	}

	public double CalculaPotAtiv(double amplitudeTensao, double angulo, double amplitudeCorrente, double angulo2) {
		return 0;
	}

	public double CalculaPotReat(double amplitudeTensao, double angulo, double amplitudeTensaoCorrente,
			double angulo2) {
		return 0;
	}

	public double CalculaPotAparente(double amplitudeTensao, double amplitudeTensaoCorrente) {
		return 0;
	}

	public double CalculaFatorPot(double angulo, double angulo2) {
		return 0;
	}
	

	
	public double CalculaOndaAmplitudeTensao(double tensao, double i, double angulo) {
		return tensao * Math.cos(Math.toRadians((frequenciaAngular * i) + angulo));
	}
	
	public double CalculaOndaHarmonica(double amplitudeTensao, double ordemHarmonica, double i ,double angulo) {
		return amplitudeTensao * Math.cos(Math.toRadians((ordemHarmonica*frequenciaAngular * i) + angulo));
	}

	public double CalculaOndaDistorcida(int numeroHarmonicos) {
		return 0;
	}

	@Override
	public double CalculaOndaHarmonica(double amplitudeTensao, int ordemHarmonica, double angulo) {
		return 0;
	}

	

}
