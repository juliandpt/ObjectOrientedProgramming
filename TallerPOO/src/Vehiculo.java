
public class Vehiculo {
	
	protected String modelo;
	private String marca;
	private String matricula;
	
	/**
	 * Crea un vehiculo
	 * @param modelo 
	 * @param marca fabricante del vehiculo
	 * @param matricula identificador del vehiculo
	 */
	public Vehiculo (String modelo, String marca, String matricula) {
		this.modelo = modelo;
		this.marca = marca;
		this.matricula = matricula;
	}
	
	/**
	 * proporciona el modelo de vehiculo
	 * @return el modelo del vehiculo
	 */
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * proporciona la marca de vehiculo
	 * @return la marca del vehiculo
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * proporciona la matricula de vehiculo
	 * @return la matricula del vehiculo
	 */
	public String getMatricula() {
		return matricula;
	}
}