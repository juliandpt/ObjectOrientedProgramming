import java.io.IOException;

public class Main {
	
	public static void main(String[] arg) throws IOException {
		ReservaVuelo reservas = new ReservaVuelo();
		reservas.inicializarVuelos();
		reservas.buclePrincipal();
	}
}

