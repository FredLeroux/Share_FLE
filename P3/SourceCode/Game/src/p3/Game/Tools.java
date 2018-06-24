package p3.Game;

import java.util.ArrayList;

public class Tools {
	
	private int hint;
	private int maxHint;
	private String plrProp;
	private String secretCode;
	private String lastHint;
	private ArrayList<String> historic;
	
	

	public Tools() {
		this.hint =0;
		this.maxHint = 0;
		this.plrProp = null;
		this.secretCode = null;
		this.lastHint = null;
		this.historic = new ArrayList<>();
				
	}

	public void setHint(int iHint) {
		this.hint = iHint;
	}
	
	public void setMaxHint(int iMaxHint) {
		this.maxHint = iMaxHint;
	}
	public void setPlrProp(String strPlrProp) {
		this.plrProp = strPlrProp;
	}
	public void setSecretCode(String strSecretCode) {
		this.secretCode = strSecretCode;
	}
	public void setLastHint(String strLastHint) {
		this.lastHint = strLastHint;
	}
	
	
	public void getLooseByHint() {
		if (hint + 1 > maxHint) {
			System.out.println("Sorry you loose, maximum hint of " + maxHint + " reached");
			System.out.println("The secret code was : " + secretCode);
			System.exit(1);}
		
	}
	public void getCheckIfWin() {
		if (plrProp.equals(secretCode)) {
			System.out.println("congratulation you win");
			System.exit(1);}
	}
	public ArrayList<String> getHistoric() {

		historic.add(lastHint);
		historic.forEach(hint -> System.out.println(hint));
		return historic;
	}
	
}

	
