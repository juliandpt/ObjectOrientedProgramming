import java.util.ArrayList;

public class Taller {

	private String nombreTaller;
	private String direccion;
	private int licencia;
	private Administrador administrador;
	private ArrayList<Vehiculo> vehiculos;
	
	/**
	 * Crea un Taller
	 * @param nombreTaller identificadión del taller
	 * @param direccion zona geografica en la que se situa el taller
	 * @param licencia 
	 * @param nombreAdmin nombre de la persona al cargo del taller
	 * @param dni identificador nacional del administrador
	 */
	public Taller (String nombreTaller, String direccion, int licencia, String nombreAdmin, String dni) {	
		this.nombreTaller = nombreTaller;
		this.direccion = direccion;
		this.licencia = licencia;
		this.administrador = new Administrador(nombreAdmin, dni);
		this.vehiculos = new ArrayList<>();
	}
	
	/**
	 * Proporciona el nombre del Taller
	 * @return el nombre del Taller
	 */
	public String getNombre() {
		return nombreTaller;
	}
	
	/**
	 * Proporciona la geolocalización del taller
	 * @return la dirección del taller
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Proporciona la licencia del taller
	 * @return la licencia del taller
	 */
	public int getLicencia() {
		return licencia;
	}
	
	/**
	 * Proporciona los datos oficiales de un administrador del taller
	 * @return tanto el nombre como el dni del respectivoadministrador
	 */
	public String datosAdministrador() {
		return administrador.getNombre()+ " : " + administrador.getDNI();
	}
	
	/**
	 * Aumenta en uno los años de servicio del administrador. No devuelve nada
	 */
	public void aumentarAnosServicio() {
		administrador.aumentarAnosServicio();
	}
	
	/**
	 * Aniadira un vehiculo al taller, a menos que este tenga la matricula de otrode otro que ya esta almacenado en ese taller
	 * @param vehiculo un vehiculo con sus propiedades
	 * @return añade el vehiculo o no, dependiendo de la matricula
	 */
	public boolean anadirVehiculo (Vehiculo vehiculo) {   
		String matricula = vehiculo.getMatricula(); 
		for(Vehiculo v : vehiculos) {                      
			if (matricula.equals(v.getMatricula())) {
				return false;
			}
		}
		return vehiculos.add(vehiculo);	
	}
	
	/**
	 * Eliminara un vehiculo en especifico, recorriendo el arraylist hasta encontrarlo
	 * @param matricula identificador de cada vehiculo
	 * @return el vehiculo se ha eliminados
	 */
	public boolean eliminarVehiculo (String matricula) {
		for(Vehiculo v : vehiculos) {                    
			if (matricula.equals(v.getMatricula())) {
				return vehiculos.remove(v);
			}
		}
		return true;	
	}
	
	/**
	 * imprime el listado de los vehiculos con su matricula y marca
	 */
	public void imprimirVehiculos () {
		for(Vehiculo v : vehiculos) {
			System.out.println(v.getMatricula() + " - " + v.getMarca());
		}
	
	}

	/**
	 * Comprueba la existencia de un vehiculo en especifico
	 * @param matricula identificador de un vehiculo
	 * @return true si la matricula ya esta en el arraylist o false si no lo esta
	 */
	private boolean existeVehiculo (String matricula) {
		for(Vehiculo v : vehiculos) {                    
			if (matricula.equals(v.getMatricula())) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Comprueba si la licencia es valida
	 * @param numLicencia 
	 * @return true si el numero de licencia es multiplo de 10 o false si no lo es
	 */
	public static boolean comprobarLicencia (int numLicencia) {
		if (numLicencia % 10 == 0) {
			return true;
		}		
		return false;
	}
}
