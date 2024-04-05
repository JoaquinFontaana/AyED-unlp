package ejercicio3;

public class Profesor {
private String nombre;
private String apellido;
private String email;
private String catedra;
private String facultad;

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setFacultad(String facultad) {
	this.facultad = facultad;
}

public void setEmail(String email) {
	this.email = email;
}

public void setCatedra(String catedra) {
	this.catedra = catedra;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getNombre() {
	return nombre;
}

public String getFacultad() {
	return facultad;
}

public String getEmail() {
	return email;
}

public String getCatedra() {
	return catedra;
}

public String getApellido() {
	return apellido;
}

public String tusDatos(){
	String apellido = getApellido();
	String nombre = getNombre();
	String email = getEmail();
	String catedra = getCatedra();
	String facultad = getFacultad();
	return("Profesor: " + apellido + nombre +
			"Facultad: " + facultad + 
			"Catedra: " + catedra
			+ email);
}
}
