package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccionesTest {
	
	private Inversion accion;
	
	@BeforeEach
	void setUp() {
		this.accion=new InversionEnAcciones("RUNE", 2, 1.75);
	}
	
	@Test
	void testValorActual() {
		assertNotEquals(3, this.accion.valorActual());
		assertEquals(3.5, this.accion.valorActual());
	}
}
