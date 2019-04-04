import java.util.*;

public class Taller {

	private String nombreTaller;
	private String direccion;
	private int licencia;
	private Administrador administrador;
	private ArrayList<Vehiculo> vehiculos;
	
	public Taller (String nombreTaller, String direccion, int licencia, String nombreAdmin, String dni) {	
		this.nombreTaller = nombreTaller;
		this.direccion = direccion;
		this.licencia = licencia;
		this.administrador = new Administrador(nombreAdmin, dni);
		this.vehiculos = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombreTaller;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getLicencia() {
		return licencia;
	}
	
	public String datosAdministrador() {
		return administrador.getNombre()+ " : " + administrador.getDNI();
	}

	public void aumentarAnosServicio() {
		administrador.aumentarAnosServicio();
	}
	
	public boolean anadirVehiculo (Vehiculo vehiculo) {     //preguntar que tipos de datos (arraylist, hashmap) entran en el temario
		String matricula = vehiculo.getMatricula(); 
		for(Vehiculo v : vehiculos) {                       //Para cada vehiculo v (elemento del arraylist) en vehiculos
			if (matricula.equals(v.getMatricula())) {
				return false;
			}
		}
		return vehiculos.add(vehiculo);	
	}
	
	public boolean eliminarVehiculo (String matricula) {
		for(Vehiculo v : vehiculos) {                      //Para cada vehiculo v (elemento del arraylist) en vehiculos
			if (matricula.equals(v.getMatricula())) {
				return vehiculos.remove(v);
			}
		}
		return true;	
	}
	
	public void imprimirVehiculos () {
		for(Vehiculo v : vehiculos) {                     //Para cada vehiculo v (elemento del arraylist) en vehiculos
			System.out.println(v.getMatricula() + " - " + v.getMarca());
		}
	
	}

	
	private boolean existeVehiculo (String matricula) {
		if (vehiculos.contains(matricula)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean comprobarLicencia (int numLicencia) {
		if (numLicencia % 10 == 0) {
			return true;
		}
		
		return false;
	}
	
	/*
	private int matriculaToInt (String matricula) {
		String pNum = matricula.substring(3);
		String pText = matricula.substring(0, 2);
		
		int resNum = Integer.parseInt(pNum);
		int resText1 = Character.getNumericValue(pText.charAt(0));
		int resText2 = Character.getNumericValue(pText.charAt(1));
		int resText3 = Character.getNumericValue(pText.charAt(2));
		resNum += resText1*10000 + resText2*100000 + resText3*1000000;
		return resNum;
	}
	*/
}
