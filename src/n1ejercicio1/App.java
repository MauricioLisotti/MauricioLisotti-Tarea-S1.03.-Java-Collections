package n1ejercicio1;
import java.util.*;

/*
 * Ejercicio 1. Crea una clase llamada Month con un atributo "name" 
 * (que almacenará el nombre del mes del año). Añade 11 objetos Month 
 * (cada uno con su atributo diferente) en un Contenedor ArrayList Java,
 *  a excepción del objeto con atributo "Agost". Luego, efectúe la 
 *  inserción en el sitio que corresponde a este mes y demuestre que el 
 *  Contenedor mantiene el orden correcto.
 */

public class App {
	
	public static void main(String[]args) {
				
		ArrayList <Month> meses = new ArrayList<Month>();
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
		
		Month month8 = new Month ("Agosto");
		
		meses.add(7,month8);
	
		
		for (Month month : meses) {
		System.out.println(month.getName());
		}
				
	}

}
