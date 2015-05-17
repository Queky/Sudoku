package ModeloTest;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.RellenarSudoku;

public class RellenarSudokuTest {
	
	@Before
	public void setUp() {
		RellenarSudoku.cargarSudokuHecho("s001", true);
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testCargarSudokuHecho() {
		assertNotNull(RellenarSudoku.getListaCorrecciones());
	}
}
