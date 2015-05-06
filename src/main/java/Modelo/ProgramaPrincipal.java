package Modelo;

import Vista.MenuSudoku;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		iniciarJuego();
		
	}
	private static void iniciarJuego(){
		MenuSudoku menu = MenuSudoku.getMenuSudoku();
		menu.setVisible(true);

	}
}
