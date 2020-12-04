package Logik;

import java.util.Arrays;
import java.util.Scanner;

public class Logik {
	static boolean Henne;
	static String[][] pos = new String[10][10]; // [Zeile][Spalte][Buchstabe]
	static String[] kreuzwoerter = new String[10];

	public static void main(String[] args) {
		kreuzwoerter[1]="Henne"; 
		printFrage();
		//getAntwort();
		Antwort="Huhn";
		checkAnwort();
		RätzelArrayDin();
		Wortgefunden();
		printRätzelfeld();

	}

	public static void printFrage() {
		System.out.println("Synonym für Henne");
	}

	static String Antwort;

	public static void getAntwort() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gib deine Antwort ein:");
		Antwort = scan.next();
	}

	public static void checkAnwort() {
		String s = Antwort;
		switch (s) {
		case "Huhn":
			System.out.println("Richtig!");
			Henne = true;
			break;
		case "Glucke":
			System.out.println("Fast");
			break;
		case "Hühnchen":
			System.out.println("Nicht ganz");
			break;
		default:
			System.out.println("Falsch");
			break;
		}
	}

	public static void printRätzelfeld() {
		System.out.println(Feld());
	}

	public static void RätzelArrayDin() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for(int k=0; k<10; k++)
				pos[j][i] = "_";
			}
		}
	}
	
	public static void Wortgefunden() {
		if (Henne == true) {
			pos[1][3]="H"; 
			pos[2][3]="E";
			pos[3][3]="N";
			pos[4][3]="N";
			pos[5][3]="E";
			for (int o = 1; o < 6; o++) {
				System.out.println(pos[2][3]);
				
//				System.out.println(kreuzwoerter[1].substring(o, o + 1));
//				pos[5][2][o] = kreuzwoerter[1].substring(o, o + 1); //Henne
//				System.out.print(pos[2][5][o]);
			}
			
			
			System.out.println();
			
	}}
	
	public static String Feld() {
		String Feld = "";
		String zw = "";
		int counter=0; 
		
		 String quadrat = "";
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	            	Feld=Feld+"| " + pos[j][i] + " "; 
	                quadrat += pos[j][i];
	                counter++;
	            }
	            counter=0;
	            quadrat += "\n";
	            Feld+="|\n";
	        }
	        System.out.println(quadrat);
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.println(Feld);
//				counter++;
//			}
//			counter=0;
//			Feld += "|\n";
//		}
		return Feld;
	}

}
