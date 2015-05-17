package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

import Modelo.ConexionConBBDD;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ScoreMaximo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5540315821664196488L;
	private static ScoreMaximo mScoreMaximo;
	private JPanel contentPane;
	private JLabel lblPuntacionesMaxomas;
	private JTextArea textArea;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreMaximo frame = new ScoreMaximo();
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
	private ScoreMaximo() {
		initialize();
	}
	public static ScoreMaximo getScoreMaximo(){
		if(mScoreMaximo == null){
			mScoreMaximo= new ScoreMaximo(); 
		}
		mScoreMaximo.initialize();
		return mScoreMaximo;
	}
	private void initialize() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getTextArea();
		PanelImagen p = new PanelImagen();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);
		getContentPane().add(getLblPuntacionesMaxomas());
		getContentPane().add(getBtnAtras());
		getContentPane().add(getTextArea());
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
	private JLabel getLblPuntacionesMaxomas() {
		if (lblPuntacionesMaxomas == null) {
			lblPuntacionesMaxomas = new JLabel("Puntaciones Maximas");
			lblPuntacionesMaxomas.setForeground(new Color(255, 255, 204));
			lblPuntacionesMaxomas.setHorizontalAlignment(SwingConstants.CENTER);
			lblPuntacionesMaxomas.setHorizontalTextPosition(SwingConstants.CENTER);
			lblPuntacionesMaxomas.setBounds(0, 25, 294, 14);
		}
		return lblPuntacionesMaxomas;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setForeground(new Color(255, 255, 204));
			textArea.setBackground(new Color(102, 51, 0));
			textArea.setEditable(false);
			textArea.setColumns(10);
			textArea.setBounds(65, 76, 165, 174);
			ConexionConBBDD c1 = ConexionConBBDD.getConexionConBBDD();
			String[] puntMax = c1.buscarPuntuacionesMaximas();
			for (int i = 0; i < puntMax.length; i++) {
				if(puntMax[i]!=null)
				textArea.append(puntMax[i]+"\n");
				
			}
			
		}
		return textArea;
	}
	private JButton getBtnAtras() {
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
			button.setBounds(105, 291, 90, 20);
		}
		return button;
	}
	class PanelImagen extends javax.swing.JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = -5438132861981044633L;

		public PanelImagen() {
			this.setSize(400, 280);
		}

		@Override
		public void paintComponent(Graphics g) {
			Dimension tamanio = getSize();
			ImageIcon imagenFondo = new ImageIcon(getClass().getResource(
					"/Imagenes/FondoScoreMaximo1.jpg"));
			g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width,
					tamanio.height, null);
			setOpaque(false);
			super.paintComponent(g);
		}
	}
}
