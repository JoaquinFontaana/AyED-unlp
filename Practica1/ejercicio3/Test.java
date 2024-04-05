package ejercicio3;
import java.util.*;
public class Test {

	public static void main (String[] args) {
		ArrayList<Estudiante> estudiantes = new ArrayList();
		estudiantes.add(new Estudiante());
		estudiantes.add(new Estudiante());
		ArrayList<Profesor> profesores = new ArrayList();
		for (int i = 0; i < 1; i++) {
			profesores.add(new Profesor());
		}
		Estudiante primerEstudiante = estudiantes.get(0);
		primerEstudiante.setApellido("Domingo");
		primerEstudiante.setNombre("Jose");
		primerEstudiante.setEmail("jose@gmail.com");
		primerEstudiante.setComision("3B");
		primerEstudiante.setDireccion("Diagonal 66");
		estudiantes.set(0, primerEstudiante);
		Estudiante segundoEstudiante = estudiantes.get(1);
		segundoEstudiante.setApellido("Disformia");
		segundoEstudiante.setNombre("Pedro");
		segundoEstudiante.setEmail("pedro@gmail.com");
		segundoEstudiante.setComision("3A");
		segundoEstudiante.setDireccion("Diagonal 50");
		estudiantes.set(1, segundoEstudiante);
		for(Estudiante estudiante : estudiantes){
			System.out.println(estudiante.tusDatos());
		}
		Profesor primerProfesor = profesores.get(0);
		primerProfesor.setApellido("Gomez");
		primerProfesor.setNombre("Carlos");
		primerProfesor.setEmail("gomez@gmail.com");
		primerProfesor.setCatedra("Programacion");
		primerProfesor.setFacultad("Informatica");
		profesores.set(0, primerProfesor);
		System.out.println(profesores.get(0).tusDatos());
	}
}
