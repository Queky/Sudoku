package Modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Clase CorregirSudoku
 */
public class CorregirSudoku {

	private List<Integer> columnasVertMal;
	private List<Integer> filasHorMal;
	private static int[][] sudokuCorregido;
	private boolean estaEnSudoku;
	private JFormattedTextField jT;
	private JFormattedTextField num;


	/**
	 * Correccion vertical.
	 *
	 * @param listaSud lista con los numeros precargados en la ventana CargarSudoku
	 */
	public void correccionVertical(JFormattedTextField[][] listaSud) {
		String num;
		columnasVertMal = new ArrayList<Integer>();

		for (int i = 0; i < listaSud.length; i++) {
			for (int j = 0; j < listaSud.length; j++) {
				if (!listaSud[i][j].getText().equals(" ") && listaSud[i][j].isEditable()) {
					num = listaSud[i][j].getText();
					for (int k = 0; k < listaSud.length; k++) {
						if (k != i) {
							if (listaSud[k][j].getText().equals(num) && !listaSud[i][j].getText().equals(" ") && listaSud[i][j].isEditable()) {
								if (!columnasVertMal.contains(j))
									columnasVertMal.add(j);
							}
						}
					}
				}

			}
		}
		
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				limpiarLista(columnasVertMal);
			}
		});
	}

	/**
	 * Correccion horizontal.
	 *
	 * @param listaSud lista con los numeros precargados en la ventana CargarSudoku
	 */
	public void correccionHorizontal(JFormattedTextField[][] listaSud) {
		String num;
		filasHorMal = new ArrayList<Integer>();

		for (int i = 0; i < listaSud.length; i++) {
			for (int j = 0; j < listaSud.length; j++) {
				if (!listaSud[i][j].getText().equals(" ")
						&& listaSud[i][j].isEditable()) {
					num = listaSud[i][j].getText();
					for (int k = 0; k < 9; k++) {
						if (k != j) {
							if (listaSud[i][k].getText().equals(num)
									&& !listaSud[i][j].getText().equals(" ")
									&& listaSud[i][j].isEditable()) {
								if (!filasHorMal.contains(i))
									filasHorMal.add(i);
							}
						}
					}
				}
			}
		}
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				limpiarLista(filasHorMal);
			}
		});
	}

	/**
	 * Correccion cuadricula.
	 *
	 * @param cuadricula cuadricula con las casillas del sudoku
	 */
	public void correccionCuadricula(JPanel cuadricula) {

		estaEnSudoku = false;
		jT = new JFormattedTextField();
		num = null;

		for (int i = 0; i < cuadricula.getComponents().length && !estaEnSudoku; i++) {
			jT = (JFormattedTextField) cuadricula.getComponent(i);
			if (!jT.getText().isEmpty())
				num = jT;
			for (int j = i + 1; j < cuadricula.getComponents().length && !estaEnSudoku; j++) {
				jT = (JFormattedTextField) cuadricula.getComponent(j);
				if (!jT.getText().equals(" ")) {
					if (num.getText().equals(jT.getText())) {
						estaEnSudoku = true;
					}
				}
			}
		}
	}
	
	/**
	 * Corregir casilla.
	 *
	 * @param casillaSudo una casilla del sudoku
	 * @param x posicion en el array
	 * @param y posicion en el array
	 */
	public void corregirCasilla(JFormattedTextField casillaSudo, int x, int y) {
		sudokuCorregido=RellenarSudoku.getListaCorrecciones();
		estaEnSudoku=false;
		if(Integer.parseInt(casillaSudo.getText())==sudokuCorregido[x][y]){
			estaEnSudoku=true;
		}
	}
	
	
	/**
	 * Corregir sudoku entero.
	 *
	 * @param listaSud lista con los numeros precargados en la ventana CargarSudoku
	 * @return true si todas las casillas estan bien, false si no lo estan
	 */
	public static boolean corregirSudokuEntero(JFormattedTextField[][] listaSud) {
		sudokuCorregido=RellenarSudoku.getListaCorrecciones();
		int numCasillasBien=0;
		for(int i=0; i<listaSud.length; i++){
			for(int j=0; j<listaSud.length; j++){
				if(listaSud[i][j].getText().equals(Integer.toString(sudokuCorregido[i][j])))
						numCasillasBien++;
				}
		}
		if(numCasillasBien==81){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * Variable para saber si una casilla del sudoku esta repetida
	 *
	 * @return true si esta repetida, false si no
	 */
	public boolean isRepetido() {
		return estaEnSudoku;
	}

	/**
	 * Tiene el numero de columnas mal
	 *
	 * @return lista con las columnas mal
	 */
	public List<Integer> getColumnasVertMal() {
		return columnasVertMal;
	}

	/**
	 * Tiene el numero de filas mal 
	 *
	 * @return lista con las filas mal
	 */
	public List<Integer> getFilasHorMal() {
		return filasHorMal;
	}

	/**
	 * Limpia la lista
	 *
	 * @param pList lista con filas o columnas mal
	 */
	public void limpiarLista(List<Integer> pList) {
		pList.removeAll(pList);
	}

}
