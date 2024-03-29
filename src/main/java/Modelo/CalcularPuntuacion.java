package Modelo;

import Vista.CargarSudoku;

/**
 * Clase CalcularPuntuacion
 */
public class CalcularPuntuacion {

	private static int tiempo;	
	private static final int puntuacionInicial = 1000;
	private static int nivelDificultad;

	
	/**
	 * Puntuacion.
	 *
	 * @param pNivelDificultad nivel de dificultad elegido por el usuario
	 * @param pContadorCorrecciones numero de veces que se ha pulsado el boton Correcciones
	 * @return puntuacion del usuario
	 */
	public static int puntuacion(int pNivelDificultad, int pContadorCorrecciones) {
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
