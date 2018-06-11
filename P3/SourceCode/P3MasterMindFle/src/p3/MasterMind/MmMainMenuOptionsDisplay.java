package p3.MasterMind;

class MmMainMenuOptionsDisplay extends MmMainMenuOptions {

	public MmMainMenuOptionsDisplay() {
		super ();
		
		for (int i = 1; i <= mainMenuOptions.size(); i++) {
			System.out.println(i +": " + mainMenuOptions.get(i));
		}
		System.out.print("\n");
		new MmOperatorChoice();
	}

}
