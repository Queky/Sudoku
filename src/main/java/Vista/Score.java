package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score extends JFrame {
	private static Score mScore ;
	private JButton btnPuntacionesMaximas;
	private JButton btnTuPuntuacion;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score();
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
	private Score() {

		initialize();
	}
	public static Score getScore(){
		if(mScore == null){
			mScore= new Score(); 
		}
		return mScore;
	}
	private void initialize() {
		setTitle("Score");
		setResizable(false);
		setBounds(100, 100, 300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		PanelImagen p = new PanelImagen();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);
		if (windowSize.height>screenSize.height) {
		windowSize.height= screenSize.height;
		}
		if (windowSize.width>screenSize.width){
		windowSize.width= screenSize.width;
		}
		setLocation((screenSize.width-windowSize.width)/2,
		(screenSize.height-windowSize.height)/2);
		getContentPane().add(getBtnPuntacionesMaximas());
		getContentPane().add(getBtnTuPuntuacion());
		getContentPane().add(getBtnMenuPrincipal());
	}
	private JButton getBtnPuntacionesMaximas() {
		if (btnPuntacionesMaximas == null) {
			btnPuntacionesMaximas = new JButton("Puntaciones Maximas");
			btnPuntacionesMaximas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreMaximo sM1 = ScoreMaximo.getScoreMaximo();
					sM1.setVisible(true);
					setVisible(false);
					dispose();
				}
			});
			btnPuntacionesMaximas.setBounds(70, 11, 160, 23);
		}
		return btnPuntacionesMaximas;
	}
	private JButton getBtnTuPuntuacion() {
		if (btnTuPuntuacion == null) {
			btnTuPuntuacion = new JButton("Tu Puntuación");
			btnTuPuntuacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BusacadorDePuntuacion bS1 = BusacadorDePuntuacion.getBusacadorDePuntuacion();
					bS1.setVisible(true);
					setVisible(false);
					dispose();
				}
			});
			btnTuPuntuacion.setBounds(70, 45, 160, 23);
		}
		return btnTuPuntuacion;
	}
	private JButton getBtnMenuPrincipal() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Menu Principal");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MenuSudoku m1 = MenuSudoku.getMenuSudoku();
					m1.setVisible(true);
					setVisible(false);
					dispose();
				}
			});
			btnNewButton.setBounds(70, 79, 160, 23);
		}
		return btnNewButton;
	}
	class PanelImagen extends javax.swing.JPanel {
		public PanelImagen() {
			this.setSize(400, 280);
		}

		@Override
		public void paintComponent(Graphics g) {
			Dimension tamanio = getSize();
			ImageIcon imagenFondo = new ImageIcon(getClass().getResource(
					"/Imagenes/FondoLogin1i.jpg"));
			g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width,
					tamanio.height, null);
			setOpaque(false);
			super.paintComponent(g);
		}
	}
}
