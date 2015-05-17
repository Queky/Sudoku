package ModeloTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.CorregirSudoku;
import Modelo.RellenarSudoku;

public class CorregirSudokuTest {

	CorregirSudoku cS;
	
	@Before
	public void setUp() {
		cS = new CorregirSudoku();
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void testCorregirSudoku() {
		assertNotNull(cS);
		RellenarSudoku.cargarSudokuHecho("s001", true);
		
	}
}
