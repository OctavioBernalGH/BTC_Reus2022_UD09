package clasePrincipal;

import clasesHijas.Lavadora;
import clasesHijas.Television;

public class MainApp {

	public static void main(String[] args) {
		
		Television LG = new Television();
		Television OKI = new Television(100, "rojo", 'a', 80, 50, true);		
		System.out.println(LG);
		System.out.println(OKI);
		Lavadora BOSCH = new Lavadora();
		Lavadora FAGOR = new Lavadora(100, "verde", 'x', 50, 50);
		System.out.println(BOSCH);
		System.out.println(FAGOR);

	}

}
