package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class cargarSudoku extends JFrame {

	private JPanel contentPane;
	private JPanel primeraCuadricula;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPanel segundaCuadricula;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JPanel terceraCuadricula;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JPanel cuartaCuadricula;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JPanel quintaCuadricula;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JPanel sextaCuadricula;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JPanel septimaCuadricula;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JPanel octavaCuadricula;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JPanel novenaCuadricula;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;

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
		contentPane.add(getPrimeraCuadricula());
		contentPane.add(getSegundaCuadricula());
		contentPane.add(getTerceraCuadricula());
		contentPane.add(getCuartaCuadricula());
		contentPane.add(getQuintaCuadricula());
		contentPane.add(getSextaCuadricula());
		contentPane.add(getSeptimaCuadricula());
		contentPane.add(getOctavaCuadricula());
		contentPane.add(getNovenaCuadricula());
	}
	private JPanel getPrimeraCuadricula() {
		if (primeraCuadricula == null) {
			primeraCuadricula = new JPanel();
			primeraCuadricula.setBounds(45, 45, 160, 160);
			primeraCuadricula.setLayout(null);
			primeraCuadricula.add(getTextField());
			primeraCuadricula.add(getTextField_1());
			primeraCuadricula.add(getTextField_2());
			primeraCuadricula.add(getTextField_3());
			primeraCuadricula.add(getTextField_4());
			primeraCuadricula.add(getTextField_5());
			primeraCuadricula.add(getTextField_6());
			primeraCuadricula.add(getTextField_7());
			primeraCuadricula.add(getTextField_8());
		}
		return primeraCuadricula;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(2, 2, 50, 50);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(2, 55, 50, 50);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(2, 108, 50, 50);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(54, 2, 50, 50);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(54, 55, 50, 50);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(54, 108, 50, 50);
		}
		return textField_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(107, 2, 50, 50);
		}
		return textField_6;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(107, 55, 50, 50);
		}
		return textField_7;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(107, 108, 50, 50);
		}
		return textField_8;
	}
	private JPanel getSegundaCuadricula() {
		if (segundaCuadricula == null) {
			segundaCuadricula = new JPanel();
			segundaCuadricula.setLayout(null);
			segundaCuadricula.setBounds(220, 45, 160, 160);
			segundaCuadricula.add(getTextField_9());
			segundaCuadricula.add(getTextField_10());
			segundaCuadricula.add(getTextField_11());
			segundaCuadricula.add(getTextField_12());
			segundaCuadricula.add(getTextField_13());
			segundaCuadricula.add(getTextField_14());
			segundaCuadricula.add(getTextField_15());
			segundaCuadricula.add(getTextField_16());
			segundaCuadricula.add(getTextField_17());
		}
		return segundaCuadricula;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(2, 2, 50, 50);
		}
		return textField_9;
	}
	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(2, 55, 50, 50);
		}
		return textField_10;
	}
	private JTextField getTextField_11() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(2, 108, 50, 50);
		}
		return textField_11;
	}
	private JTextField getTextField_12() {
		if (textField_12 == null) {
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(54, 2, 50, 50);
		}
		return textField_12;
	}
	private JTextField getTextField_13() {
		if (textField_13 == null) {
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(54, 55, 50, 50);
		}
		return textField_13;
	}
	private JTextField getTextField_14() {
		if (textField_14 == null) {
			textField_14 = new JTextField();
			textField_14.setColumns(10);
			textField_14.setBounds(54, 108, 50, 50);
		}
		return textField_14;
	}
	private JTextField getTextField_15() {
		if (textField_15 == null) {
			textField_15 = new JTextField();
			textField_15.setColumns(10);
			textField_15.setBounds(107, 2, 50, 50);
		}
		return textField_15;
	}
	private JTextField getTextField_16() {
		if (textField_16 == null) {
			textField_16 = new JTextField();
			textField_16.setColumns(10);
			textField_16.setBounds(107, 55, 50, 50);
		}
		return textField_16;
	}
	private JTextField getTextField_17() {
		if (textField_17 == null) {
			textField_17 = new JTextField();
			textField_17.setColumns(10);
			textField_17.setBounds(107, 108, 50, 50);
		}
		return textField_17;
	}
	private JPanel getTerceraCuadricula() {
		if (terceraCuadricula == null) {
			terceraCuadricula = new JPanel();
			terceraCuadricula.setLayout(null);
			terceraCuadricula.setBounds(395, 45, 160, 160);
			terceraCuadricula.add(getTextField_18());
			terceraCuadricula.add(getTextField_19());
			terceraCuadricula.add(getTextField_20());
			terceraCuadricula.add(getTextField_21());
			terceraCuadricula.add(getTextField_22());
			terceraCuadricula.add(getTextField_23());
			terceraCuadricula.add(getTextField_24());
			terceraCuadricula.add(getTextField_25());
			terceraCuadricula.add(getTextField_26());
		}
		return terceraCuadricula;
	}
	private JTextField getTextField_18() {
		if (textField_18 == null) {
			textField_18 = new JTextField();
			textField_18.setColumns(10);
			textField_18.setBounds(2, 2, 50, 50);
		}
		return textField_18;
	}
	private JTextField getTextField_19() {
		if (textField_19 == null) {
			textField_19 = new JTextField();
			textField_19.setColumns(10);
			textField_19.setBounds(2, 55, 50, 50);
		}
		return textField_19;
	}
	private JTextField getTextField_20() {
		if (textField_20 == null) {
			textField_20 = new JTextField();
			textField_20.setColumns(10);
			textField_20.setBounds(2, 108, 50, 50);
		}
		return textField_20;
	}
	private JTextField getTextField_21() {
		if (textField_21 == null) {
			textField_21 = new JTextField();
			textField_21.setColumns(10);
			textField_21.setBounds(54, 2, 50, 50);
		}
		return textField_21;
	}
	private JTextField getTextField_22() {
		if (textField_22 == null) {
			textField_22 = new JTextField();
			textField_22.setColumns(10);
			textField_22.setBounds(54, 55, 50, 50);
		}
		return textField_22;
	}
	private JTextField getTextField_23() {
		if (textField_23 == null) {
			textField_23 = new JTextField();
			textField_23.setColumns(10);
			textField_23.setBounds(54, 108, 50, 50);
		}
		return textField_23;
	}
	private JTextField getTextField_24() {
		if (textField_24 == null) {
			textField_24 = new JTextField();
			textField_24.setColumns(10);
			textField_24.setBounds(107, 2, 50, 50);
		}
		return textField_24;
	}
	private JTextField getTextField_25() {
		if (textField_25 == null) {
			textField_25 = new JTextField();
			textField_25.setColumns(10);
			textField_25.setBounds(107, 55, 50, 50);
		}
		return textField_25;
	}
	private JTextField getTextField_26() {
		if (textField_26 == null) {
			textField_26 = new JTextField();
			textField_26.setColumns(10);
			textField_26.setBounds(107, 108, 50, 50);
		}
		return textField_26;
	}
	private JPanel getCuartaCuadricula() {
		if (cuartaCuadricula == null) {
			cuartaCuadricula = new JPanel();
			cuartaCuadricula.setLayout(null);
			cuartaCuadricula.setBounds(45, 220, 160, 160);
			cuartaCuadricula.add(getTextField_27());
			cuartaCuadricula.add(getTextField_28());
			cuartaCuadricula.add(getTextField_29());
			cuartaCuadricula.add(getTextField_30());
			cuartaCuadricula.add(getTextField_31());
			cuartaCuadricula.add(getTextField_32());
			cuartaCuadricula.add(getTextField_33());
			cuartaCuadricula.add(getTextField_34());
			cuartaCuadricula.add(getTextField_35());
		}
		return cuartaCuadricula;
	}
	private JTextField getTextField_27() {
		if (textField_27 == null) {
			textField_27 = new JTextField();
			textField_27.setColumns(10);
			textField_27.setBounds(2, 2, 50, 50);
		}
		return textField_27;
	}
	private JTextField getTextField_28() {
		if (textField_28 == null) {
			textField_28 = new JTextField();
			textField_28.setColumns(10);
			textField_28.setBounds(2, 55, 50, 50);
		}
		return textField_28;
	}
	private JTextField getTextField_29() {
		if (textField_29 == null) {
			textField_29 = new JTextField();
			textField_29.setColumns(10);
			textField_29.setBounds(2, 108, 50, 50);
		}
		return textField_29;
	}
	private JTextField getTextField_30() {
		if (textField_30 == null) {
			textField_30 = new JTextField();
			textField_30.setColumns(10);
			textField_30.setBounds(54, 2, 50, 50);
		}
		return textField_30;
	}
	private JTextField getTextField_31() {
		if (textField_31 == null) {
			textField_31 = new JTextField();
			textField_31.setColumns(10);
			textField_31.setBounds(54, 55, 50, 50);
		}
		return textField_31;
	}
	private JTextField getTextField_32() {
		if (textField_32 == null) {
			textField_32 = new JTextField();
			textField_32.setColumns(10);
			textField_32.setBounds(54, 108, 50, 50);
		}
		return textField_32;
	}
	private JTextField getTextField_33() {
		if (textField_33 == null) {
			textField_33 = new JTextField();
			textField_33.setColumns(10);
			textField_33.setBounds(107, 2, 50, 50);
		}
		return textField_33;
	}
	private JTextField getTextField_34() {
		if (textField_34 == null) {
			textField_34 = new JTextField();
			textField_34.setColumns(10);
			textField_34.setBounds(107, 55, 50, 50);
		}
		return textField_34;
	}
	private JTextField getTextField_35() {
		if (textField_35 == null) {
			textField_35 = new JTextField();
			textField_35.setColumns(10);
			textField_35.setBounds(107, 108, 50, 50);
		}
		return textField_35;
	}
	private JPanel getQuintaCuadricula() {
		if (quintaCuadricula == null) {
			quintaCuadricula = new JPanel();
			quintaCuadricula.setLayout(null);
			quintaCuadricula.setBounds(220, 220, 160, 160);
			quintaCuadricula.add(getTextField_36());
			quintaCuadricula.add(getTextField_37());
			quintaCuadricula.add(getTextField_38());
			quintaCuadricula.add(getTextField_39());
			quintaCuadricula.add(getTextField_40());
			quintaCuadricula.add(getTextField_41());
			quintaCuadricula.add(getTextField_42());
			quintaCuadricula.add(getTextField_43());
			quintaCuadricula.add(getTextField_44());
		}
		return quintaCuadricula;
	}
	private JTextField getTextField_36() {
		if (textField_36 == null) {
			textField_36 = new JTextField();
			textField_36.setColumns(10);
			textField_36.setBounds(2, 2, 50, 50);
		}
		return textField_36;
	}
	private JTextField getTextField_37() {
		if (textField_37 == null) {
			textField_37 = new JTextField();
			textField_37.setColumns(10);
			textField_37.setBounds(2, 55, 50, 50);
		}
		return textField_37;
	}
	private JTextField getTextField_38() {
		if (textField_38 == null) {
			textField_38 = new JTextField();
			textField_38.setColumns(10);
			textField_38.setBounds(2, 108, 50, 50);
		}
		return textField_38;
	}
	private JTextField getTextField_39() {
		if (textField_39 == null) {
			textField_39 = new JTextField();
			textField_39.setColumns(10);
			textField_39.setBounds(54, 2, 50, 50);
		}
		return textField_39;
	}
	private JTextField getTextField_40() {
		if (textField_40 == null) {
			textField_40 = new JTextField();
			textField_40.setColumns(10);
			textField_40.setBounds(54, 55, 50, 50);
		}
		return textField_40;
	}
	private JTextField getTextField_41() {
		if (textField_41 == null) {
			textField_41 = new JTextField();
			textField_41.setColumns(10);
			textField_41.setBounds(54, 108, 50, 50);
		}
		return textField_41;
	}
	private JTextField getTextField_42() {
		if (textField_42 == null) {
			textField_42 = new JTextField();
			textField_42.setColumns(10);
			textField_42.setBounds(107, 2, 50, 50);
		}
		return textField_42;
	}
	private JTextField getTextField_43() {
		if (textField_43 == null) {
			textField_43 = new JTextField();
			textField_43.setColumns(10);
			textField_43.setBounds(107, 55, 50, 50);
		}
		return textField_43;
	}
	private JTextField getTextField_44() {
		if (textField_44 == null) {
			textField_44 = new JTextField();
			textField_44.setColumns(10);
			textField_44.setBounds(107, 108, 50, 50);
		}
		return textField_44;
	}
	private JPanel getSextaCuadricula() {
		if (sextaCuadricula == null) {
			sextaCuadricula = new JPanel();
			sextaCuadricula.setLayout(null);
			sextaCuadricula.setBounds(395, 220, 160, 160);
			sextaCuadricula.add(getTextField_45());
			sextaCuadricula.add(getTextField_46());
			sextaCuadricula.add(getTextField_47());
			sextaCuadricula.add(getTextField_48());
			sextaCuadricula.add(getTextField_49());
			sextaCuadricula.add(getTextField_50());
			sextaCuadricula.add(getTextField_51());
			sextaCuadricula.add(getTextField_52());
			sextaCuadricula.add(getTextField_53());
		}
		return sextaCuadricula;
	}
	private JTextField getTextField_45() {
		if (textField_45 == null) {
			textField_45 = new JTextField();
			textField_45.setColumns(10);
			textField_45.setBounds(2, 2, 50, 50);
		}
		return textField_45;
	}
	private JTextField getTextField_46() {
		if (textField_46 == null) {
			textField_46 = new JTextField();
			textField_46.setColumns(10);
			textField_46.setBounds(2, 55, 50, 50);
		}
		return textField_46;
	}
	private JTextField getTextField_47() {
		if (textField_47 == null) {
			textField_47 = new JTextField();
			textField_47.setColumns(10);
			textField_47.setBounds(2, 108, 50, 50);
		}
		return textField_47;
	}
	private JTextField getTextField_48() {
		if (textField_48 == null) {
			textField_48 = new JTextField();
			textField_48.setColumns(10);
			textField_48.setBounds(54, 2, 50, 50);
		}
		return textField_48;
	}
	private JTextField getTextField_49() {
		if (textField_49 == null) {
			textField_49 = new JTextField();
			textField_49.setColumns(10);
			textField_49.setBounds(54, 55, 50, 50);
		}
		return textField_49;
	}
	private JTextField getTextField_50() {
		if (textField_50 == null) {
			textField_50 = new JTextField();
			textField_50.setColumns(10);
			textField_50.setBounds(54, 108, 50, 50);
		}
		return textField_50;
	}
	private JTextField getTextField_51() {
		if (textField_51 == null) {
			textField_51 = new JTextField();
			textField_51.setColumns(10);
			textField_51.setBounds(107, 2, 50, 50);
		}
		return textField_51;
	}
	private JTextField getTextField_52() {
		if (textField_52 == null) {
			textField_52 = new JTextField();
			textField_52.setColumns(10);
			textField_52.setBounds(107, 55, 50, 50);
		}
		return textField_52;
	}
	private JTextField getTextField_53() {
		if (textField_53 == null) {
			textField_53 = new JTextField();
			textField_53.setColumns(10);
			textField_53.setBounds(107, 108, 50, 50);
		}
		return textField_53;
	}
	private JPanel getSeptimaCuadricula() {
		if (septimaCuadricula == null) {
			septimaCuadricula = new JPanel();
			septimaCuadricula.setLayout(null);
			septimaCuadricula.setBounds(45, 395, 160, 160);
			septimaCuadricula.add(getTextField_54());
			septimaCuadricula.add(getTextField_55());
			septimaCuadricula.add(getTextField_56());
			septimaCuadricula.add(getTextField_57());
			septimaCuadricula.add(getTextField_58());
			septimaCuadricula.add(getTextField_59());
			septimaCuadricula.add(getTextField_60());
			septimaCuadricula.add(getTextField_61());
			septimaCuadricula.add(getTextField_62());
		}
		return septimaCuadricula;
	}
	private JTextField getTextField_54() {
		if (textField_54 == null) {
			textField_54 = new JTextField();
			textField_54.setColumns(10);
			textField_54.setBounds(2, 2, 50, 50);
		}
		return textField_54;
	}
	private JTextField getTextField_55() {
		if (textField_55 == null) {
			textField_55 = new JTextField();
			textField_55.setColumns(10);
			textField_55.setBounds(2, 55, 50, 50);
		}
		return textField_55;
	}
	private JTextField getTextField_56() {
		if (textField_56 == null) {
			textField_56 = new JTextField();
			textField_56.setColumns(10);
			textField_56.setBounds(2, 108, 50, 50);
		}
		return textField_56;
	}
	private JTextField getTextField_57() {
		if (textField_57 == null) {
			textField_57 = new JTextField();
			textField_57.setColumns(10);
			textField_57.setBounds(54, 2, 50, 50);
		}
		return textField_57;
	}
	private JTextField getTextField_58() {
		if (textField_58 == null) {
			textField_58 = new JTextField();
			textField_58.setColumns(10);
			textField_58.setBounds(54, 55, 50, 50);
		}
		return textField_58;
	}
	private JTextField getTextField_59() {
		if (textField_59 == null) {
			textField_59 = new JTextField();
			textField_59.setColumns(10);
			textField_59.setBounds(54, 108, 50, 50);
		}
		return textField_59;
	}
	private JTextField getTextField_60() {
		if (textField_60 == null) {
			textField_60 = new JTextField();
			textField_60.setColumns(10);
			textField_60.setBounds(107, 2, 50, 50);
		}
		return textField_60;
	}
	private JTextField getTextField_61() {
		if (textField_61 == null) {
			textField_61 = new JTextField();
			textField_61.setColumns(10);
			textField_61.setBounds(107, 55, 50, 50);
		}
		return textField_61;
	}
	private JTextField getTextField_62() {
		if (textField_62 == null) {
			textField_62 = new JTextField();
			textField_62.setColumns(10);
			textField_62.setBounds(107, 108, 50, 50);
		}
		return textField_62;
	}
	private JPanel getOctavaCuadricula() {
		if (octavaCuadricula == null) {
			octavaCuadricula = new JPanel();
			octavaCuadricula.setLayout(null);
			octavaCuadricula.setBounds(220, 395, 160, 160);
			octavaCuadricula.add(getTextField_63());
			octavaCuadricula.add(getTextField_64());
			octavaCuadricula.add(getTextField_65());
			octavaCuadricula.add(getTextField_66());
			octavaCuadricula.add(getTextField_67());
			octavaCuadricula.add(getTextField_68());
			octavaCuadricula.add(getTextField_69());
			octavaCuadricula.add(getTextField_70());
			octavaCuadricula.add(getTextField_71());
		}
		return octavaCuadricula;
	}
	private JTextField getTextField_63() {
		if (textField_63 == null) {
			textField_63 = new JTextField();
			textField_63.setColumns(10);
			textField_63.setBounds(2, 2, 50, 50);
		}
		return textField_63;
	}
	private JTextField getTextField_64() {
		if (textField_64 == null) {
			textField_64 = new JTextField();
			textField_64.setColumns(10);
			textField_64.setBounds(2, 55, 50, 50);
		}
		return textField_64;
	}
	private JTextField getTextField_65() {
		if (textField_65 == null) {
			textField_65 = new JTextField();
			textField_65.setColumns(10);
			textField_65.setBounds(2, 108, 50, 50);
		}
		return textField_65;
	}
	private JTextField getTextField_66() {
		if (textField_66 == null) {
			textField_66 = new JTextField();
			textField_66.setColumns(10);
			textField_66.setBounds(54, 2, 50, 50);
		}
		return textField_66;
	}
	private JTextField getTextField_67() {
		if (textField_67 == null) {
			textField_67 = new JTextField();
			textField_67.setColumns(10);
			textField_67.setBounds(54, 55, 50, 50);
		}
		return textField_67;
	}
	private JTextField getTextField_68() {
		if (textField_68 == null) {
			textField_68 = new JTextField();
			textField_68.setColumns(10);
			textField_68.setBounds(54, 108, 50, 50);
		}
		return textField_68;
	}
	private JTextField getTextField_69() {
		if (textField_69 == null) {
			textField_69 = new JTextField();
			textField_69.setColumns(10);
			textField_69.setBounds(107, 2, 50, 50);
		}
		return textField_69;
	}
	private JTextField getTextField_70() {
		if (textField_70 == null) {
			textField_70 = new JTextField();
			textField_70.setColumns(10);
			textField_70.setBounds(107, 55, 50, 50);
		}
		return textField_70;
	}
	private JTextField getTextField_71() {
		if (textField_71 == null) {
			textField_71 = new JTextField();
			textField_71.setColumns(10);
			textField_71.setBounds(107, 108, 50, 50);
		}
		return textField_71;
	}
	private JPanel getNovenaCuadricula() {
		if (novenaCuadricula == null) {
			novenaCuadricula = new JPanel();
			novenaCuadricula.setLayout(null);
			novenaCuadricula.setBounds(395, 395, 160, 160);
			novenaCuadricula.add(getTextField_72());
			novenaCuadricula.add(getTextField_73());
			novenaCuadricula.add(getTextField_74());
			novenaCuadricula.add(getTextField_75());
			novenaCuadricula.add(getTextField_76());
			novenaCuadricula.add(getTextField_77());
			novenaCuadricula.add(getTextField_78());
			novenaCuadricula.add(getTextField_79());
			novenaCuadricula.add(getTextField_80());
		}
		return novenaCuadricula;
	}
	private JTextField getTextField_72() {
		if (textField_72 == null) {
			textField_72 = new JTextField();
			textField_72.setColumns(10);
			textField_72.setBounds(2, 2, 50, 50);
		}
		return textField_72;
	}
	private JTextField getTextField_73() {
		if (textField_73 == null) {
			textField_73 = new JTextField();
			textField_73.setColumns(10);
			textField_73.setBounds(2, 55, 50, 50);
		}
		return textField_73;
	}
	private JTextField getTextField_74() {
		if (textField_74 == null) {
			textField_74 = new JTextField();
			textField_74.setColumns(10);
			textField_74.setBounds(2, 108, 50, 50);
		}
		return textField_74;
	}
	private JTextField getTextField_75() {
		if (textField_75 == null) {
			textField_75 = new JTextField();
			textField_75.setColumns(10);
			textField_75.setBounds(54, 2, 50, 50);
		}
		return textField_75;
	}
	private JTextField getTextField_76() {
		if (textField_76 == null) {
			textField_76 = new JTextField();
			textField_76.setColumns(10);
			textField_76.setBounds(54, 55, 50, 50);
		}
		return textField_76;
	}
	private JTextField getTextField_77() {
		if (textField_77 == null) {
			textField_77 = new JTextField();
			textField_77.setColumns(10);
			textField_77.setBounds(54, 108, 50, 50);
		}
		return textField_77;
	}
	private JTextField getTextField_78() {
		if (textField_78 == null) {
			textField_78 = new JTextField();
			textField_78.setColumns(10);
			textField_78.setBounds(107, 2, 50, 50);
		}
		return textField_78;
	}
	private JTextField getTextField_79() {
		if (textField_79 == null) {
			textField_79 = new JTextField();
			textField_79.setColumns(10);
			textField_79.setBounds(107, 55, 50, 50);
		}
		return textField_79;
	}
	private JTextField getTextField_80() {
		if (textField_80 == null) {
			textField_80 = new JTextField();
			textField_80.setColumns(10);
			textField_80.setBounds(107, 108, 50, 50);
		}
		return textField_80;
	}
}
