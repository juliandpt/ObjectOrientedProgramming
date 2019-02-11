
public abstract class Producto {
	
	public Producto() {
		
	}
	
	public abstract double getPrecio() {
		return Pasta.getPrecio();
	}
	
	public abstract boolean esPizza() {
		return Pizza.esPizza();
	}
	
	public abstract String descripcion() {
		return Pizza.descripcion();
	}
}
