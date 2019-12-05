import java.util.ArrayList;
import java.util.HashMap;

public class Cine {
	
	private int idCine;
	private String nomCine;
	private int precioEntradas;
	private Localizacion localizacion;
	private HashMap<Integer, Integer> numSalaIdSala;

	
	public Cine(int idCine, String nomCine, int precio, Localizacion localizacion) {
		this.idCine = idCine;
		this.nomCine = nomCine;
		this.precioEntradas = precio;
		this.localizacion = localizacion;
		this.numSalaIdSala = new HashMap<Integer, Integer>();
	}
	
	public int getIdCine() {
		return idCine;
	}
	
	public int getPrecioEntrada() {
		return precioEntradas;
	}
	
	public String getNomCine() {
		return nomCine;
	}
	
	public Localizacion getLocalizacion() {
		return localizacion;
	}
	
	public ArrayList<Integer> listaIdsSalas() {
		ArrayList<Integer> lista = new ArrayList<Integer>(numSalaIdSala.values());
		return lista;
	}
	
	public String infoCine() {
		return "[" + getIdCine() + "] " + getNomCine();
	}
	
	public void anadirSala(Sala sala) {
		int idSala = sala.getIdSala();
		int numSala = sala.getNumSala();
		numSalaIdSala.put(numSala, idSala);
	}
	
	public String toString() {
		return "Cine: " + getNomCine() + "\n" + 
			   "Localización: " + getLocalizacion() + "\n";
	}
}
