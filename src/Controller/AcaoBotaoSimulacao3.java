package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Fluxo_Pot_Harmonico;

public class AcaoBotaoSimulacao3 implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		Fluxo_Pot_Harmonico frame = new Fluxo_Pot_Harmonico();
		frame.setVisible(true);		
	}
}
