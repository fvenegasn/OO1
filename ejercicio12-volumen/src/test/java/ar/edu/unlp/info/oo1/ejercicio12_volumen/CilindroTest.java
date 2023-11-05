package ar.edu.unlp.info.oo1.ejercicio12_volumen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {

	private Pieza cilindro1;
	private Pieza cilindro2;
	
	@BeforeEach
	void setUp() {
		cilindro1 = new Cilindro("piedra", "gris", 2, 4);
		cilindro2 = new Cilindro ("piedra", "gris",0,0);
	}
	
	@Test
	void testVolumen() {
		// cilindro
		assertNotEquals(cilindro1.getVolumen(), 51.265482457436691815402294132472);
		assertEquals(cilindro1.getVolumen(), 50.265482457436691815402294132472);
		assertEquals(cilindro2.getVolumen(), 0);
	}
	
	@Test
	void testSuperficieExterna() {
		// cilindro
		assertNotEquals(cilindro1.getSuperficieExterna(),76);
		assertEquals(cilindro1.getSuperficieExterna(),75.398223686155037723103441198708);
		assertEquals(cilindro2.getVolumen(),0);
	}
}
