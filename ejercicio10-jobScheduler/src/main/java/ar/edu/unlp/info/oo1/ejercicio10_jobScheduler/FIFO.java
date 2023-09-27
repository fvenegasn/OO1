package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class FIFO extends JobScheduler {
	
	protected JobDescription getNext() {
		return jobs.get(0);
	}
}
