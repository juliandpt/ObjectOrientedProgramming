public class Proyeccion {
	
	private int idProyeccion;
	private int idSala;
	private AsientosReservados asientosReservados;
	private Fecha fecha;
	
	public Proyeccion(int idProyeccion, Fecha fecha, Sala sala) {
		this.idProyeccion = idProyeccion;
		this.idSala = sala.getIdSala();
		this.asientosReservados = new AsientosReservados(sala.getNumFilas(), sala.getNumAsientos());
		this.fecha = fecha;
	}
	
	public int getIdProyeccion() {
		return idProyeccion;
	}
	
	public int getIdSala() {
		return idSala;
	}
	
	public AsientosReservados getAsientosReservados() {
		return asientosReservados;
	}
	
	public Fecha getFecha() {
		return fecha;
	}	
	
	public String infoProyeccion() {
		return "[" + getIdProyeccion() + "] " + getFecha() + ", Sala " + getIdSala();
	}
}
