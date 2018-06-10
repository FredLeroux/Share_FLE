package p3.MasterMind;

public class MmMenuHead {
	/** class MmMenuHead define each menu head */

	protected static String title;
	private String devMode;

	/**
	 * title = Menu Title devMode = Indicate if developer mode is on or not
	 */
	// TODO implement devmode
	public MmMenuHead() {
		MmMenuHead.title = null;
		this.devMode = null;
	}

	public String getTtile() {
		return MmMenuHead.title;
	}

	public String getDevMode() {
		return this.devMode;
	}

	public void setTitle(String titleName) {
		/** variable titleName define the title Name */
		MmMenuHead.title = titleName;
	}

	public void setDevMode(String DevModeOn) {
		/** variable DevModeOn displayed if Developer mode is active */
		this.devMode = DevModeOn;
	}

	public MmMenuHead(String titleName) {
/** Creation of the menu head*/
		title = titleName;
		
	}

}
