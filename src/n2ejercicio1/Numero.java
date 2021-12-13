package n2ejercicio1;

import java.util.Random;

public class Numero<Integer> implements Comparable<Integer> {
	
	Random claseRandom = new Random();
	int num = claseRandom.nextInt(100);
	
	
	public Numero() {
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "Numero [numero=" + num+"]";
	}
	
	public int compareTo(Integer o) {
		return 0;
	}

}
