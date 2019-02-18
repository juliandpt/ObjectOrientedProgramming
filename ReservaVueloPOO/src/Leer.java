import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer extends MenuPrincipal{
	
	public Leer () {
		super (br);
	}
		public int leerCodigoCliente() throws IOException {
			String entrada;
			int codigo;
			System.out.print("Codigo cliente: ");
			entrada = br.readLine();
			codigo = Integer.parseInt(entrada);
			return codigo;
		}
		
		public int leerNumeroVuelo() throws IOException {
			String entrada;
			int numeroVuelo;
			System.out.print("Numero Vuelo: ");
			entrada = br.readLine();
			numeroVuelo = Integer.parseInt(entrada);
			return numeroVuelo;
		}
}
