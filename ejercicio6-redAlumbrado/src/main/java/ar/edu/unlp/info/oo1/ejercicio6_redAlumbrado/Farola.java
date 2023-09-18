package ar.edu.unlp.info.oo1.ejercicio6_redAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {

	private boolean encendida;
	private List<Farola> neighbours;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola() {
		encendida=false;
		neighbours=new ArrayList<Farola>();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.neighbours.contains(otraFarola)) {
			this.neighbours.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors(){
		return this.neighbours;
	}
	
	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (!this.isOn()) {
			this.encendida=true;
			this.getNeighbors().forEach(farola -> farola.turnOn());
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.isOn()) {
			this.encendida=false;
			this.getNeighbors().forEach(farola -> farola.turnOff());			
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.encendida;
	}


	
}
