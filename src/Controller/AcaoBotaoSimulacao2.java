package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.DistorcaoHarmonica;

public class AcaoBotaoSimulacao2 implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		DistorcaoHarmonica frame = new DistorcaoHarmonica();
		frame.setVisible(true);
		
	}
}
