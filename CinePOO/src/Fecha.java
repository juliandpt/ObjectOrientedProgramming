public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	private Hora hora;
	
	public Fecha (int dia, int mes, int anio, Hora hora) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.hora = hora;
		if (dia > 31 || mes > 12 || anio > 2019) {
			System.out.println("fecha invalida");
		}
	}

	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public Hora getHora() {
		return hora;
	}

	public String toString() {
		return "Fecha: " + getDia() + "/" + getMes() + "/" + getAnio() + ", Hora: " + getHora();
	}
}
