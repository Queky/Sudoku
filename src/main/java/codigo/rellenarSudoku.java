package codigo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Ventana.cargarSudoku;

public class rellenarSudoku {
	
	public static void main (String [] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, NoSuchMethodException, SecurityException{
		loadDoneSudoku("s001", "inaki");
	}
	
	public static void loadDoneSudoku(String sudokuName, String sudokuLevel) throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		try {			
			cargarSudoku cSu = new cargarSudoku();
			String directory = Paths.get(".").toAbsolutePath().normalize().toString();
			File f = new File(directory+"/SudokusToLoad/sudokuak.txt");
			FileReader archiveReader = new FileReader(f);
			BufferedReader read = new BufferedReader(archiveReader);
			JLabel jL = new JLabel();
			
			sudokuName = read.readLine();
			jL.setText(sudokuName);
			cSu.setSudokuId(jL);
			sudokuLevel = read.readLine();
			jL.setText(sudokuLevel);
			cSu.setDifficultyLevel(jL);
			
			int posTxt=0;
			String linea = read.readLine();
			for(int i=1; i<=81; i++){
				if(linea.charAt(posTxt)!='0'){
					Method functionCall = cargarSudoku.class.getMethod("setTextField_"+i, JTextField.class);
					JTextField jT = new JTextField();
					jT.setText(Character.toString(linea.charAt(posTxt)));
					functionCall.invoke(cSu, jT);
				}
				posTxt++;
				if(i%9==0){
					linea=read.readLine();
					posTxt=0;
				}	
			}
			cSu.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la lectura del .txt\n");
		}
	}
	
	public static void generateSudoku(){
		
	}
	
	public static void countPanels(){
		
	}

}
