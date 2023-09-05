package ar.edu.unlp.info.oo1.ejercicio2_balanza;

import java.util.List;
import java.util.ArrayList;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() { // consultar
		ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getProductos());
		return ticket;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	
}
