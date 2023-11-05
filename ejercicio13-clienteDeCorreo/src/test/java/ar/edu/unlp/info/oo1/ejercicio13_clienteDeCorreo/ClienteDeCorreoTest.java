package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	
	// declaro
	private ClienteDeCorreo sistema1;
	private ClienteDeCorreo sistema2;
	private Archivo file1, file2;
	private Carpeta folder1, folder2;
	private Email email1, email2, email3;
	
	// setup
	@BeforeEach
	void setUp() {
		this.sistema1 = new ClienteDeCorreo();
		this.sistema2 = new ClienteDeCorreo();
		this.folder1 = new Carpeta("UNLP");
		this.folder2 = new Carpeta("Laboral");
		this.email1 = new Email("Elecciones", "Se vota el 1, 2 y 3 de noviembre");
		this.email2 = new Email("Hola mundo", "");
		this.email3 = new Email("Recibo noviembre", "Firme su recibo del mes mencionado");
		this.file1 = new Archivo("Recibo_Noviembre");
		this.file2 = new Archivo("Firma");
		
		this.email1.agregarAdjunto(file2);
		this.email3.agregarAdjunto(file1);
		
		this.sistema1.agregarCarpeta(folder1);
		this.sistema1.agregarCarpeta(folder2);
		
		this.sistema1.recibir(email1);
		this.sistema1.recibir(email2);
		this.sistema1.recibir(email3);
		
	}
	
	// test mover
	@Test
	void moverTest() {
		Carpeta inbox = this.sistema1.getCarpetas().get(0);
		assertEquals(3, inbox.getEmails().size());
		this.sistema1.mover(email1, inbox, folder1);
		this.sistema1.mover(email3, inbox, folder2);
		assertNotEquals(3, inbox.getEmails().size());
		assertEquals(1, this.folder1.getEmails().size());
		assertEquals(1, this.folder2.getEmails().size());
		this.sistema1.mover(email2, inbox, folder2);
		assertEquals(0, inbox.getEmails().size());
		assertEquals(2, this.folder2.getEmails().size());
	}
	
	// test buscar
	@Test
	void buscarTest() {
		assertEquals(this.email1, this.sistema1.buscar("noviembre"));
		assertEquals(this.email2, this.sistema1.buscar("mundo"));
		assertEquals(this.email3, this.sistema1.buscar("recibo"));
		assertNull(this.sistema1.buscar("agosto"));
	}
	
	// test espacio ocupado
	@Test
	void espacioOcupadoTest() {
		assertEquals(123,this.sistema1.espacioOcupado());
		assertEquals(0,this.sistema2.espacioOcupado());
	}
}
