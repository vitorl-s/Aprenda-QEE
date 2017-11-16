import static org.junit.Assert.*;

import org.junit.Test;

import model.CalculosFluxoPotFund;

public class TesteCalculoxFluxoPotFund {

	CalculosFluxoPotFund calculos = new CalculosFluxoPotFund();
	double valor_esperado,valor_calculado,amplitudeTensao,angulo,amplitudeCorrente,angulo2;
	
	@Test
	public void testaPotenciaAtiva() {
		amplitudeTensao = 220;
		angulo = 0;
		amplitudeCorrente = 39;
		angulo2 = 35;	
		valor_calculado = calculos.CalculaPotAtiv(amplitudeTensao, angulo, amplitudeCorrente, angulo2);
		valor_esperado = 7028;
		
		assertEquals(valor_esperado,valor_calculado,0);	
	}
	
	@Test
	public void testaPotenciaReativa() {
		amplitudeTensao = 220;
		angulo = 0;
		amplitudeCorrente = 39;
		angulo2 = 35;
		valor_calculado = calculos.CalculaPotReat(amplitudeTensao, angulo, amplitudeCorrente, angulo2);
		valor_esperado = -4921;
		
		assertEquals(valor_esperado,valor_calculado,0.01);	
	}
	
	@Test
	public void testaPotenciaAparente() {
		amplitudeTensao = 220;
		amplitudeCorrente = 39;
		valor_calculado = calculos.CalculaPotAparente(amplitudeTensao, amplitudeCorrente);
		valor_esperado = 8580;
		
		assertEquals(valor_esperado,valor_calculado,0);	
	}
	
	@Test
	public void testaFatorPot() {
		angulo = 0;
		angulo2 = 35;
		valor_calculado = calculos.CalculaFatorPot(angulo, angulo2);
		valor_esperado = 0.82;
		
		assertEquals(valor_esperado,valor_calculado,0.01);
		
		angulo = 2;
		angulo2 = 2;
		valor_calculado = calculos.CalculaFatorPot(angulo, angulo2);
		assertEquals(1,valor_calculado,0);
	}

}


