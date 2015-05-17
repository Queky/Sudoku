package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuSudoku extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8905801993435447065L;
	private static MenuSudoku mMenuSudoku;
	private JButton btnNuevoJuego;
	private JButton btnSocre;
	private JLabel lblNewLabel;
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

	private MenuSudoku() {
		initialize();
	}
	public static MenuSudoku getMenuSudoku(){
		if(mMenuSudoku == null){
			mMenuSudoku= new MenuSudoku(); 
		}
		return mMenuSudoku;
	}

	private void initialize() {
		setTitle("SudokuJava");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		PanelImagen p = new PanelImagen();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);
		p.add(getBtnNuevoJuego());
		p.add(getBtnSocre());
		p.add(getLblNewLabel());

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
		p.add(getBtnSalir());
	}
	

	private JButton getBtnNuevoJuego() {
		if (btnNuevoJuego == null) {
			btnNuevoJuego = new JButton("Nuevo Juego");
			btnNuevoJuego.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LoginSudoku l1 = LoginSudoku.getLoguinSudoku();
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
				Score s1 = Score.getScore();
				s1.setVisible(true);
				setVisible(false);
				dispose();
				}
			});
			btnSocre.setBounds(165, 206, 120, 30);
		}
		return btnSocre;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BEEP\\Desktop\\cooltext117730252101418.png"));
			lblNewLabel.setBounds(87, 40, 362, 114);
		}
		return lblNewLabel;
	}
	private JButton getBtnSalir() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Salir");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CargarSudoku.setTimer(false);
					dispose();
				}
			});
			btnNewButton.setBounds(165, 247, 120, 30);
		}
		return btnNewButton;
	}
	class PanelImagen extends javax.swing.JPanel {


		/**
		 * 
		 */
		private static final long serialVersionUID = 5929627489525756902L;

		public PanelImagen() {
			this.setSize(400, 280);
		}

		@Override
		public void paintComponent(Graphics g) {
			Dimension tamanio = getSize();
			ImageIcon imagenFondo = new ImageIcon(getClass().getResource(
					"/Imagenes/imgFondo.jpg"));
			g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width,
					tamanio.height, null);
			setOpaque(false);
			super.paintComponent(g);
		}
}}