package clasesHijas;

import clasePadre.ElectrodomesticoAbstract;

public class Television extends ElectrodomesticoAbstract {

	/* Atributos de clase */
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
	 * Método precioFinal , el precio aumentará en función de las pulgadas y si
	 * tiene sintonizador y si pesa mas de X kilos.
	 */
	@Override
	public double precioFinal() {

		if (resolucion > 40) {
			precioBase *= 1.30;
		}

		if (sintonizadorTDT == true) {
			precioBase += 50;
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
		return "Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ",  precioBase="
				+ precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}

}
