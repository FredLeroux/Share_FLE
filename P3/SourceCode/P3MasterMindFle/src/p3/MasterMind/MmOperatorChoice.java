package p3.MasterMind;

import java.util.Scanner;

public class MmOperatorChoice {
	private Scanner choiceEntry = new Scanner(System.in);
	protected static int choice;
	
	
	public MmOperatorChoice() {
	System.out.println("Please enter your choice");
	MmOperatorChoice.choice = choiceEntry.nextInt();
	

}}