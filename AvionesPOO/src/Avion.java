
public abstract class Avion {
	
	public String avionId;
	public int numPasajeros;
	
	public Avion(String avionId, int numPasajeros) {
		this.avionId = avionId;
		this.numPasajeros = numPasajeros;
	}

	public String getAvionId() {
		return this.avionId;
	}
	
	public int getNumPasajeros() {
		return this.numPasajeros;
	}
	
	public abstract boolean tieneMotor();
	
	public abstract double calcularAutonomia();
}
