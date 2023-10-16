package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;

	public Usuario(String nombre, String domicilio) {
		this.domicilio=domicilio;
		this.nombre=nombre;
		this.facturas= new ArrayList<Factura>();
		this.consumos= new ArrayList<Consumo>();
	}
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	private void agregarFactura(Factura factura){
		this.facturas.add(factura);
	}
	
	private Consumo ultimoConsumo() {
		return this.consumos
		.stream()
		.max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha()))
		.orElse(null);
	}
	
	public double ultimoConsumoActiva() {
		Consumo ultimoConsumo = this.ultimoConsumo();
		if (ultimoConsumo == null) {
			return 0.0;
		}
		return ultimoConsumo.getConsumoEnergiaActiva();
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo ultimoConsumo = this.ultimoConsumo();
		if (ultimoConsumo == null) {
			return new Factura (0,0,this);
		}
		
		double descuento = 0.0;
		if (ultimoConsumo.factorDePotencia() > 0.8) {
			descuento = 10;
		}
		
		Factura factura = new Factura(ultimoConsumo.costoEnBaseA(precioKWh), descuento, this);
		this.agregarFactura(factura);
		return factura;
}
	
	public List<Factura> facturas(){
		return this.facturas;
	}
}
