package ar.edu.unlp.info.oo1.ParcialFecha1;

public abstract class Producto {

	private String nombre;
	private double costoUnitario;
	private String descripcion;
	
	public Producto(String nombre, double costoUnitario, String descripcion) {
		this.nombre=nombre;
		this.costoUnitario=costoUnitario;
		this.descripcion=descripcion;
	}
	
	public abstract double impuesto(int cantidad);

	public String getNombre() {
		return nombre;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
