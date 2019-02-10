
public class Administrador {
	
	private static String nombreAdm;
	private static String dni;
	private int anosServicio;
	
	public Administrador (String nombreAdm, String dni) {
		this.nombreAdm = nombreAdm;
		this.dni = dni;
	}
	
	public static String getNombre() {		
		return nombreAdm;
	}
	
	public static String getDNI() {
		return dni;
	}
	
	public int getAnosServicio() {
		return anosServicio;
	}
	
	public void aumentarAnosServicio() {		
		anosServicio = anosServicio+1;
	}
}
