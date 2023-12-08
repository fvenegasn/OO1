package ar.edu.unlp.info.oo1.ParcialFecha2;

public class ConsultaMedica extends ServicioIntervenido{
	
	public ConsultaMedica(Medico medico) {
		super(medico);
	}
	
	public double costo() {
		return this.medico.getHonorarios() + this.adicionalPorDomingo() + 300 + medico.adicionalPorAntiguedad();
	}
	
}
