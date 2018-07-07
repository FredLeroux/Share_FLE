package p3.Game;

import java.util.HashMap;
import java.util.Scanner;

abstract class Game  {

	private int maxHint;
	private int  maxRange = 0;
	private int elementsNb = 0;
	private String opentry = null;
	private String code = null;
	private Scanner entry = new Scanner(System.in);
	private boolean entryCheck;
	private int hint = 0;
	private HashMap<Integer, String> historic = new HashMap<>();
	
	
	public Game() {
		this.setMaxRange(9);
		this.setElementsNb(4);
		this.setMaxHint(4);
	}
	public String getCode() {
		return this.code;
	}

	public void setCode() {
		Code code = new Code(getMaxRange(),getElementsNb());
		this.code = code.toString();		
	}

	public int getHint() {
		return hint;
	}
	public void setHint(int hint) {
		this.hint = hint;
	}

	public int getMaxHint() {
		return maxHint;
	}

	public String getOpEntry() {
		return opentry;
	}

	

	public HashMap<Integer, String> getHistoric() {
		historic.forEach((key, value) -> System.out.println("Proposition " + key + value));
		System.out.print("\n");
		return historic;
	}
	public void setHistoric(int key, String value) {
		this.historic.put(key, value);

	}

	

	public void setMaxHint(int maxHint) {
		System.out.println("Set maximum hint Fixed at 4 for test");
		this.maxHint = maxHint;
		// maxHint = entry.nextInt();

	}
	

	public void setOpEntry() {
		do {
			System.out.println("Proposal   ");
			opentry = entry.next();
			if (!(opentry.length() == elementsNb)) {
				System.out.println("Enter a proposal length equals to " + elementsNb + " , you have entered a "
						+ opentry.length() + " Length proposal");
				entryCheck = true;
			} else
				entryCheck = false;
		} while (entryCheck);

	}

	
	public void check(int maxHint) {

		if (opentry.equals(code)) {
			System.out.println("\n!!!!!CONGRATULATION!!!!! \nYou win ");

		} else if (hint + 1 >= maxHint) {
			System.out.println("?????Sorry you loose????? \nMaximum hint of " + maxHint + " reached"
					+ "\nThe secret code was : " + code + "\nBelow your proposal summary :");

		} else {
			System.out.println("\nSorry this is not the secret code " + (maxHint - (hint + 1)) + " hint(s) left");

		}
		hint++;

	}
	public int getMaxRange() {
		return maxRange;
	}

	public int getElementsNb() {
		return elementsNb;
	}

	public void setMaxRange(int maxRange) {
		// isOk = true;
		// while (isOk) {
		System.out.println("Set Max range(min=1 max=9): Fixed for test at 9");
		// maxRange = entry.nextInt();
		// isOk = (maxRange < 1 || maxRange > 9);
		// }
		this.maxRange = maxRange;
	}

	public void setElementsNb(int elementsNb) {
		// isOk = true;
		// while (isOk) {
		System.out.println("Set elements number composing code(<= Max Range+1(Max range setted =" + maxRange
				+ ")): Fixed for test at 4");
		// elementsNb = entry.nextInt();
		// isOk = (elementsNb > maxRange + 1);
		// }
		this.elementsNb = elementsNb;
	}
	
	
	

	public abstract void comparison(String secretcode, String codeToCompare);// je prefererais utiliser public abstract
																			// void comparison(String secretcode, String
																			// codeTocompare) pour utiliser la
																			// comparaison en mode defenseur et duel

}
