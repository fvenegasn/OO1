package ar.edu.unlp.info.oo1.ejercicio4_figurasYcuerpos;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public void setLado(double valor) {
		this.lado=valor;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return this.getLado()*4;	
	}
	
	public double getArea() {
		return this.getLado()*this.getLado();
	}
	
}
