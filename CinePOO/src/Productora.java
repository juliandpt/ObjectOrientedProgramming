import java.util.ArrayList;

public class Productora {
	
	private String nomProd;
	private ArrayList<Pelicula> peliculas;
	
	public Productora(String nomProd) {
		this.nomProd = nomProd;
		this.peliculas = new ArrayList<>();
	}
	
	public String getNombreProd() {
		return nomProd;
	}
	
	public void anadirPelicula(Pelicula p) {
		peliculas.add(p);
	}

	public String imprimirPeliculas() {
		String listaPeliculas = "Peliculas: \n";
		String nombrePeli;
		
		for (Pelicula p : peliculas) {
			nombrePeli = p.getNomPelicula();
			listaPeliculas += "- Nombre: " + nombrePeli + "\n";
		}
		return listaPeliculas;
	}
	
	public String toString() {
		return "Productora: " + getNombreProd() + "\n" + 
			   imprimirPeliculas();
	}
}
