package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	
	//declaro
	private Email email1;
	private Email email2;
	private Email email3;
	private Archivo adjunto;
	
	//setup
	@BeforeEach
	void setUp() {
		email1 = new Email("Hola", "Mundo");
		email2 = new Email("OO1", "Orientacion a objetos 1");
		email3 = new Email("", "");
		adjunto = new Archivo("File");
	}
	
	//tests
	@Test
	void tamanioTest() {
		assertEquals(9, email1.getTamanio());
		assertEquals(26, email2.getTamanio());
		assertEquals(0, email3.getTamanio());
		email3.agregarAdjunto(adjunto);
		assertEquals(4, email3.getTamanio());
	}
	
	void contieneTest() {
		assertFalse(email3.contiene("Hola"));
		assertTrue(email1.contiene("un"));
		assertTrue(email2.contiene("on a o"));
	}
	
}
