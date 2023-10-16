package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	
	private double precioKWh;
	private List<Usuario> usuarios;
	
	public Distribuidora(double precioKWh) {
		this.precioKWh=precioKWh;
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public List<Factura> facturar(){
		List<Factura> facturas = this.usuarios
				.stream()
				.map((Usuario usuario) -> usuario.facturarEnBaseA(this.getPrecioKWh()))
				.collect(Collectors.toList());
		return facturas;
	}
	
	public double consumoTotalActiva() {
		return this.usuarios
				.stream()
				.mapToDouble((Usuario usuario) -> usuario.ultimoConsumoActiva())
				.sum();
	}
	
	public void precioKWh(double precio) {
		this.precioKWh = precio;
	}
	
	public double getPrecioKWh() {
		return this.precioKWh;
	}
	
	public List<Usuario> getUsuarios(){
		List<Usuario> auxUsuarios = this.usuarios;
		return auxUsuarios;
	}
	
}
