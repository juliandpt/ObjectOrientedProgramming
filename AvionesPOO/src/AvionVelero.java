

public class AvionVelero extends Avion {
	
	public double autonomia;
	
	/**
	 * Crea un avion de tipo velero
	 * @param avionId atributo de la clase padre {@link #Avion()}, asigna un identificador al avion
	 * @param numPasajeros atributo de la clase padre {@link #Avion()}, asigna un numero de pasajeros a un avion
	 * @param autonomia guarda la autonomia del avion
	 */
	public AvionVelero(String avionId, int numPasajeros, double autonomia) {
		super(avionId, numPasajeros);
		this.autonomia = autonomia;
	}
	
	/**
	 * Clase booleana que dice si el avion tiene motor o no
	 * @return false, ya que no tiene motor
	 */
	public boolean tieneMotor() {
		return false;
	}
	
	/**
	 * Clase que calcula la autonomia de un avion
	 * @return la autonomia del avion
	 */
	public double calcularAutonomia() {
		return this.autonomia;
	}
}
