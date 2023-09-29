package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre=nombre;
		this.inversiones= new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public List<Inversion> getInversiones() {
		return this.inversiones;
	}
	
	public int getCantidadDeInversiones() {
		return this.inversiones.size();
	}
	
	public double valorActual() {
		return this.inversiones.stream()
				.mapToDouble(inversion -> inversion.valorActual())
				.sum();
	}
}
