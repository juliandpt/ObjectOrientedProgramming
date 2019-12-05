import java.util.ArrayList;

public class Pelicula {
	
	private int imdb;
	private String nomPelicula;
	private String genero;
	private String duracion;
	private Productora productora;
	private ArrayList<Participante> participantes;
	
	public Pelicula(int imdb, String nomPelicula, String genero, String duracion, Productora productora) {
		this.imdb = imdb;
		this.nomPelicula = nomPelicula;
		this.genero = genero;
		this.duracion = duracion;
		this.productora = productora;
		this.participantes = new ArrayList<>();
	}
	
	public int getImdb() {
		return imdb;
	}
	
	public String getNomPelicula() {
		return nomPelicula;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getDuracion() {
		return duracion;
	}
	
	public Productora getProductora() {
		return productora;
	}
	
	public String nomProductora() {
		return productora.getNombreProd();
	}
	
	public void anadirParticipante(Participante p) {
		participantes.add(p);
	}
	
	public String imprimirParticipantes() {
		String listado = "Participantes: \n";
		String nombre, rol;
		int edad;
		
		for (Participante p : participantes) {
			nombre = p.getNomParticipante();
			edad = p.getEdadParticipante();
			rol = p.getTipoParticipante();
			listado += "- Nombre: " + nombre + ", Edad: " + edad + ", Rol: " + rol + "\n";
		}
		return listado;
	}
	
	public String infoPelicula() {
		return "[" + getImdb() + "] " + getNomPelicula();
	}
	
	public String toString() {
		return "Pelicula escogida: " + getNomPelicula() + "\n" + 
			   "Género: " + getGenero() + "\n" +
				imprimirParticipantes() + "\n" +
			   "Duración: " + getDuracion() + "\n" +
			   "Porudctora: " + nomProductora();
	}
	
}
