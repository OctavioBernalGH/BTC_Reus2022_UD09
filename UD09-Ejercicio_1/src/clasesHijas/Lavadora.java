package clasesHijas;

import clasePadre.ElectrodomesticoAbstract;
/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @fecha: 15/04/2022
 */
public class Lavadora extends ElectrodomesticoAbstract {

	double precioConsumo = 0;
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
			precioConsumo = CONSUMO;
			consumoEnergetico = CONSUMO;
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
	 * Método precioFinal , el precio aumentará en función de la carga.
	 */

	@Override
	public double precioFinal() {

		double precioTotal = 0;
		double plusCarga = 0;
		double plusPeso = 0;

		if (carga > 30) {
			plusCarga = precioBase * 1.50;
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

		precioTotal = precioBase + plusCarga + plusPeso + precioConsumo;

		return precioTotal;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
