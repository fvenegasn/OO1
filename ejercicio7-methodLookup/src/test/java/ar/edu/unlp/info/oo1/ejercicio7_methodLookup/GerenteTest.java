package ar.edu.unlp.info.oo1.ejercicio7_methodLookup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GerenteTest {
	
	private Gerente alan;
	
	@BeforeEach
	public void setUp() {
		alan = new Gerente("Alan Turing");
	}
	
	@Test
	public void testCalcularValores() {
		assertEquals("Alan Turing", alan.getNombre());
		assertEquals(2850, alan.aportes());
		assertNotEquals(67250,alan.sueldoBasico());
		assertEquals(67850,alan.sueldoBasico());
	}
}
