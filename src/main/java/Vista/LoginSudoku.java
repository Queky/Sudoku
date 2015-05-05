package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelo.ConexionConBBDD;
import Modelo.RellenarSudoku;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;



public class LoginSudoku extends JFrame {
	
	
	private static LoginSudoku mLoginSudoku = new LoginSudoku();
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblNivelDeDificultad;
	private JTextField textField;
	private JButton btnOk;
	private JComboBox comboBox;

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
	private LoginSudoku() {
		initialize();
	}
	public static LoginSudoku getLoguinSudoku(){
		if(mLoginSudoku == null){
			mLoginSudoku= new LoginSudoku(); 
		}
		return mLoginSudoku;
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
		PanelImagen p = new PanelImagen();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);
		p.add(btnOk);
		p.add(lblNivelDeDificultad);
		p.add(lblNombre);
		p.add(comboBox);
		p.add(textField);
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
			panel.add(getBtnOk());
			panel.add(getComboBox());
		}
		return panel;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setForeground(Color.BLACK);
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNombre.setBackground(Color.BLACK);
			lblNombre.setBounds(72, 11, 108, 25);
		}
		return lblNombre;
	}
	private JLabel getLblNivelDeDificultad() {
		if (lblNivelDeDificultad == null) {
			lblNivelDeDificultad = new JLabel("Nivel de dificultad:");
			lblNivelDeDificultad.setForeground(Color.BLACK);
			lblNivelDeDificultad.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNivelDeDificultad.setBackground(Color.BLACK);
			lblNivelDeDificultad.setBounds(18, 43, 108, 25);
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
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						if(!textField.getText().equals("")){
							ConexionConBBDD con = ConexionConBBDD.getConexionConBBDD();
							con.anyadirDatosLoguin(textField.getText(), comboBox.getSelectedIndex()+1 );
							RellenarSudoku r1 = new RellenarSudoku();
							try {
								r1.loadDoneSudoku("s001", Integer.toString(comboBox.getSelectedIndex()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							setVisible(false);
							dispose();
								
						}
				}
			});
		
			btnOk.setBounds(115, 79, 75, 25);
		}
		return btnOk;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(128, 45, 60, 20);
			comboBox.addItem("1");
			comboBox.addItem("2");
			comboBox.addItem("3");
		}
		return comboBox;
	}
	class PanelImagen extends javax.swing.JPanel {
		public PanelImagen() {
			this.setSize(400, 280);
		}

		@Override
		public void paintComponent(Graphics g) {
			Dimension tamanio = getSize();
			ImageIcon imagenFondo = new ImageIcon(getClass().getResource(
					"/Imagenes/FondoLoguin2.jpg"));
			g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width,
					tamanio.height, null);
			setOpaque(false);
			super.paintComponent(g);
		}
	}
	
}
