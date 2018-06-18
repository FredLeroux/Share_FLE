package p3.MasterMind;

import java.util.ArrayList;
import java.util.HashMap;

public class MmOpChoiceAnalysis {
	private String choiceAquisition ,choiceAquisition2 = null;
	private String title,subTitle ;
	private ArrayList<String> alTable = new ArrayList<String>() ;
	private HashMap <Integer,String> optionsTable = new HashMap <Integer,String>();
	
	public MmOpChoiceAnalysis() {
		
		if (MmOperatorChoice.choice ==0) {
			title = "Main Menu";
			
			alTable.add(title+ "\n");
			alTable.forEach(title-> System.out.println(title ));
			optionsTable.put(1, MmTerms.term5 + " " + MmTerms.term15);
			optionsTable.put(2, MmTerms.term6 + " " + MmTerms.term15);
			optionsTable.put(3, MmTerms.term7 + " " + MmTerms.term16);
			optionsTable.put(4, MmTerms.term8);
			optionsTable.put(5, MmTerms.term9);
			optionsTable.put(6, MmTerms.term10 + "\n");
			optionsTable.forEach((key,value)->System.out.println(key +": " + value));
			
			
		}
		
		else if(choiceAquisition.contains(MmTerms.term10))
		{System.out.println("yo quit");
			System.exit(1);}
		else if (title.contains("Main Menu") && (choiceAquisition.contains("Game"))) 
			{System.out.println("yo");
		new MmOperatorChoice();}
		else
			{choiceAquisition2 = MmGameMenu.hmGameMenuOptions.get(MmOperatorChoice.choice);
			new MmPlayGameMenu();}
		
		new MmOperatorChoice();	
		choiceAquisition = optionsTable.get(MmOperatorChoice.choice);
		new MmOpChoiceAnalysis(); 
	}

	

}
