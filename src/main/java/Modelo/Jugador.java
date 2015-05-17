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
	public void setNombre(String pNombre){
		nombre = pNombre;
	}
	public void setNvlDificultad(int pNvlDificultad){
		nvlDificultad = pNvlDificultad;
		
	}
	public void setCodSudoku(String pCodSudoku){
		codSudoku= pCodSudoku;
		
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
