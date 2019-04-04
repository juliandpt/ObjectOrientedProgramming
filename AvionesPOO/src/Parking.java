
import java.util.*;

public class Parking {
	
	public String nombreParking;
	public List<Avion> aviones;
	
	/**
	 * Crea un Parking para almacenar aviones 
	 * @param nombreParking asigna un nombre al parking
	 */
	public Parking(String nombreParking) {
		this.nombreParking = nombreParking;
		this.aviones = new ArrayList<>();
	}
	
	/**
	 * Añade un avion a un parking 
	 * @param avion es un avion con sus respectivos atributos
	 */
	public void aparcarAvion(Avion avion) {
		this.aviones.add(avion);
	}

	/**
	 * Crea un metodo para poder enseñar la lista de aviones en un parking
	 * @return la lista de aviones que hay en el parking
	 */
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
