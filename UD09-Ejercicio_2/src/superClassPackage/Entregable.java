package superClassPackage;
/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @fecha: 15/04/2022
 */
public interface Entregable {

	static boolean entregar() {
		return false;
	}

	static boolean devolver() {
		return false;
	}
	
	static boolean isEntregado() {
		return false;
	}
}