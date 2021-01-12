package Logik3;

public class GebeContent {
	static int x=10; 
	static int y=10; 
	static int b=2; 
	static String[][][] Lösung = new String[x][y][b];  

	static String[][][] Raster =new String[x][y][b]; 
	static char[][][] RasterVersuch =new char[x][y][b];
	
	static void deklaration() {
		String[] lö = new String[10];  
		lö[0]="Vim".toUpperCase();
		lö[1]="Repository".toUpperCase();
		lö[2]="Merge".toUpperCase();
		lö[3]="Index".toUpperCase();
		lö[4]="mkdir".toUpperCase();
		lö[5]="echo".toUpperCase();
		lö[6]="Punkt".toUpperCase();
		lö[7]="Commit".toUpperCase();
		lö[8]="Main".toUpperCase();
		lö[9]="checkout".toUpperCase();

		
		Lösung[0][0][0] = String.format("%10s",lö[0])+String.format("%1s", " ");
		Lösung[1][0][0] = String.format("%9s",lö[1])+ String.format("%2s", " ");
		Lösung[2][0][0] = String.format("%8s",lö[2])+ String.format("%2s", " ");
		Lösung[3][0][0] = String.format("%7s",lö[3])+ String.format("%3s", " ");
		Lösung[4][0][0] = String.format("%6s",lö[4])+ String.format("%4s", " ");
		Lösung[5][0][0] = String.format("%5s",lö[5])+ String.format("%5s", " ");
		Lösung[6][0][0] = String.format("%4s",lö[6])+ String.format("%6s", " ");
		Lösung[7][0][0] = String.format("%3s",lö[7])+ String.format("%7s", " ");
		Lösung[8][0][0] = String.format("%2s",lö[8])+ String.format("%8s", " ");
		Lösung[9][0][0] = String.format("%1s",lö[9])+ String.format("%9s", " ");

		Lösung[0][0][1] = String.format("%10s","Flugvogel");
		Lösung[1][1][1] = String.format("%10s","Flugvogel");
		Lösung[2][2][1] = String.format("%10s","Flugvogel");
		Lösung[3][3][1] = String.format("%10s","Flugvogel");
		Lösung[4][4][1] = String.format("%10s","Flugvogel");
		Lösung[5][5][1] = String.format("%10s","Flugvogel");
		Lösung[6][6][1] = String.format("%10s","Flugvogel");
		Lösung[7][7][1] = String.format("%10s","Flugvogel");
		Lösung[8][8][1] = String.format("%10s","Flugvogel");
		Lösung[9][9][1] = String.format("%10s","Flugvogel");
		
		
		for(int x=0; x<10;x++) {
			for(int y=0; y<10;y++) {
				Raster[x][y][0]=""+Lösung[x][0][0].charAt(y);
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
}
