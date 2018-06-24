package p3.Game;

 class CompareMoreLess extends Code{
	
	private  char moreIndication;
	private  char lessIndication;
	private  char equalsIndication;
	private char moreLessAnswerChar;
	private int moreLessLength;
	private String moreLessPlrProp;
	private String moreLessSecretCode;
	private final StringBuilder moreLessAnswer;
	

	public CompareMoreLess() {
		super();
		this.moreIndication = 0;
		this.lessIndication = 0;
		this.equalsIndication = 0;
		this.moreLessLength =0;
		this.moreLessAnswer = new StringBuilder();
		
	}
	// TODO check getter utility 
	public char getMoreIndication() {
		return this.moreIndication;
	}
	
	public char getLessIndication() {
		return this.lessIndication;
	}

	public char getEqualsIndication() {
		return this.equalsIndication;
	}
	
	public void setMoreIndication(char nMoreIndication) {
		this.moreIndication=nMoreIndication;
	}
	
	public void setLessIndication(char nLessIndication) {
		this.lessIndication=nLessIndication;
	}
	public void setEqualsIndication(char nEqualsIndication) {
		this.equalsIndication=nEqualsIndication;
	}
	public void setMoreLessLength(int iMoreLessLength) {
		this.moreLessLength = iMoreLessLength;
	}
	public void setMoreLessPlrProp(String strMoreLessPlrProp) {
		this.moreLessPlrProp = strMoreLessPlrProp;
	}
	public void setMoreLessSecretCode(String strMoreLessSecretCode) {
		this.moreLessSecretCode = strMoreLessSecretCode;
	}
	
	
	public String getMoreLessAnswer() {
		if (!((moreLessSecretCode.length()) == moreLessPlrProp.length()) ) {
			throw new RuntimeException("Proposal size can not be different than code size.");
		}
		
		for(int i = 0; i<moreLessLength;i++) {
			if(moreLessPlrProp.charAt(i)== moreLessSecretCode.charAt(i))  {
				moreLessAnswerChar = equalsIndication;
			}
			if(moreLessSecretCode.charAt(i) < moreLessPlrProp.charAt(i)) {
				moreLessAnswerChar = lessIndication;
			}
			if(moreLessSecretCode.charAt(i) > moreLessPlrProp.charAt(i)) {
				moreLessAnswerChar = moreIndication;
			}
			moreLessAnswer.append(moreLessAnswerChar);
			
		}
		return moreLessAnswer.toString();
		
	}
	
	
	
}
