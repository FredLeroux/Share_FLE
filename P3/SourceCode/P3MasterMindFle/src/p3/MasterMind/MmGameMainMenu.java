package p3.MasterMind;

public class MmGameMainMenu  {
	
	public MmGameMainMenu () {
		MmMainMenuOptions displayTitle = new MmMainMenuOptions();
		new MmMenuHead(displayTitle.getMainMenuOptions().get(MmMain.choice));
		new MmMenuHeadDisplay();
		new MmGameMenuOptionsDisplay();
		
		
	}}


