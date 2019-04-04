/**
 * 
 * @author JULIAN DE PABLO
 *
 */
public class Cliente{
	
	private int codigoCliente;
	private int edad;
	
	/**
	 * Constructor de la clase Cliente
	 * @param codigo representa el codigo del cliente
	 * @param edad represebta la edad del cliente
	 */
	public Cliente(int codigo, int edad) {
		this.codigoCliente = codigo;
		this.edad = edad;
	}
	
	/**
	 * Calcula el codigo de un cliente
	 * @return el codigo de un cliente
	 */
	public int getCodigo() {
		return codigoCliente;
	}
	
	/**
	 * Calcula la edad de un cliente
	 * @return la edad de un cliente
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Clase para representar que un cliente mayor de edad no se le aplica descuento
	 * @return falso, ya que no es menor de edad
	 */
	public boolean tieneDescuento() {
		return false;
	}
}
