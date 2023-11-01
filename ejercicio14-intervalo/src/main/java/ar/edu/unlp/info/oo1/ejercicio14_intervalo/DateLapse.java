package ar.edu.unlp.info.oo1.ejercicio14_intervalo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	/*“Retorna la fecha de inicio del rango”*/
	public LocalDate getFrom() {
		return this.from;
	}
	

	/*“Retorna la fecha de fin del rango”*/
	public LocalDate getTo() {
		return this.to;
	}
	
	/*“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”*/
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(getFrom(), getTo());
	}

	/*“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.*/
	public boolean includesDate(LocalDate other) {
		if ((other.isBefore(getTo()) || (other.isEqual(getTo())) && ((other.isAfter(getFrom()) || (other.isEqual(getFrom())))))) {
			return true;
		} else {
			return false;
		}
	}
}
