
public abstract class Taller {

	private String nombreTaller;
	private String direccion;
	private int licencia;
	
	public Taller (String nombreTaller, String direccion, int licencia, String nombreAdmin, String dni) {	
		this.nombreTaller = nombreTaller;
		this.direccion = direccion;
		this.licencia = licencia;
	}
	
	public String getNombre() {
		return nombreTaller;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getLicencia() {
		return licencia;
	}
	
	public String datosAdministrador() {
		return Administrador.getNombre()+ ": " + Administrador.getDNI();
	}

	public abstract void aumentarAnosServicio();
	
	public boolean anadirVehiculo (Vehiculo vehiculo) {
		
	}
	
	public boolean eliminarVehiculo (String matricula) {
		
	}
	
	private boolean existeVehiculo (String matricula) {
		
	}
	
	public static boolean comprobarLicencia (int numLicencia) {
		
	}
}
