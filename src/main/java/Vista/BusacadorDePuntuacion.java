package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;

public class BusacadorDePuntuacion extends JFrame {

	private JPanel contentPane;
	private JLabel lblIntroduceTuNombre;
	private JTextField textField;
	private JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusacadorDePuntuacion frame = new BusacadorDePuntuacion();
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
	public BusacadorDePuntuacion() {
		initialize();
	}
	private void initialize() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 110);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIntroduceTuNombre());
		contentPane.add(getTextField());
		contentPane.add(getBtnBuscar());
	}

	private JLabel getLblIntroduceTuNombre() {
		if (lblIntroduceTuNombre == null) {
			lblIntroduceTuNombre = new JLabel("Introduce tu nombre:");
			lblIntroduceTuNombre.setBounds(10, 11, 125, 30);
		}
		return lblIntroduceTuNombre;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			textField.setBounds(140, 16, 144, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnBuscar() {
		if (btnBuscar == null) {
			btnBuscar = new JButton("Buscar");
			btnBuscar.setBounds(100, 47, 89, 23);
		}
		return btnBuscar;
	}
}
