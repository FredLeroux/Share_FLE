package p3.MasterMind;

import java.util.Scanner;

public class MmOperatorChoice {
	public static Scanner choiceEntry = new Scanner(System.in);
	protected static int choice;
	private String choiceAquisition = null;

	public MmOperatorChoice() {
		MmMainMenuOptions menuChoiceMainMenu = new MmMainMenuOptions();
		MmGameMenuOptions menuChoiceGameMenu = new MmGameMenuOptions();
		MmPlayGameMenuOptions menuChoicePlayGameMenu = new MmPlayGameMenuOptions();
		System.out.println("Please enter your choice :");
		choice = choiceEntry.nextInt();

		if (MmMenuHead.title.contains("Main")) {
			choiceAquisition = menuChoiceMainMenu.getMainMenuOptions().get(choice);
			if (choiceAquisition.contains("Game")) {
				new MmGameMainMenuHead();
				new MmDisplayMenu();
			} else if (choiceAquisition.contains("Quit")) {

				new MmAppQuit();
			}

			else {
				new MmMenuHead(
						menuChoiceMainMenu.getMainMenuOptions().get(MmOperatorChoice.choice) + " NOT yet Implemented");
				new MmDisplayMenu();
			}
		} else if (MmMenuHead.title.contains("Play")) {
			choiceAquisition = menuChoicePlayGameMenu.getPlayGameMenuOptions().get(choice);
			if (choiceAquisition.contains("Play")) {
				new MmRandomGenerator();
			} else if (choiceAquisition.contains("Quit")) {
				new MmAppQuit();
			} else {
				new MmMenuHead(
						menuChoiceGameMenu.getGameMenuOptions().get(MmOperatorChoice.choice) + " Not yet Implemented");
				new MmDisplayMenu();
			}
		}

		else if (MmMenuHead.title.contains("Game")) {
			choiceAquisition = menuChoiceGameMenu.getGameMenuOptions().get(choice);
			if (choiceAquisition.contains("Play")) {
				new MmPlayGameHead();
				new MmDisplayMenu();
			} else if (choiceAquisition.contains("Quit")) {
				new MmAppQuit();
			} else {
				new MmMenuHead(
						menuChoiceGameMenu.getGameMenuOptions().get(MmOperatorChoice.choice) + " Not yet Implemented");
				new MmDisplayMenu();
			}
		} else {
			System.out.println("Command Unknown");
			new MmDisplayMenu();
		}

	}
}
