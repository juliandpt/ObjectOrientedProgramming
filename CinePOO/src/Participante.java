public class Participante {

	private String nomParticipante;
	private int edadParticipante;
	private String tipoParticipante;
	
	public Participante(String nomParticipante, int edadParticipante, String tipoParticipante) {
		this.nomParticipante = nomParticipante;
		this.edadParticipante = edadParticipante;
		this.tipoParticipante = tipoParticipante;
	}
	
	public String getNomParticipante() {
		return nomParticipante;
	}
	
	public int getEdadParticipante() {
		return edadParticipante;
	}
	
	public String getTipoParticipante() {
		return tipoParticipante;
	}
	
	public String toString() {
		return "Nombre: " + getNomParticipante() + ", Edad: " + getEdadParticipante() + ", Rol: " + getTipoParticipante();
	}
}
