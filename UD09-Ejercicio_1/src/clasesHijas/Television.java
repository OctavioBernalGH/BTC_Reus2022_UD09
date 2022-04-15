package clasesHijas;

import clasePadre.ElectrodomesticoAbstract;
/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @fecha: 15/04/2022
 */
public class Television extends ElectrodomesticoAbstract {

	/* Atributos de clase */
	private double precioConsumo = 10;
	private double resolucion;
	private boolean sintonizadorTDT;

	/* Constantes de clase */
	private final double RESOLUCION = 20.0;
	private final boolean SINTONIZADORTDT = false;

	/* Constructor por defecto */
	public Television() {
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	/* Constructor con atributos a definir y por defecto */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	/* Constructor con atributos a definir */
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;

		precioFinal();
	}

	/* Getters y setters */
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/* Método comprobarConsumoEnergetico según eficiencia. Es abstracto. */
	@Override
	public char comprobarConsumoEnergetico(char consumoEnergetico) {

		if (consumoEnergetico == 'A' || consumoEnergetico == 'a') {
			precioConsumo += 100;
			consumoEnergetico = 'A';
		} else if (consumoEnergetico == 'B' || consumoEnergetico == 'b') {
			precioConsumo += 80;
			consumoEnergetico = 'B';
		} else if (consumoEnergetico == 'C' || consumoEnergetico == 'c') {
			precioConsumo += 60;
			consumoEnergetico = 'C';
		} else if (consumoEnergetico == 'D' || consumoEnergetico == 'd') {
			precioConsumo += 50;
			consumoEnergetico = 'D';
		} else if (consumoEnergetico == 'E' || consumoEnergetico == 'e') {
			precioConsumo += 30;
			consumoEnergetico = 'E';
		} else if (consumoEnergetico == 'F' || consumoEnergetico == 'f') {
			precioConsumo += 10;
			consumoEnergetico = 'F';
		} else {
			consumoEnergetico = CONSUMO;
			precioConsumo = CONSUMO;
		}

		return consumoEnergetico;
	}

	/* Método comprobarColor según cadena introducida. Método abstracto. */
	@Override
	public String comprobarColor(String color) {

		switch (color) {
		case "BLANCO":
			color = "BLANCO";			
			break;
		case "ROJO":
			color = "ROJO";
			break;
		case "AZUL":
			color = "AZUL";
			break;
		case "NEGRO":
			color = "NEGRO";
			break;
		case "GRIS":
			color = "GRIS";
			break;
		default:
			color = "BLANCO";
			break;
		}

		return color;

	}

	/*
	 * Método precioFinal , el precio aumentará en función de las pulgadas y si
	 * tiene sintonizador y si pesa mas de X kilos.
	 */
	@Override
	public double precioFinal() {

		double precioTotal = 0;
		double plusResolucion = 0;
		double plusPeso = 0;
		double plusSintonizador = 0;

		if (resolucion > 40) {
			plusResolucion = precioBase * 0.30;
		}

		if (sintonizadorTDT == true) {
			plusSintonizador = 50;
		}

		if (peso > 0 && peso < 20) {
			plusPeso = 10;
		} else if (peso > 19 && peso < 50) {
			plusPeso += 50;
		} else if (peso > 49 && peso < 80) {
			plusPeso += 80;
		} else if (peso >= 80) {
			plusPeso += 100;
		}

		precioTotal = plusResolucion + plusPeso + plusSintonizador + precioConsumo + precioBase;

		return precioTotal;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ",  precioBase="
				+ precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}

}
