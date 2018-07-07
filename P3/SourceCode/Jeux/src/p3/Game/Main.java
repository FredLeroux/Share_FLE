package p3.Game;

import java.util.Scanner;

public class Main {

	public static boolean codeCompareCheck = true;
	public static boolean hintCheck = true;
	public static Scanner entry = new Scanner(System.in);
	public static int gameChoice;
	public static int Choice;

	public static void main(String[] args) {
		
		do {
		System.out.println("1: More Less Game Challenger Mode");
		System.out.println("2: Mastermind Game Challenger Mode");
		System.out.println("Game Choice ?");
		gameChoice = entry.nextInt();

		if (gameChoice == 1) {
			MoreLess moreLess = new MoreLess();
			moreLess.setCode();
			do {
				System.out.println("\nSecret code is " + moreLess.getCode());
				moreLess.setOpEntry();
				moreLess.check(moreLess.getMaxHint());
				moreLess.comparison(moreLess.getCode(), moreLess.getOpEntry());
				moreLess.setMorelessAnswer();				
				if (!(moreLess.getOpEntry().equals(moreLess.getCode()))) {
					moreLess.setHistoric(moreLess.getHint(),
							" : " + moreLess.getOpEntry() + " // clues are " + moreLess.answerToString());
					moreLess.getHistoric();
				}
				codeCompareCheck = (!moreLess.getOpEntry().equals(moreLess.getCode()));
				hintCheck = moreLess.getHint() < moreLess.getMaxHint();
			} while (codeCompareCheck && hintCheck);

			System.out.println("youpala youpi");

		}

		if (gameChoice == 2) {
			Mastermind masterMind = new Mastermind();
			masterMind.setCode();
			masterMind.setSecretCodeTbl(masterMind.getCode());
			do {
				System.out.println("\nSecret code is " + masterMind.getCode());
				masterMind.setOpEntry();
				masterMind.setCodeToCompareTbl(masterMind.getOpEntry());
				masterMind.check(masterMind.getMaxHint());
				masterMind.comparison(masterMind.getCode(), masterMind.getOpEntry());
				int answerTable[] = masterMind.getAnswerTable();
				masterMind.setAnswer(
						answerTable[0] + " element(s) right placed, " + answerTable[1] + " element(s) present.");
				if (!(masterMind.getOpEntry().equals(masterMind.getCode()))) {
					masterMind.setHistoric(masterMind.getHint(),
							" : " + masterMind.getOpEntry() + " // clues are " + masterMind.getAnswer());
					masterMind.getHistoric();
				}
				codeCompareCheck = (!masterMind.getOpEntry().equals(masterMind.getCode()));
				hintCheck = masterMind.getHint() < masterMind.getMaxHint();
			} while (codeCompareCheck && hintCheck);
		}
		
		System.out.println("1: Replay");
		System.out.println("2: Quit");
		System.out.println(" Choice ?");
		Choice = entry.nextInt();
		}while (Choice == 1);

	
		}
		
}