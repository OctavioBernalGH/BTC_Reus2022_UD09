package classPackage;

/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @fecha: 15/04/2022
 */
public class Serie {

	// Atributos de clase.
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Constantes de clase.
	private final int NUMEROTEMPORADASCONST = 3;
	private final boolean ENTREGADOCONST = false;

	// Constructor con valores por defecto.
	public Serie() {
		this.numeroTemporadas = NUMEROTEMPORADASCONST;
		this.entregado = ENTREGADOCONST;
	}

	// Constructor con atributo creado y título , los demás por defecto.
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = NUMEROTEMPORADASCONST;
		this.entregado = ENTREGADOCONST;
	}

	// Constructor con todos los atributos menos extregado.
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	// Métodos get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	// Sobreescritura método toString().
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
