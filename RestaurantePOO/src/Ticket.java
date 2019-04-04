import java.util.*;

public class Ticket {
	
	private boolean promoPizza;
	private boolean promoPasta;
	private ArrayList<Producto> productos;
	
	public Ticket (boolean promoPizza, boolean promoPasta) {
		this.promoPizza = promoPizza;
		this.promoPasta = promoPasta;
		this.productos = new ArrayList<>();
	}
	
	public boolean getPromoPizza() {
		return true;
	}
	
	public boolean getPromoPasta() {
		return true;
	}
	
	public void anadirProducto (Producto producto) {
		productos.add(producto);
	}
	
	public ArrayList<Producto> imprimirTicket() {
		return productos;
	}
}
