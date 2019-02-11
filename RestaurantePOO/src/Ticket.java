
public class Ticket {
	
	private boolean promoPizza;
	private boolean promoPasta;
	
	public Ticket (boolean promoPizza, boolean promoPasta) {
		this.promoPizza = promoPizza;
		this.promoPasta = promoPasta;
	}
	
	public void anadirProducto (Producto producto) {
		
	}
	
	public String imprimirTicket() {
		return "algo";
	}
}
