
public class Coche extends Vehiculo{
	
	private boolean esGasolina;
	private int prioridad;
	
	/**
	 * Crea un coche
	 * @param modelo modelo del vehiculo
	 * @param marca fabricante del vehiculo
	 * @param matricula identificador del vehiculo
	 * @param esGasolina tipo de gasoleo del coche
	 * @param prioridad prioridad del vehiculo segun el tipo de gasoleo
	 */
	public Coche (String modelo, String marca, String matricula, boolean esGasolina, int prioridad) {
		super (modelo, matricula, matricula);
		this.esGasolina = esGasolina;
		this.prioridad = prioridad;
	}
	
	/**
	 * Prporciona el modelo del coche
	 * @return el modelo del coche
	 */
	public String getModelo() {
		return modelo + " (Coche)";
	}
	
	/**
	 * Prporciona la prioridad del coche. Los diesel tienen mayor prioridad
	 * @return la prioridad del coche
	 */
	public int getPrioridad() {
		return prioridad;
	}
	
	/**
	 * Se comprueba si el coche es gasolina o no
	 * @return si es gasolina o no
	 */
	public boolean esGasolina() {
		return true;
	}
}