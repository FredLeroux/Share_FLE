package p3.Game;

import java.util.ArrayList;

public class Mastermind extends Game {

	private int nbRightPlaced;
	private int nbPresent;
	private int clueRightPlaced;
	private int clueElmentPresent;
	private ArrayList<String> codeList;

	public Mastermind() {
		this.nbPresent = 0;
		this.clueRightPlaced = 0;
		this.clueElmentPresent = 0;
		this.codeList = new ArrayList<>();
	}

	public int getNbRightPlaced() {
		return nbRightPlaced;
	}

	public int getNbPresent() {
		return nbPresent;
	}

	public int getClueRightPlaced() {
		return clueRightPlaced;
	}

	public void setClueRightPlaced(int clueRightPlaced) {
		this.clueRightPlaced = clueRightPlaced;
	}

	public int getClueElmentPresent() {
		return clueElmentPresent;
	}

	public void setClueElmentPresent(int clueElmentPresent) {
		this.clueElmentPresent = clueElmentPresent;
	}

	public ArrayList<String> getCodeList() {
		return codeList;
	}

	public void setCodeList(ArrayList<String> codeList) {
		this.codeList = codeList;
	}

	@Override
	public void comparison(String secretCode, String codeToCompare, int elementsNb) {

		ArrayList<Character> codeToCompareTbl = new ArrayList<Character>();
		ArrayList<Character> secretCodeTbl = new ArrayList<Character>();
		this.nbRightPlaced = 0;
		for (int i = 0; i < elementsNb; i++) {
			secretCodeTbl.add(secretCode.charAt(i));
			codeToCompareTbl.add(codeToCompare.charAt(i));
			if (secretCode.charAt(i) == codeToCompare.charAt(i)) {
				this.nbRightPlaced++;
			}
		}
		secretCodeTbl.retainAll(codeToCompareTbl);
		this.nbPresent = Math.abs(secretCodeTbl.size() - nbRightPlaced);
	}

	@Override
	public void setHistoric(int getHint, String getChalOrDefMode) {
		historic.put(getHint, " : " + getOpEntry() + " // clues are " + this.nbRightPlaced
				+ " element(s) rigth placed, " + this.nbPresent + " element(s) present");

	}

	@Override
	public void defenderMode(int nbElements) {
		int codeListSize = codeList.size();
		if (codeList.isEmpty()) {
			String code = null;
			int codeListElmt = 0;
			for (int i = 0; i < Math.pow(10, nbElements); i++) {
				code = String.format("%0" + nbElements + "d", codeListElmt++);
				if (basisVer == true) {
					avoidDuplicate(code, nbElements);
					if (duplicate == true)
						continue;
					else
						codeList.add(code);
				} else
					codeList.add(code);
			}
		}

		if (getPcEntry().equals("empty")) {
			setPcEntry(codeList.get(getRandom()));
		} else {

			String codeToCompare = null;
			if (getClueRightPlaced() == 0 && getClueElmentPresent() == 0) {
				for (int i = 0; i < codeList.size(); i++) {
					codeToCompare = codeList.get(i);
					comparison(getPcEntry(), codeToCompare, nbElements);
					if ((getClueRightPlaced() > 0) || (getClueElmentPresent() > 0)) {
						codeList.remove(codeToCompare);
					}
				}
			}

			else if (!(getClueRightPlaced() == nbElements) && !(getClueElmentPresent() == nbElements)) {

				for (int i = 0; i < codeList.size(); i++) {
					codeToCompare = codeList.get(i);
					comparison(getPcEntry(), codeToCompare, nbElements);
					if (!((getClueRightPlaced() == nbRightPlaced) && (getClueElmentPresent() == nbPresent))) {
						codeList.remove(codeToCompare);
					} else
						continue;
				}
			}

		}
		codeList.remove(getPcEntry());
		codeListSize = codeList.size();
		setRandom(0, codeListSize - 1);// causse a codeliste size at 0 is an empty codelist and not a codelits with 1
										// elment so to avoid bug -1 //to be clear a codelist with 1 string have a size of
										// 1 so random can be 1 but with a size of 1 the first element is at the entry
										// zero so if random is 1 we will ask for codelist.get(1) but doesn't exist the
										// first place is 0 so whith -1 we will never have issue again
		System.out.println("random number fo get in list = : " + getRandom());
		System.out.println(codeList.toString());
		setPcEntry(codeList.get(getRandom()));
	}

}
