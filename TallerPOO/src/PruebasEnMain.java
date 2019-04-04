
public class PruebasEnMain {

	public static void main(String[] args) {
		
		System.out.println(Taller.comprobarLicencia(123473));
		Taller taller = new Taller("Norauto", "c/ VALLESECO, 13", 1, "Juan Carlos", "57437596L");
		Vehiculo vehiculo1 = new Vehiculo("Coupe", "BMW", "321456");
		Vehiculo vehiculo2 = new Vehiculo("Todoterreno", "Range Rover", "123456");
		System.out.println(taller.anadirVehiculo(vehiculo1));
		System.out.println(taller.anadirVehiculo(vehiculo1));
		System.out.println(taller.anadirVehiculo(vehiculo2));
		taller.imprimirVehiculos();
		System.out.println(taller.eliminarVehiculo(vehiculo2.getMatricula()));
		System.out.println("¿Cual he borrado?");
		taller.imprimirVehiculos();
		System.out.println(taller.datosAdministrador());
		System.out.println(taller.eliminarVehiculo(vehiculo1.getMatricula()));
		
	}
	
}