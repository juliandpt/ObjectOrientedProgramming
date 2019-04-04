
public class Administrador {
	
	private String nombreAdm;
	private String dni;
	private int anosServicio;
	
	/**
	 * Crea un administrador
	 * @param nombreAdm nombre del administrador
	 * @param dni identificador nacional del administrador
	 */
	public Administrador (String nombreAdm, String dni) {
		this.nombreAdm = nombreAdm;
		this.dni = dni;
		this.anosServicio = 0;
	}
	
	/**
	 * Proporciona el nombre del administrador
	 * @return el nombre del administrador
	 */
	public String getNombre() {		
		return nombreAdm;
	}
	
	/**
	 * Proporciona el dni del administrador
	 * @return el dni del administrador
	 */
	public String getDNI() {
		return dni;
	}
	
	/**
	 * Proporciona lo anios de servicio del administrador
	 * @return los anios de servicio del administrador
	 */
	public int getAnosServicio() {
		return anosServicio;
	}
	
	/**
	 * Aumenta en uno los anios de servicio del administrador. No devuelve nada
	 */
	public void aumentarAnosServicio() {		
		anosServicio = anosServicio+1;
	}
}
