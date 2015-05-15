package Modelo;

import javax.swing.JLabel;

import Vista.CargarSudoku;

public class CalcularPuntuacion {

	private static int tiempo;
	private static final int puntuacionInicial = 1000;
	private static int nivelDificultad;

	public static int calcularPuntuacion(int pNivelDificultad, int pContadorCorrecciones) {
		tiempo = CargarSudoku.obtenerTiempo();
		nivelDificultad = Jugador.getJugador().getNvlDificultad();
		int resul = (puntuacionInicial * nivelDificultad)
				- (nivelDificultad * tiempo/nivelDificultad) - (pContadorCorrecciones * 25);
		if (resul > 0)
			return resul;
		else
			return 1;

	}

}
