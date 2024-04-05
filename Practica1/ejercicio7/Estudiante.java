package ejercicio7;

public class Estudiante {
private String nombre;
private String apellido;

public void setApellido(String apellido) {
	this.apellido = apellido;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public String getNombre() {
	return nombre;
}
public boolean equals(Estudiante estudiante) {
	if(this.nombre.equals(estudiante.nombre) && this.apellido.equals(estudiante.apellido)) {
		return true;
	}
	else return false;
}
}
