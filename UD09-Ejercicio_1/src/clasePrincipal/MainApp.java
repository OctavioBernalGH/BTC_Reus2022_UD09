package clasePrincipal;

import clasesHijas.Lavadora;
import clasesHijas.Television;
/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @fecha: 15/04/2022
 */
public class MainApp {

	public static void main(String[] args) {

		System.out.println("================== TELEVISIONES ==================");
		/* Se crean 10 objetos del tipo Televisión */
		Television lg = new Television(250, "azul", 'f', 60, 50, false);
		Television oki = new Television(100, "rojo", 'a', 80, 50, true);
		Television samsung = new Television(100, "morado", 'x', 80, 50, true);
		Television philips = new Television(699, "verde", 's', 180, 50, false);
		Television aoc = new Television(399, "blanco", 'b', 30, 50, true);
		Television benq = new Television(499, "negro", 'a', 60, 20, false);
		Television thomson = new Television(849, "rojo", 'f', 100, 100, true);
		Television sony = new Television(666, "azul", 'e', 25, 25, true);
		Television telepaco = new Television(350, "negro", 'd', 70, 50, false);
		Television teleVisor = new Television(250, "gris", 'c', 50, 50, true);

		/* Se define un array de objetos Televisión y se llena según la posición */
		Television[] arrTeles = new Television[10];
		arrTeles[0] = lg;
		arrTeles[1] = oki;
		arrTeles[2] = samsung;
		arrTeles[3] = philips;
		arrTeles[4] = aoc;
		arrTeles[5] = benq;
		arrTeles[6] = thomson;
		arrTeles[7] = sony;
		arrTeles[8] = telepaco;
		arrTeles[9] = teleVisor;

		/* Variable para almacenar al precio total de las televisiones */
		double precioTotalTelevisiones = 0;

		/*
		 * Bucle para calcular el precio final de cada tele contando los plues y para
		 * mostrar todas las teles , precio base de cada una , precio de cada tele al
		 * completo y la suma del valor de las teles.
		 */
		for (int i = 0; i < arrTeles.length; i++) {
			System.out.println(arrTeles[i]);
			System.out.println("Precio total televisión " + i + " con pluses es: " + arrTeles[i].precioFinal());
			precioTotalTelevisiones += arrTeles[i].precioFinal();
		}

		System.out.println("\nEl precio de todas las televisiones es: " + precioTotalTelevisiones);

		System.out.println("\n\n\n================== LAVADORAS ==================");
		/* Se crean 10 objetos del tipo Lavadora */
		Lavadora bosch = new Lavadora(455, "rojo", 'f', 40, 60);
		Lavadora fagor = new Lavadora(250, "verde", 'x', 50, 50);
		Lavadora balai = new Lavadora(699, "negro", 'a', 30, 80);
		Lavadora haier = new Lavadora(455, "morada", 's', 40, 60);
		Lavadora miele = new Lavadora(250, "gris", 'b', 80, 90);
		Lavadora brandt = new Lavadora(699, "blanca", 'c', 30, 10);
		Lavadora aeg = new Lavadora(455, "azul", 'a', 25, 80);
		Lavadora hotpoint = new Lavadora(250, "gris", 'f', 150, 150);
		Lavadora candy = new Lavadora(699, "negra", 's', 10, 10);
		Lavadora siemens = new Lavadora(699, "roja", 'd', 60, 84);

		/* Se define un array de objetos Lavadora y se llena según la posición */
		Lavadora[] arrLavadoras = new Lavadora[10];
		arrLavadoras[0] = fagor;
		arrLavadoras[1] = balai;
		arrLavadoras[2] = haier;
		arrLavadoras[3] = miele;
		arrLavadoras[4] = brandt;
		arrLavadoras[5] = aeg;
		arrLavadoras[6] = hotpoint;
		arrLavadoras[7] = candy;
		arrLavadoras[8] = siemens;
		arrLavadoras[9] = bosch;
		

		/* Variable para almacenar al precio total de las lavadoras */
		double precioTotalLavadoras = 0;

		/*
		 * Bucle para calcular el precio final de cada lavadora contando los plues y para
		 * mostrar todas las lavadoras , precio base de cada una , precio de cada lavadora al
		 * completo y la suma del valor de las lavadoras.
		 */
		for (int i = 0; i < arrLavadoras.length; i++) {
			System.out.println(arrLavadoras[i]);
			System.out.println("Precio total lavadora " + i + " con pluses es: " + arrLavadoras[i].precioFinal());
			precioTotalLavadoras += arrLavadoras[i].precioFinal();
		}

		System.out.println("\nEl precio de todas las lavadoras es: " + precioTotalLavadoras);
	
		System.out.println("El precio total de los electrodomésticos es: " + (precioTotalLavadoras + precioTotalTelevisiones));
	}

}
