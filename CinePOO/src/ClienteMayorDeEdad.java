public class ClienteMayorDeEdad extends Cliente{

	public ClienteMayorDeEdad(String dni, String contrasena, String nomCliente, String apellidos, int edad, boolean discapacidad) {
		super(dni, contrasena, nomCliente, apellidos, edad, discapacidad);
	}
	
	public boolean tieneDescuentoEdad() {
		return true;
	}
	
	public boolean tieneDescuentoDiscapacidad() {
		if(getDiscapacidad() == true) {
			return true;
		}
		return false;
	}
}
