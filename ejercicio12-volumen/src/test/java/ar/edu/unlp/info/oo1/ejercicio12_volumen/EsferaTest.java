package ar.edu.unlp.info.oo1.ejercicio12_volumen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsferaTest {
	
	private Pieza esfera1;
	private Pieza esfera2;
	
	@BeforeEach
	void setUp() {
		esfera1 = new Esfera("piedra", "gris", 5);
		esfera2 = new Esfera("piedra", "gris", 0);
	}
	
	@Test
	void testVolumen() {
		assertNotEquals(esfera1.getVolumen(),524.59877559829887307710723054658);
		assertEquals(esfera1.getVolumen(),523.59877559829887307710723054658);
		assertEquals(esfera2.getVolumen(), 0);
	}
	
	@Test
	void testSuperficieExterna() {
		// esfera
		assertNotEquals(esfera1.getSuperficieExterna(),314);
		assertEquals(esfera1.getSuperficieExterna(),314.15926535897932384626433832795);
		assertEquals(esfera2.getSuperficieExterna(),0);
	}
}
