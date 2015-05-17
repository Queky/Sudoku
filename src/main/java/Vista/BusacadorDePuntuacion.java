package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Modelo.ConexionConBBDD;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BusacadorDePuntuacion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7914238406122291062L;
	private static BusacadorDePuntuacion mBuscadorDePuntuacion;
	private JPanel contentPane;
	private JLabel lblIntroduceTuNombre;
	private JTextField textField;
	private JButton btnBuscar;
	private JButton button;

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
	private BusacadorDePuntuacion() {
		initialize();
	}
	public static BusacadorDePuntuacion getBusacadorDePuntuacion(){
		if(mBuscadorDePuntuacion == null){
			mBuscadorDePuntuacion= new BusacadorDePuntuacion(); 
		}
		return mBuscadorDePuntuacion;
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
		contentPane.add(getButton());
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
			btnBuscar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ConexionConBBDD c1 = ConexionConBBDD.getConexionConBBDD();
							JOptionPane.showMessageDialog(BusacadorDePuntuacion.this,
									String.format("Tu puntación maxima es de: "+c1.buscarPuntacionMasAltaDeJugador(textField.getText()), e.getActionCommand()));
							
						}
					});
				}
			
			btnBuscar.setBounds(40, 47, 90, 25);
			return btnBuscar;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("< Atras");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Score s1 = Score.getScore();
					s1.setVisible(true);
					setVisible(false);
					dispose();
				}
			});
			button.setBounds(150, 47, 90, 25);
		}
		return button;
	}
}
