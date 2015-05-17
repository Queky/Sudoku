package ModeloTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import Modelo.Jugador;

public class JugadorTest {
	Jugador j1;

	@Before
	public void setUp() throws Exception {
		j1 = Jugador.getJugador();
		j1.setNombre("Eneko");
		j1.setNvlDificultad(1);
		j1.setCodSudoku("s001");

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJugador() {
		assertNotNull(Jugador.getJugador());
	}

	@Test
	public void testGetJugador() {
		assertEquals(j1, Jugador.getJugador());
	}


	@Test
	public void testGetNombre() {
		assertEquals(j1.getNombre(), "Eneko");
	}

	@Test
	public void testGetNvlDificultad() {
		assertEquals(j1.getNvlDificultad(), 1);
	}

	@Test
	public void testGetCodSud() {
		assertEquals(j1.getCodSudoku(), "s001");
	}

}
