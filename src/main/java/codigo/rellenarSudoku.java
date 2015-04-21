package codigo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Ventana.cargarSudoku;;

public class rellenarSudoku {
	
	public rellenarSudoku() {
		// TODO Auto-generated constructor stub
	}
	
	public void loadDoneSudoku() throws IOException{
		
		try {
			FileReader archive = new FileReader("sudokuak.txt");
			BufferedReader read = new BufferedReader(archive);
			read.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la lectura del .txt");
		}
	}
	
	public void generateSudoku(){
		
	}

}
