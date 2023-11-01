package ar.edu.unlp.info.oo1.ejercicio12_volumen;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReporteDeConstruccion {

	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	/*
	"Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro'). 
	Retorna la suma de los volúmenes de todas las piezas hechas en ese material"
	*/
	public double getVolumenDeMaterial(String material) {
		// filtro el listado de piezas por mi material
		List<Pieza> containMaterial = piezas.stream()
				.filter(pieza -> pieza.getMaterial() == material)
				.collect(Collectors.toList());
	
		// obtengo la suma
		return containMaterial.stream()
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}
	
	/*
	"Recibe como parámetro un color (un string, por ejemplo 'Rojo'). 
	Retorna la suma de las superficies externas de todas las piezas pintadas con ese color".
	*/
	public double getSuperficieDeColor(String color) {
		// filtro por color
		List<Pieza> containColor = piezas.stream()
				.filter(pieza -> pieza.getColor() == color)
				.collect(Collectors.toList());
		
		// obtengo la suma
		return containColor.stream()
				.mapToDouble(pieza -> pieza.getSuperficieExterna())
				.sum();
	}
}
