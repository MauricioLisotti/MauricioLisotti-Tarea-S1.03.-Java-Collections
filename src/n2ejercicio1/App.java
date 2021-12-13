package n2ejercicio1;
import java.util.*;


/* Ejercicio 1.  Crea una clase llamada Numero que contenga un 
 * objeto Integer que se inicialice con un valor comprendido 
 * entre 0 y 100 utilizando java.util.Random. Rellena una cola 
 * tipo PriorityQueue con objetos de esta clase y extrae los
 * valores utilizando poll() para demostrar que se obtiene el orden 
 * deseado.
 * 
 */

public class App {
	public static void main(String[]args) {
		
		PriorityQueue<Numero> listaQueue = new PriorityQueue();
		Numero num1 = new Numero();
		Numero num2 = new Numero();
		Numero num3 = new Numero();
		Numero num4 = new Numero();
		Numero num5 = new Numero();
		
		listaQueue.add(num1);
		listaQueue.add(num2);
		listaQueue.add(num3);
		listaQueue.add(num4);
		listaQueue.add(num5);
		
        System.out.println("PriorityQueue inicial: " + listaQueue);

		for (int i = -1; i<=listaQueue.size();i++) {
		
		System.out.println("The element at the head of thequeue is: " + listaQueue.poll());
	
        System.out.println("Final PriorityQueue: " + listaQueue);

		}
		
	}
	
}
