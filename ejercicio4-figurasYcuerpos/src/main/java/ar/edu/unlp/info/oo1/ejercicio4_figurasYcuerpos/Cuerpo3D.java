package ar.edu.unlp.info.oo1.ejercicio4_figurasYcuerpos;

public class Cuerpo3D {

	private double altura;
	private Figura caraBasal;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double valor) {
		this.altura = valor;
	}
	public Figura getCaraBasal() {
		return caraBasal;
	}
	public void setCaraBasal(Figura cara) {
		this.caraBasal = cara;
	}
	
	public double getVolumen() {
		return this.getCaraBasal().getArea()*this.getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2*this.getCaraBasal().getArea()+this.getCaraBasal().getPerimetro()*this.getAltura();
	}
}
