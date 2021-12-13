package n1ejercicio5;
import java.util.*;

/*
 * Ejercicio 5. Crea y rellene un objeto List<Integer>. 
 * Crea y rellene un segundo objeto List<Integer> del mismo tamaño 
 * que el primero. Utilice sendos objetos ListIterator para leer los 
 * elementos de la primera lista e insertarlos en la segunda en
 * orden inverso (pruebe a explorar varias formas diferentes de 
 * resolver este problema).
 */

public class App {
	
	
	
	public static void main(String[]args) {

		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(5);
		
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista2.add(11);
		lista2.add(12);
		lista2.add(13);
		lista2.add(14);
		lista2.add(15);
		
		
		ListIterator<Integer> it1 = lista1.listIterator();
		
		ListIterator<Integer> it2 = lista2.listIterator();
		
		/*
		System.out.println("Muestra lista 1:");
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}	
		
		
		System.out.println("Muestra lista 2:");
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}	
		
		*/
		System.out.println("Muestra lista 2 completa:");
		
		while (it1.hasPrevious()) {
		    it2.add(it1.previous());
		}
		
		System.out.println(lista2);
		
		
	}

}
