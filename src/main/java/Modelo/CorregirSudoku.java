package Modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CorregirSudoku {

	private List<Integer> columnasVertMal;
	private List<Integer> filasHorMal;
	private boolean repetido;
	private JFormattedTextField jT;
	private JFormattedTextField num;

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

	public void correccionCuadricula(JPanel cuadricula) {

		repetido = false;
		jT = new JFormattedTextField();
		num = null;

		for (int i = 0; i < cuadricula.getComponents().length && !repetido; i++) {
			jT = (JFormattedTextField) cuadricula.getComponent(i);
			if (!jT.getText().isEmpty())
				num = jT;
			for (int j = i + 1; j < cuadricula.getComponents().length && !repetido; j++) {
				jT = (JFormattedTextField) cuadricula.getComponent(j);
				if (!jT.getText().equals(" ")) {
					if (num.getText().equals(jT.getText())) {
						repetido = true;
					}
				}
			}
		}
	}

	public boolean isRepetido() {
		return repetido;
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

}
