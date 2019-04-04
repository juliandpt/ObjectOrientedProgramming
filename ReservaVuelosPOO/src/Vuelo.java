/**
 * 
 * @author JULIAN DE PABLO
 *
 */
public class Vuelo {
	
	// Almacenador origenes
	public String origen;
	// Almacenador de destinos
	public String destino;
	// Almacenador de precios
	public double precio;
	// Almacenador de horas
	private String hora;
	
	/**
	 * Constructor de la clase Vuelo
	 * @param origen lugar de origen de un vuelo
	 * @param destino lugar donde llegara el vuelo
	 * @param hora hora de salida del vuelo
	 * @param precio precio a pagar por volar
	 */
	public Vuelo(String origen, String destino, String hora, double precio) {
		this.origen = origen;
		this.destino = destino;
		this.hora = hora;
		this.precio = precio;
	}
	
	/**
	 * Clase que calcula el origen del vuelo
	 * @return el lugar de origen de un vuelo
	 */
	public String getOrigen() {
		return origen;
	}
	
	/**
	 * Clase que calcula el destino del vuelo
	 * @return el lugar donde llegara el vuelo
	 */
	public String getDestino() {
		return destino;
	}
	
	/**
	 * Clase que calcula la hora del vuelo
	 * @return la hora de salida del vuelo
	 */
	public String getHora() {
		return hora;
	}
	
	/**
	 * Clase que calcula el precio del vuelo
	 * @return el precio a pagar por volar
	 */
	public double getPrecio() {
		return precio;
	}
}
