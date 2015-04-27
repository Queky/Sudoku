package Modelo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import Vista.CargarSudoku;

public class RellenarSudoku {
	
	public static void main (String [] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, NoSuchMethodException, SecurityException{
		loadDoneSudoku("s001", "inaki");
	}
	
	@SuppressWarnings("resource")
	public static void loadDoneSudoku(String sudokuName, String sudokuLevel) throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		try {			
			CargarSudoku cSu = new CargarSudoku();
			String directory = Paths.get(".").toAbsolutePath().normalize().toString();
			File f = new File(directory+"/SudokusToLoad/sudokuak.txt");
			FileReader archiveReader = new FileReader(f);
			BufferedReader read = new BufferedReader(archiveReader);
			JLabel jL = new JLabel();
			
			sudokuName = read.readLine();
			jL.setText(sudokuName);
			cSu.setCodigoSudoku(jL);
			sudokuLevel = read.readLine();
			jL.setText(sudokuLevel);
			cSu.setNivelDificultad(jL);

			int posTxt=0;
			String linea = read.readLine();
			for(int i=0; i<9; i++){
				for(int j=0; j<9; j++){
					JFormattedTextField jT = new JFormattedTextField();
					if(linea.charAt(posTxt)!='0'){
						jT.setText(Character.toString(linea.charAt(posTxt)));
						cSu.setCasillaSudoku(jT, i, j, false);
					}
					posTxt++;
				}
				linea = read.readLine();
				posTxt=0;
			}
			cSu.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la lectura del .txt\n");
		}
	}
}
