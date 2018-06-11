package p3.MasterMind;

 public class MmPlayGameHead  {

	public MmPlayGameHead() {
		
		
		
		MmGameMenuOptions displayTitle = new MmGameMenuOptions();
		if (displayTitle.getGameMenuOptions().get(MmOperatorChoice.choice).contains("Challenger"))
		{
		new MmMenuHead(MmGameMainMenuHead.gamePlayed+"\n"+displayTitle.getGameMenuOptions().get(MmOperatorChoice.choice));}
		else
			new MmMenuHead(displayTitle.getGameMenuOptions().get(MmOperatorChoice.choice) + " Not yet Implemented");
	}

	
	}


