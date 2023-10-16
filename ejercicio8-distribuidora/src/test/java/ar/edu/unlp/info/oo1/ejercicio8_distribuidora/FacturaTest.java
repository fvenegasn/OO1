package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {

	private Usuario usuario;
	private Factura factura;

	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Mercedes", "Calle Sosa 99, San Miguel de Tucuman");
		factura = new Factura(2000, 10, usuario);
	}

	@Test
	public void testInicializar() {
		assertEquals(10, factura.descuento());
		assertEquals(2000, factura.getMontoEnergiaActiva());
		assertEquals(factura.fecha(), LocalDate.now());
		assertEquals(usuario, factura.usuario());
	}

	@Test
	public void testMontoTotal() {
		assertEquals(1800, factura.montoTotal());
	}

}
