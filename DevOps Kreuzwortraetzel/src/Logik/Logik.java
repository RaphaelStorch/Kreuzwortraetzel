package Logik;

import java.util.Arrays;
import java.util.Scanner;

public class Logik {
	static boolean Henne;
	static String[][] pos = new String[10][10]; // [Zeile][Spalte][Buchstabe]

	public static void main(String[] args) { 
		WortLiefern WL = new WortLiefern(); 
		WL.printWoerter();
		FragenLiefern FL = new FragenLiefern(WL);
		FL.printFragen();
		FeldLiefern Feld = new FeldLiefern(); 
		Feld.paintFeld();
		
		AntwortLiefern AW = new AntwortLiefern(WL, FL, Feld); 
		
	}

	public static String Feld() {
		String Feld = "";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				Feld = Feld + "| " + pos[i][j] + " ";
			Feld += "|\n";
		}
		return Feld;
	}

}
