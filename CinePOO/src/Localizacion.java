public class Localizacion {
	
	private String calle, codPostal, ciudad;
	
	public Localizacion(String calle, String codPostal, String ciudad) {
		this.calle = calle;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public String getCodPostal() {
		return codPostal;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public String toString() {
		return getCalle() + ", " + getCodPostal() + ", " + getCiudad();
	}
}
