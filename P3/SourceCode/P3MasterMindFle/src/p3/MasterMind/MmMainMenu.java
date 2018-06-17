package p3.MasterMind;

import java.util.HashMap;

class MmMainMenu extends MmAppHead {
	protected static HashMap<Integer, String> hmMainMenuOptions = new HashMap<Integer, String>();
	private MmMenuElements mmMainMenuOptions = new MmMenuElements();

	public MmMainMenu() {
		MmMenuElements mmMainMenuTitle = new MmMenuElements();
		mmMainMenuTitle.setTitle(MmTerms.term19 + MmTerms.term4 + " " + MmTerms.term14 + MmTerms.term20);
		mmMainMenuTitle.getHeadTable().add(mmMainMenuTitle.getTitle());
		for (int i = 0; i < mmMainMenuTitle.getHeadTable().size(); i++) {
			System.out.println(mmMainMenuTitle.getHeadTable().get(i));
		}
		System.out.print("\n");

		mmMainMenuOptions.setElement1(MmTerms.term5 + " " + MmTerms.term15);
		mmMainMenuOptions.setElement2(MmTerms.term6 + " " + MmTerms.term15);
		mmMainMenuOptions.setElement3(MmTerms.term7 + " " + MmTerms.term16);
		mmMainMenuOptions.setElement4(MmTerms.term8);
		mmMainMenuOptions.setElement5(MmTerms.term9);
		mmMainMenuOptions.setElement6(MmTerms.term10);
		mmMainMenuOptions.getOptionsTable().put(MmMenuElements.option1, mmMainMenuOptions.getElement1());
		mmMainMenuOptions.getOptionsTable().put(MmMenuElements.option2, mmMainMenuOptions.getElement2());
		mmMainMenuOptions.getOptionsTable().put(MmMenuElements.option3, mmMainMenuOptions.getElement3());
		mmMainMenuOptions.getOptionsTable().put(MmMenuElements.option4, mmMainMenuOptions.getElement4());
		mmMainMenuOptions.getOptionsTable().put(MmMenuElements.option5, mmMainMenuOptions.getElement5());
		mmMainMenuOptions.getOptionsTable().put(MmMenuElements.option6, mmMainMenuOptions.getElement6());
		for (int i = 1; i <= mmMainMenuOptions.getOptionsTable().size(); i++) {
			System.out.println(i + ": " + mmMainMenuOptions.getOptionsTable().get(i));
		}
		System.out.print("\n");
		MmMainMenu.hmMainMenuOptions = mmMainMenuOptions.getOptionsTable();
		new MmOperatorChoice();
		new MmOpChoiceAnalysis();
	}

}
