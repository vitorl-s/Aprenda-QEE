import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Simular_View extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simular_View frame = new Simular_View();
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
	public Simular_View() {
		setTitle("APRENDA QEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemvindoaAoAprenda = new JLabel("Bem-Vindo(a) ao Aprenda QEE!");
		lblBemvindoaAoAprenda.setBounds(11, 37, 364, 31);
		contentPane.add(lblBemvindoaAoAprenda);
		
		JLabel lblPorFavorSelecione = new JLabel("Por favor, selecione uma das simulações desejadas!");
		lblPorFavorSelecione.setBounds(11, 80, 371, 15);
		contentPane.add(lblPorFavorSelecione);
		
		JButton btnNewButton = new JButton("Fluxo de Potência Fundamental");
		btnNewButton.setBounds(152, 207, 256, 46);
		contentPane.add(btnNewButton);
		
		JButton btnDistoroHarmnica = new JButton("Distorção Harmônica");
		btnDistoroHarmnica.setBounds(152, 275, 256, 46);
		contentPane.add(btnDistoroHarmnica);
		
		JButton btnFluxoDePotncia = new JButton("Fluxo de potência Harmônico");
		btnFluxoDePotncia.setBounds(152, 343, 256, 46);
		contentPane.add(btnFluxoDePotncia);
	}
}
