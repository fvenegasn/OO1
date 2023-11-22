package ar.edu.unlp.info.oo1.ParcialFecha1;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Pedido {
	
	private LocalDate fechaPedido;
	private List<Item> items;
	
	public Pedido(LocalDate fecha) {
		this.fechaPedido=fecha;
		this.items= new ArrayList<Item>();
	}
	
	public void agregarProducto(Producto producto, int cantidad) {
		Item item = new Item(producto, cantidad);
		this.items.add(item);
	}

	public List<Item> getItems() {
		return items;
	}
	
	public double costoTotal() {
		return items.stream()
				.mapToDouble(item -> item.costoTotal())
				.sum();
	}
	
	// reimpl
	public int totalPorProducto(Producto producto) {
		return items.stream()
				.filter(item -> item.getNombreProducto().equals(producto))
				.mapToInt(item -> item.getCantidad())
				.sum();
	}
}
