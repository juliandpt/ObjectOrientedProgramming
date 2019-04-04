
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TorreControl {
	
	public String nombreAeropuerto;
	public Parking parking;
	public List<Avion> aviones;
	
	/**
	 * Crea una torre de control
	 * @param nombreAeropuerto asigna un nombre a un aeropuerto
	 * @param nombreParking
	 */
	public TorreControl(String nombreAeropuerto, String nombreParking) {
		this.nombreAeropuerto = nombreAeropuerto;
		this.parking = new Parking(nombreParking);
		this.aviones = new ArrayList<>();
	}

	public void añadirAvion(Avion avion) {
		this.aviones.add(avion);
	}

	private int getSigAvionPos() {
		int pos = -1;
		Comparator<Avion> comparator = Comparator.comparing(av -> av.calcularAutonomia());
		Stream<Avion> avionesOrdenados = aviones.stream().sorted(comparator);
		Avion a = avionesOrdenados.findFirst().orElse(null);
		if (a != null) {
			pos = this.aviones.indexOf(a);
		}
		return pos;
	}

	public boolean aparcarSigAvion() {
		int pos = this.getSigAvionPos();
		if (pos != -1) {
			Avion a = this.aviones.get(pos);
			this.aviones.remove(a);
			this.parking.aparcarAvion(a);
			return true;
		} else {
			return false;
		}
	}

	public String listarAvionesParking() {
		return this.parking.listAviones();
	}

}
