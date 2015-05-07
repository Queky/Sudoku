package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score extends JFrame {
	private static Score mScore ;
	private JButton btnPuntacionesMaximas;
	private JButton btnTuPuntuacion;

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
	}
	private JButton getBtnPuntacionesMaximas() {
		if (btnPuntacionesMaximas == null) {
			btnPuntacionesMaximas = new JButton("Puntaciones Maximas");
			btnPuntacionesMaximas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnPuntacionesMaximas.setBounds(70, 27, 160, 23);
		}
		return btnPuntacionesMaximas;
	}
	private JButton getBtnTuPuntuacion() {
		if (btnTuPuntuacion == null) {
			btnTuPuntuacion = new JButton("Tu Puntuación");
			btnTuPuntuacion.setBounds(70, 61, 160, 23);
		}
		return btnTuPuntuacion;
	}
}
