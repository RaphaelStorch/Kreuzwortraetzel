package Logik;

import java.util.Scanner;

public class AntwortLiefern {
	
	AntwortChecken AC = new AntwortChecken(); 
	static String Antwort;
	FeldLiefern FL = new FeldLiefern(); 
	
	AntwortLiefern(WortLiefern WL, FragenLiefern FL, FeldLiefern feld){
		for(int i=0; i<10; i++) {
		System.out.println(FL.fragen[i]);
		Antwort=getAntwort();
		AC.checkAnwort(Antwort, WL, FL, feld);
		}
	}


	public static String getAntwort() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gib deine Antwort ein:");
		Antwort = scan.next();
		return Antwort; 
	}

	
	public static void WortSchreiber(String[] kreuzwoerter, boolean[] gefunden) {
		String[][] pos = new String[10][10]; 
		if (gefunden[1]== true) {
			for (int o = 0; o < kreuzwoerter[1].length(); o++) {
				pos[1][o] = "" + kreuzwoerter[1].charAt(o);
				pos[1][o] = pos[1][o].toUpperCase();}
		}
	}	
}
