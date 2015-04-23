package Ventana;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

public class MenuSudoku extends JFrame {
	public Image imagenFondo;
	public URL fondo;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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
	

	/**
	 * Create the frame.
	 */
	public MenuSudoku() {
		initialize();
	}
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 390);
		String directory = Paths.get(".").toAbsolutePath().normalize().toString();
		fondo = this.getClass().getResource(directory+"/Imagenes/Fondo-Web-d-Madera-rojo-oscuro.jpg");
		imagenFondo = new ImageIcon(fondo).getImage();
		Container contenedor = getContentPane();
		contenedor.add(panel);
		
		//add(new JLabel(new ImageIcon(directory+"/Imagenes/Fondo-Web-d-Madera-rojo-oscuro.jpg")));
	}
	public JPanel panel = new JPanel(){
	public void paitComponent(Graphics g){
		g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
		
	}
	};
}
