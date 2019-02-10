
import java.util.*;

public class Parking {
	
	public String nombreParking;
	public List<Avion> aviones;

	public Parking(String nombreParking) {
		this.nombreParking = nombreParking;
		this.aviones = new ArrayList<>();
	}

	public void aparcarAvion(Avion avion) {
		this.aviones.add(avion);
	}

	public String listAviones() {
		String lista = "";
		for (int i = 0; i < this.aviones.size(); i++) {
			if(i == this.aviones.size()-1) {
				lista += aviones.get(i).getAvionId() + " (" + aviones.get(i).getNumPasajeros() + ")";
			} else {
				lista += aviones.get(i).getAvionId() + " (" + aviones.get(i).getNumPasajeros() + "), ";
			}
		}
		
		return lista;
	}
}
