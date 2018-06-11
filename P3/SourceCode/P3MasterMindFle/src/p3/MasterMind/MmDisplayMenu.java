package p3.MasterMind;

class MmDisplayMenu extends MmMenuHeadDisplay {

	public MmDisplayMenu() {
		super();
		if (MmMenuHead.title.contains("Main"))
			new MmMainMenuOptionsDisplay();
		else if (MmMenuHead.title.contains("Challenger"))
			new MmPlayGameMenuOptionsDisplay();
		else if (MmMenuHead.title.contains("Game"))
			new MmGameMenuOptionsDisplay();
		else {
			new MmMenuHead("Main Menu");
			new MmDisplayMenu();
		}

	}

}
