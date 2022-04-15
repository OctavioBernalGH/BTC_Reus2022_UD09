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
	private String compa�ia;

	// Constantes de clase.
	private final double HORASESTIMADASCONST = 10.0;
	private final boolean ENTREGADOCONST = false;

	// Constructor con valores por defecto.
	public Videojuego() {
		this.horasEstimadas = HORASESTIMADASCONST;
		this.entregado = ENTREGADOCONST;
	}

	// Constructor con t�tulo y horas estimadas, lo dem�s por defecto.
	public Videojuego(String titulo, double horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADOCONST;
	}

	// Constructor con todos los atributos excepto entregado.
	public Videojuego(String titulo, double horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}

	// M�todos get y set.
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	// Sobreescribimos el m�todo toString().
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compa�ia=" + compa�ia + "]";
	}

}
