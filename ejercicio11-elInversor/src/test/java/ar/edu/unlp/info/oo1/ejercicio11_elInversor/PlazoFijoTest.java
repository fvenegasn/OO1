package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	
	private Inversion plazoFijo;
	
	@BeforeEach
	void setUp() {
		this.plazoFijo = new PlazoFijo(LocalDate.now().minusDays(5), 1000, 0.1);
	}
	
	@Test
	public void testValorActual() {
		assertNotEquals(500,this.plazoFijo.valorActual()); // valor del interés sin el monto depositado
		assertEquals(1500, this.plazoFijo.valorActual()); // valor correcto
	}
}
