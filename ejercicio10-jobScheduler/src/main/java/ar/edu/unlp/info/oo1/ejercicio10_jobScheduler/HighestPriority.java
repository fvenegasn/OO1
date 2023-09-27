package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class HighestPriority extends JobScheduler{
	
	protected JobDescription getNext() {
		return jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);
	}
}
