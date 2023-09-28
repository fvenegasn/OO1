package ar.edu.unlp.info.oo1.ejercicio2_balanza;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.productos = new ArrayList<Producto>(productos);
	}
	
	public Ticket() { // como no recibe info, emite ticket en 0
		this.fecha = LocalDate.now();
		this.productos = new ArrayList<Producto>();
	}
	
	public double impuesto() { //pensado para obtener cuánto del producto corresponde a impuesto
		return this.getPrecioTotal() * 0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	// no los estoy calculando dos veces de la misma forma en dos distintas clases? -> es casualidad y está bien que sea así
	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
}
