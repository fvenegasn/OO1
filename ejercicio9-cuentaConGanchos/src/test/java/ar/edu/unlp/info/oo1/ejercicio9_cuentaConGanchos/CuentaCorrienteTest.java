package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CuentaCorrienteTest {

	private CuentaCorriente cuentaCorriente1;
	private CuentaCorriente cuentaCorriente2;
	
	@BeforeEach
	void setUp() {
		this.cuentaCorriente1 = new CuentaCorriente();
		this.cuentaCorriente2 = new CuentaCorriente();
		cuentaCorriente2.setLimite(7000);
	}
	
	@Test
	void testExtraerSinLimite() {
		assertFalse(cuentaCorriente1.extraer(1000));
	}
	
	@Test
	void testExtraer() {
		cuentaCorriente1.setLimite(10000);
		assertTrue(cuentaCorriente1.extraer(5000));
		assertEquals(cuentaCorriente1.getSaldo(),0); // consultar por qué no pasa -> debería ser 0, pero JUnit dice que es 5000
	}
	
	@Test
	void testDepositar() {
		cuentaCorriente1.depositar(500);
		assertEquals(cuentaCorriente1.getSaldo(),500);
		assertTrue(cuentaCorriente1.puedeExtraer(500));
	}
	
	@Test
	void testTransferir() {
		assertTrue(cuentaCorriente2.transferirACuenta(5000, cuentaCorriente1));
		assertFalse(cuentaCorriente1.transferirACuenta(5000, cuentaCorriente2)); // consultar -> JUnit espera TRUE
		cuentaCorriente2.transferirACuenta(5000, cuentaCorriente1);
		assertFalse(cuentaCorriente2.puedeExtraer(2001));
		assertTrue(cuentaCorriente1.puedeExtraer(5000));
	}
	
	
	
}