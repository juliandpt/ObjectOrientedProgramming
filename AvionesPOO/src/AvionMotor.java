
public class AvionMotor extends Avion {
	
	public double combustible;
	public double millasPorGalon;
	
	public AvionMotor(String avionId, int numPasajeros, double combustible, double millasPorGalon) {
		super(avionId, numPasajeros);
		this.combustible = combustible;
		this.millasPorGalon = millasPorGalon;
	}
	
	public boolean tieneMotor() {
		return true;
	}
	
	public double calcularAutonomia() {
		return combustible * millasPorGalon;
	}
}
