package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	
	private List<Email> emails;
	private String nombre;
	
	public Carpeta(String nombre) {
		this.nombre=nombre;
		this.emails=new ArrayList<Email>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Email> getEmails() {
		return emails;
	}
	
	// recibe un mail por parámetro y lo agrega a esta carpeta
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	// recibe un mail por parámetro y lo elimina de esta carpeta
	public void quitarEmail(Email email) {
		this.emails.remove(email);
	}
	
	// retorna el espacio ocupado de una carpeta
	public int espacioOcupado() {
		return this.emails.stream()
				.mapToInt(email -> email.getTamanio())
				.sum(); // deberia agregarle el espacio que ocupa el nombre de la carpeta? -> no pq no aclara enunciado
	}
	
	// retorna el primer email que encuentra cuyo título o cuerpo contienen el texto indicado como parámetro. 
	// Busca en todas las carpetas.
	public Email buscar (String texto) {
		return this.getEmails().stream()
				.filter(email -> email.contiene(texto))
				.findFirst().orElse(null);
	}	
}
