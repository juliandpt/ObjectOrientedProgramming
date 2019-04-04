
public abstract class Avion {
	
	public String avionId;
	public int numPasajeros;
	
	/**
	 * Crea un Avion 
	 * @param avionId identificador del avion
	 * @param numPasajeros numero de pasajeros
	 */
	public Avion(String avionId, int numPasajeros) {
		this.avionId = avionId;
		this.numPasajeros = numPasajeros;
	}
	
	/**
	 * Clase que calcula el identificador de un avion
	 * @return el identificador del avion
	 */
	public String getAvionId() {
		return this.avionId;
	}
	
	/**
	 * Clase que calcula el numero de pasajeros
	 * @return el numero de pasajeros
	 */
	public int getNumPasajeros() {
		return this.numPasajeros;
	}
	
	public abstract boolean tieneMotor();
	
	public abstract double calcularAutonomia();
}
