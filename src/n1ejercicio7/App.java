package n1ejercicio7;
import java.util.*;
import java.util.Map.Entry;
/*
 * Ejercicio 7. Rellene un HashMap con parejas clave-valor. 
 * Ordene las parejas según el código hash e imprima el resultado 
 * (Idea: utilizar un TreeMap). Extraiga las parejas ordenadas 
 * e introdúzcalas en un mapa LinkedHashMap (Idea: utilizar su 
 * constructor). Demuestre que se mantiene el orden de inserción. 
 * Extraiga sólo las claves ordenadas e introdúzcalas primero en 
 * un HashSet y después en un LinkedHashSet. ¿Se mantiene el orden?
 */


public class App {
	public static void main(String[]args) {
		
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
		 
        hash_map.put("A",1);
        hash_map.put("B",2);
        hash_map.put("C",3);
        hash_map.put("D",4);
        hash_map.put("E",5);
        
        System.out.println("Primer HashMap: "+hash_map);

        //
        
        Set<Entry<String,Integer>> listaEntry = hash_map.entrySet();
        
        ArrayList<Map.Entry<String,Integer>> array_list = new  ArrayList<Map.Entry<String,Integer>>();
        array_list.addAll(((Collection<? extends Entry<String, Integer>>) listaEntry));

        System.out.println("ArrayList sin ordenar: "+array_list);
        
        //
        
        Collections.sort(array_list, new Comparator<Map.Entry<String,Integer>>() {
        	public int compare(Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2) {
            return Integer.compare(entry1.getValue(),  entry2.getValue());
        	}
        });
        
        System.out.println("ArrayList ordenado: "+array_list);
        
        //
        
        LinkedHashMap<String,Integer> linked_hash_map = new LinkedHashMap<String,Integer>() ;
        
        for (Map.Entry<String,Integer> entry:array_list) {
            linked_hash_map.put(entry.getKey(),entry.getValue());
        }
        
        System.out.println("LinkedHashMap se mantiene el órden: "+linked_hash_map);

        //
        
     //   HashSet<String, Integer> hash_set = new HashSet<String,Integer>();
        
        
		
		
	}

}
