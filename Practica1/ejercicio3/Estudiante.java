package ejercicio3;

public class Estudiante {
	private String comision;
	private String nombre;
	private String email;
	private String apellido;
	private String direccion;
	
	public String getApellido() {
		return apellido;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getComision() {
		return comision;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setComision(String comision) {
		this.comision = comision;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String tusDatos(){
		String apellido = getApellido();
		String nombre = getNombre();
		String email = getEmail();
		String direccion = getDireccion();
		String comision = getComision();
		return("Estudiante: " + apellido + " " + nombre +
				" Comision: " + comision + 
				" Direccion: " + direccion + " "
				+ email);
	}
}
