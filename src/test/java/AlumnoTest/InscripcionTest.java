package AlumnoTest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dominio.Alumno;
import dominio.Curso;
import dominio.Materia;


public class InscripcionTest {
	
@Before
public void before() {
	Materia discreta = new Materia();
	Collection<Materia> correlativas = new ArrayList<Materia>();
	correlativas.add(discreta);
	Materia sistOp = new Materia(correlativas);
	
	Curso curso1 = new Curso(sistOp);
	
	Alumno lean = new Alumno("Lean");
	Alumno jose = new Alumno("Jose");
	
}

@Test
public void seCreoInscripcion() {
	
	
}
	
}
