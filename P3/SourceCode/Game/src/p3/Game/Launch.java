package p3.Game;

import java.util.Scanner;

public class Launch {

	/**
	 * @param maxRange
	 *            is the maximum digit range value used at each elements composing
	 *            the code.
	 * @param nbElements
	 *            is the number of elements composing the code*
	 */

	public static int maxRange;
	public static int nbElements;
	public static int maxHint = 0;
	public static int hintNumber = 0;
	public static int hintCount = 0;
	public static String playerProposal = null;
	public static String LAST_HINT = null;
	public static int game;
	public static String settedCode;
	public static boolean moreless = true;

	public static Scanner entry = new Scanner(System.in);

	public Launch() {

		maxRange = 0;
		nbElements = 0;
		settedCode = "null";
	}

	public static void main(String[] args) {
		// TODO replace settings by
		// config.properties------------------------------------------------------------------
		System.out.println("Please set the applcation:\n");
		System.out.println("Digit maximum range value is");
		maxRange = entry.nextInt();

		System.out.println("Elements number to use is");
		nbElements = entry.nextInt();

		System.out.println("Maximum hint is");
		maxHint = entry.nextInt();
		// -------------------------------------------------------------------------------------
		// Initializing
		// elements-------------------------------------------------------------
		Tools checkIn = new Tools();
		checkIn.setMaxHint(maxHint);
		Code getCode = new Code();
		getCode.setCodeMaxRange(maxRange);
		getCode.setCodeNbElements(nbElements);
		settedCode = getCode.generateRandomNb();

		// will be replace by
		// menu---------------------------------------------------------------
		System.out.println("Select game");
		System.out.println("1: +/-");
		System.out.println("2:Mastemind");
		// ---------------------------------------------------------------------------------------
		game = entry.nextInt();
		if (game == 1) {
			do {
				checkIn.setHint(hintCount);
				checkIn.getLooseByHint();

				System.out.println("Player proposal (the secretcode is " + settedCode + ")");

				playerProposal = entry.next();

				checkIn.setPlrProp(playerProposal);
				checkIn.setSecretCode(settedCode);
				checkIn.getCheckIfWin();

				CompareMoreLess gameMoreLess = new CompareMoreLess();
				gameMoreLess.setMoreIndication('+');
				gameMoreLess.setLessIndication('-');
				gameMoreLess.setEqualsIndication('=');
				gameMoreLess.setMoreLessLength(nbElements);
				gameMoreLess.setMoreLessPlrProp(playerProposal);
				gameMoreLess.setMoreLessSecretCode(settedCode);

				if (!playerProposal.equals(settedCode)) {
					System.out.println(
							"\nSorry this is not the secret code, " + (maxHint - (hintCount + 1) + " hint left."));
					hintCount = (hintNumber++ + 1);
					checkIn.setLastHint("Your proposition n°=" + hintCount + " was " + playerProposal
							+ ", the clues on this proposition are : " + gameMoreLess.getMoreLessAnswer() + ".");
					checkIn.getHistoric();
					System.out.println("\n");
				}
			} while (!playerProposal.equals(settedCode));
		}

		if (game == 2) {
			do {
				checkIn.setHint(hintCount);
				checkIn.getLooseByHint();

				System.out.println("Player proposal (the secretcode is " + settedCode + ")");

				playerProposal = entry.next();

				checkIn.setPlrProp(playerProposal);
				checkIn.setSecretCode(settedCode);
				checkIn.getCheckIfWin();

				CompareMastermind gameMastermind = new CompareMastermind();
				gameMastermind.setRightPlacedIndication(" Element(s) right placed");
				gameMastermind.setPresentIndication(" Element(s) presents");
				gameMastermind.setMmElements(nbElements);
				gameMastermind.setMmPlrProp(playerProposal);
				gameMastermind.setMmSecretCode(settedCode);

				if (!playerProposal.equals(settedCode)) {
					System.out.println(
							"\nSorry this is not the secret code, " + (maxHint - (hintCount + 1) + " hint left."));
					hintCount = (hintNumber++ + 1);
					checkIn.setLastHint("Your proposition n°=" + hintCount + " was " + playerProposal
							+ ", the clues on this proposition are : " + gameMastermind.getMastermindAnswwer() + ".");
					checkIn.getHistoric();
					System.out.println("\n");
				}
			} while (!playerProposal.equals(settedCode));
		}

		System.out.println("Youpala, Youpi");
	}

}
