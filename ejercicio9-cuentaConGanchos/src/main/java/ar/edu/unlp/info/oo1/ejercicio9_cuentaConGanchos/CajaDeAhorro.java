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
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto-this.impuesto(monto));
	}
	
	@Override
	public boolean extraer(double monto) { // no lo puedo convertir a sentencia única porque sino no puedo devolver true o false en base a la operación, sino que me queda void
		if (super.extraer(monto+this.impuesto(monto))) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) { // idem
		if (super.transferirACuenta(monto+this.impuesto(monto), cuentaDestino)) {
			return true;
		}
		return false;
	}
	
}
