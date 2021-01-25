package Logik;

public class AntwortChecken {
	static String Antwort;
	static String[] kreuzwoerter = new String[10]; 
	static boolean[] gefunden = new boolean[10]; 
	static String[] Feld; 
	static char[][] pos = new char[10][10]; 
	static String[] MusterFeld = new String[10]; 
	
	AntwortChecken(){}
	
	
	public static void checkAnwort(String[] kreuzwoerter, boolean[] gefunden) {
		
		switch (Antwort) {
		case "Huhn":
			System.out.println("Richtig!");
			gefunden[1] = true;
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


	public void checkAnwort(String antwort2, WortLiefern wL, FragenLiefern fL, FeldLiefern feld) {
		this.Antwort=antwort2; 
		this.kreuzwoerter = wL.GetWörter();  
		this.Feld=feld.getFeld();
		MusterFeld MF = new MusterFeld(Antwort, kreuzwoerter, feld);
		MusterFeld = MF.createMusterFeld(); 
		
	}
	
	
	
}
