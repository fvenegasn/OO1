package ar.edu.unlp.info.oo1.ParcialFecha1;

public class ProductoNacional extends Producto{

	public ProductoNacional(String nombre, double costoUnitario, String descripcion){
		super(nombre, costoUnitario, descripcion);
	}
	
	@Override
	public double impuesto(int cantidad) {
		if (cantidad > 10) {
			return 1.0;
		} else {
			return 1.05;
		}
	}
}
