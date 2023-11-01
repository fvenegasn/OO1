package ar.edu.unlp.info.oo1.ejercicio12_volumen;

public class PrismaRectangular extends Pieza{
	
	private int ladoMayor;
	private int ladoMenor;
	private int altura;

	public PrismaRectangular(String material, String color, int ladoMayor, int ladoMenor, int altura) {
		super(material,color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}

	public int getLadoMayor() {
		return ladoMayor;
	}

	public int getLadoMenor() {
		return ladoMenor;
	}

	public int getAltura() {
		return altura;
	}
	
	public double getVolumen() {
		double volumen = ladoMayor*ladoMenor*altura;
		return volumen;
	}
	
	public double getSuperficieExterna() {
		double superficieExterna = 2*(ladoMayor*ladoMenor+ladoMayor*altura+ladoMenor*altura);
		return superficieExterna;		
	}
}
