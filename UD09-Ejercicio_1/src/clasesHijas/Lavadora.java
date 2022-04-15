package clasesHijas;

import clasePadre.ElectrodomesticoAbstract;

public class Lavadora extends ElectrodomesticoAbstract {

	private double carga;
	private final double CARGA = 5;

	/* Constructor por defecto */
	public Lavadora() {
		this.carga = CARGA;
	}

	/* Constructor con atributos a definir y constantes */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = CARGA;
		precioFinal();
	}

	/* Método comprobarConsumoEnergetico según eficiencia. Es abstracto. */
	@Override
	public char comprobarConsumoEnergetico(char consumoEnergetico) {

		if (consumoEnergetico == 'A' || consumoEnergetico == 'a') {
			precioBase += 100;
		} else if (consumoEnergetico == 'B' || consumoEnergetico == 'b') {
			precioBase += 80;
		} else if (consumoEnergetico == 'C' || consumoEnergetico == 'c') {
			precioBase += 60;
		} else if (consumoEnergetico == 'D' || consumoEnergetico == 'd') {
			precioBase += 50;
		} else if (consumoEnergetico == 'E' || consumoEnergetico == 'e') {
			precioBase += 30;
		} else if (consumoEnergetico == 'F' || consumoEnergetico == 'f') {
			precioBase += 10;
		} else {
			consumoEnergetico = CONSUMO;
		}

		return consumoEnergetico;
	}

	/* Método comprobarColor según cadena introducida. Método abstracto. */
	@Override
	public String comprobarColor(String color) {

		if (color.toUpperCase() == "BLANCO") {
			color = "BLANCO";
		} else if (color.toUpperCase() == "NEGRO") {
			color = "NEGRO";
		} else if (color.toUpperCase() == "ROJO") {
			color = "ROJO";
		} else if (color.toUpperCase() == "AZUL") {
			color = "AZUL";
		} else if (color.toUpperCase() == "GRIS") {
			color = "GRIS";
		} else {
			color = COLOR;
		}

		return color;

	}

	/*
	 * Método precioFinal , el precio aumentará en función de la carga.
	 */

	@Override
	public double precioFinal() {

		if (carga > 30) {
			precioBase *= 1.50;
		}

		if (peso > 0 && peso < 20) {
			precioBase += 10;
		} else if (peso > 19 && peso < 50) {
			precioBase += 50;
		} else if (peso > 49 && peso < 80) {
			precioBase += 80;
		} else if (peso >= 80) {
			precioBase += 100;
		}

		return precioBase;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	

}
