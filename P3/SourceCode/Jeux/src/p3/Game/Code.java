package p3.Game;

import java.util.LinkedHashSet;
import java.util.Random;


public class Code extends LinkedHashSet<Integer> {

	
	private int getInt = 0;
	private final StringBuilder CODE = new StringBuilder();
	private final Random RANDOM = new Random();
	
	
	public Code(int maxRange, int elementsNb) {
		while (this.size() < elementsNb) {
			getInt = RANDOM.nextInt(maxRange + 1);//
			this.add(getInt);
		}
		this.forEach(nb -> CODE.append(nb));
		
	}
	
	public String toString() {
		return CODE.toString();
	}
	
	
	
}
