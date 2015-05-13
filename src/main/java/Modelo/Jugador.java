package Modelo;

public class Jugador {
	private static Jugador mJugador;
	private String nombre;
	private int nvlDificultad;
	private String codSudoku;
	
	private Jugador(){
	}
	
	public static Jugador getJugador(){
		if(mJugador == null){
			mJugador= new Jugador(); 
		}
		return mJugador;
	}
	public void setInfoJugador(String pNombre, int pNvlDificultad, String pCodSudoku){
		nombre = pNombre;
		nvlDificultad =pNvlDificultad;
		pCodSudoku = codSudoku;
	}
	public String getNombre(){
		return nombre;
	}
	public int getNvlDificultad(){
		return nvlDificultad;
	}
	public String getCodSudoku(){
		return codSudoku;
	}

}
