package dominio;

import java.util.ArrayList;
import java.util.Collection;

public class Alumno {

	private String nombre;

	private Collection<Materia> materiasAprobadas;
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
		this.materiasAprobadas = new ArrayList<Materia>();
	}

	public void agregarMateriaAprobada(Materia materia) {
		materiasAprobadas.add(materia);
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean tieneAprobadas(Collection<Materia> correlativas) {
		return materiasAprobadas.containsAll(correlativas);
	}
	
	
}
