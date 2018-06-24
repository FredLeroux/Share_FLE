package p3.Game;

import java.util.HashSet;

class CompareMastermind extends Code {

	
	private int nbRightPlaced;
	private int nbPresent;
	private int mmElement;
	private String rightPlacedIndication;
	private String presentIndication;
	private String mmPlrProp;
	private String mmSecretCode;

	private String mastermindAnswer;

	public CompareMastermind() {
		super();
		this.mmElement = 0;
		this.rightPlacedIndication = null;
		this.mastermindAnswer = null;
		this.mmPlrProp = null;
		this.mmSecretCode = null;
	}

	public String getRightPlacedIndication() {
		return this.rightPlacedIndication;
	}

	public String getPresentIndication() {
		return this.presentIndication;
	}

	public void setRightPlacedIndication(String nRightPlacedIndication) {
		this.rightPlacedIndication = nRightPlacedIndication;
	}

	public void setPresentIndication(String nPresentIndication) {
		this.presentIndication = nPresentIndication;
	}

	public void setMmElements(int iMmElements) {
		this.mmElement = iMmElements;
	}

	public void setMmPlrProp(String strMmPlrProp) {
		this.mmPlrProp = strMmPlrProp;
	}

	public void setMmSecretCode(String strSecretCode) {
		this.mmSecretCode = strSecretCode;
	}

	public String getMastermindAnswwer() {

		HashSet<Character> challengerProposal = new HashSet<>();
		HashSet<Character> secretCode = new HashSet<>();

		for (int i = 0; i < this.mmElement; i++) {
			challengerProposal.add(this.mmPlrProp.charAt(i));
			secretCode.add(this.mmSecretCode.charAt(i));
			if (this.mmSecretCode.charAt(i) == this.mmPlrProp.charAt(i)) {
				nbRightPlaced++;
			}
		}
		challengerProposal.retainAll(secretCode);
		nbPresent = challengerProposal.size();
		
		mastermindAnswer = nbRightPlaced + " " + rightPlacedIndication + ", " + nbPresent + " " + presentIndication;
		
		return mastermindAnswer;

	}

}
