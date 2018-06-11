package p3.MasterMind;

public class MmGameMainMenuHead  {
	protected static String gamePlayed;
	
	public MmGameMainMenuHead () {
		MmMainMenuOptions displayTitle = new MmMainMenuOptions();
		new MmMenuHead(displayTitle.getMainMenuOptions().get(MmOperatorChoice.choice));
		MmGameMainMenuHead.gamePlayed=displayTitle.getMainMenuOptions().get(MmOperatorChoice.choice);		
	}}


