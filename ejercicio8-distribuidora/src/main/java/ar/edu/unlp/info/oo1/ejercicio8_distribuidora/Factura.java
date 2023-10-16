package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;

import java.time.LocalDate;

public class Factura {
	
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.montoEnergiaActiva=montoEnergiaActiva;
		this.descuento=descuento;
		this.fecha=LocalDate.now();
		this.usuario=usuario;
	}
	
	public double montoTotal() {
		return this.montoEnergiaActiva-this.montoEnergiaActiva*(this.descuento/100);
	}
	
	public Usuario usuario() {
		return usuario;
	}
	
	public LocalDate fecha() {
		return fecha;
	}
	
	public double descuento() {
		return descuento;
	}

	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}
}
