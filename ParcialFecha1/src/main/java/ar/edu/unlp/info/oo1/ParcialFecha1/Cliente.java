package ar.edu.unlp.info.oo1.ParcialFecha1;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private String email;
	private LocalDate fechaAlta;
	private List<Pedido> pedidos;
	
	public Cliente (String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		this.fechaAlta = LocalDate.now();
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public Pedido realizarPedido(LocalDate fecha) {
		Pedido pedido = new Pedido(fecha);
		this.pedidos.add(pedido);
		return pedido;
	}
	
	public double costoTotal(LocalDate inicio, LocalDate fin) {
		return pedidos.stream()
				.mapToDouble(pedido -> pedido.costoTotal())
				.sum();
	}
	
	public List<Pedido> getPedidos(){
		return this.pedidos;
	}
	
	// reimpl
	public int totalPorProducto(Producto producto) {
		return this.pedidos.stream()
				.mapToInt(pedido -> pedido.totalPorProducto(producto))
				.sum();
	}
}
