import java.util.*;

public class Taller {

	private String nombreTaller;
	private String direccion;
	private int licencia;
	private Administrador administrador;
	private ArrayList<Vehiculo> vehiculos;
	
	public Taller (String nombreTaller, String direccion, int licencia, String nombreAdmin, String dni) {	
		this.nombreTaller = nombreTaller;
		this.direccion = direccion;
		this.licencia = licencia;
		this.administrador = new Administrador(nombreAdmin, dni);
		this.vehiculos = new ArrayList<>();
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
		return administrador.getNombre()+ " : " + administrador.getDNI();
	}

	public void aumentarAnosServicio() {
		administrador.aumentarAnosServicio();
	}
	
	public boolean anadirVehiculo (Vehiculo vehiculo) {
		String matricula = vehiculo.getMatricula(); 
		for (int i = 0; i < vehiculos.size(); i++) {
				if (vehiculo.contains(matricula)) {
					
				}
		}
		return vehiculos.add(vehiculo);	
	}
	
	public boolean eliminarVehiculo (String matricula) {
		return vehiculos.remove(matricula);
	}
	
	private boolean existeVehiculo (String matricula) {
		if (vehiculos.contains(matricula)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean comprobarLicencia (int numLicencia) {
		if (numLicencia % 10 == 0) {
			return true;
		}
		
		return false;
	}
}
