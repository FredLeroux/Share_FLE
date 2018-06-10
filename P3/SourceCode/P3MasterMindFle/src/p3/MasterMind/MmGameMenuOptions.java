package p3.MasterMind;

import java.util.HashMap;

public class MmGameMenuOptions {
	protected static HashMap<Integer, String> gameMenuOptions = new HashMap<Integer, String>();

	public HashMap<Integer, String> getGameMenuOptions(){
		return gameMenuOptions;
	}
	
	
	public MmGameMenuOptions() {

		gameMenuOptions.put(1, ": Play Challenger mode");
		gameMenuOptions.put(2, ": Play Défenseur Mode");
		gameMenuOptions.put(3, ": Play Duel Mode");
		gameMenuOptions.put(4, ": Rules");
		gameMenuOptions.put(5, ": Back to Main Menu");
		gameMenuOptions.put(6, ": Quit");
		
		

		}
		
	}

