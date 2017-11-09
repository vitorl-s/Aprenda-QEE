package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.Simular_View;

public class VoltaMenuPrincipal implements ActionListener{

	
	private JFrame telaSimulacao;
	
	public VoltaMenuPrincipal(JFrame telaSimulacao){
		this.telaSimulacao = telaSimulacao;
	}
	
	public void actionPerformed(ActionEvent e) {
		telaSimulacao.setVisible(false);
		Simular_View menu = new Simular_View();
		menu.setVisible(true);
	}
	
}
