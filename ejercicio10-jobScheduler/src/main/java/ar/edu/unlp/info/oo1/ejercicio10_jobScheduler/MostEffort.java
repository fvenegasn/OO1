package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class MostEffort extends JobScheduler{
	
	protected JobDescription getNext() {
		return jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
				.orElse(null);
	}
}
