import java.io.IOException;

public class Catalogo extends ReservaVuelo{
	
	public Catalogo() throws IOException {
		super();
	}

	public String catalogoVuelos() {
		String listado = "--------- Vuelos ---------";
		String origen, destino, hora;
		double precio;
		for (int i = 0; i < origenes.size(); ++i) {
			origen = ((String) origenes.elementAt(i)).toString();
			destino = ((String) destinos.elementAt(i)).toString();
			hora = ((String) horas.elementAt(i)).toString();
			precio = ((Double) precios.elementAt(i)).doubleValue();
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
}