package AlumnoTest;

import org.junit.Assert;
import org.junit.Test;

import dominio.Alumno;


public class InscripcionTest {

@Test
public void seCreoInscripcion() {
	
	Alumno alumno = new Alumno("leandro");
	Assert.assertEquals("leandro", alumno.getNombre());
}
	
}
