/**
 * 
 * @author JULIAN DE PABLO
 *
 */
public class Reserva {

	// Almacenador de reservass
	private int numVuelo;
	private int codigoCliente;
	
	/**
	 * Constructor de la clase Reserva. Crea una reserva de vuelo
	 */		
	public Reserva(int codCliente, int codigoVuelo) {
		codigoCliente = codCliente;
		numVuelo = codigoVuelo;
	}
	
	/**
	 * Clase que calcula el codio del cliente
	 * @return el codigo de un cliente
	 */
	public int getCodigoCliente() {
		return this.codigoCliente;
	}

	/**
	 * Calcula el numero del vuelo
	 * @return el numero de un vuelo
	 */
	public int getNumVuelo() {
		return this.numVuelo;
	}
}
