package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Fluxo_Pot_Harmonico extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fluxo_Pot_Harmonico frame = new Fluxo_Pot_Harmonico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fluxo_Pot_Harmonico() {
		setBounds(100, 100, 935, 535);

	}

}
