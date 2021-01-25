package Logik2;

import java.util.Scanner;

public class Postionen {
	static int worte = 10;
	static int fragen = 10;
	static int x = 10;
	static int y = 10;
	static int einfach = 10;
	static int SwitchModus = 2;
	static String[][][] wort = new String[worte][fragen][SwitchModus]; // 0=Antwort 1=Frage
	static char[][][] pos = new char[11][11][2];

	void worte() {
		wort[0][0][0] = "ENTE";
		wort[1][0][0] = "ENTE";
		wort[2][0][0] = "ENTE";
		wort[3][0][0] = "GANS";
		wort[4][0][0] = "ENTE";
		wort[5][0][0] = "ENTE";
		wort[6][0][0] = "ENTE";
		wort[7][0][0] = "ENTE";
		wort[8][0][0] = "ENTE";
		wort[9][0][0] = "ENTE";

		wort[0][0][1] = "Flugvogel";
		wort[1][1][1] = "Flugvogel";
		wort[2][2][1] = "Flugvogel";
		wort[3][3][1] = "Flugvogel";
		wort[4][4][1] = "Flugvogel";
		wort[5][5][1] = "Flugvogel";
		wort[6][6][1] = "Flugvogel";
		wort[7][7][1] = "Flugvogel";
		wort[8][8][1] = "Flugvogel";
		wort[9][9][1] = "Flugvogel";

		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				pos[i][k][0] = ' ';
				pos[10][10][0] = ' ';
				pos[i][k][1] = ' ';
				pos[10][10][1] = ' ';
//				for(int e=0; e<2;e++) {
//					
//				}
			}
		}
	}

	void posgenerator() {
		worte();
		for (int w = 0; w < einfach; w++) {
			for (int ii = 0; ii < wort[w][0][0].length() && ii < x; ii++) {
				pos[ii][w][0] = wort[w][0][0].charAt(ii);
			}
		}
	}

	void zeichne() {
		String s = "";
		for (int yy = 0; yy < einfach; yy++) {
			for (int xx = 0; xx < einfach; xx++) {
				s = s + pos[xx][yy][0] + "| ";
			}
			s = s + "\n";
		}
		System.out.println(s);
	}

	void frage() {
		for (int i = 0; i < 10; i++) {
			// System.out.println("Frage "+i+": "+wort[i][i][1]+"");
		}
	}

	static String Antwort = "";
	static int zeile = 0;
	static int spalte = 0;

	void wähleFrage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wähle (zeile):");
		zeile = scan.nextInt();
		System.out.println("Wähle (spalte):");
		spalte = scan.nextInt();
		System.out.println("Wähle Antwort");
		Antwort = scan.next();
	}
	
	void validierung() {
		
	}

	public void zeichnewahr() {
		String s = "";
		for (int yy = 0; yy < einfach; yy++) {
			for (int xx = 0; xx < einfach; xx++) {
				s = s + pos[xx][yy][1] + "| ";
			}
			s = s + "\n";
		}
		System.out.println(s);
	}

}
