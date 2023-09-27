package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

public class CuentaCorriente extends Cuenta{
	
	private double limite;
	
	public CuentaCorriente() {
		super();
		this.limite=0;
	}
	
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo()+limite >= monto) {
			return true;
		}
		return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
