package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	
	//declaro
	private Carpeta folder1;
	private Carpeta folder2;
	private Email email;
	
	//setup
	@BeforeEach
	void setUp() {
		folder1 = new Carpeta("ATIC");
		folder2 = new Carpeta("APU");
		email = new Email("OO1", "Se matriculó correctamente en la materia");
		
		folder2.agregarEmail(email);
	}
	
	//tests
	@Test
	void espacioOcupadoTest() {
		assertEquals(0, folder1.espacioOcupado());
		assertEquals(43, folder2.espacioOcupado());
		folder1.agregarEmail(email);
		folder2.agregarEmail(email); // se supone que no podría agregarlo dos veces a la misma carpeta?
		assertEquals(43, folder1.espacioOcupado());
		assertEquals(86, folder2.espacioOcupado());
	}
	
	@Test
	void buscarTest() {
		assertNull(folder1.buscar("OO1"));
		assertEquals(email, folder2.buscar("materia"));
	}
	
}
