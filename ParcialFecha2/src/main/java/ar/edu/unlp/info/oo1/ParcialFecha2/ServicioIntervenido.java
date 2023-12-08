package ar.edu.unlp.info.oo1.ParcialFecha2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioIntervenido implements Servicio{
	
	private LocalDate fecha;
	protected Medico medico;
	//private double costoMateriales;
	
	public ServicioIntervenido(Medico medico) {
		this.medico = medico;
		//this.costoMateriales = costoMateriales;
		this.fecha= LocalDate.now();
	}
	
	public double adicionalPorDomingo() {
		if (fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			return 200;
		} else {
			return 0;
		}
	}
	
	public boolean enFecha(LocalDate fecha) {
		if (this.fecha == fecha) {
			return true;
		} else {
			return false;
		}
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
}
