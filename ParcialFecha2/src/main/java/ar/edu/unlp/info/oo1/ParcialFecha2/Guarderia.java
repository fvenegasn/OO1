package ar.edu.unlp.info.oo1.ParcialFecha2;

import java.time.LocalDate;

public class Guarderia implements Servicio{
	
	private Mascota mascota;
	private int dias;
	private LocalDate fecha;
	
	public Guarderia(Mascota mascota, int dias) {
		this.mascota = mascota;
		this.dias = dias;
		this.fecha = LocalDate.now();
	}

	public double costo() {
		return dias*500*mascota.descuentoPorServicios();
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public boolean enFecha(LocalDate fecha) {
		return this.fecha.isAfter(fecha) && this.fecha.isBefore(fecha.plusDays(dias)); // aca realmente tengo dudas de si contempla los valores de borde (día de inicio, día de fin) o sólo el rango entre ellos
	}
}
