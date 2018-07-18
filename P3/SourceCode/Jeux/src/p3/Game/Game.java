package p3.Game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

abstract class Game {

	private int maxHint;
	private int minRange = 0;
	private int maxRange = 0;
	private int elementsNb = 0;
	private int codeListSize = 0;
	private int getrd = 0;
	private String opEntry = null;
	private String code = null;
	protected String pcEntry;
	private String codeToCompare;
	private String opCode = null;
	private String gameAnswer = null;
	protected boolean basisVer;
	private String clues;
	private String chal;
	private String def;
	protected boolean duplicate;

	private int hint = 0;
	private ArrayList<String> codeListWD = new ArrayList<>();
	/** codeListWD = code list containing duplicate in code */
	private ArrayList<String> codeListWOD = new ArrayList<>();
	/** codeListWOD = code list without duplicate in code */
	protected static HashMap<Integer, String> historic = new HashMap<>();

	private Random random = new Random();

	public Game() {
		this.codeToCompare = null;
		this.setMinRange(0);
		this.setMaxRange(9);
		this.setElementsNb(4);
		this.setMaxHint(20);
		pcEntry = "empty";
		this.duplicate = false;
		this.chal = "challenger";
		this.def = "defender";
	}

	public String getChalMode() {
		return chal;
	}

	public String getDefMode() {
		return def;
	}

	public void setVersion(int version) {
		if (version == 1) {
			this.basisVer = true;
		} else
			this.basisVer = false;
	}

	public int getMaxRange() {
		return maxRange;
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

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int maxRange) {
		// isOk = true;
		// while (isOk) {
		System.out.println("Set Min range(min=0 max=8): Fixed for test at 0");
		// maxRange = entry.nextInt();
		// isOk = (maxRange < 1 || maxRange > 9);
		// }
		this.minRange = maxRange;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(int minRange, int maxRange, int elementsNb) {
		String codetoCheck = null;
		Code code = new Code(minRange, maxRange, elementsNb);
		if (this.basisVer == true) {
			do {
				Code basiscode = new Code(minRange, maxRange, elementsNb);
				codetoCheck = basiscode.toString();
				avoidDuplicate(codetoCheck, elementsNb);
			} while (this.duplicate == true);
			this.code = codetoCheck;
		} else {
			this.code = code.toString();
		}

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

	public void setMaxHint(int maxHint) {
		System.out.println("Set maximum hint Fixed at 20 for test");
		this.maxHint = maxHint;
		// maxHint = entry.nextInt();

	}

	public String getOpEntry() {
		return opEntry;
	}

	public void setOpEntry(String entry) {
		if (!(entry.length() == elementsNb))
			throw new RuntimeException("Proposition length has to be equals to the element numbre");
		opEntry = entry.toString();
	}

	public void avoidDuplicate(String string, int elementsNb) {
		HashSet<Character> codeTbl = new HashSet<>();
		for (int i = 0; i < elementsNb; i++) {
			codeTbl.add(string.charAt(i));
		}
		if (codeTbl.size() < elementsNb)
			this.duplicate = true;

		else
			this.duplicate = false;

	}

	public HashMap<Integer, String> getHistoric() {
		historic.forEach((key, value) -> System.out.println("Proposition " + key + value));
		System.out.print("\n");
		return historic;
	}

	public String getGameAnswer() {
		return gameAnswer;
	}

	public void setGameAnswer(int maxHint, String getChalOrDefMode) {

		String codeToCompare = null;
		String code = null;		
		if (!getChalOrDefMode.equalsIgnoreCase(getChalMode()) && !getChalOrDefMode.equalsIgnoreCase(getDefMode())) {
			throw new RuntimeException("only Challenger or Defender expression are permitted");
		}

		if (getChalOrDefMode.equals(getChalMode())) {
			codeToCompare = this.opEntry;
			code = this.code;
			if (codeToCompare.equals(code)) {
				this.gameAnswer = "\n!!!!!CONGRATULATION!!!!! \nYou win ";
			} else if (hint + 1 >= maxHint) {
				this.gameAnswer = "?????Sorry you loose????? \nMaximum hint of " + maxHint + " reached"
						+ "\nThe secret code was : " + code + "\nBelow your proposal summary :";
			} else {
				this.gameAnswer = "\nSorry this is not the secret code " + (maxHint - (hint + 1)) + " hint(s) left\n";
			}
		} else {
			codeToCompare = pcEntry;
			code = opCode;
			if (codeToCompare.equals(code)) {
				this.gameAnswer = "?????Sorry you loose????? \n\nPC has found secret code in " + (hint + 1) + " hint(s)\n";
			} else if (hint + 1 >= maxHint) {
				this.gameAnswer = "\n!!!!!CONGRATULATION!!!!! \nYou win ";
			} else {
				this.gameAnswer = (maxHint - (hint + 1)) + " hint(s) left";
			}
		}
		hint++;
		

	}

	public int getElementsNb() {
		return elementsNb;
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
//-----------------------------------------------------------------------------------------------------------------------
	public ArrayList<String> getCodeList() {
		return codeListWOD;
	}

	public void setCodeList(int elementsNb) {
		int codeListElmt = 0;

		for (int i = 0; i < Math.pow(10, elementsNb); i++) {
			codeListWD.add(String.format("%0" + elementsNb + "d", codeListElmt++));
		}
	}

	public void cleanCodeList(int elementsNb) {

		for (int i = 0; i < codeListWD.size(); i++) {
			HashSet<Character> codelistfilter = new HashSet<>();
			String code = codeListWD.get(i);
			for (int j = 0; j < elementsNb; j++) {
				char codeChar = code.charAt(j);
				codelistfilter.add(codeChar);

			}
			if ((codelistfilter.size() == elementsNb))
				codeListWOD.add(code);

		}
	}

	public String getOpcode() {
		return opCode;
	}

	public void setOpcode(String opcode) {
		opCode = opcode;
	}

	public int getRandom() {
		return getrd;
	}

	public void setRandom(int minValue, int maxValue) {
		this.getrd = random.nextInt(((maxValue - minValue) + 1)) + minValue;

	}

	public int getCodeListSize() {
		return codeListSize;
	}

	public void setCodeListSize(ArrayList<String> codelist) {
		this.codeListSize = codelist.size();
	}

	public String getPcEntry() {
		return pcEntry;
	}

	public void setPcEntry(String str) {
		this.pcEntry = str;
	}

	public String getCodeToCompare() {
		return codeToCompare;
	}

	public void setCodeToCompare(String code) {
		this.codeToCompare = code;
	}

	public void setCluesAnalysis(String clues, String answer, String codeToCompare, ArrayList<String> codeList) {
		if (clues.equals(answer))
			codeList.remove(codeToCompare);

	}

	public String getClues() {
		return clues;
	}

	public void setClues(String clues) {
		this.clues = clues;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public abstract void comparison(String secretcode, String codeToCompare, int elementsNb);

	public abstract void defenderMode(int nbElements);

	public abstract void setHistoric(int key, String getChalOrDefMode);
}
