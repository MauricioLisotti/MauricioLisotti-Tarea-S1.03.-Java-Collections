package n1ejercicio2;
import java.util.*;

/* Ejercicio 2. Asegúrese de que si convertimos el Contenedor 
 * utilizado en el punto anterior a un Contenedor HashSet, 
 * éste no permite duplicados. Verifícalo.
 */

public class App {
	
	public static void main(String[]args) {
				
	//	ArrayList <Month> meses = new ArrayList<Month>();
		
		HashSet<Month> meses = new HashSet<Month>();

		meses.add(new Month("Enero"));
		meses.add(new Month("Febrero"));
		meses.add(new Month("Marzo"));
		meses.add(new Month("Abril"));
		meses.add(new Month("Mayo"));
		meses.add(new Month("Junio"));
		meses.add(new Month("Julio"));
		meses.add(new Month("Septiembre"));
		meses.add(new Month("Octubre"));
		meses.add(new Month("Noviembre"));
		meses.add(new Month("Diciembre"));
		
		meses.add(new Month("Agosto"));
	
		
		// TERMINAR!!!!!!!
		
		
		for (Month month : meses) {
		System.out.println(month.getName());
		}
				
	}

}
