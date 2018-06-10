package p3.MasterMind;

class MmGameMenuOptionsDisplay extends MmGameMenuOptions {

	public MmGameMenuOptionsDisplay() {
		super();
		for (int i = 1; i <= gameMenuOptions.size(); i++) {
			System.out.println(i + gameMenuOptions.get(i));
	}
	}
		

}
