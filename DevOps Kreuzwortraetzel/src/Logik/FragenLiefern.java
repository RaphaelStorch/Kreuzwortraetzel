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
		fragen[1]="Synonym f�r Henne"; 
		fragen[2]="Fluss mit drei Buchstaben";
		fragen[3]="Ab durch die ...!";
		fragen[4]="Synonym f�r Tisch am Bett?";
		fragen[5]="Gro�e Insel �ber England?";
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
