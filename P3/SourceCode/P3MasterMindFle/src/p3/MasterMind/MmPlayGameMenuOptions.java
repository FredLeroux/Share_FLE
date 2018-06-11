package p3.MasterMind;

import java.util.HashMap;

public class MmPlayGameMenuOptions {

	
		protected static HashMap<Integer, String> playGameMenuOptions = new HashMap<Integer, String>();

		public HashMap<Integer, String> getPlayGameMenuOptions(){
			return playGameMenuOptions;
		}
		
		
		public MmPlayGameMenuOptions() {

			playGameMenuOptions.put(1, "Play");
			playGameMenuOptions.put(2, "Main Menu");
			playGameMenuOptions.put(3, "Quit");
			
			
			

			}
	}


