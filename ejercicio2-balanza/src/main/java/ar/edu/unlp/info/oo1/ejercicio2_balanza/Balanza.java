package ar.edu.unlp.info.oo1.ejercicio2_balanza;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal = this.pesoTotal+ producto.getPeso();
		this.precioTotal = this.precioTotal + (producto.getPrecio());
	}
	
	public Ticket emitirTicket() {
		int qProductos = this.getCantidadDeProductos();
		double pesoTotal = this.getPesoTotal();
		double precioTotal = this.getPrecioTotal(); // se agregan variables que obtienen los valores de los atributos para no enviar como parámetro la referencia de mi atributo. sería como "pasar por valor" los atributos
		Ticket ticket = new Ticket(qProductos, pesoTotal, precioTotal);
		return ticket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}
	
	
	
}
