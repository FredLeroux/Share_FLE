package p3.MasterMind;

import java.util.Scanner;

public class MmOperatorChoice {
	private Scanner choiceEntry = new Scanner(System.in);
	public static int choice;
	
	public MmOperatorChoice (int choice) {
		MmOperatorChoice.choice = 0;
	}
	
	
	public MmOperatorChoice () {
	System.out.println("Please enter your choice");
	MmOperatorChoice.choice = choiceEntry.nextInt();
	new MmOpChoiceAnalysis();
	
	

}}