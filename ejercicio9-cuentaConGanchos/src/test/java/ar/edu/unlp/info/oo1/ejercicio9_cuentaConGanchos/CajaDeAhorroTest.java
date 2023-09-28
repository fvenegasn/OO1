package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// los tests se pueden hacer más robustos agregando más verificaciones en cada uno de los casos de las operaciones

public class CajaDeAhorroTest {

	private CajaDeAhorro cajaDeAhorro1;
	private CajaDeAhorro cajaDeAhorro2;
	
	@BeforeEach
	void setUp() {
		this.cajaDeAhorro1 = new CajaDeAhorro();
		this.cajaDeAhorro2 = new CajaDeAhorro();
		cajaDeAhorro1.depositar(1000);
	}
	
	@Test
	void testExtraerSinSaldo() {
		assertFalse(cajaDeAhorro1.extraer(1000));
		assertFalse(cajaDeAhorro2.extraer(1000));
	}
	
	@Test
	void testDepositar() {
		assertNotEquals(cajaDeAhorro1.getSaldo(), 1000);
		assertEquals(cajaDeAhorro1.getSaldo(), 980);
		assertEquals(cajaDeAhorro2.getSaldo(), 0);
	}
	
	@Test
	void testExtraer() {
		assertTrue(cajaDeAhorro1.extraer(500));
		assertFalse(cajaDeAhorro1.extraer(981));
		assertFalse(cajaDeAhorro2.extraer(300));
	}
	
	@Test
	void testTransferir() {
		assertTrue(cajaDeAhorro1.transferirACuenta(100, cajaDeAhorro2));
		assertEquals(cajaDeAhorro2.getSaldo(),98);
		assertEquals(cajaDeAhorro1.getSaldo(),878);
	}
	
	
	
}
