package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Distorcao_Harmonica;

public class AcaoBotaoSimulacao2 implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Distorcao_Harmonica frame = new Distorcao_Harmonica();
		frame.setVisible(true);
		
	}
}
