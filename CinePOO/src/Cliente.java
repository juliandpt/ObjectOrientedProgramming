
public class Cliente {
	
	private String dni;
	private String contrasena;
	private String nomCliente;
	private String apellidos;
	private int edad;
	private boolean discapacidad;
	
	public Cliente(String dni, String contrasena, String nomCliente, String apellidos, int edad, boolean discapacidad) {
		this.dni = dni;
		this.contrasena = contrasena;
		this.nomCliente = nomCliente;
		this.apellidos = apellidos;
		this.edad = edad;
		this.discapacidad = discapacidad;
	}

	public String getDNI() {
		return dni;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNomCliente() {
		return nomCliente;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public boolean getDiscapacidad() {
		return discapacidad;
	}
	
	public boolean tieneDescuentoEdad() {
		return false;
	}
	
	public boolean tieneDescuentoDiscapacidad() {
		if(getDiscapacidad() == true) {
			return true;
		}
		return false;
	}
	
	public boolean contrasenaCorrecta(String contrasena) {
		if (this.contrasena.equals(contrasena)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Nombre completo: " + getNomCliente() + " " + getApellidos() + "\n" + 
			   "DNI: " + getDNI() + "\n" + 
			   "Edad: " + getEdad() + "\n" +
			   "Tiene discapacidad: " + getDiscapacidad();
	}
}
