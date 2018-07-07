package p3.Game;

import java.util.HashSet;

public class Mastermind extends Game {

	private int nbRightPlaced;
	private int nbPresent = 0;
	private int answerTable[];
	private String answer;

	private HashSet<Character> codeToCompareTbl;
	private HashSet<Character> secretCodeTbl;

	public Mastermind() {
		this.nbRightPlaced = 0;
		this.nbPresent = 0;
		this.answerTable = new int[2];
		this.codeToCompareTbl = new HashSet<>();
		this.secretCodeTbl = new HashSet<>();
	}

	public int getNbRightPlaced() {
		return nbRightPlaced;
	}

	public void setNbRightPlaced(int nbRightPlaced) {
		this.nbRightPlaced = nbRightPlaced;
	}

	public HashSet<Character> getCodeToCompareTbl() {
		return codeToCompareTbl;
	}

	public void setCodeToCompareTbl(String codeToCompare) {
		for (int i = 0; i < codeToCompare.length(); i++) {
			codeToCompareTbl.add(codeToCompare.charAt(i));
		}
	}

	public HashSet<Character> getSecretCodeTbl() {
		return secretCodeTbl;
	}

	public void setSecretCodeTbl(String secretCode) {
		for (int i = 0; i < secretCode.length(); i++) {
			secretCodeTbl.add(secretCode.charAt(i));
		}
	}

	public int[] getAnswerTable() {
		return answerTable;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public void comparison(String secretcode, String codeToCompare) {
		this.nbRightPlaced = 0;
		for (int i = 0; i < secretcode.length(); i++) {
			if (secretcode.charAt(i) == codeToCompare.charAt(i)) {
				nbRightPlaced++;
			}

		}
		codeToCompareTbl.retainAll(secretCodeTbl);
		nbPresent = codeToCompareTbl.size();
		answerTable[0] = nbRightPlaced;
		answerTable[1] = nbPresent;

	}
}
