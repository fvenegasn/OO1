package ar.edu.unlp.info.oo1.ParcialFecha2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String especie;
	private List<Servicio> servicios;
	
	public Mascota(String nombre, LocalDate nacimiento, String especie) {
		this.nombre = nombre;
		this.fechaDeNacimiento = nacimiento;
		this.especie = especie;
		this.servicios = new ArrayList<Servicio>();
	}
	
	public Servicio registrarConsultaMedica(Medico medico) {
		Servicio servicio = new ConsultaMedica(medico);
		this.servicios.add(servicio);
		return servicio;
	}
	
	public Servicio registrarVacunacion(Medico medico, String nombre, double costo) {
		Servicio servicio = new Vacunacion(medico, nombre, costo);
		this.servicios.add(servicio);
		return servicio;
	}
	
	public Servicio registrarGuarderia(int dias) {
		Servicio servicio = new Guarderia(this, dias);
		this.servicios.add(servicio);
		return servicio;
	}
	
	public double costoTotalPorFecha(LocalDate fecha) {
		return servicios.stream()
				//.filter(servicio -> servicio.getFecha() == fecha)
				.filter(servicio -> servicio.enFecha(fecha) == true)
				.mapToDouble(servicio -> servicio.costo())
				.sum();
	}
	
	public int getEdad() {
		return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
	}
	
	public int cantidadServicios() {
		return this.servicios.size();
	}
	
	public double descuentoPorServicios() {
		if (this.cantidadServicios() >= 5) {
			return 0.9; // aplica el 10%
		} else {
			return 1.0; // paga el total
		}
	}
	
	public boolean esCachorro() {
		return this.getEdad() < 2;
	}
}
