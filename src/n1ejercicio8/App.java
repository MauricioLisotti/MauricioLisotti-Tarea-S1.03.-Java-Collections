package n1ejercicio8;
import java.util.*;
import java.util.Map.Entry;
/*
 * Ejercicio 8. Rellena un mapa LinkedHashMap con claves de tipo 
 * String y objetos del tipo que prefiera. Extraiga las parejas, 
 * ordénelas según las claves (en orden alfabético) y vuelva a 
 * insertarlas en el mapa. Idea: Utiliza un ArrayList para realizar 
 * la ordenación con la clase Comparator.  
 */

public class App {
	public static void main(String[]args) {
		
		LinkedHashMap <String, Cliente> listaClientes = new LinkedHashMap <String, Cliente>();
		
		listaClientes.put("uno", new Cliente ("Mauricio","Lisotti"));
		listaClientes.put("dos", new Cliente ("Carlos","Perez"));
		listaClientes.put("tres", new Cliente ("Julio","Suarez"));
		listaClientes.put("cuatro", new Cliente ("Pepe","Fernandez"));
		
		System.out.println("LinkedHashMap primero: "+listaClientes);
	
		Set<Entry<String,Cliente>> listaSet = listaClientes.entrySet();
		
		ArrayList<Map.Entry<String,Cliente>> listaArrayList = new ArrayList<Map.Entry<String,Cliente>>(listaSet);
		
		System.out.println("ArrayList:"+listaArrayList);
		
		Collections.sort(listaArrayList, new Comparator<Map.Entry<String, Cliente>>(){
			public int compare(Map.Entry<String,Cliente> entry1, Map.Entry<String, Cliente> entry2) {
				return entry1.getKey().compareTo(entry2.getKey());
			}
		});
		
		System.out.println("ArrayList ordenado: "+listaArrayList);
		
		
		LinkedHashMap<String,Cliente> linkedHashMap = new LinkedHashMap<String,Cliente>();
		
		for (Map.Entry<String,Cliente> entry : listaArrayList) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("LinkedHashMap"+linkedHashMap);
		
		
		
		
	
	}
	
}
