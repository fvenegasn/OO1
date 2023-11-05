package ar.edu.unlp.info.oo1.ejercicio12_volumen;

public class Cilindro extends Pieza{
	
	private int radio;
	private int altura;
	
	public Cilindro(String material, String color, int radio, int altura) {
		super(material,color);
		this.radio=radio;
		this.altura=altura;
	}
	
	public int getRadio() {
		return radio;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public double getVolumen() {
		return Math.PI*radio*radio*altura;
	}
	
	public double getSuperficieExterna() {
		return 2*Math.PI*radio*altura+2*Math.PI*radio*radio;
	}
}
