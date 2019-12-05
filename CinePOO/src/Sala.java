public class Sala {
	
	private int idSala;
	private int numSala;
	private int numFilas;
	private int numAsientos;
	
	public Sala(int idSala, int numSala, int numFilas, int numAsientos) {
		this.idSala = idSala;
		this.numSala = numSala;
		this.numFilas = numFilas;
		this.numAsientos = numAsientos;
	}
	
	public int getIdSala() {
		return idSala;
	}
	
	public int getNumSala() {
		return numSala;
	}
	
	public int getNumFilas() {
		return numFilas;
	}
	
	public int getNumAsientos() {
		return numAsientos;
	}
	    
	public String infoSala() {
		return "[" + getNumSala() + "] Sala " + getNumSala(); 
	}
	
	public String toString() {
		return "Sala: " + getNumSala() + ", Filas: " + getNumFilas() + ", Asientos: " + getNumAsientos();
	}
}
