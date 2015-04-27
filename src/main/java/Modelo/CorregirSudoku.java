package Modelo;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import Vista.CargarSudoku;

public class CorregirSudoku {

	public CorregirSudoku() {
		// TODO Auto-generated constructor stub
	}

	
	public boolean correccionVertical(){
		boolean vertical=false;
		String num;
		CargarSudoku cSu = new CargarSudoku();
		List<Integer> columnasMal = new ArrayList<Integer>();
		
		JTextField[][] listSudo = new JTextField[9][9];
		listSudo=cSu.getListaSudoku();
		
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				if(listSudo[i][j].getText()!=null){
					num=listSudo[i][j].getText();
					for(int k=0; k<9; k++){
						if(k!=i){
							if(listSudo[k][j].getText().equals(num))
								vertical=true;
								columnasMal.add(j);
						}
					}
				}
				
			}
		}
		return vertical;
	}
	
	public boolean correccionCuadricula(){
		
		boolean cuadricula=false;
		
		return cuadricula;
	}

}
