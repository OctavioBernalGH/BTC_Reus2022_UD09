package classPackage;

/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @fecha: 15/04/2022
 */
public class Videojuego {

	// Atributos de clase.
	private String titulo;
	private double horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;

	// Constantes de clase.
	private final double HORASESTIMADASCONST = 10.0;
	private final boolean ENTREGADOCONST = false;

	// Constructor con valores por defecto.
	public Videojuego() {
		this.horasEstimadas = HORASESTIMADASCONST;
		this.entregado = ENTREGADOCONST;
	}

	// Constructor con título y horas estimadas, lo demás por defecto.
	public Videojuego(String titulo, double horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADOCONST;
	}

	// Constructor con todos los atributos excepto entregado.
	public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}

	// Métodos get y set.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	// Sobreescribimos el método toString().
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

}
