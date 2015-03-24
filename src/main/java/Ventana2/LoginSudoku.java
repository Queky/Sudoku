package Ventana2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class LoginSudoku extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblNivelDeDificultad;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSudoku frame = new LoginSudoku();
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
	public LoginSudoku() {
		initialize();
	}
	private void initialize() {
		setResizable(false);
		setTitle("Identificaci\u00F3n del Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		if (windowSize.height>screenSize.height) {
		windowSize.height= screenSize.height;
		}
		if (windowSize.width>screenSize.width){
		windowSize.width= screenSize.width;
		}
		setLocation((screenSize.width-windowSize.width)/2,
		(screenSize.height-windowSize.height)/2);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNombre());
			panel.add(getLblNivelDeDificultad());
			panel.add(getTextField());
			panel.add(getTextField_1());
			panel.add(getBtnOk());
		}
		return panel;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(62, 11, 58, 24);
		}
		return lblNombre;
	}
	private JLabel getLblNivelDeDificultad() {
		if (lblNivelDeDificultad == null) {
			lblNivelDeDificultad = new JLabel("Nivel de dificultad:");
			lblNivelDeDificultad.setBounds(10, 43, 128, 24);
		}
		return lblNivelDeDificultad;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(128, 13, 128, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(128, 45, 128, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.setBounds(120, 80, 60, 25);
		}
		return btnOk;
	}
}
