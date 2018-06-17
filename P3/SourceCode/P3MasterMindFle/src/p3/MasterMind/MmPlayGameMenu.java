package p3.MasterMind;

import java.util.HashMap;

class MmPlayGameMenu extends MmAppHead {

	protected static HashMap<Integer, String> hmPlayGameMenuOptions = new HashMap<Integer, String>();
	private MmMenuElements mmPlayGameMenuOptions = new MmMenuElements();
	private MmMenuElements mmMenuTitle2 = new MmMenuElements();

	public MmPlayGameMenu() {

		mmMenuTitle2.setTitle(MmGameMenu.mmGameMenuTitle);
		mmMenuTitle2.setSubTitle(MmTerms.term19 + MmOpChoiceAnalysis.choiceAquisition + MmTerms.term20);
		mmMenuTitle2.getHeadTable().add(mmMenuTitle2.getTitle());
		mmMenuTitle2.getHeadTable().add(mmMenuTitle2.getSubTitle());
		for (int i = 0; i < mmMenuTitle2.getHeadTable().size(); i++) {
			System.out.println(mmMenuTitle2.getHeadTable().get(i));
		}
		System.out.print("\n");

		mmPlayGameMenuOptions.setElement1(MmTerms.term17);
		mmPlayGameMenuOptions.setElement2(MmTerms.term4 + " " + MmTerms.term14);
		mmPlayGameMenuOptions.setElement3(MmTerms.term10);
		mmPlayGameMenuOptions.getOptionsTable().put(MmMenuElements.option1, mmPlayGameMenuOptions.getElement1());
		mmPlayGameMenuOptions.getOptionsTable().put(MmMenuElements.option2, mmPlayGameMenuOptions.getElement2());
		mmPlayGameMenuOptions.getOptionsTable().put(MmMenuElements.option3, mmPlayGameMenuOptions.getElement3());

		for (int i = 1; i <= mmPlayGameMenuOptions.getOptionsTable().size(); i++) {
			System.out.println(i + ": " + mmPlayGameMenuOptions.getOptionsTable().get(i));
		}
		System.out.print("\n");
		MmMainMenu.hmMainMenuOptions = mmPlayGameMenuOptions.getOptionsTable();
		new MmOperatorChoice();
		new MmOpChoiceAnalysis();
	}
}
