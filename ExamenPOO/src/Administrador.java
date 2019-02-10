
public class Administrador {
	
	private String nombreAdm;
	private String dni;
	private int anosServicio;
	
	public Administrador (String nombreAdm, String dni) {
		this.nombreAdm = nombreAdm;
		this.dni = dni;
	}
	
	public String getNombre() {		
		return nombreAdm;
	}
	
	public String getDni() {
		return dni;
	}
	
	public int getAnosServicio() {
		return anosServicio;
	}
	
	public void aumentarAnosServicio() {		
		anosServicio = anosServicio+1;
	}
}
