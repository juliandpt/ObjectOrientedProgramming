
public class AvionMotor extends Avion {
	
	public double combustible;
	public double millasPorGalon;
	
	/**
	 * Clase que crea un Avion con motor
	 * @param avionId atributo de la clase padre {@link #Avion()}, asigna un identificador al avion
	 * @param numPasajeros atributo de la clase padre {@link #Avion()}, asigna un numero de pasajeros a un avion
	 * @param combustible es el combustible que tiene el avion
	 * @param millasPorGalon es la eficiencia del combustible
	 */
	public AvionMotor(String avionId, int numPasajeros, double combustible, double millasPorGalon) {
		super(avionId, numPasajeros);
		this.combustible = combustible;
		this.millasPorGalon = millasPorGalon;
	}
	
	/**
	 * Clase de tipo booleana que dice si es avion tiene motor o no
	 * @return true si el avion tiene motor
	 */
	public boolean tieneMotor() {
		return true;
	}
	
	/**
	 * Clase que va a indicar la utonomia de vuelo que va a tener el avion
	 * @return un calculo entre combustible y millasPorGalon
	 */
	public double calcularAutonomia() {
		return combustible * millasPorGalon;
	}
}
