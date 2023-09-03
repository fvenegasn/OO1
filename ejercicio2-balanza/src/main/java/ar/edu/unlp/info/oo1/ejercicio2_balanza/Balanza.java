package ar.edu.unlp.info.oo1.ejercicio2_balanza;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() { // consultar
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
		this.precioTotal = this.precioTotal + (producto.getPrecio()); // no correspondería realizarlo en el producto 
														   			  //ya que es la balanza quien obtiene este calculo, 
														   			  // un producto no puede calcular su precio total
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
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
