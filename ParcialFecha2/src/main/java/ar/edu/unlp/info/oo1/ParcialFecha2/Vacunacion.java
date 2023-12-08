package ar.edu.unlp.info.oo1.ParcialFecha2;

public class Vacunacion extends ServicioIntervenido{
	
	private String nombre;
	private double costo;
	
	public Vacunacion(Medico medico, String nombre, double costo) {
		super(medico);
		this.nombre = nombre;
		this.costo = costo;
	}
	
	public double costo() {
		return this.medico.getHonorarios() + this.adicionalPorDomingo() + 500 + costo;
	}

}
