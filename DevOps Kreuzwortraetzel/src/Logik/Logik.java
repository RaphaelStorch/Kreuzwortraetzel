package Logik;
import java.util.Scanner; 
public class Logik{
	public static void main(String[] args){

		printFrage();
		getAntwort();
		checkAnwort();
		printRätzelfeld();
		

	}

	public static void printFrage() {
		System.out.println("Synonym für Henne");
	} 
	
	static String Antwort; 
	public static void getAntwort() { 
		Scanner scan=new Scanner(System.in);
		System.out.println("Gib deine Antwort ein:");
		Antwort=scan.next();
	}
	
	
	
	public static void checkAnwort() {
		String s = Antwort;
	    switch (s) {
	        case "Huhn":
	            System.out.println("Richtig!");
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


	public static String Feld() {
		String Feld = ""; 
		for(int j=0; j<6; j++) {
			for(int i=0; i<10; i++) {
				Feld = Feld+ "|__"; }
			Feld += "|\n";}
		return Feld;
	}
	

}
