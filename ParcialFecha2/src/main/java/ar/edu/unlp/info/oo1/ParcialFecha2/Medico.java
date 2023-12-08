package ar.edu.unlp.info.oo1.ParcialFecha2;

import java.time.LocalDate;
import java.time.Period;

public class Medico {
	
	private String nombre;
	private LocalDate fechaDeIngreso;
	private double honorarios;
	
	public Medico (String nombre, LocalDate ingreso, double honorarios) {
		this.nombre = nombre;
		this.fechaDeIngreso = ingreso;
		this.honorarios = honorarios;
	}

	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public double getHonorarios() {
		return honorarios;
	}
	
	public double adicionalPorAntiguedad() {
		return 100*Period.between(fechaDeIngreso, LocalDate.now()).getYears();
	}
}
