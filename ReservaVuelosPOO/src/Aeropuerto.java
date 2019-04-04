/**
 * 
 * @author JULIAN DE PABLO
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Aeropuerto {
	// Acceso a la entrada estándar
	private BufferedReader br;
	private Vector<Vuelo> vuelos;
	private Vector<Reserva> reservas;
	
	/**
	 * Constructor de la clase Aeropuerto
	 * @throws IOException Si se produce algun I/O error
	 */
	public Aeropuerto() throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		vuelos = new Vector<Vuelo>();
		reservas = new Vector<Reserva>();
	}
	
	/**
	 * Inicializa los atributos del objeto de tipo reservaVuelos aniadiendo tres vuelos entre Madrid y Barcelona. No devuelve nada
	 */
	public void inicializarVuelos() {
		// Primer vuelo
		vuelos.addElement(new Vuelo("Madrid", "Barcelona", "9:00", 157));
		// Segundo vuelo
		vuelos.addElement(new Vuelo("Barcelona", "Madrid", "12:30", 175));
		// Tercer vuelo
		vuelos.addElement(new Vuelo("Madrid", "Barcelona", "18:00", 162));
	}
	
	/**
	 * Obtiene una representacion de los vuelos del catalogo
	 * @return Un String que representa los vuelos del catalogo
	 */
	public String catalogoVuelos() {
			String listado = "--------- Vuelos ---------";
			String origen, destino, hora;
			double precio;
			Vuelo v;
			
			for (int i = 0; i < vuelos.size(); ++i) {
				v = vuelos.elementAt(i);
				origen = v.getOrigen();
				destino = v.getDestino();
				hora = v.getHora();
				precio = v.getPrecio();
				listado += "\n--- Vuelo Número " + (i+1) + " ---\n";
				listado += "Origen: " + origen + "\n";
				listado += "Destino: " + destino + "\n";
				listado += "Hora: " + hora + "\n";
				listado += "Precio: " + precio + "\n";
				listado += "\n----------------------";
			}
			listado += "\n------- Fin Vuelos -------\n";
			return listado;
		}
		
		/**
		 * Reserva un vuelo para un código de cliente, indicando la posición del vuelo en la lista, en reservas
		 * @param codigoCliente un entero que indica el codigo del cliente
		 * @param codigoVuelo un entero que indica el codigo de vuelo
		 */
		public void reservarVuelo(int codigoCliente, int codigoVuelo) {
			reservas.addElement(new Reserva(codigoCliente, codigoVuelo));
		}
		
		/**
		 * Obtiene una representacion de cliente, origen, destino, hora y precio de cada reserva
		 * @return un String que representa laa reservas almacenadas
		 */
		public String listadoReservas() {
			String listado = "--------- Reservas ---------";
			int cliente, numVuelo;
			String origen, destino, hora;
			double precio;
			Reserva r;
			Vuelo v;
			for (int i = 0; i < reservas.size(); ++i) {
				r = reservas.elementAt(i);
				cliente = r.getCodigoCliente();
				numVuelo = r.getNumVuelo();
				v = vuelos.elementAt(numVuelo);
				origen = v.getOrigen();
				destino = v.getDestino();
				hora = v.getHora();
				precio = v.getPrecio();
				listado += "\n--- Reserva Número " + (i+1) + " ---\n";
				listado += "Cliente: " + cliente + "\n";
				listado += "Origen: " + origen + "\n";
				listado += "Destino: " + destino + "\n";
				listado += "Hora: " + hora + "\n";
				listado += "Precio: " + precio + "\n";
				listado += "\n------------------------";
			}
			listado += "\n------ Fin Reservas ------\n";
			return listado;
		}
		
		/**
		 * Lee el dato introducido por la enttrada estandar, que es un String que representa el codigo del cliente 
		 * @return Un entero con el valor numerico del String introducido
		 * @throws IOException If an I/O error occurs.
		 */
		public Cliente leerDatosCliente() throws IOException {
			String entrada;
			int codigo;
			int edad;
			
			System.out.print("Codigo cliente: ");
			entrada = br.readLine();
			codigo = Integer.parseInt(entrada);
			
			System.out.println("Edad cliente: ");
			entrada = br.readLine();		
			edad = Integer.parseInt(entrada);
			
			if (edad < 18) {
				return new ClienteMenor(codigo, edad);
			}
			
			return new Cliente(codigo, edad);		
		}
		
		/**
		 * Lee el dato introducido por la entrada estandar, que es un String que representa el codigo del vuelo
		 * @return Un entero con el valor numerico del String introducido
		 * @throws IOException If an I/O error occurs.
		 */
		public int leerNumeroVuelo() throws IOException {
			String entrada;
			int numeroVuelo;
			System.out.print("Numero Vuelo: ");
			entrada = br.readLine();
			numeroVuelo = Integer.parseInt(entrada);
			return numeroVuelo;
		}
		
		/**
		 * Muestra el menu con la opciones disponibles, parsea la que ha elegido el usuario 
		 * @return un entero con el valor numerico de la opcion elegida por el usuario
		 * @throws IOException Si ocurre un I/O error.
		 */
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
		
		/**
		 * Mientras el ususario elija alguna opcion llama al metodo {@link #menuPrincipal()}
		 * @throws IOException Si se produce algun I/O error
		 */
		public void buclePrincipal() throws IOException {
			boolean salir = false;
			int opcion;
			Cliente cliente;
			int numeroVuelo;
			while (!salir) {
				opcion = menuPrincipal();
				switch (opcion) {
					case 1:		System.out.println(this.catalogoVuelos());
								break;
					case 2:		cliente = this.leerDatosCliente();
								numeroVuelo = this.leerNumeroVuelo();
								this.reservarVuelo(cliente.getCodigo(), numeroVuelo-1);
								break;
					case 3:		System.out.println(this.listadoReservas());
								break;
					default:	salir = true;
				}
			}
		}
}
