
public class Entrada {
	
	private static int ultimaEntrada = 1;
	private int idEntrada, idSala, idFila, idAsiento;
	private double precio;
	private String nomCliente, apellidosCliente, nomPelicula, nomCine;
	private Fecha fecha;
	
	public Entrada(String nomCliente, String apellidosCliente, String idPelicula, String idCine, Fecha fecha, int idSala, int idFila, int idAsiento, double precio) {
		this.nomCliente = nomCliente;
		this.apellidosCliente = apellidosCliente;
		this.nomPelicula = idPelicula;
		this.nomCine = idCine;
		this.fecha = fecha;
		this.idSala = idSala;
		this.idFila = idFila;
		this.idAsiento = idAsiento;
		this.precio = precio;
		this.idEntrada = ultimaEntrada++;
	}
	
	public String getNomCliente() {
		return nomCliente;
	}
	
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	
	public int getIdEntrada() {
		return idEntrada;
	}
	
	public int getSala() {
		return idSala;
	}
	
	public String getCine() {
		return nomCine;
	}
	
	public String getPelicula() {
		return nomPelicula;
	}
	
	public int getFila() {
		return idFila;
	}
	
	public int getAsiento() {
		return idAsiento;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public Fecha getFecha() {
		return fecha;
	}
	
	public String toString() {
		return "--------------------------------------------" + "\n" +
			   "Id: " + getIdEntrada() + "\n" +
			   "Cliente: " + getNomCliente() + " " + getApellidosCliente() + "\n" +
			   "Pelicula: " + getPelicula() + "\n" +
			   "Cine: " + getCine() + "\n" +
			   getFecha() + "\n" +
			   "Sala: " + getSala() + ", Fila: " + getFila() + ", Asiento: " + getAsiento() + "\n" +
			   "Precio: " + getPrecio() + "\n" +
			   "--------------------------------------------";
		
	}
	
}
