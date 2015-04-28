package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import Modelo.CorregirSudoku;

public class CargarSudoku extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3108827976249420404L;
	private JFormattedTextField[][] listaSudoku;
	private JPanel contentPane;
	private JPanel Cuadricula1;
	private JPanel Cuadricula2;
	private JPanel Cuadricula3;
	private JPanel Cuadricula4;
	private JPanel Cuadricula5;
	private JPanel Cuadricula6;
	private JPanel Cuadricula7;
	private JPanel Cuadricula8;
	private JPanel Cuadricula9;
	private JLabel sudokuId;
	private JLabel dLevel;
	private JLabel nivelDificultad;
	private JLabel CodigoSudoku;
	private JButton btnCorregir;
	private MaskFormatter mascara;
	private CorregirSudoku cSCor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CargarSudoku frame = new CargarSudoku();
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

	public CargarSudoku() {
		initialize();
	}

	private void initialize() {
		try {
			setTitle("Sudoku");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 600, 600);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			listaSudoku = new JFormattedTextField[9][9];
			mascara = new MaskFormatter("#");
			mascara.setInvalidCharacters("0, ");
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					listaSudoku[i][j] = new JFormattedTextField(mascara);
					final JFormattedTextField jT = listaSudoku[i][j];
					jT.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (jT.isEditable())
								jT.selectAll();
						}
					});
					listaSudoku[i][j]
							.setHorizontalAlignment(JFormattedTextField.CENTER);
				}
			}
			contentPane.add(getCuadricula1());
			contentPane.add(getCuadricula2());
			contentPane.add(getCuadricula3());
			contentPane.add(getCuadricula4());
			contentPane.add(getCuadricula5());
			contentPane.add(getCuadricula6());
			contentPane.add(getCuadricula7());
			contentPane.add(getCuadricula8());
			contentPane.add(getCuadricula9());
			contentPane.add(getSudokuId());
			contentPane.add(getDLevel());
			contentPane.add(getNivelDificultad());
			contentPane.add(getCodigoSudoku());
			contentPane.add(getBtnNewButton());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private JPanel getCuadricula1() {
		if (Cuadricula1 == null) {
			Cuadricula1 = new JPanel();
			Cuadricula1.setBounds(45, 45, 160, 160);
			Cuadricula1.setLayout(null);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					Cuadricula1.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(j * 54, 27 * i * 2, 50, 50);
				}
			}
		}
		return Cuadricula1;
	}

	private JPanel getCuadricula2() {
		if (Cuadricula2 == null) {
			Cuadricula2 = new JPanel();
			Cuadricula2.setLayout(null);
			Cuadricula2.setBounds(220, 45, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 3; j < 6; j++) {
					Cuadricula2.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return Cuadricula2;
	}

	private JPanel getCuadricula3() {
		if (Cuadricula3 == null) {
			Cuadricula3 = new JPanel();
			Cuadricula3.setLayout(null);
			Cuadricula3.setBounds(395, 45, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 6; j < 9; j++) {
					Cuadricula3.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return Cuadricula3;
	}

	private JPanel getCuadricula4() {
		if (Cuadricula4 == null) {
			Cuadricula4 = new JPanel();
			Cuadricula4.setLayout(null);
			Cuadricula4.setBounds(45, 220, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 3; i < 6; i++) {
				for (int j = 0; j < 3; j++) {
					Cuadricula4.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return Cuadricula4;
	}

	private JPanel getCuadricula5() {
		if (Cuadricula5 == null) {
			Cuadricula5 = new JPanel();
			Cuadricula5.setLayout(null);
			Cuadricula5.setBounds(220, 220, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 3; i < 6; i++) {
				for (int j = 3; j < 6; j++) {
					Cuadricula5.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return Cuadricula5;
	}

	private JPanel getCuadricula6() {
		if (Cuadricula6 == null) {
			Cuadricula6 = new JPanel();
			Cuadricula6.setLayout(null);
			Cuadricula6.setBounds(395, 220, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 3; i < 6; i++) {
				for (int j = 6; j < 9; j++) {
					Cuadricula6.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return Cuadricula6;
	}

	private JPanel getCuadricula7() {
		if (Cuadricula7 == null) {
			Cuadricula7 = new JPanel();
			Cuadricula7.setLayout(null);
			Cuadricula7.setBounds(45, 392, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 6; i < 9; i++) {
				for (int j = 0; j < 3; j++) {
					Cuadricula7.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return Cuadricula7;
	}

	private JPanel getCuadricula8() {
		if (Cuadricula8 == null) {
			Cuadricula8 = new JPanel();
			Cuadricula8.setLayout(null);
			Cuadricula8.setBounds(220, 392, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 6; i < 9; i++) {
				for (int j = 3; j < 6; j++) {
					Cuadricula8.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return Cuadricula8;
	}

	private JPanel getCuadricula9() {
		if (Cuadricula9 == null) {
			Cuadricula9 = new JPanel();
			Cuadricula9.setLayout(null);
			Cuadricula9.setBounds(395, 392, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 6; i < 9; i++) {
				for (int j = 6; j < 9; j++) {
					Cuadricula9.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return Cuadricula9;
	}

	public JFormattedTextField[][] getListaSudoku(
			JFormattedTextField[][] pListSud) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				pListSud[i][j].setText(listaSudoku[i][j].getText());
			}
		}
		return pListSud;
	}

	public void setCasillaSudoku(JFormattedTextField pCasillaSudoku, int x,
			int y, boolean editable) {

		listaSudoku[x][y].setText(pCasillaSudoku.getText());
		listaSudoku[x][y].setEditable(editable);
		listaSudoku[x][y].setBackground(Color.LIGHT_GRAY);
		listaSudoku[x][y].setFocusable(false);
	}

	private JLabel getSudokuId() {
		if (sudokuId == null) {
			sudokuId = new JLabel("Codigo Sudoku:");
			sudokuId.setHorizontalAlignment(SwingConstants.RIGHT);
			sudokuId.setBounds(395, 17, 109, 16);
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

	private JLabel getNivelDificultad() {
		if (nivelDificultad == null) {
			nivelDificultad = new JLabel("");
			nivelDificultad.setHorizontalAlignment(SwingConstants.CENTER);
			nivelDificultad.setBounds(144, 17, 61, 16);
		}
		return nivelDificultad;
	}

	private JLabel getCodigoSudoku() {
		if (CodigoSudoku == null) {
			CodigoSudoku = new JLabel("");
			CodigoSudoku.setHorizontalAlignment(SwingConstants.CENTER);
			CodigoSudoku.setBounds(494, 17, 61, 16);
		}
		return CodigoSudoku;
	}

	public void setNivelDificultad(JLabel pNivelDificultad) {
		nivelDificultad.setText(pNivelDificultad.getText());
	}

	public void setCodigoSudoku(JLabel pCodigoSudoku) {
		CodigoSudoku.setText(pCodigoSudoku.getText());
	}

	private JButton getBtnNewButton() {
		if (btnCorregir == null) {
			btnCorregir = new JButton("Corregir");
			btnCorregir.setBounds(242, 12, 117, 29);
		}
		btnCorregir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pE) {
				// TODO Auto-generated method stub
				cSCor = new CorregirSudoku();
				cSCor.correccionVertical(listaSudoku);
			}
		});
		return btnCorregir;
	}

	public void subrayarLinea(boolean pVertical, List<Integer> pColumnasMal) {
		if (pVertical) {
			System.out.println(pColumnasMal);
			for (int i = 0; i < pColumnasMal.size(); i++) {
				for (int j = 0; j < 9; j++) {
					if (listaSudoku[j][pColumnasMal.get(i)].isEditable()) {
						listaSudoku[j][pColumnasMal.get(i)]
								.setBackground(Color.RED);
						listaSudoku[j][pColumnasMal.get(i)].repaint();
						listaSudoku[j][pColumnasMal.get(i)].revalidate();
					}
				}
			}
		}
	}
}
