package Model;

public interface Calculos {
	public double CalculaOndaAmplitudeTensao(double tensao, double i, double angulo);
	public double CalculaOndaCorrente(double amplitudeCorrente, double i, double angulo2);
	public double CalculaPotInst(double amplitudeTensao, double i, double angulo,double corrente,double angulo2);
	public double CalculaPotAtiv(double amplitudeTensao, double angulo , double amplitudeCorrente, double angulo2);
	public double CalculaPotReat(double amplitudeTensao, double angulo ,double amplitudeTensaoCorrente,double angulo2);
	public double CalculaPotAparente(double amplitudeTensao, double amplitudeTensaoCorrente);
	public double CalculaFatorPot(double angulo, double angulo2);
	public double CalculaOndaHarmonica(double amplitudeTensao, int ordemHarmonica,double angulo);
	public double CalculaOndaDistorcida(int numeroHarmonicos);
}
