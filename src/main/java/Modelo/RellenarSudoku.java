package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import Vista.CargarSudoku;

public class RellenarSudoku {

	private static CargarSudoku cSu;
	private static String directory = Paths.get(".").toAbsolutePath()
			.normalize().toString();
	private static File f = new File(directory + "/Sudokus hechos/sudokuak.txt");
	private static FileReader archiveReader;
	private static BufferedReader read;
	private static JLabel jL;
	private static int[][] listaCorrecciones;
	private static String linea;
	
	public static void main (String [] args){
		cargarSudokuHecho("s001", true);
	}
	
	public static void cargarSudokuHecho(String pSudoku, boolean esCodigo) {


			cSu = CargarSudoku.getInstance();
			try {
				archiveReader = new FileReader(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			read = new BufferedReader(archiveReader);
			jL = new JLabel();

			int posTxt = 0;
			boolean encontrado = false;
			try {
				linea = read.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (linea != null && !encontrado) {
				if (linea.equals(pSudoku)) {
					encontrado = true;
					if (esCodigo) {
						jL.setText(linea);
						cSu.setCodigoSudoku(jL);
						obtenerCodigoSudoku(jL);
						try {
							linea = read.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						jL.setText(linea);
						cSu.setNivelDificultad(jL);
					} else {
						cSu.setCodigoSudoku(jL);
						obtenerCodigoSudoku(jL);
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
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						posTxt++;
					}
				}
				jL.setText(linea);
				try {
					linea = read.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				posTxt = 0;
			}
			cargarSolucionSudoku();
			cSu.setVisible(true);

	}

	public static void cargarSolucionSudoku() {
		
		int posTxt=0;
		listaCorrecciones = new int[9][9];
		try {
			for (int i = 0; i < 9; i++) {
				for(int j=0; j<9; j++){
					listaCorrecciones[i][j]=Character.getNumericValue(linea.charAt(posTxt));
					posTxt++;
				}
				linea = read.readLine();
				posTxt=0;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void cargarSudokuEntero(){
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				JFormattedTextField jT = new JFormattedTextField();
				jT.setText(Integer.toString(listaCorrecciones[i][j]));
				cSu.setCasillaSudoku(jT, i, j, false);
			}
		}
	}
	
	public static JLabel obtenerCodigoSudoku(JLabel pL) {
		return pL;
	}

	public static int[][] getListaCorrecciones() {
		return listaCorrecciones;
	}
	
}
