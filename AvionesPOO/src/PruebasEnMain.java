
public class PruebasEnMain {

	public static void main(String[] args) {
		TorreControl torreControl = new TorreControl("Aeropuerto internacional", "Parking");
		AvionVelero av1 = new AvionVelero("Avion velero 1", 200, 324);
		AvionVelero av2 = new AvionVelero("Avion velero 2", 100, 298);
		AvionMotor am1 = new AvionMotor("Avion motor 1", 150, 200, 1.5);
		AvionMotor am2 = new AvionMotor("Avion motor 2", 130, 210, 1.5);
		torreControl.añadirAvion(av1);
		torreControl.añadirAvion(av2);
		torreControl.añadirAvion(am1);
		torreControl.añadirAvion(am2);
		System.out.println(torreControl.aparcarSigAvion());
		System.out.println(torreControl.aparcarSigAvion());
		System.out.println(torreControl.aparcarSigAvion());
		System.out.println(torreControl.aparcarSigAvion());
		System.out.println(torreControl.aparcarSigAvion());
		System.out.println(torreControl.listarAvionesParking());
	}

}
