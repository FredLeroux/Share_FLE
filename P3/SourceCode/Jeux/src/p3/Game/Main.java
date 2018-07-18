package p3.Game;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static boolean codeCompareCheck = true;
	public static boolean hintCheck = true;
	public static Scanner entry = new Scanner(System.in);
	public static int gameChoice;
	public static int Choice;
	public static int count;
	public static ArrayList<String> codeliste = new ArrayList<String>();

	public static void main(String[] args) {

		do {

			System.out.println("1: More Less Game Challenger Mode");
			System.out.println("2: Mastermind Game Challenger Mode");
			System.out.println("3: More Less Game Defender Mode");
			System.out.println("4: More Less Game Defender Mode");
			System.out.println("Game Choice ?");
			
			
			
			
			
			
			
			
			
			gameChoice = entry.nextInt();
			// --------------------------------------------------------------------------------------------------------------
			if (gameChoice == 1) {
				MoreLess moreLess = new MoreLess();				
				System.out.println("Select Version");
				System.out.println("1: Basis");
				System.out.println("2: Variante");
				moreLess.setVersion(entry.nextInt());
				moreLess.setCode(moreLess.getMinRange(),moreLess.getMaxRange(),moreLess.getElementsNb());
				do {
					System.out.println("\nSecret code is " + moreLess.getCode());
					System.out.println("Proposition :");
					moreLess.setOpEntry(entry.next());
					moreLess.setGameAnswer(moreLess.getMaxHint(),moreLess.getChalMode());
					System.out.println(moreLess.getGameAnswer());
					moreLess.comparison(moreLess.getCode(), moreLess.getOpEntry(), moreLess.getElementsNb());
					if (!(moreLess.getOpEntry().equals(moreLess.getCode()))) {
						moreLess.setHistoric(moreLess.getHint(),moreLess.getChalMode());
						moreLess.getHistoric();
					}
					codeCompareCheck = (!moreLess.getOpEntry().equals(moreLess.getCode()));
					hintCheck = moreLess.getHint() < moreLess.getMaxHint();
				} while (codeCompareCheck && hintCheck);

			}
			// --------------------------------------------------------------------------------------------------------------
			if (gameChoice == 2) {
				Mastermind masterMind = new Mastermind();
				masterMind.setCode(masterMind.getMinRange(),masterMind.getMaxRange(),masterMind.getElementsNb());
				do {
					System.out.println("\nSecret code is " + masterMind.getCode());
					System.out.println("Proposition :");
					masterMind.setOpEntry(entry.next());
					masterMind.setGameAnswer(masterMind.getMaxHint(), masterMind.getChalMode());
					System.out.println(masterMind.getGameAnswer());
					masterMind.comparison(masterMind.getCode(), masterMind.getOpEntry(), masterMind.getElementsNb());
					if (!(masterMind.getOpEntry().equals(masterMind.getCode()))) {
						masterMind.setHistoric(masterMind.getHint(),masterMind.getChalMode());
						masterMind.getHistoric();
					}
					codeCompareCheck = (!masterMind.getOpEntry().equals(masterMind.getCode()));
					hintCheck = masterMind.getHint() < masterMind.getMaxHint();
				} while (codeCompareCheck && hintCheck);
			}
			// --------------------------------------------------------------------------------------------------------------
			if (gameChoice == 3) {
				MoreLess mLDefender = new MoreLess();

				System.out.println("set your code");
				mLDefender.setOpcode(entry.next());
				do {
					mLDefender.defenderMode(mLDefender.getElementsNb());			
					mLDefender.setGameAnswer(mLDefender.getMaxHint(), mLDefender.getDefMode());
					//System.out.println(mLDefender.getGameAnswer());
					if (mLDefender.getOpcode().equals(mLDefender.getPcEntry())|| (mLDefender.getHint()==mLDefender.getMaxHint())) {
						
						mLDefender.getHistoric();
						System.out.println("Your secret code is : "+ mLDefender.getPcEntry());
						System.out.println("\n" + mLDefender.getGameAnswer());
						
						break;}
					else {						
						//System.out.println("Your secret code is : " + mLDefender.getOpcode());
						//System.out.println("Pc proposition      : " + mLDefender.getPcEntry());
						//System.out.println("Enter your clues on this proposition : " );
						mLDefender.comparison(mLDefender.getOpcode() , mLDefender.getPcEntry(), mLDefender.getElementsNb());//						
						mLDefender.setClues(mLDefender.answerToString());//entry.next()
						mLDefender.setHistoric(mLDefender.getHint(),mLDefender.getDefMode());
					}
				} while (!mLDefender.getOpcode().equals(mLDefender.getPcEntry()));
			

			}
			//------------------------------------------------------------------------------------------------------------------------------------------------------
			if(gameChoice == 4) {
				count =0;
			Mastermind t = new Mastermind ();
			System.out.println("Select Version");
			System.out.println("1: Basis");
			System.out.println("2: Variante");
			t.setVersion(entry.nextInt());
			System.out.println("set your code");
			t.setOpcode(entry.next());	
			do {
			t.defenderMode(t.getElementsNb());
			System.out.println(t.getPcEntry());
			t.comparison(t.getOpcode(), t.getPcEntry(),t.getElementsNb());
			System.out.println("Element(s) number rigth placed :");
			t.setClueRightPlaced(t.getNbRightPlaced());
			System.out.println("Element(s) number present :");			
			t.setClueElmentPresent(t.getNbPresent());
			//System.out.println(t.getNbRightPlaced() +"//"+ t.getNbPresent());
			System.out.println("codelist size =" + t.getCodeList().size());
			System.out.println("hint : "+ ((count++)+1));
			}while (!t.getOpcode().equals(t.getPcEntry()));
			System.out.println("Fini");}
			// -----------------------------------------------------------------------------------------------------------------------------------------------------
			System.out.println("1: Replay");
			System.out.println("2: Quit");
			System.out.println(" Choice ?");
			Choice = entry.nextInt();
		} while (Choice == 1);

	}

}