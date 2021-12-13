package n1ejercicio6;
import java.util.*;

/*
 * Ejercicio 6. Crea un objeto vacío LinkedList<Integer>. 
 * Utilizando un iterador ListIterator, añada valores enteros 
 * a la lista insertandolos siempre a la mitad de ésta.
 */

public class App {
	
	
	 public static void main(String[] args) {
		 
		 LinkedList< Integer > list = new LinkedList<Integer>() ;

		 getIterator( list ).add( 1 );
		 getIterator( list ).add( 2 );
		 getIterator( list ).add( 3 );
		 getIterator( list ).add( 4 );
		 getIterator( list ).add( 5 );
		 getIterator( list ).add( 6 );
	            
		 System.out.println( list );
	 }

	 private static ListIterator<Integer> getIterator(LinkedList<Integer> list) {
		 return list.listIterator( list.size() / 2 );
	 }
	
}
