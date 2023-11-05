package ar.edu.unlp.info.oo1.ejercicio12_volumen;

public class Esfera extends Pieza{
	
	private int radio;
	
	public Esfera(String material, String color, int radio) {
		super(material,color);
		this.radio=radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getVolumen() {
		return ((double) 4/3) * Math.PI * Math.pow(this.getRadio(), 3);
	}
	
	public double getSuperficieExterna() {
		return 4*Math.PI*radio*radio;
	}
}
