package ar.edu.unlp.info.oo1.ejercicio12_volumen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiezaTest {
	
	private Pieza cilindro;
	private Pieza esfera;
	private Pieza prismaRectangular;
	
	@BeforeEach
	void setUp() {
		cilindro = new Cilindro("piedra", "gris", 2, 4);
		esfera = new Esfera("piedra", "gris", 5);
		prismaRectangular = new PrismaRectangular("tierra", "marron", 3,4,5);
	}
	
	@Test
	void testVolumen() {
		// cilindro
		assertNotEquals(cilindro.getVolumen(), 51.265482457436691815402294132472);
		assertEquals(cilindro.getVolumen(), 50.265482457436691815402294132472);
		// esfera
		assertNotEquals(esfera.getVolumen(),524.59877559829887307710723054658);
		assertEquals(esfera.getVolumen(),523.59877559829887307710723054658);
		// prisma
		assertNotEquals(prismaRectangular.getVolumen(),59);
		assertEquals(prismaRectangular.getVolumen(),60);
	}
	
	@Test
	void testSuperficieExterna() {
		// cilindro
		assertNotEquals(cilindro.getSuperficieExterna(),76);
		assertEquals(cilindro.getSuperficieExterna(),75.398223686155037723103441198708);
		// esfera
		assertNotEquals(esfera.getSuperficieExterna(),314);
		assertEquals(esfera.getSuperficieExterna(),314.15926535897932384626433832795);
		// prisma
		assertNotEquals(prismaRectangular.getSuperficieExterna(),47);
		assertEquals(prismaRectangular.getSuperficieExterna(),94);
	}
}
