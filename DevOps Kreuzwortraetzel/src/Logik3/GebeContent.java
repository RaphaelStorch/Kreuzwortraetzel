package Logik3;

public class GebeContent {
	static int x=10; 
	static int y=10; 
	static int b=2; 
	static String[][][] L�sung = new String[x][y][b];  

	static String[][][] Raster =new String[x][y][b]; 
	static char[][][] RasterVersuch =new char[x][y][b];
	
	static void deklaration() {
		String[] l� = new String[10];  
		l�[0]="Vim".toUpperCase();
		l�[1]="Repository".toUpperCase();
		l�[2]="Merge".toUpperCase();
		l�[3]="Index".toUpperCase();
		l�[4]="mkdir".toUpperCase();
		l�[5]="echo".toUpperCase();
		l�[6]="Punkt".toUpperCase();
		l�[7]="Commit".toUpperCase();
		l�[8]="Main".toUpperCase();
		l�[9]="checkout".toUpperCase();

		
		L�sung[0][0][0] = String.format("%10s",l�[0])+String.format("%1s", " ");
		L�sung[1][0][0] = String.format("%9s",l�[1])+ String.format("%2s", " ");
		L�sung[2][0][0] = String.format("%8s",l�[2])+ String.format("%2s", " ");
		L�sung[3][0][0] = String.format("%7s",l�[3])+ String.format("%3s", " ");
		L�sung[4][0][0] = String.format("%6s",l�[4])+ String.format("%4s", " ");
		L�sung[5][0][0] = String.format("%5s",l�[5])+ String.format("%5s", " ");
		L�sung[6][0][0] = String.format("%4s",l�[6])+ String.format("%6s", " ");
		L�sung[7][0][0] = String.format("%3s",l�[7])+ String.format("%7s", " ");
		L�sung[8][0][0] = String.format("%2s",l�[8])+ String.format("%8s", " ");
		L�sung[9][0][0] = String.format("%1s",l�[9])+ String.format("%9s", " ");

		L�sung[0][0][1] = String.format("%10s","Flugvogel");
		L�sung[1][1][1] = String.format("%10s","Flugvogel");
		L�sung[2][2][1] = String.format("%10s","Flugvogel");
		L�sung[3][3][1] = String.format("%10s","Flugvogel");
		L�sung[4][4][1] = String.format("%10s","Flugvogel");
		L�sung[5][5][1] = String.format("%10s","Flugvogel");
		L�sung[6][6][1] = String.format("%10s","Flugvogel");
		L�sung[7][7][1] = String.format("%10s","Flugvogel");
		L�sung[8][8][1] = String.format("%10s","Flugvogel");
		L�sung[9][9][1] = String.format("%10s","Flugvogel");
		
		
		for(int x=0; x<10;x++) {
			for(int y=0; y<10;y++) {
				Raster[x][y][0]=""+L�sung[x][0][0].charAt(y);
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
			System.out.println(L�sung[x][x][1]);}
	}
}
