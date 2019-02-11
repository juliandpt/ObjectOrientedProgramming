
public class Pasta extends Producto{
	
	private String tipoPasta;
	private String tipoSalsa;
	private double precio;
	
	public Pasta (String tipoPasta, String tipoSalsa, double precio) {
		this.tipoPasta = tipoPasta;
		this.tipoSalsa = tipoSalsa;
		this.precio = precio;
	}
	
	public String getTipoPasta() {
		return tipoPasta;
	}
	
	public String getTipoSalsa() {
		return tipoSalsa;
	}
	
	public boolean esPizza() {
		return false;
	}
	
	public double getPrecio() {
		return 0;
	}
	
	public String descripcion() {
		return "caca";
	}
}
