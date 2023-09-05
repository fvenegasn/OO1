package ar.edu.unlp.info.oo1.ejercicio4_figurasYcuerpos;

public class Circulo extends Figura{
	private double radio;
	
	public double getDiametro() {
		return this.getRadio()*2;
	}
	
	public void setDiametro(double valor) {
		this.setRadio(valor/2);
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double valor) {
		this.radio=valor;
	}
	
	public double getPerimetro() {
		return Math.PI*this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI*this.getRadio()*this.getRadio();		
	}
	
}
