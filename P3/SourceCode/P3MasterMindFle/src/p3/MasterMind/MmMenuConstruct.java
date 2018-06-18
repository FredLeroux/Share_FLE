package p3.MasterMind;

public class MmMenuConstruct {
	private MmMenuElements welcomeConstruct = new MmMenuElements();
	private MmMenuElements mainMenuConstruct = new MmMenuElements();
	private MmMenuElements gameMenuConstruct = new MmMenuElements();
	private MmMenuElements playMenuConstruct = new MmMenuElements();
	protected static String menuChoiceAquisition, titleSetted;

	public MmMenuConstruct() {

		menuChoiceAquisition = null;
		titleSetted = null;

		if (MmMenuElements.choice == 0) {
			welcomeConstruct.dappHead();
			welcomeConstruct.setTitle(MmTerms.term22);
			welcomeConstruct.dMenuTitle();
			welcomeConstruct.dAppWelcomeScreen();
			welcomeConstruct.display();
			welcomeConstruct.askChoice();
			titleSetted = welcomeConstruct.getTitle().toString();
			menuChoiceAquisition = welcomeConstruct.dAppWelcomeScreen().get(MmMenuElements.choice).toString();
			welcomeConstruct.loop();

		} else if (MmMenuElements.choiceAquisition.contains("Start")
				|| MmMenuElements.choiceAquisition.contains("Main")) {
			mainMenuConstruct.dappHead();
			mainMenuConstruct.setTitle(MmTerms.term19 + MmTerms.term4 + " " + MmTerms.term14 + MmTerms.term20);
			mainMenuConstruct.dMenuTitle();
			mainMenuConstruct.dMainMenuOpt();
			mainMenuConstruct.display();
			mainMenuConstruct.askChoice();
			titleSetted = mainMenuConstruct.getTitle().toString();
			menuChoiceAquisition = mainMenuConstruct.dMainMenuOpt().get(MmMenuElements.choice).toString();
			welcomeConstruct.loop();

		} else if (MmMenuElements.choiceAquisition.contains(MmTerms.term15)
				&& MmMenuElements.titleSet.contains(MmTerms.term4)) {
			gameMenuConstruct.dappHead();
			gameMenuConstruct.setTitle(MmTerms.term19 + MmMenuElements.choiceAquisition + MmTerms.term20);
			gameMenuConstruct.dMenuTitle();
			gameMenuConstruct.dGameMenuOpt();
			gameMenuConstruct.display();
			gameMenuConstruct.askChoice();
			titleSetted = gameMenuConstruct.getTitle().toString();
			menuChoiceAquisition = gameMenuConstruct.dGameMenuOpt().get(MmMenuElements.choice).toString();
			gameMenuConstruct.loop();
		}

		else if (MmMenuElements.choiceAquisition.contains(MmTerms.term17)
				&& MmMenuElements.titleSet.contains(MmTerms.term15)) {

			playMenuConstruct.dappHead();
			playMenuConstruct.setTitle(MmMenuElements.titleSet);
			playMenuConstruct.setSubTitle(MmTerms.term19 + MmMenuElements.choiceAquisition + MmTerms.term20);
			playMenuConstruct.dMenuTitle();
			playMenuConstruct.dMenuSubTitle();
			playMenuConstruct.dPlayGameMenu();
			playMenuConstruct.display();
			playMenuConstruct.askChoice();
			menuChoiceAquisition = playMenuConstruct.dPlayGameMenu().get(MmMenuElements.choice).toString();
			System.out.println(menuChoiceAquisition);
			playMenuConstruct.loop();
		}

		else {
			welcomeConstruct.dappHead();
			System.out.println(MmTerms.term23);
			System.exit(1);
		}

	}

}
