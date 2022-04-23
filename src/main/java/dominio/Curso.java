package dominio;

import java.util.ArrayList;
import java.util.Collection;

public class Curso {

	private Materia materia;
	
	private Collection<Alumno> alumnos;
	
	private int cantAlumnosNecesarios = 2;
	
	private boolean abierto = false;

	public Curso(Materia materia) {
		super();
		this.materia = materia;
		this.alumnos = new ArrayList<Alumno>();
	}
	
	public void agregarAlumno(Alumno alumno) throws AlumnoException{
		if(alumno.tieneAprobadas(this.materia.getCorrelativas())) {
			this.alumnos.add(alumno);	
		}else {
			throw new AlumnoException("El alumno no tiene las correlativas aprobadas");
		}
		
	}
	
	public void abrir() throws CursoException {
		if(alumnos.size() == cantAlumnosNecesarios) {
			setAbierto(true);
		}else {
			throw new CursoException("El curso no alcanzo la cantidad necesaria de alumnos");
		}
	}

	public boolean isAbierto() {
		return abierto;
	}

	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}
	
	
}
