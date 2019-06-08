
public class Hora {
	
	private int hora, minutos;
	
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public String toString() {
		return getHora() + ":" + getMinutos();
	}
}
