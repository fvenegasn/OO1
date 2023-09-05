package ar.edu.unlp.info.oo1.ejercicio3_presupuestos;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem (Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		return items.stream().mapToDouble(item -> item.costo()).sum();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public List<Item> getItems() {
		return items;
	}
	
	
}

