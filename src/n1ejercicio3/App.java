package n1ejercicio3;

import java.util.*;


/*
 * Ejercicio 3. Crea una clase llamada Generadora que devuelva 
 * nombres de personajes (como String) de su película 
 * favorita cada vez que invoque al método 'siguientePersonaje()',
 *  y que vuelva al principio de la lista de personajes una vez 
 *  que haya terminado con todos los nombres. Utilice este generador 
 *  para rellenar un ArrayList, un LinkedList, un HashSet, un LinkedHashSet 
 *  y un TreeSet, y después imprima por pantalla cada contenedor. ¿Qué 
 *  contenedores permiten elementos repetidos? ¿Qué contenedores permiten 
 *  una ordenación por orden natural o alfanumérico?
 */

public class App {
	
	public static void main(String[]args) {

		//ArrayList
		
		ArrayList<Generadora> pjArr = new ArrayList<Generadora>();
		
		pjArr.add(new Generadora ("Ironman"));
		pjArr.add(new Generadora ("Hulk"));
		pjArr.add(new Generadora ("Capitán América"));
		pjArr.add(new Generadora ("Ironman"));
		pjArr.add(new Generadora ("Dr. Strange"));
	
		
		//LinkedList
		
        LinkedList<Generadora> pjLinked = new LinkedList<Generadora>();

        pjLinked.add(new Generadora("Ironman"));
        pjLinked.add(new Generadora("Hulk"));
        pjLinked.add(new Generadora("Capitán América"));
        pjLinked.add(new Generadora("Ironman"));
        pjLinked.add(new Generadora("Dr. Strange"));
        
        
        //HashSet
        
		Set<Generadora> pjHashS = new HashSet<Generadora>();
		
		pjHashS.add(new Generadora("Ironman"));
		pjHashS.add(new Generadora("Hulk"));
		pjHashS.add(new Generadora("Capitán América"));
		pjHashS.add(new Generadora("Ironman"));
		pjHashS.add(new Generadora("Dr. Strange"));
		
		
		//LinkedHashSet
		
		LinkedHashSet<Generadora> pjLinkedHash = new LinkedHashSet<Generadora>();

		pjLinkedHash.add(new Generadora("Ironman"));
		pjLinkedHash.add(new Generadora("Hulk"));
		pjLinkedHash.add(new Generadora("Capitán América"));
		pjLinkedHash.add(new Generadora("Ironman"));
		pjLinkedHash.add(new Generadora("Dr. Strange"));
		
		/*
		//TreeSet
		TreeSet<Generadora> pjTreeSet = new TreeSet<Generadora>();
		
		pjTreeSet.add(new Generadora("Ironman"));
		pjTreeSet.add(new Generadora("Hulk"));
		pjTreeSet.add(new Generadora("Capitán América"));
		pjTreeSet.add(new Generadora("Spiderman"));
		pjTreeSet.add(new Generadora("Dr. Strange"));
		*/
		
		System.out.println("ArrayList:");
		
		for (Generadora generadora : pjArr) {
			System.out.println(generadora.getPersonaje());
			}
        
		System.out.println("");
		System.out.println("LinkedList:");
		
		for (Generadora generadora : pjLinked) {
			System.out.println(generadora.getPersonaje());
			}
		
		System.out.println("");
		System.out.println("HashSet:");
		
		for (Generadora generadora : pjHashS) {
			System.out.println(generadora.getPersonaje());
			}
		
		System.out.println("");
		System.out.println("LinkedHashSet:");
		
		for (Generadora generadora : pjLinkedHash) {
			System.out.println(generadora.getPersonaje());
			}
		
		/*
		System.out.println("");
		System.out.println("TreeSet");
		
		for (Generadora generadora : pjTreeSet) {
			System.out.println(generadora.getPersonaje());
			}
		*/
		
	}
	
}
