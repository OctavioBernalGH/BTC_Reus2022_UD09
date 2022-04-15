package clasePadre;

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
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
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
