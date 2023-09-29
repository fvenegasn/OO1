package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	
	private Inversor inversor;
	private Inversion plazoFijo;
	private Inversion accion;
	
	@BeforeEach
	void setUp() {
		this.inversor = new Inversor("Adrian");
		this.plazoFijo = new PlazoFijo(LocalDate.now().minusDays(20), 100, 0.05);
		this.accion = new InversionEnAcciones("ROB", 15000, 0.8324);
		this.inversor.agregarInversion(plazoFijo);
	}
	
	@Test
	void testCantidadDeInversiones() {
		assertNotEquals(2, this.inversor.getCantidadDeInversiones());
		assertEquals(1, this.inversor.getCantidadDeInversiones());
	}
	
	@Test
	void testValorActual() {
		assertNotEquals(12686, this.inversor.valorActual());
		assertEquals(200, this.inversor.valorActual());
		this.inversor.agregarInversion(accion);
		assertEquals(12686,this.inversor.valorActual());
	}

}
