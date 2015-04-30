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
	private static CargarSudoku mCargarSudoku;
	private static final long serialVersionUID = 3108827976249420404L;
	private JFormattedTextField[][] listaSudoku;
	private JPanel contentPane;
	private JPanel cuadricula1;
	private JPanel cuadricula2;
	private JPanel cuadricula3;
	private JPanel cuadricula4;
	private JPanel cuadricula5;
	private JPanel cuadricula6;
	private JPanel cuadricula7;
	private JPanel cuadricula8;
	private JPanel cuadricula9;
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
	
	// Singleton
	public static CargarSudoku getInstance() {
		if(mCargarSudoku==null){
			mCargarSudoku = new CargarSudoku();
		}
		return mCargarSudoku;
	}
	
	private CargarSudoku() {
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
		if (cuadricula1 == null) {
			cuadricula1 = new JPanel();
			cuadricula1.setBounds(45, 45, 160, 160);
			cuadricula1.setLayout(null);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					cuadricula1.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(j * 54, 27 * i * 2, 50, 50);
				}
			}
		}
		return cuadricula1;
	}

	private JPanel getCuadricula2() {
		if (cuadricula2 == null) {
			cuadricula2 = new JPanel();
			cuadricula2.setLayout(null);
			cuadricula2.setBounds(220, 45, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 3; j < 6; j++) {
					cuadricula2.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return cuadricula2;
	}

	private JPanel getCuadricula3() {
		if (cuadricula3 == null) {
			cuadricula3 = new JPanel();
			cuadricula3.setLayout(null);
			cuadricula3.setBounds(395, 45, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 6; j < 9; j++) {
					cuadricula3.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return cuadricula3;
	}

	private JPanel getCuadricula4() {
		if (cuadricula4 == null) {
			cuadricula4 = new JPanel();
			cuadricula4.setLayout(null);
			cuadricula4.setBounds(45, 220, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 3; i < 6; i++) {
				for (int j = 0; j < 3; j++) {
					cuadricula4.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return cuadricula4;
	}

	private JPanel getCuadricula5() {
		if (cuadricula5 == null) {
			cuadricula5 = new JPanel();
			cuadricula5.setLayout(null);
			cuadricula5.setBounds(220, 220, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 3; i < 6; i++) {
				for (int j = 3; j < 6; j++) {
					cuadricula5.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return cuadricula5;
	}

	private JPanel getCuadricula6() {
		if (cuadricula6 == null) {
			cuadricula6 = new JPanel();
			cuadricula6.setLayout(null);
			cuadricula6.setBounds(395, 220, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 3; i < 6; i++) {
				for (int j = 6; j < 9; j++) {
					cuadricula6.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return cuadricula6;
	}

	private JPanel getCuadricula7() {
		if (cuadricula7 == null) {
			cuadricula7 = new JPanel();
			cuadricula7.setLayout(null);
			cuadricula7.setBounds(45, 395, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 6; i < 9; i++) {
				for (int j = 0; j < 3; j++) {
					cuadricula7.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return cuadricula7;
	}

	private JPanel getCuadricula8() {
		if (cuadricula8 == null) {
			cuadricula8 = new JPanel();
			cuadricula8.setLayout(null);
			cuadricula8.setBounds(220, 395, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 6; i < 9; i++) {
				for (int j = 3; j < 6; j++) {
					cuadricula8.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return cuadricula8;
	}

	private JPanel getCuadricula9() {
		if (cuadricula9 == null) {
			cuadricula9 = new JPanel();
			cuadricula9.setLayout(null);
			cuadricula9.setBounds(395, 395, 160, 160);
			int x = 0;
			int y = 0;
			for (int i = 6; i < 9; i++) {
				for (int j = 6; j < 9; j++) {
					cuadricula9.add(listaSudoku[i][j]);
					listaSudoku[i][j].setBounds(x * 54, 27 * y * 2, 50, 50);
					x++;
				}
				x = 0;
				y++;
			}
		}
		return cuadricula9;
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
				cSCor.correccionHorizontal(listaSudoku);
				subrayarVertical(cSCor.getColumnasVertMal(), cSCor.getFilasHorMal());
				subrayarHorizontal(cSCor.getFilasHorMal(),
						cSCor.getColumnasVertMal());
				cSCor.correccionCuadricula(cuadricula1);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula1);
				cSCor.correccionCuadricula(cuadricula2);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula2);
				cSCor.correccionCuadricula(cuadricula3);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula3);
				cSCor.correccionCuadricula(cuadricula4);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula4);
				cSCor.correccionCuadricula(cuadricula5);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula5);
				cSCor.correccionCuadricula(cuadricula6);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula6);
				cSCor.correccionCuadricula(cuadricula7);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula7);
				cSCor.correccionCuadricula(cuadricula8);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula8);
				cSCor.correccionCuadricula(cuadricula9);
				subrayarCuadricula(cSCor.isRepetido(), cuadricula9);
			}
		});
		return btnCorregir;
	}
	
	public void subrayarVertical(List<Integer> pColumnasMal, List<Integer> pFilasMal) {
		System.out.println(pColumnasMal);
		if (!pColumnasMal.isEmpty() || !pFilasMal.isEmpty()) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (listaSudoku[j][i].isEditable() && pColumnasMal.contains(i)) {
						listaSudoku[j][i].setBackground(Color.RED);
					} else if (listaSudoku[j][i].isEditable() && !pColumnasMal.contains(i))
						listaSudoku[j][i].setBackground(Color.WHITE);
				}
			}
		} else
			ponerEnBlanco();
	}

	private void ponerEnBlanco() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(listaSudoku[i][j].isEditable() && listaSudoku[i][j].getBackground().equals(Color.RED))
					listaSudoku[i][j].setBackground(Color.WHITE);
			}
		}

	}

	public void subrayarHorizontal(List<Integer> pFilasMal,
		List<Integer> pColumMal) {
		System.out.println(pFilasMal);
		if (!pFilasMal.isEmpty() || !pColumMal.isEmpty()) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (listaSudoku[i][j].isEditable() && pFilasMal.contains(i)) {
						listaSudoku[i][j].setBackground(Color.RED);
					} else if (listaSudoku[i][j].isEditable() && !pFilasMal.contains(j) && !listaSudoku[i][j].getBackground().equals(Color.RED))
						listaSudoku[i][j].setBackground(Color.WHITE);
				}
			}
		}else
			ponerEnBlanco();
	}

	public void subrayarCuadricula(boolean pintar, JPanel jP) {
		System.out.println(pintar);
		if(pintar){
			for(int i=0; i<9; i++){
				if(!jP.getComponent(i).getBackground().equals(Color.LIGHT_GRAY))
					jP.getComponent(i).setBackground(Color.RED);
			}
		}
	}
}
