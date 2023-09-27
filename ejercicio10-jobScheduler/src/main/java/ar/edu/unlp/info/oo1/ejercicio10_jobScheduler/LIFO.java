package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class LIFO extends JobScheduler{
	
	protected JobDescription getNext() {
		return jobs.get(jobs.size()-1);
	}
	
}
