import java.io.*;
import java.util.Vector;

public class ReservaVuelo {
	// Almacenador origenes
	protected Vector origenes;
	// Almacenador de destinos
	protected Vector destinos;
	// Almacenador de horas
	protected Vector horas;
	// Almacenador de precios
	protected Vector precios;
	// Almacenador de códigos de clientes
	private Vector codigosCliente;
	// Almacenador de reservas
	private Vector reservas;
	private Catalogo catalogo;
	private Leer leer;
	
	// Constructor
	public ReservaVuelo() throws IOException {
		origenes = new Vector();
		destinos = new Vector();
		horas = new Vector();
		precios = new Vector();
		codigosCliente = new Vector();
		reservas = new Vector();
	}
	
	// Inicialización del catalogo de vuelos
	public void inicializarVuelos() {
		// Primer vuelo
		origenes.addElement("Madrid");
		destinos.addElement("Barcelona");
		horas.addElement("9:00");
		precios.addElement(new Double(157));
		// Segundo vuelo
		origenes.addElement("Barcelona");
		destinos.addElement("Madrid");
		horas.addElement("12:30");
		precios.addElement(new Double(175));
		// Tercer vuelo
		origenes.addElement("Madrid");
		destinos.addElement("Barcelona");
		horas.addElement("18:00");
		precios.addElement(new Double(162));
	}
	
	// Reserva un vuelo para un código de cliente, indicando la posición del vuelo en la lista, en reservas
	public void reservarVuelo(int codigoCliente, int codigoVuelo) {
		codigosCliente.addElement(new Integer(codigoCliente));
		reservas.addElement(new Integer(codigoVuelo));
	}
	
	// Listado de reservas
	public String listadoReservas() {
		String listado = "--------- Reservas ---------";
		int cliente, reserva;
		String origen, destino, hora;
		double precio;
		for (int i = 0; i < codigosCliente.size(); ++i) {
			cliente = ((Integer) codigosCliente.elementAt(i)).intValue();
			reserva = ((Integer) reservas.elementAt(i)).intValue();
			origen = ((String) origenes.elementAt(reserva)).toString();
			destino = ((String) destinos.elementAt(reserva)).toString();
			hora = ((String) horas.elementAt(reserva)).toString();
			precio = ((Double) precios.elementAt(reserva)).doubleValue();
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
