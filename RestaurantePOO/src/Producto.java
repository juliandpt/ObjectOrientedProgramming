
public abstract class Producto {
	
	private Pasta pasta;
	private Pizza pizza;
	public Producto() {
		
	}
	
	public double getPrecio() {
		return pasta.getPrecio();
	}
	
	public boolean esPizza() {
		return pizza.esPizza();
	}
	
	public String descripcion() {
		return pizza.descripcion();
	}
}
