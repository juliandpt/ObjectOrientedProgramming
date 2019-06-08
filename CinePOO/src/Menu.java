import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private GestorRegistros gr;
	
	public Menu(GestorRegistros ger) {
		sc = new Scanner(System.in);
		gr = ger;
	}
	
	public boolean esCorrecto(String s) {
		if (s.contains("0") || s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9")) {
			return false;
		} else {
			return true;
		}
	}
	
	public void menuEscogerAsiento(String nomCliente, int idPelicula, int idCine, int idProyeccion) {
		gr.escogerAsientoPr(nomCliente, idPelicula, idCine, idProyeccion);
	}
	
	public void menuProyecciones(String idCliente, int idPelicula, int idCine) {
		boolean cancelar = false;
		int idProyeccion;
		
		gr.imprimirLocalizacionCines(idCine);
		
		System.out.println();
		System.out.println("*---- HORARIOS ----*");
		
		while(!cancelar) {
			System.out.println(gr.mostrarProyecciones(idPelicula, idCine));
			System.out.println("Elija una fecha: ");
			
			idProyeccion = sc.nextInt();
			sc.nextLine();
			
			
			while (!gr.existeProyeccion(idPelicula, idCine, idProyeccion)) {
				System.out.println("La fecha seleccionada no existe");
				System.out.println("Vuelva a elegir otra fecha: ");
				idProyeccion = sc.nextInt();
			}
			menuEscogerAsiento(idCliente, idPelicula, idCine, idProyeccion);
			cancelar = true;
		}
	}
	
	public void menuCines(String nomCliente, int idPelicula) {
		boolean cancelar = false;
		int idCine;
		
		gr.imprimirInfoPeliculas(idPelicula);
		
		System.out.println();
		System.out.println("*---- CINES ----*");
		
		while(!cancelar) {
			System.out.println(gr.mostrarCines(idPelicula));
			System.out.println("Elija una opcion: ");
			
			idCine = sc.nextInt();
			sc.nextLine();
			
			gr.existeCine(idCine);
			
			while(!gr.existeCine(idCine)) {
				System.out.println("El cine seleccionado no existe");
				System.out.println("Vuelva a elegir otro cine: ");
				idCine = sc.nextInt();
			}
			menuProyecciones(nomCliente, idPelicula, idCine);
			cancelar = true;
		}
	}
	
	public void menuPeliculas(String nomCliente) {
		boolean cancelar = false;
		int imdb;
		
		System.out.println();
		System.out.println("*---- PELICULAS DISPONIBLES ----*");
		
		while (!cancelar) {
			System.out.println(gr.mostrarPeliculas());
			System.out.println("Elija una opción: ");
			
			imdb = sc.nextInt();
			sc.nextLine();
			
			gr.existePelicula(imdb);
			
			
			while(!gr.peliculaEsSeleccionable(imdb)) {
				System.out.println("Opción no disponible");
				System.out.println("Vuelva a elegir una opcion: ");
				imdb =sc.nextInt();
			}		
			menuCines(nomCliente, imdb);
			cancelar = true;
		}		
	}
	
	public void menuFinalizarCompra() {
		int pago;
		
		System.out.println("Precio total a pagar: " + gr.precioTotal() + "€");
		System.out.println();
		System.out.println("Introduzca el precio total:");
		
		pago = sc.nextInt();
		sc.nextLine();
		
		while(pago != gr.precioTotal()) {
			System.out.println("Cantidad mal introducida");
			System.out.println("Por favor, vuelva a introducir la cantidad: ");
			
			pago = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Muchas gracias por su compra");
	}
	
	public void menuEntradasReservadas() {
		boolean cancelar = false;
		int option;
		String opcion;
		
		gr.imprimirEntradas();
		
		while(!cancelar) {
			
			System.out.println();
			System.out.println("¿Desea eliminar alguna entrada?: ");
			
			opcion = sc.next();
			
			if(opcion.equalsIgnoreCase("si")) {
				System.out.println();
				System.out.println("Introduzca el Id de la entrada que desea eliminar: ");
				
				option = sc.nextInt();
				sc.nextLine();
				
				while(!gr.existeEntrada(option)) {
					System.out.println("La entrada seleccionada no existe");
					System.out.println("Vuelva a introducir el Id de la entrada que desea eliminar: ");
					
					option = sc.nextInt();
					sc.nextLine();
				}
				
				gr.eliminarEntrada(option);
				
				System.out.println("Entrada eliminada con exito");
				cancelar = true;
				
			}else if(opcion.equalsIgnoreCase("no")){
				cancelar = true;
				
			}else {
				System.out.println("Campo mal introducido");
			}
		}
	}
	
	public void menuReservasEntradas(String idCliente) {
		int opcion;
		boolean volverAtras = false;
		
		System.out.println();
		
		while(!volverAtras) {		
			System.out.println("*---- MENU DE COMPRA DE ENTRADAS ----*");
			System.out.println("[1] Comprar entradas");
			System.out.println("[2] Entradas reservadas");
			System.out.println("[3] Finalizar compra");
			System.out.println("[4] Cerrar sesión");
			System.out.println("¿Qué desea hacer?:");
				
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
				case 1:
					menuPeliculas(idCliente);
					System.out.println();
					break;
				case 2:
					System.out.println();
					System.out.println("*---- ENTRADAS RESERVADAS ----*");
					
					if(gr.entradasVacias()) {
						System.out.println("Ninguna entrada reserada");
					}else {
						menuEntradasReservadas();
					}
					System.out.println();
					break;
				case 3:
					System.out.println();
					System.out.println("*---- MENU DE COMPRA ----*");
					
					if (gr.precioTotal() == 0) {
						System.out.println("Ninguna entrada reservada");
						volverAtras = false;
					}else {
						menuFinalizarCompra();
						volverAtras = true;
					}	
					System.out.println();
					break;
				case 4:
					volverAtras = true;
					System.out.println();
					break;
				default:
					System.out.println("Opción incorrecta");
					System.out.println();	
			}
		}
	}
		
	public void crearCliente() {
		String nomCliente, apellidos, dni, dis, contrasena;
		boolean discapacidad = false;
		int edad;
		
		System.out.println();
		System.out.println("*---- CREACIÓN DE USUARIO ----*");
		
		System.out.println("Introduzca su nombre: ");   
		nomCliente = sc.nextLine();
		
		while (esCorrecto(nomCliente) == false) { 
			System.out.println("El campo de nombre esta mal introducido");
			System.out.println("Vuelva a introducir su nombre: ");   
			nomCliente = sc.nextLine();
		}
		
		System.out.println("Introduzca sus apellidos: ");
		apellidos = sc.nextLine();
		
		while (esCorrecto(apellidos) == false) { 
			System.out.println("El campo de apellidos esta mal introducido");
			System.out.println("Vuelva a introducir sus apellidos: ");
			apellidos = sc.nextLine();
		}
		
		System.out.println("Introduzca su DNI/NIF: ");
		dni = sc.nextLine();
		
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Tiene alguna discapacidad(si/no): ");
		dis = sc.nextLine();
		
		while (!dis.equalsIgnoreCase("si") && !dis.equalsIgnoreCase("no")) {
			System.out.println("El campo de discapacidad esta mal introducido");
			System.out.println("Tiene alguna discapacidad(si/no): ");
			dis = sc.nextLine();
		}
		
		if (dis.equalsIgnoreCase("si")) {
			discapacidad = true;	
		} else if(dis.equalsIgnoreCase("no")) {
			discapacidad = false;
		} 
		
		System.out.println("Introduzca la contraseña deseada: ");
		contrasena = sc.nextLine();
		
		if (edad >= 60) {
			Cliente ClienteMayor = new ClienteMayorDeEdad(dni, contrasena, nomCliente, apellidos, edad, discapacidad);
			gr.anadirCliente(ClienteMayor);
		} else if (edad < 18) {
			Cliente ClienteMenor = new ClienteMenorDeEdad(dni, contrasena, nomCliente, apellidos, edad, discapacidad);
			gr.anadirCliente(ClienteMenor);
		} else {
			gr.anadirCliente(new Cliente(dni, contrasena, apellidos, nomCliente, edad, discapacidad));
		}
		menuReservasEntradas(dni);
	}
	
	public void menuLogIn() {
		String dni, contrasena;
		
		System.out.println();
		System.out.println("*----LOG IN----*");
		
		System.out.println("Usuario(dni/nif): ");
		dni = sc.next();
		
		System.out.println("Contraseña: ");
		contrasena = sc.next();
		
		while(gr.validarUsuario(dni, contrasena) == false) {
			System.out.println("Contraseña incorrecta");
			System.out.println();
			System.out.println("Vuelva a introducir su contraseña: ");
			contrasena = sc.next();
		}
		
		System.out.println("Bienvenido");

		menuReservasEntradas(dni);
	}
		
	public void menuPrincipal() {
		int opcion;
		boolean salir = false;
		
		while (!salir) {
			System.out.println("*---- MENU PRINCIPAL ----*");
			System.out.println("[1] Iniciar Sesión");
			System.out.println("[2] Crear Usuario");
			System.out.println("[3] Salir");
			System.out.println("Elija una opcion: ");
			opcion = sc.nextInt();
			sc.nextLine();
			switch(opcion) {
				case 1:
					menuLogIn();
					break;
				case 2:
					crearCliente();
					break;
				case 3:
					salir = true;
					System.out.println("Gracias por su visita");
					break;
				default:
					System.out.println("Opción incorrecta");
					System.out.println();
			}
		}
	}
}
