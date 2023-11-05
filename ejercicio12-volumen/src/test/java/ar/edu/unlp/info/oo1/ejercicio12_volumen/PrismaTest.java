package ar.edu.unlp.info.oo1.ejercicio12_volumen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaTest {
	
	private Pieza prismaRectangular1;
	private Pieza prismaRectangular2;
	
	@BeforeEach
	void setUp() {
		prismaRectangular1 = new PrismaRectangular("tierra", "marron", 3,4,5);
		prismaRectangular2 = new PrismaRectangular("tierra", "marron", 3,4,0);
	}
	
	@Test
	void testVolumen() {
		// prisma
		assertNotEquals(prismaRectangular1.getVolumen(),59);
		assertEquals(prismaRectangular1.getVolumen(),60);
		assertEquals(prismaRectangular2.getVolumen(),0);
	}
	
	@Test
	void testSuperficieExterna() {
		// prisma
		assertNotEquals(prismaRectangular1.getSuperficieExterna(),47);
		assertEquals(prismaRectangular1.getSuperficieExterna(),94);
		assertEquals(prismaRectangular2.getSuperficieExterna(), 24);
	}
}
