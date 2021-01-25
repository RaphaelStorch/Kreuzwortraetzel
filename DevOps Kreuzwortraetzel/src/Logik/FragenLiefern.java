package Logik;

import java.util.Arrays;

public class FragenLiefern {
	WortLiefern WL = new WortLiefern(); 
	
	public FragenLiefern(WortLiefern WL){
		this.WL = WL; 
	}
	
	public static String[] fragen = new String[10];
	public String[] GetFragen() {
		fragen[0]="";
		fragen[1]="Synonym für Henne"; 
		fragen[2]="Fluss mit drei Buchstaben";
		fragen[3]="Ab durch die ...!";
		fragen[4]="Synonym für Tisch am Bett?";
		fragen[5]="Große Insel über England?";
		fragen[6]=""; 
		fragen[7]="";
		fragen[8]=""; 
		fragen[9]="";
		return fragen; 
	}
	
	void printFragen() {
		System.out.println(Arrays.toString(GetFragen()));
	}
	
	
	
}
