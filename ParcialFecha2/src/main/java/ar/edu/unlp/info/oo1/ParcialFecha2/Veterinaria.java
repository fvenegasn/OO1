package ar.edu.unlp.info.oo1.ParcialFecha2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
	
	private List<Medico> medicos;
	private List<Mascota> mascotas;
	
	public Veterinaria() {
		this.medicos = new ArrayList<Medico>();
		this.mascotas = new ArrayList<Mascota>();
	}
	
	public Medico registrarMedico(String nombre, LocalDate ingreso, double honorarios) {
		Medico medico = new Medico(nombre, ingreso, honorarios);
		this.medicos.add(medico);
		return medico;
	}
	
	public Mascota registrarMascota(String nombre, LocalDate nacimiento, String especie) {
		Mascota mascota = new Mascota(nombre, nacimiento, especie);
		this.mascotas.add(mascota);
		return mascota;
	}
	
	public double costoPorMascota(Mascota mascota, LocalDate fecha) { // innecesario, método pasamanos
		return mascota.costoTotalPorFecha(fecha);
	}
	
	public double costoPorCachorros(LocalDate fecha) {
		return mascotas.stream()
				.filter(mascota -> mascota.esCachorro() == true)
				.mapToDouble(mascota -> mascota.costoTotalPorFecha(fecha))
				.sum();
	}
}
