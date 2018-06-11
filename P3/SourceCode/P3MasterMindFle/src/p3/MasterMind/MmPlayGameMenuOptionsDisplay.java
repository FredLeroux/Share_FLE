package p3.MasterMind;

class MmPlayGameMenuOptionsDisplay extends MmPlayGameMenuOptions {

	public MmPlayGameMenuOptionsDisplay() {
		super();
		
		for (int i = 1; i <= playGameMenuOptions.size(); i++) {
			System.out.println(i + ": " + playGameMenuOptions.get(i));
		}
		System.out.print("\n");
		new MmOperatorChoice();
	}
}
