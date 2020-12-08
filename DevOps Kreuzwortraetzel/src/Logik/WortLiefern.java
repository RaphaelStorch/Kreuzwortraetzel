package Logik;

import java.util.Arrays;

public class WortLiefern {
	
	WortLiefern(){
		String[] kreuzwoerter;
		kreuzwoerter=GetWörter(); 
		boolean[] gefunden; 
		//gefunden = getGefunden(); 
	}
	
	public static String[] kreuzwoerter = new String[10];
	public static String[] GetWörter() {
			kreuzwoerter[0] = "1SACHSEN"; 
			kreuzwoerter[1] = "2HUHN";
			kreuzwoerter[2] = "3ULM"; 
			kreuzwoerter[3] = "4HECKE"; 
			kreuzwoerter[4] = "5NACHTTISCH";
			kreuzwoerter[5] = "6ISLAND";
			kreuzwoerter[6] = "7TIERFRASS";
			kreuzwoerter[7] = "8BIERFASS";
			kreuzwoerter[8] = "9LEAGUE";
			kreuzwoerter[9] = "0LUKYLUKE";
		return kreuzwoerter; 
	}; 
	
//	public static boolean[] gefunden = new boolean[10];  
//	public static boolean[] getGefunden() {
//		return gefunden; 
//	}
	
	public void printWoerter() {
		System.out.println(Arrays.toString(GetWörter()));
	}
//	public void printGefunden() {
//		System.out.println(Arrays.toString(getGefunden()));
//	}
//	
}
