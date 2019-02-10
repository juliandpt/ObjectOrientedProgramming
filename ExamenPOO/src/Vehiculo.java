
public class Vehiculo {
	
	protected String modelo;
	private String marca;
	private String matricula;
	
	public Vehiculo (String modelo, String marca, String matricula) {
		this.modelo = modelo;
		this.marca = marca;
		this.matricula = matricula;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getMatricula() {
		return matricula;
	}
}
