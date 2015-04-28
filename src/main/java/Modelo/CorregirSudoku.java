package Modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import Vista.CargarSudoku;

public class CorregirSudoku {

	public CorregirSudoku() {
		// TODO Auto-generated constructor stub
	}

	public void correccionVertical(JFormattedTextField[][] listaSud) {
		boolean vertical = false;
		String num;
		CargarSudoku cSu = new CargarSudoku();
		List<Integer> columnasMal = new ArrayList<Integer>();

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
								vertical = true;
								if(!columnasMal.contains(j))
									columnasMal.add(j);
							}
						}
					}
				}

			}
		}
		if (vertical)
			cSu.subrayarLinea(vertical, columnasMal);
		cSu.repaint();
	}

	public boolean correccionCuadricula() {

		boolean cuadricula = false;

		return cuadricula;
	}

}
