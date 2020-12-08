package Logik3;

import java.util.Scanner;
import java.util.logging.Formatter;

public class Main {
	static int x=10; 
	static int y=10; 
	static int b=2; 
	static char[][][] Raster =new char[x][y][b]; 
	static char[][][] RasterVersuch =new char[x][y][b]; 
	static String[][][] Lösung = new String[x][y][b];  
	
	public static void main(String[] args) {
		deklaration(); 
		frage();
		antwort();
	}
	
	static void deklaration() {
		Lösung[0][0][0] = "ENTE";
		Lösung[1][0][0] = "ENTE";
		Lösung[2][0][0] = "ENTE";
		Lösung[3][0][0] = "GANS";
		Lösung[4][0][0] = "ENTE";
		Lösung[5][0][0] = "ENTE";
		Lösung[6][0][0] = "ENTE";
		Lösung[7][0][0] = "ENTE";
		Lösung[8][0][0] = "ENTE";
		Lösung[9][0][0] = "ENTE";

		Lösung[0][0][1] = "Flugvogel";
		Lösung[1][1][1] = "Flugvogel";
		Lösung[2][2][1] = "Flugvogel";
		Lösung[3][3][1] = "Flugvogel";
		Lösung[4][4][1] = "Flugvogel";
		Lösung[5][5][1] = "Flugvogel";
		Lösung[6][6][1] = "Flugvogel";
		Lösung[7][7][1] = "Flugvogel";
		Lösung[8][8][1] = "Flugvogel";
		Lösung[9][9][1] = "Flugvogel";

		
		for(int x=0; x<10;x++) {
			for(int y=0; y<10;y++) {
				Raster[x][y][0]=Lösung[x][0][0].charAt(0);
			}
		}
		
		for(int x=0; x<10;x++) {
			for(int y=0; y<10;y++) {
				RasterVersuch[x][y][1]=' ';
			}
		}
	}
	
	static void frage(){
		for(int x=0; x<1;x++) {
			System.out.println(Lösung[x][x][1]);}
	}
	
	static String Antwort=""; 
	static int zeile=0; 
	static int spalte=0; 
	static char antwortchar=' '; 
	static void antwort() {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Eingabemuster: zeilespalte enter Antwortchar "
				+ "oder zeile Antwort");
		zeile=scan.nextInt();
		spalte=scan.nextInt();
		Antwort = scan.next();
//		for(int i=0; i<Antwort.length(); i++) {
//		zeile = Integer.parseInt(Antwort.substring(1,2)); //zeile
//			if(Antwort.substring(3,5).equals("10")) {}//Antwort für ganze Zeile 
//			else {spalte= (int) Antwort.charAt(3);} //spalte
//			antwortchar=Antwort.charAt(4); 
//	}
		System.out.println("die Eingabe war: " + zeile+ " "+ spalte + " " + Antwort);
	}
	
}
