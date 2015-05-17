package Modelo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import Vista.CargarSudoku;

/**
 * Clase RellenarSudoku
 */
public class RellenarSudoku {

	private static CargarSudoku cSu;
	private static BufferedReader read;
	private static JLabel jL;
	private static int[][] listaSolucionSudoku;
	private static String linea;
	private static InputStream is;

	/**
	 * Cargar sudoku hecho.
	 *
	 * @param pSudoku codigo o nivel de dificultad del sudoku
	 * @param esCodigo true si es codigo, false si es un nivel de dificultad
	 */
	public static void cargarSudokuHecho(String pSudoku, boolean esCodigo) {
		
		cSu = CargarSudoku.getInstance();
		cSu.reiniciar();
		is = RellenarSudoku.class.getResourceAsStream("/Sudokus/sudokuak.txt");
		read = new BufferedReader(new InputStreamReader(is));
		jL = new JLabel();

		int posTxt = 0;
		boolean encontrado = false;
		try {
			linea = read.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (linea != null && !encontrado) {
			if (linea.equals(pSudoku)) {
				encontrado = true;
				if (esCodigo) {
					jL.setText(linea);
					cSu.setCodigoSudoku(jL);
					try {
						linea = read.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					jL.setText(linea);
					cSu.setNivelDificultad(jL);
				} else {
					cSu.setCodigoSudoku(jL);
					jL.setText(linea);
					cSu.setNivelDificultad(jL);
				}
			} else {
				if (posTxt % 9 == 0 && posTxt != 0)
					posTxt = 0;
				else {
					try {
						read.mark(posTxt);
					} catch (IOException e) {
						e.printStackTrace();
					}
					posTxt++;
				}
			}
			jL.setText(linea);
			try {
				linea = read.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		posTxt = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				JFormattedTextField jT = new JFormattedTextField();
				if (linea.charAt(posTxt) != '0') {
					jT.setText(Character.toString(linea.charAt(posTxt)));
					cSu.setCasillaSudoku(jT, i, j, false);
				}
				posTxt++;
			}
			try {
				linea = read.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			posTxt = 0;
		}
		cargarSolucionSudoku();
		cSu.setVisible(true);

	}

	/**
	 * Carga en una lista la solucion del sudoku
	 */
	public static void cargarSolucionSudoku() {
		
		int posTxt=0;
		listaSolucionSudoku = new int[9][9];
		try {
			for (int i = 0; i < 9; i++) {
				for(int j=0; j<9; j++){
					listaSolucionSudoku[i][j]=Character.getNumericValue(linea.charAt(posTxt));
					posTxt++;
				}
				linea = read.readLine();
				posTxt=0;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			read.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Rellena el sudoku entero con la solucion correcta
	 * 
	 * Solo funciona al introducir por teclado F4, es un truco
	 */
	public static void cargarSudokuEntero(){
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				JFormattedTextField jT = new JFormattedTextField();
				jT.setText(Integer.toString(listaSolucionSudoku[i][j]));
				cSu.setCasillaSudoku(jT, i, j, false);
			}
		}
	}

	/**
	 * Devuelve la lista con la solucion del sudoku
	 *
	 * @return lista correcciones
	 */
	public static int[][] getListaCorrecciones() {
		return listaSolucionSudoku;
	}
	
}
