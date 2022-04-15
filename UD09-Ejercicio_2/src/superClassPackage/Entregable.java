package superClassPackage;

/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @fecha: 15/04/2022
 */
public interface Entregable {

	// Cambia el atributo prestado a true.
	static boolean entregar() {
		return false;
	}

	// Cambie el atributo prestado a false.
	static boolean devolver() {
		return false;
	}

	// Devuelve el estado del atributo prestado
	static boolean isEntregado() {
		return false;
	}
	
	/* 
	 * Compara las horas estimadas en los videojuegos y el número de temporadas 
	 * en las series.
	 */
	
	static double compareTo(Object a) {
		return 0;
	}
}