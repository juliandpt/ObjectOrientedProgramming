/**
 * 
 * @author JULIAN DE PABLO
 *
 */
public class ClienteMenor extends Cliente {
	
	/**
	 * Constructor de la clase ClienteMenor
	 * @param codigoCliente
	 * @param edad
	 */
	public ClienteMenor(int codigoCliente, int edad) {
		super(codigoCliente, edad);	
	}
	
	/**
	 * Clase que aplica descuento a un cliente por ser menor de edad
	 * @return true, ya que sera un cliente menor de edad
	 */
	@Override
	public boolean tieneDescuento() {
		return true;
	}
}
