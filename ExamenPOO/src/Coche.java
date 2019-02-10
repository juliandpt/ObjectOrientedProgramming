
public class Coche extends Vehiculo{
	
	private boolean esGasolina;
	private int prioridad;
	
	public Coche (String modelo, String marca, String matricula, boolean esGasolina, int prioridad) {
		super (modelo, matricula, matricula);
		this.esGasolina = esGasolina;
		this.prioridad = prioridad;
	}
	
	public String getMarca() {
		return modelo + " (Coche)";
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	
	public boolean esGasolina() {
		return true;
	}
}
 