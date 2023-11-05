package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	
	private Inversor inversor1;
	private Inversor inversor2;
	private Inversion plazoFijo;
	private Inversion accion;
	
	@BeforeEach
	void setUp() {
		this.inversor1 = new Inversor("Adrian");
		this.inversor2 = new Inversor("Patricio");
		this.plazoFijo = new PlazoFijo(LocalDate.now().minusDays(20), 100, 0.05);
		this.accion = new InversionEnAcciones("ROB", 15000, 0.8324);
		this.inversor1.agregarInversion(plazoFijo);
	}
	
	@Test
	// no tiene mucho sentido evaluar un getter
	void testCantidadDeInversiones() {
		assertEquals(1, this.inversor1.getCantidadDeInversiones());
		assertEquals(0, this.inversor2.getCantidadDeInversiones());
	}
	
	@Test
	void testValorActual() {
		assertNotEquals(12686, this.inversor1.valorActual());
		assertEquals(200, this.inversor1.valorActual());
		this.inversor1.agregarInversion(accion);
		assertEquals(12686,this.inversor1.valorActual());
		assertEquals(0, this.inversor2.valorActual());
	}

}
