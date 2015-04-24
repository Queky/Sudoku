package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class MenuSudoku extends JFrame {
	private JButton btnNewButton;
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
	p.add(getBtnNewButton());
}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(190, 100, 120, 30);
		}
		return btnNewButton;
	}
}