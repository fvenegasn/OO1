package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteres; // se da entre 0 y 1. p.e: 25% = 0.25
	
	public PlazoFijo(LocalDate fecha, double monto, double porcentaje) {
		this.fechaDeConstitucion=fecha;
		this.montoDepositado=monto;
		this.porcentajeDeInteres=porcentaje;
	}
	
	public double valorActual() {
		return montoDepositado+(this.montoDepositado*
								this.porcentajeDeInteres*
								(ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now())));
	}
}
