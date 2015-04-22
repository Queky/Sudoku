package Ventana;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import codigo.JTextFieldLimit;

public class cargarSudoku extends JFrame {

	private JPanel contentPane;
	private JPanel Cuadricula1;
	private JTextField textField_1;
	private JPanel Cuadricula2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPanel Cuadricula3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JPanel Cuadricula4;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JPanel Cuadricula5;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JPanel Cuadricula6;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JPanel Cuadricula7;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JPanel Cuadricula8;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JPanel Cuadricula9;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JLabel difficultyLevel;
	private JLabel sudokuOwner;
	private JLabel sudokuId;
	private JLabel dLevel;
	private JLabel IdSudoku;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cargarSudoku frame = new cargarSudoku();
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
	public cargarSudoku() {
		initialize();
	}

	private void initialize() {
		setTitle("Sudoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCuadricula1());
		contentPane.add(getCuadricula2());
		contentPane.add(getCuadricula3());
		contentPane.add(getCuadricula4());
		contentPane.add(getCuadricula5());
		contentPane.add(getCuadricula6());
		contentPane.add(getCuadricula7());
		contentPane.add(getCuadricula8());
		contentPane.add(getCuadricula9());
		contentPane.add(getDifficultyLevel());
		contentPane.add(getSudokuOwner());
		contentPane.add(getSudokuId());
		contentPane.add(getDLevel());
		contentPane.add(getIdSudoku());
	}
	private JPanel getCuadricula1() {
		if (Cuadricula1 == null) {
			Cuadricula1 = new JPanel();
			Cuadricula1.setBounds(45, 45, 160, 160);
			Cuadricula1.setLayout(null);
			Cuadricula1.add(getTextField_1());
			Cuadricula1.add(getTextField_2());
			Cuadricula1.add(getTextField_3());
			Cuadricula1.add(getTextField_10());
			Cuadricula1.add(getTextField_11());
			Cuadricula1.add(getTextField_12());
			Cuadricula1.add(getTextField_19());
			Cuadricula1.add(getTextField_20());
			Cuadricula1.add(getTextField_21());
		}
		return Cuadricula1;
	}
	
	private JPanel getCuadricula2() {
		if (Cuadricula2 == null) {
			Cuadricula2 = new JPanel();
			Cuadricula2.setLayout(null);
			Cuadricula2.setBounds(220, 45, 160, 160);
			Cuadricula2.add(getTextField_4());
			Cuadricula2.add(getTextField_5());
			Cuadricula2.add(getTextField_6());
			Cuadricula2.add(getTextField_13());
			Cuadricula2.add(getTextField_14());
			Cuadricula2.add(getTextField_15());
			Cuadricula2.add(getTextField_22());
			Cuadricula2.add(getTextField_23());
			Cuadricula2.add(getTextField_24());
		}
		return Cuadricula2;
	}
	
	private JPanel getCuadricula3() {
		if (Cuadricula3 == null) {
			Cuadricula3 = new JPanel();
			Cuadricula3.setLayout(null);
			Cuadricula3.setBounds(395, 45, 160, 160);
			Cuadricula3.add(getTextField_7());
			Cuadricula3.add(getTextField_8());
			Cuadricula3.add(getTextField_9());
			Cuadricula3.add(getTextField_16());
			Cuadricula3.add(getTextField_17());
			Cuadricula3.add(getTextField_18());
			Cuadricula3.add(getTextField_25());
			Cuadricula3.add(getTextField_26());
			Cuadricula3.add(getTextField_27());
		}
		return Cuadricula3;
	}
	
	private JPanel getCuadricula4() {
		if (Cuadricula4 == null) {
			Cuadricula4 = new JPanel();
			Cuadricula4.setLayout(null);
			Cuadricula4.setBounds(45, 220, 160, 160);
			Cuadricula4.add(getTextField_28());
			Cuadricula4.add(getTextField_29());
			Cuadricula4.add(getTextField_30());
			Cuadricula4.add(getTextField_37());
			Cuadricula4.add(getTextField_38());
			Cuadricula4.add(getTextField_39());
			Cuadricula4.add(getTextField_46());
			Cuadricula4.add(getTextField_47());
			Cuadricula4.add(getTextField_48());
		}
		return Cuadricula4;
	}
	
	private JPanel getCuadricula5() {
		if (Cuadricula5 == null) {
			Cuadricula5 = new JPanel();
			Cuadricula5.setLayout(null);
			Cuadricula5.setBounds(220, 220, 160, 160);
			Cuadricula5.add(getTextField_22_1());
			Cuadricula5.add(getTextField_32());
			Cuadricula5.add(getTextField_33());
			Cuadricula5.add(getTextField_40());
			Cuadricula5.add(getTextField_41());
			Cuadricula5.add(getTextField_42());
			Cuadricula5.add(getTextField_49());
			Cuadricula5.add(getTextField_50());
			Cuadricula5.add(getTextField_51());
		}
		return Cuadricula5;
	}
	
	private JPanel getCuadricula6() {
		if (Cuadricula6 == null) {
			Cuadricula6 = new JPanel();
			Cuadricula6.setLayout(null);
			Cuadricula6.setBounds(395, 220, 160, 160);
			Cuadricula6.add(getTextField_22_2());
			Cuadricula6.add(getTextField_35());
			Cuadricula6.add(getTextField_36());
			Cuadricula6.add(getTextField_43());
			Cuadricula6.add(getTextField_44());
			Cuadricula6.add(getTextField_45());
			Cuadricula6.add(getTextField_52());
			Cuadricula6.add(getTextField_53());
			Cuadricula6.add(getTextField_54());
		}
		return Cuadricula6;
	}
	
	private JPanel getCuadricula7() {
		if (Cuadricula7 == null) {
			Cuadricula7 = new JPanel();
			Cuadricula7.setLayout(null);
			Cuadricula7.setBounds(45, 392, 160, 160);
			Cuadricula7.add(getTextField_55());
			Cuadricula7.add(getTextField_56());
			Cuadricula7.add(getTextField_57());
			Cuadricula7.add(getTextField_64());
			Cuadricula7.add(getTextField_65());
			Cuadricula7.add(getTextField_66());
			Cuadricula7.add(getTextField_73());
			Cuadricula7.add(getTextField_74());
			Cuadricula7.add(getTextField_75());
		}
		return Cuadricula7;
	}
	
	private JPanel getCuadricula8() {
		if (Cuadricula8 == null) {
			Cuadricula8 = new JPanel();
			Cuadricula8.setLayout(null);
			Cuadricula8.setBounds(220, 392, 160, 160);
			Cuadricula8.add(getTextField_22_4());
			Cuadricula8.add(getTextField_59());
			Cuadricula8.add(getTextField_60());
			Cuadricula8.add(getTextField_67());
			Cuadricula8.add(getTextField_68());
			Cuadricula8.add(getTextField_69());
			Cuadricula8.add(getTextField_76());
			Cuadricula8.add(getTextField_77());
			Cuadricula8.add(getTextField_78());
		}
		return Cuadricula8;
	}
	
	private JPanel getCuadricula9() {
		if (Cuadricula9 == null) {
			Cuadricula9 = new JPanel();
			Cuadricula9.setLayout(null);
			Cuadricula9.setBounds(395, 392, 160, 160);
			Cuadricula9.add(getTextField_61());
			Cuadricula9.add(getTextField_62());
			Cuadricula9.add(getTextField_63());
			Cuadricula9.add(getTextField_70());
			Cuadricula9.add(getTextField_71());
			Cuadricula9.add(getTextField_72());
			Cuadricula9.add(getTextField_79());
			Cuadricula9.add(getTextField_80());
			Cuadricula9.add(getTextField_81());
		}
		return Cuadricula9;
	}
	
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setBounds(2, 2, 50, 50);
			textField_1.setColumns(10);
			textField_1.setHorizontalAlignment(JTextField.CENTER);
			textField_1.setDocument(new JTextFieldLimit(1));
		}
		return textField_1;
	}
	
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setColumns(10);
			textField_2.setBounds(54, 2, 50, 50);
			textField_2.setDocument(new JTextFieldLimit(1));
		}
		return textField_2;
	}
	
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(2, 2, 50, 50);
			textField_4.setHorizontalAlignment(JTextField.CENTER);
			textField_4.setDocument(new JTextFieldLimit(1));
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(54, 2, 50, 50);
			textField_5.setHorizontalAlignment(JTextField.CENTER);
			textField_5.setDocument(new JTextFieldLimit(1));
		}
		return textField_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(107, 2, 50, 50);
			textField_6.setHorizontalAlignment(JTextField.CENTER);
			textField_6.setDocument(new JTextFieldLimit(1));
		}
		return textField_6;
	}

	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(2, 2, 50, 50);
			textField_7.setHorizontalAlignment(JTextField.CENTER);
			textField_7.setDocument(new JTextFieldLimit(1));
		}
		return textField_7;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(54, 2, 50, 50);
			textField_8.setHorizontalAlignment(JTextField.CENTER);
			textField_8.setDocument(new JTextFieldLimit(1));
		}
		return textField_8;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(107, 2, 50, 50);
			textField_9.setHorizontalAlignment(JTextField.CENTER);
			textField_9.setDocument(new JTextFieldLimit(1));
		}
		return textField_9;
	}

	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_3.setColumns(10);
			textField_3.setBounds(107, 2, 50, 50);
			textField_3.setDocument(new JTextFieldLimit(1));
		}
		return textField_3;
	}
	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setHorizontalAlignment(SwingConstants.CENTER);
			textField_10.setColumns(10);
			textField_10.setBounds(2, 55, 50, 50);
			textField_10.setDocument(new JTextFieldLimit(1));
		}
		return textField_10;
	}
	private JTextField getTextField_11() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setHorizontalAlignment(SwingConstants.CENTER);
			textField_11.setColumns(10);
			textField_11.setBounds(54, 55, 50, 50);
			textField_11.setDocument(new JTextFieldLimit(1));
		}
		return textField_11;
	}
	private JTextField getTextField_12() {
		if (textField_12 == null) {
			textField_12 = new JTextField();
			textField_12.setHorizontalAlignment(SwingConstants.CENTER);
			textField_12.setColumns(10);
			textField_12.setBounds(107, 55, 50, 50);
			textField_12.setDocument(new JTextFieldLimit(1));
		}
		return textField_12;
	}
	private JTextField getTextField_13() {
		if (textField_13 == null) {
			textField_13 = new JTextField();
			textField_13.setHorizontalAlignment(SwingConstants.CENTER);
			textField_13.setColumns(10);
			textField_13.setBounds(2, 55, 50, 50);
			textField_13.setDocument(new JTextFieldLimit(1));
		}
		return textField_13;
	}
	private JTextField getTextField_14() {
		if (textField_14 == null) {
			textField_14 = new JTextField();
			textField_14.setHorizontalAlignment(SwingConstants.CENTER);
			textField_14.setColumns(10);
			textField_14.setBounds(54, 55, 50, 50);
			textField_14.setDocument(new JTextFieldLimit(1));
		}
		return textField_14;
	}
	private JTextField getTextField_15() {
		if (textField_15 == null) {
			textField_15 = new JTextField();
			textField_15.setHorizontalAlignment(SwingConstants.CENTER);
			textField_15.setColumns(10);
			textField_15.setBounds(107, 55, 50, 50);
			textField_15.setDocument(new JTextFieldLimit(1));
		}
		return textField_15;
	}
	private JTextField getTextField_16() {
		if (textField_16 == null) {
			textField_16 = new JTextField();
			textField_16.setHorizontalAlignment(SwingConstants.CENTER);
			textField_16.setColumns(10);
			textField_16.setBounds(2, 55, 50, 50);
			textField_16.setDocument(new JTextFieldLimit(1));
		}
		return textField_16;
	}
	private JTextField getTextField_17() {
		if (textField_17 == null) {
			textField_17 = new JTextField();
			textField_17.setHorizontalAlignment(SwingConstants.CENTER);
			textField_17.setColumns(10);
			textField_17.setBounds(54, 55, 50, 50);
			textField_17.setDocument(new JTextFieldLimit(1));
		}
		return textField_17;
	}
	private JTextField getTextField_18() {
		if (textField_18 == null) {
			textField_18 = new JTextField();
			textField_18.setHorizontalAlignment(SwingConstants.CENTER);
			textField_18.setColumns(10);
			textField_18.setBounds(107, 55, 50, 50);
			textField_18.setDocument(new JTextFieldLimit(1));
		}
		return textField_18;
	}
	private JTextField getTextField_19() {
		if (textField_19 == null) {
			textField_19 = new JTextField();
			textField_19.setHorizontalAlignment(SwingConstants.CENTER);
			textField_19.setColumns(10);
			textField_19.setBounds(2, 108, 50, 50);
			textField_19.setDocument(new JTextFieldLimit(1));
		}
		return textField_19;
	}
	private JTextField getTextField_20() {
		if (textField_20 == null) {
			textField_20 = new JTextField();
			textField_20.setHorizontalAlignment(SwingConstants.CENTER);
			textField_20.setColumns(10);
			textField_20.setBounds(54, 108, 50, 50);
			textField_20.setDocument(new JTextFieldLimit(1));
		}
		return textField_20;
	}
	private JTextField getTextField_21() {
		if (textField_21 == null) {
			textField_21 = new JTextField();
			textField_21.setHorizontalAlignment(SwingConstants.CENTER);
			textField_21.setColumns(10);
			textField_21.setBounds(107, 108, 50, 50);
			textField_21.setDocument(new JTextFieldLimit(1));
		}
		return textField_21;
	}
	private JTextField getTextField_22() {
		if (textField_22 == null) {
			textField_22 = new JTextField();
			textField_22.setHorizontalAlignment(SwingConstants.CENTER);
			textField_22.setColumns(10);
			textField_22.setBounds(2, 108, 50, 50);
			textField_22.setDocument(new JTextFieldLimit(1));
		}
		return textField_22;
	}
	private JTextField getTextField_23() {
		if (textField_23 == null) {
			textField_23 = new JTextField();
			textField_23.setHorizontalAlignment(SwingConstants.CENTER);
			textField_23.setColumns(10);
			textField_23.setBounds(54, 108, 50, 50);
			textField_23.setDocument(new JTextFieldLimit(1));
		}
		return textField_23;
	}
	private JTextField getTextField_24() {
		if (textField_24 == null) {
			textField_24 = new JTextField();
			textField_24.setHorizontalAlignment(SwingConstants.CENTER);
			textField_24.setColumns(10);
			textField_24.setBounds(107, 108, 50, 50);
			textField_24.setDocument(new JTextFieldLimit(1));
		}
		return textField_24;
	}
	private JTextField getTextField_25() {
		if (textField_25 == null) {
			textField_25 = new JTextField();
			textField_25.setHorizontalAlignment(SwingConstants.CENTER);
			textField_25.setColumns(10);
			textField_25.setBounds(2, 108, 50, 50);
			textField_25.setDocument(new JTextFieldLimit(1));
		}
		return textField_25;
	}
	private JTextField getTextField_26() {
		if (textField_26 == null) {
			textField_26 = new JTextField();
			textField_26.setHorizontalAlignment(SwingConstants.CENTER);
			textField_26.setColumns(10);
			textField_26.setBounds(54, 108, 50, 50);
			textField_26.setDocument(new JTextFieldLimit(1));
		}
		return textField_26;
	}
	private JTextField getTextField_27() {
		if (textField_27 == null) {
			textField_27 = new JTextField();
			textField_27.setHorizontalAlignment(SwingConstants.CENTER);
			textField_27.setColumns(10);
			textField_27.setBounds(107, 108, 50, 50);
			textField_27.setDocument(new JTextFieldLimit(1));
		}
		return textField_27;
	}

	private JTextField getTextField_28() {
		if (textField_28 == null) {
			textField_28 = new JTextField();
			textField_28.setHorizontalAlignment(SwingConstants.CENTER);
			textField_28.setColumns(10);
			textField_28.setBounds(2, 2, 50, 50);
			textField_28.setDocument(new JTextFieldLimit(1));
		}
		return textField_28;
	}
	private JTextField getTextField_29() {
		if (textField_29 == null) {
			textField_29 = new JTextField();
			textField_29.setHorizontalAlignment(SwingConstants.CENTER);
			textField_29.setColumns(10);
			textField_29.setBounds(54, 2, 50, 50);
			textField_29.setDocument(new JTextFieldLimit(1));
		}
		return textField_29;
	}
	private JTextField getTextField_30() {
		if (textField_30 == null) {
			textField_30 = new JTextField();
			textField_30.setHorizontalAlignment(SwingConstants.CENTER);
			textField_30.setColumns(10);
			textField_30.setBounds(107, 2, 50, 50);
			textField_30.setDocument(new JTextFieldLimit(1));
		}
		return textField_30;
	}
	private JTextField getTextField_37() {
		if (textField_37 == null) {
			textField_37 = new JTextField();
			textField_37.setHorizontalAlignment(SwingConstants.CENTER);
			textField_37.setColumns(10);
			textField_37.setBounds(2, 55, 50, 50);
			textField_37.setDocument(new JTextFieldLimit(1));
		}
		return textField_37;
	}
	private JTextField getTextField_38() {
		if (textField_38 == null) {
			textField_38 = new JTextField();
			textField_38.setHorizontalAlignment(SwingConstants.CENTER);
			textField_38.setColumns(10);
			textField_38.setBounds(54, 55, 50, 50);
			textField_38.setDocument(new JTextFieldLimit(1));
		}
		return textField_38;
	}
	private JTextField getTextField_39() {
		if (textField_39 == null) {
			textField_39 = new JTextField();
			textField_39.setHorizontalAlignment(SwingConstants.CENTER);
			textField_39.setColumns(10);
			textField_39.setBounds(107, 55, 50, 50);
			textField_39.setDocument(new JTextFieldLimit(1));
		}
		return textField_39;
	}
	private JTextField getTextField_46() {
		if (textField_46 == null) {
			textField_46 = new JTextField();
			textField_46.setHorizontalAlignment(SwingConstants.CENTER);
			textField_46.setColumns(10);
			textField_46.setBounds(2, 108, 50, 50);
			textField_46.setDocument(new JTextFieldLimit(1));
		}
		return textField_46;
	}
	private JTextField getTextField_47() {
		if (textField_47 == null) {
			textField_47 = new JTextField();
			textField_47.setHorizontalAlignment(SwingConstants.CENTER);
			textField_47.setColumns(10);
			textField_47.setBounds(54, 108, 50, 50);
			textField_47.setDocument(new JTextFieldLimit(1));
		}
		return textField_47;
	}
	private JTextField getTextField_48() {
		if (textField_48 == null) {
			textField_48 = new JTextField();
			textField_48.setHorizontalAlignment(SwingConstants.CENTER);
			textField_48.setColumns(10);
			textField_48.setBounds(107, 108, 50, 50);
			textField_48.setDocument(new JTextFieldLimit(1));
		}
		return textField_48;
	}

	private JTextField getTextField_22_1() {
		if (textField_31 == null) {
			textField_31 = new JTextField();
			textField_31.setHorizontalAlignment(SwingConstants.CENTER);
			textField_31.setColumns(10);
			textField_31.setBounds(2, 2, 50, 50);
			textField_31.setDocument(new JTextFieldLimit(1));
		}
		return textField_31;
	}
	private JTextField getTextField_32() {
		if (textField_32 == null) {
			textField_32 = new JTextField();
			textField_32.setHorizontalAlignment(SwingConstants.CENTER);
			textField_32.setColumns(10);
			textField_32.setBounds(54, 2, 50, 50);
			textField_32.setDocument(new JTextFieldLimit(1));
		}
		return textField_32;
	}
	private JTextField getTextField_33() {
		if (textField_33 == null) {
			textField_33 = new JTextField();
			textField_33.setHorizontalAlignment(SwingConstants.CENTER);
			textField_33.setColumns(10);
			textField_33.setBounds(107, 2, 50, 50);
			textField_33.setDocument(new JTextFieldLimit(1));
		}
		return textField_33;
	}
	private JTextField getTextField_40() {
		if (textField_40 == null) {
			textField_40 = new JTextField();
			textField_40.setHorizontalAlignment(SwingConstants.CENTER);
			textField_40.setColumns(10);
			textField_40.setBounds(2, 55, 50, 50);
			textField_40.setDocument(new JTextFieldLimit(1));
		}
		return textField_40;
	}
	private JTextField getTextField_41() {
		if (textField_41 == null) {
			textField_41 = new JTextField();
			textField_41.setHorizontalAlignment(SwingConstants.CENTER);
			textField_41.setColumns(10);
			textField_41.setBounds(54, 55, 50, 50);
			textField_41.setDocument(new JTextFieldLimit(1));
		}
		return textField_41;
	}
	private JTextField getTextField_42() {
		if (textField_42 == null) {
			textField_42 = new JTextField();
			textField_42.setHorizontalAlignment(SwingConstants.CENTER);
			textField_42.setColumns(10);
			textField_42.setBounds(107, 55, 50, 50);
			textField_42.setDocument(new JTextFieldLimit(1));
		}
		return textField_42;
	}
	private JTextField getTextField_49() {
		if (textField_49 == null) {
			textField_49 = new JTextField();
			textField_49.setHorizontalAlignment(SwingConstants.CENTER);
			textField_49.setColumns(10);
			textField_49.setBounds(2, 108, 50, 50);
			textField_49.setDocument(new JTextFieldLimit(1));
		}
		return textField_49;
	}
	private JTextField getTextField_50() {
		if (textField_50 == null) {
			textField_50 = new JTextField();
			textField_50.setHorizontalAlignment(SwingConstants.CENTER);
			textField_50.setColumns(10);
			textField_50.setBounds(54, 108, 50, 50);
			textField_50.setDocument(new JTextFieldLimit(1));
		}
		return textField_50;
	}
	private JTextField getTextField_51() {
		if (textField_51 == null) {
			textField_51 = new JTextField();
			textField_51.setHorizontalAlignment(SwingConstants.CENTER);
			textField_51.setColumns(10);
			textField_51.setBounds(107, 108, 50, 50);
			textField_51.setDocument(new JTextFieldLimit(1));
		}
		return textField_51;
	}

	private JTextField getTextField_22_2() {
		if (textField_34 == null) {
			textField_34 = new JTextField();
			textField_34.setHorizontalAlignment(SwingConstants.CENTER);
			textField_34.setColumns(10);
			textField_34.setBounds(2, 2, 50, 50);
			textField_34.setDocument(new JTextFieldLimit(1));
		}
		return textField_34;
	}
	private JTextField getTextField_35() {
		if (textField_35 == null) {
			textField_35 = new JTextField();
			textField_35.setHorizontalAlignment(SwingConstants.CENTER);
			textField_35.setColumns(10);
			textField_35.setBounds(54, 2, 50, 50);
			textField_35.setDocument(new JTextFieldLimit(1));
		}
		return textField_35;
	}
	private JTextField getTextField_36() {
		if (textField_36 == null) {
			textField_36 = new JTextField();
			textField_36.setHorizontalAlignment(SwingConstants.CENTER);
			textField_36.setColumns(10);
			textField_36.setBounds(107, 2, 50, 50);
			textField_36.setDocument(new JTextFieldLimit(1));
		}
		return textField_36;
	}
	private JTextField getTextField_43() {
		if (textField_43 == null) {
			textField_43 = new JTextField();
			textField_43.setHorizontalAlignment(SwingConstants.CENTER);
			textField_43.setColumns(10);
			textField_43.setBounds(2, 55, 50, 50);
			textField_43.setDocument(new JTextFieldLimit(1));
		}
		return textField_43;
	}
	private JTextField getTextField_44() {
		if (textField_44 == null) {
			textField_44 = new JTextField();
			textField_44.setHorizontalAlignment(SwingConstants.CENTER);
			textField_44.setColumns(10);
			textField_44.setBounds(54, 55, 50, 50);
			textField_44.setDocument(new JTextFieldLimit(1));
		}
		return textField_44;
	}
	private JTextField getTextField_45() {
		if (textField_45 == null) {
			textField_45 = new JTextField();
			textField_45.setHorizontalAlignment(SwingConstants.CENTER);
			textField_45.setColumns(10);
			textField_45.setBounds(107, 55, 50, 50);
			textField_45.setDocument(new JTextFieldLimit(1));
		}
		return textField_45;
	}
	private JTextField getTextField_52() {
		if (textField_52 == null) {
			textField_52 = new JTextField();
			textField_52.setHorizontalAlignment(SwingConstants.CENTER);
			textField_52.setColumns(10);
			textField_52.setBounds(2, 108, 50, 50);
			textField_52.setDocument(new JTextFieldLimit(1));
		}
		return textField_52;
	}
	private JTextField getTextField_53() {
		if (textField_53 == null) {
			textField_53 = new JTextField();
			textField_53.setHorizontalAlignment(SwingConstants.CENTER);
			textField_53.setColumns(10);
			textField_53.setBounds(54, 108, 50, 50);
			textField_53.setDocument(new JTextFieldLimit(1));
		}
		return textField_53;
	}
	private JTextField getTextField_54() {
		if (textField_54 == null) {
			textField_54 = new JTextField();
			textField_54.setHorizontalAlignment(SwingConstants.CENTER);
			textField_54.setColumns(10);
			textField_54.setBounds(107, 108, 50, 50);
			textField_54.setDocument(new JTextFieldLimit(1));
		}
		return textField_54;
	}

	private JTextField getTextField_55() {
		if (textField_55 == null) {
			textField_55 = new JTextField();
			textField_55.setHorizontalAlignment(SwingConstants.CENTER);
			textField_55.setColumns(10);
			textField_55.setBounds(2, 2, 50, 50);
			textField_55.setDocument(new JTextFieldLimit(1));
		}
		return textField_55;
	}
	private JTextField getTextField_56() {
		if (textField_56 == null) {
			textField_56 = new JTextField();
			textField_56.setHorizontalAlignment(SwingConstants.CENTER);
			textField_56.setColumns(10);
			textField_56.setBounds(54, 2, 50, 50);
			textField_56.setDocument(new JTextFieldLimit(1));
		}
		return textField_56;
	}
	private JTextField getTextField_57() {
		if (textField_57 == null) {
			textField_57 = new JTextField();
			textField_57.setHorizontalAlignment(SwingConstants.CENTER);
			textField_57.setColumns(10);
			textField_57.setBounds(107, 2, 50, 50);
			textField_57.setDocument(new JTextFieldLimit(1));
		}
		return textField_57;
	}
	private JTextField getTextField_64() {
		if (textField_64 == null) {
			textField_64 = new JTextField();
			textField_64.setHorizontalAlignment(SwingConstants.CENTER);
			textField_64.setColumns(10);
			textField_64.setBounds(2, 55, 50, 50);
			textField_64.setDocument(new JTextFieldLimit(1));
		}
		return textField_64;
	}
	private JTextField getTextField_65() {
		if (textField_65 == null) {
			textField_65 = new JTextField();
			textField_65.setHorizontalAlignment(SwingConstants.CENTER);
			textField_65.setColumns(10);
			textField_65.setBounds(54, 55, 50, 50);
			textField_65.setDocument(new JTextFieldLimit(1));
		}
		return textField_65;
	}
	private JTextField getTextField_66() {
		if (textField_66 == null) {
			textField_66 = new JTextField();
			textField_66.setHorizontalAlignment(SwingConstants.CENTER);
			textField_66.setColumns(10);
			textField_66.setBounds(107, 55, 50, 50);
			textField_66.setDocument(new JTextFieldLimit(1));
		}
		return textField_66;
	}
	private JTextField getTextField_73() {
		if (textField_73 == null) {
			textField_73 = new JTextField();
			textField_73.setHorizontalAlignment(SwingConstants.CENTER);
			textField_73.setColumns(10);
			textField_73.setBounds(2, 108, 50, 50);
			textField_73.setDocument(new JTextFieldLimit(1));
		}
		return textField_73;
	}
	private JTextField getTextField_74() {
		if (textField_74 == null) {
			textField_74 = new JTextField();
			textField_74.setHorizontalAlignment(SwingConstants.CENTER);
			textField_74.setColumns(10);
			textField_74.setBounds(54, 108, 50, 50);
			textField_74.setDocument(new JTextFieldLimit(1));
		}
		return textField_74;
	}
	private JTextField getTextField_75() {
		if (textField_75 == null) {
			textField_75 = new JTextField();
			textField_75.setHorizontalAlignment(SwingConstants.CENTER);
			textField_75.setColumns(10);
			textField_75.setBounds(107, 108, 50, 50);
			textField_75.setDocument(new JTextFieldLimit(1));
		}
		return textField_75;
	}

	private JTextField getTextField_22_4() {
		if (textField_58 == null) {
			textField_58 = new JTextField();
			textField_58.setHorizontalAlignment(SwingConstants.CENTER);
			textField_58.setColumns(10);
			textField_58.setBounds(2, 2, 50, 50);
			textField_58.setDocument(new JTextFieldLimit(1));
		}
		return textField_58;
	}
	private JTextField getTextField_59() {
		if (textField_59 == null) {
			textField_59 = new JTextField();
			textField_59.setHorizontalAlignment(SwingConstants.CENTER);
			textField_59.setColumns(10);
			textField_59.setBounds(54, 2, 50, 50);
			textField_59.setDocument(new JTextFieldLimit(1));
		}
		return textField_59;
	}
	private JTextField getTextField_60() {
		if (textField_60 == null) {
			textField_60 = new JTextField();
			textField_60.setHorizontalAlignment(SwingConstants.CENTER);
			textField_60.setColumns(10);
			textField_60.setBounds(107, 2, 50, 50);
			textField_60.setDocument(new JTextFieldLimit(1));
		}
		return textField_60;
	}
	private JTextField getTextField_67() {
		if (textField_67 == null) {
			textField_67 = new JTextField();
			textField_67.setHorizontalAlignment(SwingConstants.CENTER);
			textField_67.setColumns(10);
			textField_67.setBounds(2, 55, 50, 50);
			textField_67.setDocument(new JTextFieldLimit(1));
		}
		return textField_67;
	}
	private JTextField getTextField_68() {
		if (textField_68 == null) {
			textField_68 = new JTextField();
			textField_68.setHorizontalAlignment(SwingConstants.CENTER);
			textField_68.setColumns(10);
			textField_68.setBounds(54, 55, 50, 50);
			textField_68.setDocument(new JTextFieldLimit(1));
		}
		return textField_68;
	}
	private JTextField getTextField_69() {
		if (textField_69 == null) {
			textField_69 = new JTextField();
			textField_69.setHorizontalAlignment(SwingConstants.CENTER);
			textField_69.setColumns(10);
			textField_69.setBounds(107, 55, 50, 50);
			textField_69.setDocument(new JTextFieldLimit(1));
		}
		return textField_69;
	}
	private JTextField getTextField_76() {
		if (textField_76 == null) {
			textField_76 = new JTextField();
			textField_76.setHorizontalAlignment(SwingConstants.CENTER);
			textField_76.setColumns(10);
			textField_76.setBounds(2, 108, 50, 50);
			textField_76.setDocument(new JTextFieldLimit(1));
		}
		return textField_76;
	}
	private JTextField getTextField_77() {
		if (textField_77 == null) {
			textField_77 = new JTextField();
			textField_77.setHorizontalAlignment(SwingConstants.CENTER);
			textField_77.setColumns(10);
			textField_77.setBounds(54, 108, 50, 50);
			textField_77.setDocument(new JTextFieldLimit(1));
		}
		return textField_77;
	}
	private JTextField getTextField_78() {
		if (textField_78 == null) {
			textField_78 = new JTextField();
			textField_78.setHorizontalAlignment(SwingConstants.CENTER);
			textField_78.setColumns(10);
			textField_78.setBounds(107, 108, 50, 50);
			textField_78.setDocument(new JTextFieldLimit(1));
		}
		return textField_78;
	}
	
	private JTextField getTextField_61() {
		if (textField_61 == null) {
			textField_61 = new JTextField();
			textField_61.setHorizontalAlignment(SwingConstants.CENTER);
			textField_61.setColumns(10);
			textField_61.setBounds(2, 2, 50, 50);
			textField_61.setDocument(new JTextFieldLimit(1));
		}
		return textField_61;
	}
	private JTextField getTextField_62() {
		if (textField_62 == null) {
			textField_62 = new JTextField();
			textField_62.setHorizontalAlignment(SwingConstants.CENTER);
			textField_62.setColumns(10);
			textField_62.setBounds(54, 2, 50, 50);
			textField_62.setDocument(new JTextFieldLimit(1));
		}
		return textField_62;
	}
	private JTextField getTextField_63() {
		if (textField_63 == null) {
			textField_63 = new JTextField();
			textField_63.setHorizontalAlignment(SwingConstants.CENTER);
			textField_63.setColumns(10);
			textField_63.setBounds(107, 2, 50, 50);
			textField_63.setDocument(new JTextFieldLimit(1));
		}
		return textField_63;
	}
	private JTextField getTextField_70() {
		if (textField_70 == null) {
			textField_70 = new JTextField();
			textField_70.setHorizontalAlignment(SwingConstants.CENTER);
			textField_70.setColumns(10);
			textField_70.setBounds(2, 55, 50, 50);
			textField_70.setDocument(new JTextFieldLimit(1));
		}
		return textField_70;
	}
	private JTextField getTextField_71() {
		if (textField_71 == null) {
			textField_71 = new JTextField();
			textField_71.setHorizontalAlignment(SwingConstants.CENTER);
			textField_71.setColumns(10);
			textField_71.setBounds(54, 55, 50, 50);
			textField_71.setDocument(new JTextFieldLimit(1));
		}
		return textField_71;
	}
	private JTextField getTextField_72() {
		if (textField_72 == null) {
			textField_72 = new JTextField();
			textField_72.setHorizontalAlignment(SwingConstants.CENTER);
			textField_72.setColumns(10);
			textField_72.setBounds(107, 55, 50, 50);
			textField_72.setDocument(new JTextFieldLimit(1));
		}
		return textField_72;
	}
	private JTextField getTextField_79() {
		if (textField_79 == null) {
			textField_79 = new JTextField();
			textField_79.setHorizontalAlignment(SwingConstants.CENTER);
			textField_79.setColumns(10);
			textField_79.setBounds(2, 108, 50, 50);
			textField_79.setDocument(new JTextFieldLimit(1));
		}
		return textField_79;
	}
	private JTextField getTextField_80() {
		if (textField_80 == null) {
			textField_80 = new JTextField();
			textField_80.setHorizontalAlignment(SwingConstants.CENTER);
			textField_80.setColumns(10);
			textField_80.setBounds(54, 108, 50, 50);
			textField_80.setDocument(new JTextFieldLimit(1));
		}
		return textField_80;
	}
	private JTextField getTextField_81() {
		if (textField_81 == null) {
			textField_81 = new JTextField();
			textField_81.setHorizontalAlignment(SwingConstants.CENTER);
			textField_81.setColumns(10);
			textField_81.setBounds(107, 108, 50, 50);
			textField_81.setDocument(new JTextFieldLimit(1));
		}
		return textField_81;
	}

	public void setTextField_1(JTextField pTextField_1) {
		textField_1.setText(pTextField_1.getText());
		textField_1.setEditable(false);
	}

	public void setTextField_4(JTextField pTextField_4) {
		textField_4.setText(pTextField_4.getText());
		textField_4.setEditable(false);
	}

	public void setTextField_5(JTextField pTextField_5) {
		textField_5.setText(pTextField_5.getText());
		textField_5.setEditable(false);
	}

	public void setTextField_6(JTextField pTextField_6) {
		textField_6.setText(pTextField_6.getText());
		textField_6.setEditable(false);
	}

	public void setTextField_7(JTextField pTextField_7) {
		textField_7.setText(pTextField_7.getText());
		textField_7.setEditable(false);
	}

	public void setTextField_8(JTextField pTextField_8) {
		textField_8.setText(pTextField_8.getText());
		textField_8.setEditable(false);
	}

	public void setTextField_9(JTextField pTextField_9) {
		textField_9.setText(pTextField_9.getText());
		textField_9.setEditable(false);
	}

	public void setTextField_2(JTextField pTextField_2) {
		textField_2.setText(pTextField_2.getText());
		textField_2.setEditable(false);
	}

	public void setTextField_3(JTextField pTextField_3) {
		textField_3.setText(pTextField_3.getText());
		textField_3.setEditable(false);
	}

	public void setTextField_10(JTextField pTextField_10) {
		textField_10.setText(pTextField_10.getText());
		textField_10.setEditable(false);
	}

	public void setTextField_11(JTextField pTextField_11) {
		textField_11.setText(pTextField_11.getText());;
		textField_11.setEditable(false);
	}

	public void setTextField_12(JTextField pTextField_12) {
		textField_12.setText(pTextField_12.getText());
		textField_12.setEditable(false);
	}

	public void setTextField_13(JTextField pTextField_13) {
		textField_13.setText(pTextField_13.getText());
		textField_13.setEditable(false);
	}

	public void setTextField_14(JTextField pTextField_14) {
		textField_14.setText(pTextField_14.getText());
		textField_14.setEditable(false);
	}

	public void setTextField_15(JTextField pTextField_15) {
		textField_15.setText(pTextField_15.getText());
		textField_15.setEditable(false);
	}

	public void setTextField_16(JTextField pTextField_16) {
		textField_16.setText(pTextField_16.getText());
		textField_16.setEditable(false);
	}

	public void setTextField_17(JTextField pTextField_17) {
		textField_17.setText(pTextField_17.getText());
		textField_17.setEditable(false);
	}

	public void setTextField_18(JTextField pTextField_18) {
		textField_18.setText(pTextField_18.getText());
		textField_18.setEditable(false);
	}

	public void setTextField_19(JTextField pTextField_19) {
		textField_19.setText(pTextField_19.getText());
		textField_19.setEditable(false);
	}

	public void setTextField_20(JTextField pTextField_20) {
		textField_20.setText(pTextField_20.getText());
		textField_20.setEditable(false);
	}

	public void setTextField_21(JTextField pTextField_21) {
		textField_21.setText(pTextField_21.getText());
		textField_21.setEditable(false);
	}

	public void setTextField_22(JTextField pTextField_22) {
		textField_22.setText(pTextField_22.getText());
		textField_22.setEditable(false);
	}

	public void setTextField_23(JTextField pTextField_23) {
		textField_23.setText(pTextField_23.getText());
		textField_23.setEditable(false);
	}

	public void setTextField_24(JTextField pTextField_24) {
		textField_24.setText(pTextField_24.getText());
		textField_24.setEditable(false);
	}

	public void setTextField_25(JTextField pTextField_25) {
		textField_25.setText(pTextField_25.getText());
		textField_25.setEditable(false);
	}

	public void setTextField_26(JTextField pTextField_26) {
		textField_26.setText(pTextField_26.getText());
		textField_26.setEditable(false);
	}

	public void setTextField_27(JTextField pTextField_27) {
		textField_27.setText(pTextField_27.getText());
		textField_27.setEditable(false);
	}

	public void setTextField_28(JTextField pTextField_28) {
		textField_28.setText(pTextField_28.getText());
		textField_28.setEditable(false);
	}

	public void setTextField_29(JTextField pTextField_29) {
		textField_29.setText(pTextField_29.getText());
		textField_29.setEditable(false);
	}

	public void setTextField_30(JTextField pTextField_30) {
		textField_30.setText(pTextField_30.getText());
		textField_30.setEditable(false);
	}

	public void setTextField_37(JTextField pTextField_37) {
		textField_37.setText(pTextField_37.getText());
		textField_37.setEditable(false);
	}

	public void setTextField_38(JTextField pTextField_38) {
		textField_38.setText(pTextField_38.getText());
		textField_38.setEditable(false);
	}

	public void setTextField_39(JTextField pTextField_39) {
		textField_39.setText(pTextField_39.getText());
		textField_39.setEditable(false);
	}

	public void setTextField_46(JTextField pTextField_46) {
		textField_46.setText(pTextField_46.getText());
		textField_46.setEditable(false);
	}

	public void setTextField_47(JTextField pTextField_47) {
		textField_47.setText(pTextField_47.getText());
		textField_47.setEditable(false);
	}

	public void setTextField_48(JTextField pTextField_48) {
		textField_48.setText(pTextField_48.getText());
		textField_48.setEditable(false);
	}

	public void setTextField_31(JTextField pTextField_31) {
		textField_31.setText(pTextField_31.getText());
		textField_31.setEditable(false);
	}

	public void setTextField_32(JTextField pTextField_32) {
		textField_32.setText(pTextField_32.getText());
		textField_32.setEditable(false);
	}

	public void setTextField_33(JTextField pTextField_33) {
		textField_33.setText(pTextField_33.getText());
		textField_33.setEditable(false);
	}

	public void setTextField_40(JTextField pTextField_40) {
		textField_40.setText(pTextField_40.getText());
		textField_40.setEditable(false);
	}

	public void setTextField_41(JTextField pTextField_41) {
		textField_41.setText(pTextField_41.getText());
		textField_41.setEditable(false);
	}

	public void setTextField_42(JTextField pTextField_42) {
		textField_42.setText(pTextField_42.getText());
		textField_42.setEditable(false);
	}

	public void setTextField_49(JTextField pTextField_49) {
		textField_49.setText(pTextField_49.getText());
		textField_49.setEditable(false);
	}

	public void setTextField_50(JTextField pTextField_50) {
		textField_50.setText(pTextField_50.getText());
		textField_50.setEditable(false);
	}

	public void setTextField_51(JTextField pTextField_51) {
		textField_51.setText(pTextField_51.getText());
		textField_51.setEditable(false);
	}

	public void setTextField_34(JTextField pTextField_34) {
		textField_34.setText(pTextField_34.getText());
		textField_34.setEditable(false);
	}

	public void setTextField_35(JTextField pTextField_35) {
		textField_35.setText(pTextField_35.getText());
		textField_35.setEditable(false);
	}

	public void setTextField_36(JTextField pTextField_36) {
		textField_36.setText(pTextField_36.getText());
		textField_36.setEditable(false);
	}

	public void setTextField_43(JTextField pTextField_43) {
		textField_43.setText(pTextField_43.getText());
		textField_43.setEditable(false);
	}

	public void setTextField_44(JTextField pTextField_44) {
		textField_44.setText(pTextField_44.getText());
		textField_44.setEditable(false);
	}

	public void setTextField_45(JTextField pTextField_45) {
		textField_45.setText(pTextField_45.getText());
		textField_45.setEditable(false);
	}

	public void setTextField_52(JTextField pTextField_52) {
		textField_52.setText(pTextField_52.getText());
		textField_52.setEditable(false);
	}

	public void setTextField_53(JTextField pTextField_53) {
		textField_53.setText(pTextField_53.getText());
		textField_53.setEditable(false);
	}

	public void setTextField_54(JTextField pTextField_54) {
		textField_54.setText(pTextField_54.getText());
		textField_54.setEditable(false);
	}

	public void setTextField_55(JTextField pTextField_55) {
		textField_55.setText(pTextField_55.getText());
		textField_55.setEditable(false);
	}

	public void setTextField_56(JTextField pTextField_56) {
		textField_56.setText(pTextField_56.getText());
		textField_56.setEditable(false);
	}

	public void setTextField_57(JTextField pTextField_57) {
		textField_57.setText(pTextField_57.getText());
		textField_57.setEditable(false);
	}

	public void setTextField_64(JTextField pTextField_64) {
		textField_64.setText(pTextField_64.getText());
		textField_64.setEditable(false);
	}

	public void setTextField_65(JTextField pTextField_65) {
		textField_65.setText(pTextField_65.getText());
		textField_65.setEditable(false);
	}

	public void setTextField_66(JTextField pTextField_66) {
		textField_66.setText(pTextField_66.getText());
		textField_66.setEditable(false);
	}

	public void setTextField_73(JTextField pTextField_73) {
		textField_73.setText(pTextField_73.getText());
		textField_73.setEditable(false);
	}

	public void setTextField_74(JTextField pTextField_74) {
		textField_74.setText(pTextField_74.getText());
		textField_74.setEditable(false);
	}

	public void setTextField_75(JTextField pTextField_75) {
		textField_75.setText(pTextField_75.getText());
		textField_75.setEditable(false);
	}

	public void setTextField_58(JTextField pTextField_58) {
		textField_58.setText(pTextField_58.getText());
		textField_58.setEditable(false);
	}

	public void setTextField_59(JTextField pTextField_59) {
		textField_59.setText(pTextField_59.getText());
		textField_59.setEditable(false);
	}

	public void setTextField_60(JTextField pTextField_60) {
		textField_60.setText(pTextField_60.getText());
		textField_60.setEditable(false);
	}

	public void setTextField_67(JTextField pTextField_67) {
		textField_67.setText(pTextField_67.getText());
		textField_67.setEditable(false);
	}

	public void setTextField_68(JTextField pTextField_68) {
		textField_68.setText(pTextField_68.getText());
		textField_68.setEditable(false);
	}

	public void setTextField_69(JTextField pTextField_69) {
		textField_69.setText(pTextField_69.getText());
		textField_69.setEditable(false);
	}

	public void setTextField_76(JTextField pTextField_76) {
		textField_76.setText(pTextField_76.getText());
		textField_76.setEditable(false);
	}

	public void setTextField_77(JTextField pTextField_77) {
		textField_77.setText(pTextField_77.getText());
		textField_77.setEditable(false);
	}

	public void setTextField_78(JTextField pTextField_78) {
		textField_78.setText(pTextField_78.getText());
		textField_78.setEditable(false);
	}

	public void setTextField_61(JTextField pTextField_61) {
		textField_61.setText(pTextField_61.getText());
		textField_61.setEditable(false);
	}

	public void setTextField_62(JTextField pTextField_62) {
		textField_62.setText(pTextField_62.getText());
		textField_62.setEditable(false);
	}

	public void setTextField_63(JTextField pTextField_63) {
		textField_63.setText(pTextField_63.getText());
		textField_63.setEditable(false);
	}

	public void setTextField_70(JTextField pTextField_70) {
		textField_70.setText(pTextField_70.getText());
		textField_70.setEditable(false);
	}

	public void setTextField_71(JTextField pTextField_71) {
		textField_71.setText(pTextField_71.getText());
		textField_71.setEditable(false);
	}

	public void setTextField_72(JTextField pTextField_72) {
		textField_72.setText(pTextField_72.getText());
		textField_72.setEditable(false);
	}

	public void setTextField_79(JTextField pTextField_79) {
		textField_79.setText(pTextField_79.getText());
		textField_79.setEditable(false);
	}

	public void setTextField_80(JTextField pTextField_80) {
		textField_80.setText(pTextField_80.getText());
		textField_80.setEditable(false);
	}

	public void setTextField_81(JTextField pTextField_81) {
		textField_81.setText(pTextField_81.getText());
		textField_81.setEditable(false);
	}

	private JLabel getDifficultyLevel() {
		if (difficultyLevel == null) {
			difficultyLevel = new JLabel("");
			difficultyLevel.setHorizontalAlignment(SwingConstants.CENTER);
			difficultyLevel.setBounds(144, 17, 61, 16);
		}
		return difficultyLevel;
	}
	private JLabel getSudokuOwner() {
		if (sudokuOwner == null) {
			sudokuOwner = new JLabel("");
			sudokuOwner.setBounds(268, 17, 61, 16);
		}
		return sudokuOwner;
	}
	public void setDifficultyLevel(JLabel pDifficultyLevel) {
		difficultyLevel.setText(pDifficultyLevel.getText());
	}

	public void setSudokuOwner(JLabel pSudokuOwner) {
		sudokuOwner.setText(pSudokuOwner.getText());
	}

	public void setSudokuId(JLabel pSudokuId) {
		sudokuId.setText(pSudokuId.getText());
	}

	private JLabel getSudokuId() {
		if (sudokuId == null) {
			sudokuId = new JLabel("");
			sudokuId.setHorizontalAlignment(SwingConstants.RIGHT);
			sudokuId.setBounds(494, 17, 61, 16);
		}
		return sudokuId;
	}
	private JLabel getDLevel() {
		if (dLevel == null) {
			dLevel = new JLabel("Nivel de dificultad:");
			dLevel.setBounds(45, 17, 119, 16);
		}
		return dLevel;
	}
	private JLabel getIdSudoku() {
		if (IdSudoku == null) {
			IdSudoku = new JLabel("Codigo de sudoku:");
			IdSudoku.setBounds(395, 17, 119, 16);
		}
		return IdSudoku;
	}
}
