import java.util.*;

public class Pizza extends Producto{
	
	private List<String> ingredientes;
	private int diametro;
	private String nombre;
	
	public Pizza (int diametro, String nombre) {
		this.diametro = diametro;
		this.nombre = nombre;
	}
	
	public void anadirIngrediente (String ingrediente) {
		
	}
	
	public int getNumIngredientes() {
		return 0;
	}
	
	public String getIngrediente (int posicion) {
		return "algo";
	}
	
	public int getDiametro() {
		return diametro;
	}
	
	public boolean esPizza() {
		return true;
	}
	
	public double getPrecio() {
		return 0;
	}
	
	public String descripcion() {
		return "algo";
	}
}
