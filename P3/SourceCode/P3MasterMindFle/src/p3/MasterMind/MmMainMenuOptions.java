package p3.MasterMind;

import java.util.HashMap;

public class MmMainMenuOptions {

	protected static HashMap<Integer, String> mainMenuOptions = new HashMap<Integer, String>();
	
	public HashMap<Integer, String> getMainMenuOptions(){
		return mainMenuOptions;
	}

	public MmMainMenuOptions() {

		mainMenuOptions.put(1, "Recherche +/- Game");
		mainMenuOptions.put(2, "MasterMind Game");
		mainMenuOptions.put(3, "Developement Mode");
		mainMenuOptions.put(4, "Rules");
		mainMenuOptions.put(5, "Configuration");
		mainMenuOptions.put(6, "Quit");
		

	}

}
