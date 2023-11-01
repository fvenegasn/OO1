package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo=titulo;
		this.cuerpo=cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}
	
	public void agregarAdjunto(Archivo adjunto) {
		this.adjuntos.add(adjunto);
	}
	
	// El tamaño de un email es la suma del largo del título, el largo del cuerpo, y del tamaño de sus adjuntos.
	public int getTamanio() {
		int tamanioAdjuntos = this.adjuntos.stream()
				.mapToInt(adjunto -> adjunto.tamanio())
				.sum();
		return this.getTitulo().length() + this.getCuerpo().length() + tamanioAdjuntos;
	}
}
