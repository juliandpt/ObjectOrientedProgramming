
public class PruebasEnMain {

	public static void main(String[] args) {
		
		System.out.println(Taller.comprobarLicencia(123473));
		Taller taller = new Taller("Norauto", "c/ VALLESECO, 13", 1, "Juan Carlos", "57437596L");
		Vehiculo vehiculo1 = new Vehiculo("Coupe", "BMW", "321456");
		Vehiculo vehiculo2 = new Vehiculo("Coupe", "BMW", "321456");
		Taller.anadirVehiculo(vehiculo1);
		Taller.anadirVehiculo(vehiculo1);
		Taller.eliminarVehiculo(vehiculo2);
		
	}

}
