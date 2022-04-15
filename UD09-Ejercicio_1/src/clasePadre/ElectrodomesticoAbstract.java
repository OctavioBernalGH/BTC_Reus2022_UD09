package clasePadre;
/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @fecha: 15/04/2022
 */
public abstract class ElectrodomesticoAbstract {

	/* Atributos de clase padre */
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	/* Constantes de clase padre */
	protected final String COLOR = "BLANCO";
	protected final char CONSUMO = 'F';
	protected final double PESO = 5.0;

	/* Constructor vacío */
	public ElectrodomesticoAbstract() {
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = PESO;
	}

	/* Constructor con parámetros y con constantes */
	public ElectrodomesticoAbstract(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = peso;
	}

	/* Constructor de clase completo */
	public ElectrodomesticoAbstract(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color.toUpperCase());
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	/* Getters y setters */
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/* Calculamos el precio según eficiencia energética */
	public  abstract char comprobarConsumoEnergetico(char consumoEnergetico);

	/* Comprobamos el color , si la cadena introducida es incorrecta pasaremos a valor por defecto */
	public abstract String comprobarColor(String color);
	
	/* precioFinal */
	public double precioFinal() {
		return precioBase;
	}

}
