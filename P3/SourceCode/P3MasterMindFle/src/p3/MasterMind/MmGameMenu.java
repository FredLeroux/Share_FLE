package p3.MasterMind;

import java.util.HashMap;

class MmGameMenu extends MmAppHead {
	protected static HashMap<Integer, String> hmGameMenuOptions = new HashMap<Integer, String>();
	protected static String mmGameMenuTitle;
	private MmMenuElements mmGameMenuOptions = new MmMenuElements();
	private MmMenuElements mmMenuTitle = new MmMenuElements();

	public MmGameMenu() {

		mmMenuTitle.setTitle(MmTerms.term19 + MmOpChoiceAnalysis.choiceAquisition + MmTerms.term20 );
		mmMenuTitle.getHeadTable().add(mmMenuTitle.getTitle()+"\n");
		mmMenuTitle.getHeadTable().forEach(title-> System.out.println(title));
		
		mmGameMenuOptions.getOptionsTable().put(1, MmTerms.term17 + " " + MmTerms.term11+ " "+ MmTerms.term16);
		mmGameMenuOptions.getOptionsTable().put(2, MmTerms.term17 + " " + MmTerms.term12+ " "+ MmTerms.term16);
		mmGameMenuOptions.getOptionsTable().put(3, MmTerms.term17 + " " + MmTerms.term13+ " "+ MmTerms.term16);
		mmGameMenuOptions.getOptionsTable().put(4, MmTerms.term8);
		mmGameMenuOptions.getOptionsTable().put(5, MmTerms.term4 + "" + MmTerms.term14);
		mmGameMenuOptions.getOptionsTable().put(6, MmTerms.term10+"\n");
		mmGameMenuOptions.getOptionsTable().forEach((key,value)-> System.out.println(key + " :" + value));
		
		MmGameMenu.hmGameMenuOptions = mmGameMenuOptions.getOptionsTable();
		MmGameMenu.mmGameMenuTitle = mmMenuTitle.getTitle();
		new MmOperatorChoice();
		new MmOpChoiceAnalysis();
	}
}
