package p3.MasterMind;

import java.util.ArrayList;

import java.util.HashMap;

public class MmMenuElements  {
	/** class MmMenuHead define each menu head */

	private String element1, element2, element3, element4, element5, element6;
	protected static String title,subTitle ;
	protected static int option1,option2,option3,option4,option5,option6;
	private  ArrayList<String> headTable ;
	private  HashMap <Integer,String> optionsTable;

	// private String devMode;

	/**
	 * title = Menu Title devMode = Indicate if developer mode is on or not
	 * 
	 */
	// TODO implement devmode
	public MmMenuElements() {
		this.element1 = null;
		this.element2 = null;
		this.element3 = null;
		this.element4 = null;
		this.element5= null;
		this.element6= null;
		MmMenuElements.title = null;
		MmMenuElements.subTitle =null;
		MmMenuElements.option1 = 1;
		MmMenuElements.option2 = 2;
		MmMenuElements.option3 = 3;
		MmMenuElements.option4 = 4;
		MmMenuElements.option5 = 5;
		MmMenuElements.option6 = 6;
		this.headTable = new ArrayList<String>();
		this.optionsTable = new HashMap <Integer,String>() ;
		
	}

	public String getElement1() {
		return this.element1;
	}
	public String getElement2() {
		return this.element2;
	}
	public String getElement3() {
		return this.element3;
	}
	public String getElement4() {
		return this.element4;
	}
	public String getElement5() {
		return this.element5;
	}
	public String getElement6() {
		return this.element6;
	}
	public String getTitle() {
		return MmMenuElements.title;
	}
	public String getSubTitle() {
		return MmMenuElements.subTitle;
	}

	public ArrayList<String> getHeadTable(){
		return this.headTable ;
	}
	
	public HashMap <Integer,String> getOptionsTable(){
		return this.optionsTable;
	}

	public void setElement1(String nElement1) {
		this.element1 = nElement1;
	}

	public void setElement2(String nElement2) {
		this.element2 = nElement2;
	}
	public void setElement3(String nElement3) {
		this.element3 = nElement3;
	}
	public void setElement4(String nElement4) {
		this.element4 = nElement4;
	}
	public void setElement5(String nElement5) {
		this.element5 = nElement5;
	}
	public void setElement6(String nElement6) {
		this.element6 = nElement6;
	}
	public void setTitle(String nTitle) {
		MmMenuElements.title = nTitle;
	}
	public void setSubTitle(String nSubTitle) {
		MmMenuElements.subTitle = nSubTitle;
	}
	
	public void setHeadTable(ArrayList<String>alHeadTable) {
		this.headTable = alHeadTable;
		
		
		
		
		}
	
	
	
	public void setOptionsTable(HashMap <Integer,String> hmOptionsTable) {
		this.optionsTable = new HashMap <Integer,String>(hmOptionsTable);
		}
	
	
	}
	
	
	

		
	
