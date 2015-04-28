package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuSudoku extends JFrame {
	private JButton btnNuevoJuego;
	private JButton btnSocre;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSudoku frame = new MenuSudoku();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuSudoku() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		PanelImagen p = new PanelImagen();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);
		p.add(getBtnNuevoJuego());
		p.add(getBtnSocre());
	}

	private JButton getBtnNuevoJuego() {
		if (btnNuevoJuego == null) {
			btnNuevoJuego = new JButton("NuevoJuego");
			btnNuevoJuego.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LoginSudoku l1 = new LoginSudoku();
					l1.setVisible(true);
					setVisible(false);
					dispose();

				}
			});
			btnNuevoJuego.setBounds(165, 165, 120, 30);
		}
		return btnNuevoJuego;
	}
	private JButton getBtnSocre() {
		if (btnSocre == null) {
			btnSocre = new JButton("Score");
			btnSocre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSocre.setBounds(165, 224, 120, 30);
		}
		return btnSocre;
	}
}