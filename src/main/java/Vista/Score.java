package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Score extends JFrame {
	private static Score mScore ;
	private JTextArea textArea;
	private JLabel lblPuntacionesMaximas;

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
		setBounds(100, 100, 400, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getTextArea());
		getContentPane().add(getLblPuntacionesMaximas());
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
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(50, 42, 290, 294);
		}
		return textArea;
	}
	private JLabel getLblPuntacionesMaximas() {
		if (lblPuntacionesMaximas == null) {
			lblPuntacionesMaximas = new JLabel("Puntaciones Maximas");
			lblPuntacionesMaximas.setBounds(400/2-135/2,12, 135, 20);
		}
		return lblPuntacionesMaximas;
	}
}
