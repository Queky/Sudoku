package Modelo;

import javax.swing.JLabel;

import Vista.CargarSudoku;

public class CalcularPuntuacion {

	private static int tiempo;
	private static final int puntuacionInicial = 1000;
	private static int nivelDificultad;

	public static int calcularPuntuacion(JLabel pL, int pContadorCorrecciones) {
		tiempo = CargarSudoku.obtenerTiempo();
		nivelDificultad = Integer.parseInt(pL.getText());
		return puntuacionInicial * nivelDificultad - nivelDificultad * tiempo
				* pContadorCorrecciones;
	}

}
