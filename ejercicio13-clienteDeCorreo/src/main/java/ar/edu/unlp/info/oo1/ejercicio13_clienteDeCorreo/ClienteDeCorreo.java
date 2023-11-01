package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() { // el inbox cuenta como una carpeta de la lista carpetas?
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	// almacena en el inbox (una de las carpetas) el email que recibe como parámetro
	public void recibir (Email email) {
		this.inbox.agregarEmail(email);
	}
	
	// mueve el email que viene como parámetro de la carpeta origen a la carpeta destino 
	// (asuma que el email está en la carpeta origen cuando se recibe este mensaje).
	public void mover (Email email, Carpeta origen, Carpeta destino) {
		origen.quitarEmail(email);
		destino.agregarEmail(email); // qué pasa si la carpeta destino no existe?
	}
	
	// retorna el primer email que encuentra cuyo título o cuerpo contienen el texto indicado como parámetro. 
	// Busca en todas las carpetas.
	public Email buscar (String texto) {
		// busco en el inbox
		Email emailBuscado = this.inbox.buscar(texto);
		// si no está en el inbox
		if (emailBuscado == null) {
			// busco en otras carpetas
			emailBuscado = this.carpetas.stream()
					.map(carpeta -> carpeta.buscar(texto))
					.filter(email->email != null)
					.findFirst().orElse(null);
		}
		return emailBuscado;
	}

	// retorna la suma del espacio ocupado por todos los emails de todas las carpetas.
	public int espacioOcupado() {
		int tamanioInbox = this.inbox.espacioOcupado();
		int tamanioCarpetas = this.carpetas.stream()
				.mapToInt(carpeta -> carpeta.espacioOcupado())
				.sum();
		return tamanioInbox + tamanioCarpetas;
	}
}
