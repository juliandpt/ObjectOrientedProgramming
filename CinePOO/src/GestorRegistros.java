import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorRegistros {
	
	private HashMap<String, Cliente> clientes;
	private HashMap<Integer, Pelicula> peliculas;
	private HashMap<Integer, Cine> cines;
	private HashMap<Integer, Sala> salas;
	private HashMap<Integer, Entrada> entradas;
	private HashMap<Integer, Proyeccion> proyecciones;
	private HashMap<Integer, HashMap<Integer, ArrayList<Integer>>> pelisCinesProyecciones; 
	private HashMap<Integer, ArrayList<Integer>> peliculasCines;
	
	public GestorRegistros() {
		clientes = new HashMap<String, Cliente>();
		peliculas = new HashMap<Integer, Pelicula>();
		cines = new HashMap<Integer, Cine>();
		salas = new HashMap<Integer, Sala>();
		entradas = new HashMap<Integer, Entrada>();
		proyecciones = new HashMap<Integer, Proyeccion>();
		pelisCinesProyecciones = new HashMap<Integer, HashMap<Integer, ArrayList<Integer>>>();
		peliculasCines = new HashMap<Integer, ArrayList<Integer>>();		
	}

//AÑADIR
	
	public void anadirPelicula(Pelicula pelicula) {
		int idPelicula = pelicula.getImdb();
		ArrayList<Integer> pelis = new ArrayList<Integer>();
		peliculas.put(idPelicula, pelicula);
		peliculasCines.put(idPelicula, pelis);
		if(!pelisCinesProyecciones.containsKey(idPelicula)) {
			 HashMap<Integer, ArrayList<Integer>> hs = new  HashMap<Integer, ArrayList<Integer>>();
			 pelisCinesProyecciones.put(idPelicula, hs);
		}
	}
	
	public void anadirCliente(Cliente cliente) {
		String idCliente = cliente.getDNI();
		clientes.put(idCliente, cliente);
	}
	
	public void anadirCine(int idPelicula, Cine cine) {
		int idCine = cine.getIdCine();
		cines.put(idCine, cine);
		peliculasCines.get(idPelicula).add(idCine);
	}
	
	public void anadirSala(int idCine, Sala sala) {
		int idSala = sala.getIdSala();
		salas.put(idSala, sala);
		cines.get(idCine).anadirSala(sala);
	}
	
	public void anadirEntrada(Entrada entrada) {
		int idEntrada = entrada.getIdEntrada();
		entradas.put(idEntrada, entrada);
	}
	
	public void anadirProyeccion(int idPelicula, int idCine, Proyeccion proyeccion) {
		int idProyeccion = proyeccion.getIdProyeccion();
		if(!existeCinePr(idPelicula, idCine)) {
			ArrayList<Integer> ListaProyecciones = new ArrayList<Integer>();
			pelisCinesProyecciones.get(idPelicula).put(idCine, ListaProyecciones);
		}	
		proyecciones.put(idProyeccion, proyeccion);
		pelisCinesProyecciones.get(idPelicula).get(idCine).add(idProyeccion);
	}
	
//COMPROBAR
	
	public boolean existeCliente(String idCliente) {
		return clientes.containsKey(idCliente);
	}
	
	public boolean validarUsuario (String idCliente, String contrasena) {
		Cliente cliente = clientes.get(idCliente);
		return cliente.contrasenaCorrecta(contrasena);
	}
	
	public boolean existePelicula(int idPelicula) {
		return peliculas.containsKey(idPelicula);
	}
	
	public boolean existeCine(int idCine) {
		return cines.containsKey(idCine);
	}
	
	public boolean existeSala(int idSala) {
		return salas.containsKey(idSala);
	}
	
	public boolean emitePelicula(int idPelicula, int idCine) {
		return peliculasCines.get(idPelicula).contains(idCine);
	}	
	
	public boolean peliculaEsSeleccionable(int idPelicula) {
		if(!existePelicula(idPelicula)) {
			return false;
		}
		return !peliculasCines.get(idPelicula).isEmpty();
	}
	
	public boolean cineEsSeleccionable(int idCine) {
		if(!existeCine(idCine)) {
			return false;
		}
		return cines.get(idCine).listaIdsSalas() != null;
	}
	
	public boolean existeCinePr(int idPelicula, int idCine) {
		return pelisCinesProyecciones.get(idPelicula).containsKey(idCine);
	}
	
	public boolean existeProyeccion(int idPelicula, int idCine, int idProyeccion) {
		return pelisCinesProyecciones.get(idPelicula).get(idCine).contains(idProyeccion);
	}
	
	public boolean existeEntrada(int idEntrada) {
		return entradas.containsKey(idEntrada);
	}
	
//IMPRIMIR	
	
	public String mostrarSalas(int idCine) {
		String salida = "";
		
		ArrayList<Integer> listaIds = cines.get(idCine).listaIdsSalas();
		for (int idSala : listaIds) {
			salida += salas.get(idSala).infoSala() + "\n";
		}
		return salida;
	}
	
	public String mostrarProyecciones(int idPelicula, int idCine) {
		String salida = "";
		
		ArrayList<Integer> listaIds = pelisCinesProyecciones.get(idPelicula).get(idCine);
		for (int idProyeccion : listaIds) {
			salida += proyecciones.get(idProyeccion).infoProyeccion() + "\n";
		}
		return salida;
	}
	
	public double calcularPrecioEntrada(String idCliente, int idCine) {
		if(clientes.get(idCliente).tieneDescuentoDiscapacidad()) {
			return cines.get(idCine).getPrecioEntrada() * 0.6; 
		}
		
		if (clientes.get(idCliente).tieneDescuentoEdad()) {
			return cines.get(idCine).getPrecioEntrada() * 0.8;
		}
		
		return cines.get(idCine).getPrecioEntrada();
	}
	
	public String mostrarCines(int idPelicula) {
		String salida = "";
		
		ArrayList<Integer> listaIds = peliculasCines.get(idPelicula);
		for (int idCine : listaIds) {
			salida += cines.get(idCine).infoCine() + "\n";
		}
		return salida;
	}
	
	public String mostrarPeliculas() {
		String salida = "";
		
		for (Map.Entry<Integer, Pelicula> pelicula : peliculas.entrySet()) {
			salida += pelicula.getValue().infoPelicula() + "\n";			
		}
		return salida;
	}
	
	public void imprimirInfoPeliculas(int idPelicula) {
		System.out.println();
		System.out.println("*---- INFROMACIÓN DE LA PELICULA ----*");
		System.out.println(peliculas.get(idPelicula).toString());
	}
	
	public void imprimirLocalizacionCines(int idCine){
		System.out.println();
		System.out.println("Localización del cine elegido:");
		System.out.println(" - " + cines.get(idCine).getLocalizacion());
	}
	
	public double precioTotal() {
		int precioTotal = 0;
		for (Map.Entry<Integer, Entrada> entry : entradas.entrySet()) {
			precioTotal += entry.getValue().getPrecio();
		}
		return precioTotal;
	}
	
	public void escogerAsientoPr(String idCliente, int idPelicula, int idCine, int idProyeccion) {
		Scanner sc = new Scanner(System.in);
		AsientosReservados ar = proyecciones.get(idProyeccion).getAsientosReservados();
		int fila, asiento;
		char[][] s = proyecciones.get(idProyeccion).getAsientosReservados().getOcupacion();
		
		System.out.println();
		System.out.println("*-- SALA " + proyecciones.get(idProyeccion).getIdSala() + " --*");
		System.out.println();
		ar.mostrarSala();
		
		System.out.println();
		System.out.println("Escoge una fila(1-" + ar.getNumFilas() + "): ");
		fila = sc.nextInt();
		ar.setNumFila(fila);
		
		while (fila > ar.getNumFilas() || fila < 1){
			System.out.println("fila inexistente");
            System.out.println("Vuelva a escoger una fila(1-" + ar.getNumFilas() + "): ");
        	fila = sc.nextInt();
        	ar.setNumFila(fila);
        }
		
		System.out.println("Escoge un asiento(1-" + ar.getNumAsientos() + "): ");
		asiento = sc.nextInt();
		ar.setNumAsiento(asiento);
		
		while (asiento > ar.getNumAsientos() || asiento < 1){
            System.out.println("asiento inexistente");
            System.out.println("Vuelva a escoger un asiento(1-" + ar.getNumAsientos() + "): ");
        	asiento = sc.nextInt();
        	ar.setNumAsiento(asiento);
        }
		
		while (s[fila-1][asiento-1] == 'X') {
			System.out.println("Asiento ocupado");
			System.out.println("Vuelva a escoger una fila(1-" + ar.getNumFilas() + "): ");  
			fila = sc.nextInt();
			ar.setNumFila(fila);
        	System.out.println("Vuelva a escoger un asiento(1-" + ar.getNumAsientos() + "): ");  
        	asiento = sc.nextInt();
        	ar.setNumAsiento(asiento);
        }
		
		if(s[fila-1][asiento-1] == 'O'){
            s[fila-1][asiento-1] = 'X';
        }      
		
		System.out.println();
		System.out.println("Su entrada:");
		generarEntrada(idCliente, idPelicula, idCine, proyecciones.get(idProyeccion).getFecha(), proyecciones.get(idProyeccion).getIdSala(), fila, asiento);
	}
	
	public void generarEntrada(String idCliente, int idPelicula, int idCine, Fecha fecha, int idSala, int idFila, int idAsiento) {
		Entrada entrada = new Entrada(clientes.get(idCliente).getNomCliente(), clientes.get(idCliente).getApellidos(), 
				peliculas.get(idPelicula).getNomPelicula(), 
				cines.get(idCine).getNomCine(), 
				fecha,
				idSala, idFila, idAsiento, 
				calcularPrecioEntrada(idCliente, idCine));
		
		System.out.println(entrada.toString()); 
		anadirEntrada(entrada);
	}
	
	public void imprimirEntradas() {
		System.out.println("Número de entradas reservadas: " +  entradas.size());
		for (Map.Entry<Integer, Entrada> entry : entradas.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
	
//OTROS	
	
	public String getNomCliente(String idCliente) {
		return clientes.get(idCliente).getNomCliente();
	}
		
	public void tamanoClientes() {
		clientes.size();
	}

	public void eliminarProyeccion(int idCine, int idPelicula) {
		peliculasCines.get(idPelicula).remove(idCine);
	}
	
	public void eliminarEntrada(int idEntrada) {
		entradas.remove(idEntrada);
	}
	
	public boolean entradasVacias() {
		return entradas.isEmpty();
	}
	
	public String getNomPelicula(int idPelicula) {
		return peliculas.get(idPelicula).getNomPelicula();
	}
	
	public String getNomCine(int idCine) {
		return cines.get(idCine).getNomCine();
	}
}