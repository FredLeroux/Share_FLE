package p3.MasterMind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class test {
	private String title, subTitle;
	protected static String choiceAquisition, titleSet;
	protected static int choice;
	private ArrayList<String> menuTitle, menuSubtitle;
	private HashMap<Integer, String> appWelcomeScreenOpt, mainMenuOpt, gameMenuOpt, playMenuOpt, optionsTable;
	private Scanner choiceEntry = new Scanner(System.in);

	public test() {
		this.title = null;
		this.subTitle = null;
		// test.choiceAquisition=null;
		// test.titleSet=null;

		this.menuTitle = new ArrayList<String>();
		this.menuSubtitle = new ArrayList<String>();
		this.appWelcomeScreenOpt = new HashMap<Integer, String>();
		this.mainMenuOpt = new HashMap<Integer, String>();
		this.gameMenuOpt = new HashMap<Integer, String>();
		this.playMenuOpt = new HashMap<Integer, String>();
		this.optionsTable = new HashMap<Integer, String>();

	}

	public String getTitle() {
		return this.title;
	}

	public String getSubTitle() {
		return this.subTitle;
	}

	public void setTitle(String nTitle) {
		this.title = nTitle;
	}

	public void setSubTitle(String nSubTitle) {
		this.subTitle = nSubTitle;
	}

	public ArrayList<String> dMenuTitle() {
		menuTitle.add(this.title + "\n");
		menuTitle.forEach(title -> System.out.println(title));
		return this.menuTitle;
	}

	public ArrayList<String> dMenuSubTitle() {
		menuSubtitle.add(this.subTitle + "\n");
		menuSubtitle.forEach(subTitle -> System.out.println(subTitle));
		return this.menuSubtitle;
	}

	public HashMap<Integer, String> dAppWelcomeScreen() {
		appWelcomeScreenOpt.put(1, "Start");
		appWelcomeScreenOpt.put(2, "Quit" + "\n");
		optionsTable = appWelcomeScreenOpt;
		return this.appWelcomeScreenOpt;
	}

	public HashMap<Integer, String> dMainMenuOpt() {
		mainMenuOpt.put(1, MmTerms.term5 + " " + MmTerms.term15);
		mainMenuOpt.put(2, MmTerms.term6 + " " + MmTerms.term15);
		mainMenuOpt.put(3, MmTerms.term7 + " " + MmTerms.term16);
		mainMenuOpt.put(4, MmTerms.term8);
		mainMenuOpt.put(5, MmTerms.term9);
		mainMenuOpt.put(6, MmTerms.term10 + "\n");
		optionsTable = mainMenuOpt;
		return this.mainMenuOpt;
	}

	public HashMap<Integer, String> dGameMenuOpt() {
		gameMenuOpt.put(1, MmTerms.term17 + " " + MmTerms.term11 + " " + MmTerms.term16);
		gameMenuOpt.put(2, MmTerms.term17 + " " + MmTerms.term12 + " " + MmTerms.term16);
		gameMenuOpt.put(3, MmTerms.term17 + " " + MmTerms.term13 + " " + MmTerms.term16);
		gameMenuOpt.put(4, MmTerms.term8);
		gameMenuOpt.put(5, MmTerms.term4 + " " + MmTerms.term14);
		gameMenuOpt.put(6, MmTerms.term10 + "\n");
		optionsTable = gameMenuOpt;
		return this.gameMenuOpt;
	}

	public HashMap<Integer, String> dPlayGameMenu() {
		playMenuOpt.put(1, MmTerms.term17);
		playMenuOpt.put(2, "Main Menu");
		playMenuOpt.put(3, MmTerms.term10 + "\n");
		optionsTable = playMenuOpt;
		return this.playMenuOpt;
	}

	public void display() {
		optionsTable.forEach((key, value) -> System.out.println(key + ": " + value));
	}

	public void askChoice() {
		System.out.println("Please enter your choice");
		test.choice = choiceEntry.nextInt();

	}

	public void loop() {
		test.choiceAquisition = testsuiteamettreddasnmain.menuChoiceAquisition;
		test.titleSet = testsuiteamettreddasnmain.titleSetted;
		new testsuiteamettreddasnmain();
	}

}
