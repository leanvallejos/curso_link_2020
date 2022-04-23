package dominio;

import java.util.ArrayList;
import java.util.Collection;

public class Materia {

	private Collection<Materia> correlativas;
	
	
	public Collection<Materia> getCorrelativas() {
		return correlativas;
	}


	public void setCorrelativas(Collection<Materia> correlativas) {
		this.correlativas = correlativas;
	}


	public Materia(Collection<Materia> correlativas) {
		super();
		this.correlativas = correlativas;
	}


	public Materia() {
		this.correlativas = new ArrayList<Materia>();
	}




}
