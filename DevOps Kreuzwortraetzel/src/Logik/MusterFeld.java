package Logik;

public class MusterFeld {
	
	static String Antwort;
	static String[] kreuzwoerter = new String[10]; 
	static boolean[] gefunden = new boolean[10]; 
	static String[] Feld;
	static String[] MusterFeld = new String[10]; 
	static char[][] pos = new char[10][10]; 
	
	MusterFeld(String antwort2, String[] kreuzwoerter, FeldLiefern feld){
		this.Antwort=antwort2; 
		this.kreuzwoerter = kreuzwoerter; 
	//	this.kreuzwoerter = fL.GetFragen(); 
		this.Feld=feld.getFeld();
		
	}
	
	String[] createMusterFeld(){
		for(int y=0; y<10; y++) {
			MusterFeld[y]=" ";
			for(int x=0; x<10; x++) {
				if(kreuzwoerter[y].length()<=0 ||kreuzwoerter[y].length()<=x ) {pos[x][y]=' ';} 
				else {pos[x][y]=kreuzwoerter[y].charAt(x);}
				MusterFeld[y]=MusterFeld[y] + " " + pos[x][y] + " ";
			}
			System.out.println(MusterFeld[y]);
		}
		return MusterFeld;
	}
	
	char[][] getpos() {
		return pos; 
	}
	
	
}
