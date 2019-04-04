/**
 * 
 * @author JULIAN DE PABLO
 *
 */
import java.io.IOException;

public class Main {
	
	/**
	 * Crea un objeto de tipo aeropuerto y llama a los metodos {@link #buclePrincipal()} y {@link #inicializarVuelos()}
	 * @param arg argumentos del programa (no se espera ninguno)
	 * @throws IOException Si se produce algun I/O error
	 */
	public static void main(String[] arg) throws IOException {
		Aeropuerto aeropuerto = new Aeropuerto();
		aeropuerto.inicializarVuelos();
		aeropuerto.buclePrincipal();
	}
}
