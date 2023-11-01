package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

public class Archivo {
	
	private String nombre;

	public Archivo(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// asuma que el tamaño de un archivo es el largo de su nombre.
	public int tamanio() {
		return getNombre().length();
	}
}
