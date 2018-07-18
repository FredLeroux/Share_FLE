package p3.Game;

import java.util.ArrayList;

class MoreLess extends Game {

	private char moreIndication;
	private char lessIndication;
	private char equalsIndication;
	private char moreLessAnswerElmt;
	private StringBuilder moreLessAnswer;
	private ArrayList<Character> answertable;

	public MoreLess() {

		this.moreIndication = '+';
		this.lessIndication = '-';
		this.equalsIndication = '=';
		this.moreLessAnswerElmt = 0;

	}

	public String answerToString() {
		return moreLessAnswer.toString();
	}

	public ArrayList<Character> getAnswertable() {
		return this.answertable;
	}

	@Override
	/**
	 * @param Code
	 *            define the secret code to find generate by PC or by the Operator
	 * @param codeTocompare
	 *            define the code to compare generate by PC or by the Operator;
	 */
	public void comparison(String code, String codeTocompare, int elementsNb) {
		/** equivalent to setAnswertable */
		answertable = new ArrayList<>();
		this.moreLessAnswer = new StringBuilder();
		for (int i = 0; i < elementsNb; i++) {

			if (code.charAt(i) == codeTocompare.charAt(i)) {
				this.moreLessAnswerElmt = this.equalsIndication;
			}
			if (code.charAt(i) < codeTocompare.charAt(i)) {
				this.moreLessAnswerElmt = this.lessIndication;
			}
			if (code.charAt(i) > codeTocompare.charAt(i)) {
				this.moreLessAnswerElmt = this.moreIndication;
			}
			this.answertable.add(this.moreLessAnswerElmt);
		}
		this.answertable.forEach(Elmt -> moreLessAnswer.append(Elmt));

	}

	@Override
	public void setHistoric(int getHint, String getChalOrDefMode) {
		String code;
		String answer;
		if (getChalOrDefMode.equals(getChalMode())) {
			code = getOpEntry();
			answer = answerToString();
		} else {
			code = getPcEntry();
			answer = getClues();
		}
		historic.put(getHint, " : " + code + " // clues are " + answer);
	}

	@Override
	public void defenderMode(int nbElements) {

		int minRange = 0;
		int maxRange = 0;
		int middle = (getMaxRange() / 2);
		int pcEntryElmt = 0;

		StringBuilder pcEntrySb = new StringBuilder();

		if (getPcEntry().equals("empty")) {
			for (int i = 0; i < nbElements; i++) {
				pcEntrySb.append(middle);
			}
		}

		else {
			for (int i = 0; i < nbElements; i++) {

				if (getClues().charAt(i) == '=')
					pcEntrySb.append(getPcEntry().charAt(i));

				else if (Character.getNumericValue(getPcEntry().charAt(i)) == middle) {
					if (getClues().charAt(i) == '-')
						pcEntryElmt = middle - ((middle + 1 - getMinRange()) / 2);

					else
						pcEntryElmt = ((getMaxRange() + 1 - middle) / 2) + middle;

					pcEntrySb.append(pcEntryElmt);
				}

				else if (Character.getNumericValue(getPcEntry().charAt(i)) > middle) {
					if (getClues().charAt(i) == '-') {
						minRange = middle;
						maxRange = Character.getNumericValue(getPcEntry().charAt(i)) + 1;
						pcEntryElmt = ((maxRange - minRange) / 2) + minRange;
					} else {
						minRange = Character.getNumericValue(getPcEntry().charAt(i));
						maxRange = getMaxRange() + 1;
						pcEntryElmt = ((maxRange - minRange) / 2) + minRange;
					}
					pcEntrySb.append(pcEntryElmt);

				}

				else if (Character.getNumericValue(getPcEntry().charAt(i)) < middle) {
					if (getClues().charAt(i) == '-') {						
						minRange = getMinRange() ;
						maxRange = Character.getNumericValue(getPcEntry().charAt(i));
						pcEntryElmt =  maxRange/ 2 ;						
					}

					else {
						minRange = Character.getNumericValue(getPcEntry().charAt(i));
						maxRange = middle + 1;
						pcEntryElmt = ((maxRange - minRange) / 2) + minRange;
					}					
					pcEntrySb.append(pcEntryElmt);
				}

			}

		}
		setPcEntry(pcEntrySb.toString());

	}
		}
