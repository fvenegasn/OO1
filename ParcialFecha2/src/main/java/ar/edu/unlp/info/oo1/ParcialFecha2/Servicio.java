package ar.edu.unlp.info.oo1.ParcialFecha2;

import java.time.LocalDate;

public interface Servicio {
	
	//LocalDate fecha = LocalDate.now(); // private LocalDate fecha
	
	public double costo();
	
	public LocalDate getFecha();
	
	public boolean enFecha(LocalDate fecha);
}
