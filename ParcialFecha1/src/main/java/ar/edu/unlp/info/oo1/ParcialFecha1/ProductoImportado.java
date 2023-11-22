package ar.edu.unlp.info.oo1.ParcialFecha1;

public class ProductoImportado extends Producto {
	
	private String paisOrigen;
	
	public ProductoImportado(String nombre, double costoUnitario, String descripcion, String paisOrigen) {
		super(nombre, costoUnitario, descripcion);
		this.paisOrigen=paisOrigen;
	}
	
	@Override
	public double impuesto(int cantidad) {
		if ((this.paisOrigen.equals("Brasil") || this.paisOrigen.equals("Uruguay") || this.paisOrigen.equals("Paraguay")) && (cantidad > 50)){
			return 1.08;
		} else {
			return 1.21;
		}
	}
}
