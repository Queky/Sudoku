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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreMaximo extends JFrame {
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
		contentPane.add(getButton());
	}
	private JLabel getLblPuntacionesMaxomas() {
		if (lblPuntacionesMaxomas == null) {
			lblPuntacionesMaxomas = new JLabel("Puntaciones Maximas");
			lblPuntacionesMaxomas.setHorizontalAlignment(SwingConstants.CENTER);
			lblPuntacionesMaxomas.setHorizontalTextPosition(SwingConstants.CENTER);
			lblPuntacionesMaxomas.setBounds(0, 11, 294, 14);
		}
		return lblPuntacionesMaxomas;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
			textArea.setColumns(10);
			textArea.setBounds(0, 28, 294, 270);
			
		}
		return textArea;
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
			button.setBounds(300/2-90/2, 300, 90, 20);
		}
		return button;
	}
}
