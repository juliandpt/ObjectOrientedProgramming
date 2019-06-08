
public class AsientosReservados {
	
	private int numFilas;
	private int idFila;
	private int numAsientos;
	private int idAsiento;
	char[][] ocupacion;
	
	public AsientosReservados(int numFilas, int numAsientos) {
		this.numFilas = numFilas;
		this.numAsientos = numAsientos;
		this.ocupacion = new char [numFilas][numAsientos];
		for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numAsientos; j++) {
                ocupacion[i][j] = 'O';
            }
        }
	}
	
	public int getNumFilas() {
		return numFilas;
	}
	
	public int getIdFila() {
		return idFila;
	}
	
	public void setNumFila(int numFila) {
		this.idFila = numFila;
	}
	
	public int getNumAsientos() {
		return numAsientos;
	}
	
	public int getIdAsiento() {
		return idAsiento;
	}
	
	public void setNumAsiento(int numAsiento) {
		this.idAsiento = numAsiento;
	}
	
	public char[][] getOcupacion() {
		return ocupacion;
	}
	
	public void mostrarSala() {
		for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numAsientos; j++) {
                System.out.print(" " + ocupacion[i][j] + " ");
            }
            System.out.println();
        }
	}
}
