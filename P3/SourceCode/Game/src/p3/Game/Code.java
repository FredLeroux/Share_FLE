package p3.Game;

import java.util.ArrayList;
import java.util.Random;

public class Code {

	protected static String code = null;
	private int codeMaxRange;
	private  int codeNbElements;
	private int element;
	private int gElement;
	private final StringBuilder pcCode;
	private final Random random;

	public Code() {

		this.codeMaxRange = 0;
		this.codeNbElements = 0;
		this.element = 0;
		this.gElement = 0;
		this.pcCode = new StringBuilder();
		this.random = new Random();
	}
	
	public void setCodeMaxRange(int iCodeMAsrange) {
		this.codeMaxRange = iCodeMAsrange;
	}
	public void setCodeNbElements (int iCodeNbElements) {
		this.codeNbElements =iCodeNbElements;
	}

	public String generateRandomNb() {
		/*if (codeMaxRange< 1 || codeMaxRange > 10) {
			throw new RuntimeException("Digit maximum range have to be between 1 and 10");
		}
		if (codeNbElements < 1 || codeNbElements > codeMaxRange) {
			throw new RuntimeException("Elements number to use have to be between 1 and digit maximum range");
		}*/

		ArrayList<Integer> sRange = new ArrayList<>();
		for (int i = 0; i < this.codeMaxRange; i++)
			sRange.add(i);
		for (int i = 0; i < this.codeNbElements; i++) {
			gElement = random.nextInt(sRange.size());
			element = sRange.get(gElement);
			pcCode.append(element);
			sRange.remove(gElement);
		}
		code = pcCode.toString();
		return code;
	}

	
	
	
}
