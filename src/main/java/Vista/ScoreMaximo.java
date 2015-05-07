package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class ScoreMaximo extends JFrame {
	private static ScoreMaximo mScoreMaximo;
	private JPanel contentPane;
	private JLabel lblPuntacionesMaxomas;
	private JTextArea textArea;

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
		contentPane.add(getLblPuntacionesMaxomas());
		contentPane.add(getTextArea());
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
			lblPuntacionesMaxomas.setHorizontalAlignment(SwingConstants.CENTER);
			lblPuntacionesMaxomas.setHorizontalTextPosition(SwingConstants.CENTER);
			lblPuntacionesMaxomas.setBounds(0, 12, 294, 14);
		}
		return lblPuntacionesMaxomas;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setColumns(10);
			textArea.setBounds(0, 37, 294, 274);
		}
		return textArea;
	}
}
