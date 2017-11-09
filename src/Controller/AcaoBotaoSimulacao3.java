package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.FluxoPotHarmonico;

public class AcaoBotaoSimulacao3 implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		FluxoPotHarmonico frame = new FluxoPotHarmonico();
		frame.setVisible(true);		
	}
}
