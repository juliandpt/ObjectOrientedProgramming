
public class AvionMotorN2 extends Avion implements Comparable<AvionMotor> {
	
	public double combustible;
	public double millasPorGalon;

	public AvionMotorN2(String avionId, int numPasajeros, double combustible, double millasPorGalon) {
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

	@Override
	public int compareTo(AvionMotor otro) {
		int res = 0;
		
		if (this.calcularAutonomia() == otro.calcularAutonomia()) {
			res = 0;
		} else if (this.calcularAutonomia() > otro.calcularAutonomia()) {
			res = 1;
		} else {
			res = -1;
		}

		return res;
	}
}