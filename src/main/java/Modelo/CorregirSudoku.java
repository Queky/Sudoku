package Modelo;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.SwingUtilities;

import Vista.CargarSudoku;

public class CorregirSudoku {

	private List<Integer> columnasVertMal;
	private List<Integer> filasHorMal;

	public CorregirSudoku() {
		// TODO Auto-generated constructor stub
	}

	public void correccionVertical(JFormattedTextField[][] listaSud) {
		String num;
		columnasVertMal = new ArrayList<Integer>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (!listaSud[i][j].getText().equals(" ")
						&& listaSud[i][j].isEditable()) {
					num = listaSud[i][j].getText();
					for (int k = 0; k < 9; k++) {
						if (k != i) {
							if (listaSud[k][j].getText().equals(num)
									&& !listaSud[i][j].getText().equals(" ")
									&& listaSud[i][j].isEditable()) {
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
				// TODO Auto-generated method stub
				limpiarLista(columnasVertMal);
			}
		});
	}

	public void correccionHorizontal(JFormattedTextField[][] listaSud) {
		String num;
		filasHorMal = new ArrayList<Integer>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
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
				// TODO Auto-generated method stub
				limpiarLista(filasHorMal);
			}
		});
	}
	
	public void correccionCuadricula(JFormattedTextField[][] listaSud) {
		String num;
		List<Integer> listaCuadricula = new ArrayList<Integer>();
		CargarSudoku cS = new CargarSudoku();
		
		for(int i=0; i<9; i++){
			Component c=cS.getContentPane().getComponent(i);
			//c.getComponentAt
		}
	}

	public List<Integer> getColumnasVertMal() {
		return columnasVertMal;
	}

	public List<Integer> getFilasHorMal() {
		return filasHorMal;
	}

	public void limpiarLista(List<Integer> pList) {
		pList.removeAll(pList);
	}

	public boolean correccionCuadricula() {

		boolean cuadricula = false;

		return cuadricula;
	}

}
