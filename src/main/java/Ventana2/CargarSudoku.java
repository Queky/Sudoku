package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.Dimension;

public class CargarSudoku extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CargarSudoku dialog = new CargarSudoku();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CargarSudoku() {
		initialize();
	}
	private void initialize() {
		setLocationByPlatform(true);
		setResizable(false);
		setTitle("Seleccionar nivel de dificultad");
		setName("");
		setBounds(100, 100, 320, 250);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		if(windowSize.height>screenSize.height)
			windowSize.height=screenSize.height;
		if(windowSize.width>screenSize.width)
			windowSize.width=screenSize.width;
		setLocation((screenSize.width-windowSize.width)/2, (screenSize.height-windowSize.height)/2);
		setSize((int)(screenSize.width*0.3), (int)(screenSize.height*0.3));
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getRdbtnNewRadioButton());
		contentPanel.add(getRdbtnNewRadioButton_1());
		contentPanel.add(getRdbtnNewRadioButton_2());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				buttonPane.add(cancelButton);
			}
		}
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Facil");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(157, 48, 70, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("Medio");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(157, 83, 70, 23);
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("Dificil");
			buttonGroup.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setBounds(157, 118, 70, 23);
		}
		return rdbtnNewRadioButton_2;
	}
}
