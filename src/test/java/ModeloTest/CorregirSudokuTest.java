package ModeloTest;

import static org.junit.Assert.*;

import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;

import junit.framework.AssertionFailedError;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.CorregirSudoku;
import Modelo.RellenarSudoku;
import Vista.CargarSudoku;

public class CorregirSudokuTest {

	CorregirSudoku cS;
	JFormattedTextField[][] jT;
	JPanel jP;
	
	@Before
	public void setUp() {
		cS = new CorregirSudoku();
		RellenarSudoku.cargarSudokuHecho("s001", true);
		jT = new JFormattedTextField[9][9];
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				jT[i][j]=new JFormattedTextField();
			}
		}
		int[][] lista = new int[9][9];
		lista=RellenarSudoku.getListaCorrecciones();
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				jT[i][j].setText(Integer.toString(lista[i][j]));
			}
		}
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void testCorreccionVertical() {
		assertNotNull(cS);
		cS.correccionVertical(jT);
		assertNotNull(cS.getColumnasVertMal());
	}
	
	@Test
	public void testCorreccionHorizontal() {
		assertNotNull(cS);
		cS.correccionHorizontal(jT);
		assertNotNull(cS.getFilasHorMal());
	}
	
	@Test
	public void testCorreccionCuadricula() {
		jP=new JPanel();
		jT[0][0].setText("1");
		jP.add(jT[0][0]);
		jT[0][1].setText("2");
		jP.add(jT[0][1]);
		assertNotNull(cS);
		cS.correccionCuadricula(jP);
		assertFalse(cS.isRepetido());
		jT[0][2].setText("1");
		jP.add(jT[0][2]);
		cS.correccionCuadricula(jP);
		assertTrue(cS.isRepetido());
	}
}
