package n1ejercicio4;

public class Derivada implements Comparable <Derivada>{
	
	private String cadena;
	
	public Derivada(String cadena) {
		this.cadena=cadena;
	}
	
	public String toString() {
		return "Derivada [cadena = " +cadena+ "]";
	}
	
	public int compareTo(Derivada o) {
		return this.cadena.compareTo(o.cadena);
	}
}
