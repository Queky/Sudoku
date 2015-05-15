package ModeloTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import Modelo.CalcularPuntuacion;

public class CalcularPuntuacionTest {
	CalcularPuntuacion cP1;
	@Before
	public void setUp() throws Exception {
		cP1 = new CalcularPuntuacion();
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testCalcularPuntuacion(){
		assertNotNull(new CalcularPuntuacion());
	}
}