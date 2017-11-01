package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

import View.Fluxo_Pot_Fund;
import View.Simular_View;


public class Simular_Controller implements ActionListener{
	
		
	private JInternalFrame simulacao;


	public Simular_Controller(JInternalFrame simulacao) {
		this.simulacao = simulacao;
	}
	
	public void actionPerformed(ActionEvent e) {
		simulacao.setVisible(false);
		Fluxo_Pot_Fund telaFPF = new Fluxo_Pot_Fund();
		telaFPF.setVisible(true);
	}
}
	

