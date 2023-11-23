package ar.edu.unlp.info.oo1.ParcialFecha1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {

	private List<Cliente> clientes;
	private List<Producto> productos;
	
	public Distribuidora() {
		this.clientes = new ArrayList<Cliente>();
		this.productos = new ArrayList<Producto>();
	}
	
	public Cliente registrarCliente(String nombre, String email) {
		Cliente cliente = new Cliente (nombre,email);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Producto registrarProductoNacional(String nombre, double costoUnitario, String descripcion) {
		Producto producto = new ProductoNacional(nombre, costoUnitario, descripcion);
		this.productos.add(producto);
		return producto;
	}
	
	public Producto registrarProductoImportado(String nombre, double costoUnitario, String descripcion, String paisOrigen) {
		Producto producto = new ProductoImportado(nombre, costoUnitario, descripcion,paisOrigen);
		this.productos.add(producto);
		return producto;
	}
	
	public Pedido agregarPedido(Cliente cliente) {
		Pedido pedido = cliente.realizarPedido(LocalDate.now());
		return pedido;
	}
	
	// reimpl
	public int totalPorProducto(Producto producto) {
		return clientes.stream()
				.mapToInt(cliente -> cliente.totalPorProducto(producto))
				.sum();
	}
	
	/*public int totalPorProducto(Producto producto) { 
		return clientes.stream()
				.map(cliente -> cliente.getPedidos())
				.map(pedido -> pedido.getItems())
				.filter(item -> item.getNombreProducto() = producto)
				.mapToInt(item -> item.getCantidad())
				.sum();
	}*/
	
	public double costoTotal(Cliente cliente, LocalDate inicio, LocalDate fin) {
		return cliente.costoTotal(inicio, fin);
	}
	
	public List<Cliente> clientesConMayorCosto(){
		return clientes.stream()
				.sorted(((cl1, cl2) -> cl2.costoTotal(LocalDate.now().minusDays(30), LocalDate.now())
						.compareTo(cl1.costoTotal(LocalDate.now().minusDays(30), LocalDate.now()))
				.limit(5)
				.collect(Collectors.toList());
	}
}
