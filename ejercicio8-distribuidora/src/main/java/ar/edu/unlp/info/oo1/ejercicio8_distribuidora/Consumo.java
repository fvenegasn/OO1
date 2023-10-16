package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;

import java.time.LocalDate;

public class Consumo {
	
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public double costoEnBaseA(double precioKWh) {
		return consumoEnergiaActiva*precioKWh;
	}
	
	public double factorDePotencia() {
		return consumoEnergiaActiva / 
				Math.sqrt(
						(consumoEnergiaActiva*consumoEnergiaActiva)
						+(consumoEnergiaReactiva*consumoEnergiaReactiva));
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}
}
