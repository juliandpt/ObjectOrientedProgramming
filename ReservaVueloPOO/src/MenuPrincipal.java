import java.io.BufferedReader;
import java.io.IOException;

public class MenuPrincipal {
	// Acceso a la entrada estándar
		protected BufferedReader br;
		private Catalogo catalogo;
		private Leer leer;
	// Menu principal
		public int menuPrincipal() throws IOException {
			int opcion = 0;
			String entrada;
			System.out.println("[1] Mostrar catálogo de vuelos.");
			System.out.println("[2] Realizar reserva.");
			System.out.println("[3] Listado de reservas.");
			System.out.println("[0] Salir.");
			System.out.print("Elige una opcion: ");
			entrada = br.readLine();
			opcion = Integer.parseInt(entrada);
			return opcion;
		}
		
		// Método principal de gestión
		public void buclePrincipal() throws IOException {
			boolean salir = false;
			int opcion;
			int codigo, numeroVuelo;
			while (!salir) {
				opcion = menuPrincipal();
				switch (opcion) {
					case 1:		System.out.println(catalogo.catalogoVuelos());
								break;
					case 2:		codigo = leer.leerCodigoCliente();
								numeroVuelo = leer.leerNumeroVuelo();
								this.reservarVuelo(codigo,numeroVuelo-1);
								break;
					case 3:		System.out.println(this.listadoReservas());
								break;
					default:	salir = true;
				}
			}
		}
}
