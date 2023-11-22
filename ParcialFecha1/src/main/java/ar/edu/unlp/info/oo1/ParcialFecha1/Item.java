package ar.edu.unlp.info.oo1.ParcialFecha1;

public class Item {

	private Producto producto;
	private int cantidad;
	
	public Item(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public String getNombreProducto() {
		return this.producto.getNombre();
	}
	
	public double costoTotal() {
		return this.producto.getCostoUnitario() * cantidad * this.producto.impuesto(cantidad);
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}
}
