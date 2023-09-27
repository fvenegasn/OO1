package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public double impuesto(double monto) {
		return monto*0.02;
	}
	
	protected boolean puedeExtraer(double monto) {
		if (impuesto(monto) + monto <= this.getSaldo()) {
			return true;
		}
		return false;
	}
	
	public void depositar(double monto) {
		super.depositar(monto);
		this.extraerSinControlar(this.impuesto(monto));
	}
	
	public boolean extraer(double monto) {
		if (super.extraer(monto)) {
			this.extraerSinControlar(this.impuesto(monto));
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (super.transferirACuenta(monto, cuentaDestino)) {
			this.extraerSinControlar(this.impuesto(monto));
			return true;
		}
		return false;
	}
	
}
