package n1ejercicio4;
import java.util.*;


/*
 * Ejercicio 4. Escribe un metodo public static <T> void iterCollection 
 * (Collection<T> c) que utilice un iterador para recorrer una colección 
 * genérica pasada por argumento e imprima todos sus objetos (utilizando 
 * el método toString()) . Rellene todos los distintos tipos de Java 
 * Collections (ArrayList, LinkedList, HashSet, LinkedHashSet y TreeSet), 
 * con una serie de objetos y aplique el método diseñado en cada Contenedor.
 */

public class App {

	public static <T> void iterCollection(Collection<T> c) {
		
		Iterator<T> it=c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
			
		}	
	}
	
	
	public static void main(String[]args) {
		
		Derivada miIt = new Derivada ("perro");
		
		//ArrayList
		
		ArrayList<Derivada> datosArray = new ArrayList<Derivada>();	
		
		datosArray.add(new Derivada ("Uno"));
		datosArray.add(new Derivada ("Dos"));
		datosArray.add(new Derivada ("Tres"));
		

						
		//LinkedList
		
		LinkedList<Derivada> datosLinkedList = new LinkedList<Derivada>();

		datosLinkedList.add(new Derivada ("Uno"));
		datosLinkedList.add(new Derivada ("Dos"));
		datosLinkedList.add(new Derivada ("Tres"));
        
        
        //HashSet
        
		HashSet<Derivada> datosHashSet = new HashSet<Derivada>();
		
		datosHashSet.add(new Derivada ("Uno"));
		datosHashSet.add(new Derivada ("Dos"));
		datosHashSet.add(new Derivada ("Tres"));
        
		
			
		//LinkedHashSet
			
		LinkedHashSet<Derivada> datosLinkedHashSet = new LinkedHashSet<Derivada>();
		
		datosLinkedHashSet.add(new Derivada ("Uno"));
		datosLinkedHashSet.add(new Derivada ("Dos"));
		datosLinkedHashSet.add(new Derivada ("Tres"));
				
		
		//TreeSet
		
		TreeSet<Derivada> datosTreeSet = new TreeSet<Derivada>();
			
		datosTreeSet.add(new Derivada ("Uno"));
		datosTreeSet.add(new Derivada ("Dos"));
		datosTreeSet.add(new Derivada ("Tres"));
		
		
		// llamo al iterador
		
		System.out.println("ArrayList:");
		
		iterCollection(datosArray);
		
		System.out.println("LinkedList:");
		
		iterCollection(datosLinkedList);
		
		System.out.println("HashSet:");
		
		iterCollection(datosHashSet);
		
		System.out.println("LinkedHashSet:");
		
		iterCollection(datosLinkedHashSet);
		
		
		System.out.println("TreeSet:");
		iterCollection(datosTreeSet);
		
		
	
	}
	
	
	
}
