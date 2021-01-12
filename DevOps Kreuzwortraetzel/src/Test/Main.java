package Test;

import java.util.Scanner;

import wortcutter.FragenAnzeiger;

public class Main {
	public static void main(String[] args) {
		init();
		
	} 

	static void init() {
		System.out.println("Starte Programm");
		Tutorial updater = new Tutorial(); 
		  updater.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	void initolderVersion() {
//		String[] frage = {"Synonym für Hi","Hauptstadt England", "Synonym für Tuch"}; 
//		String[] antwort = {"Hallo", "London", "Handtuch"}; 
//		String eingabe = ""; 
//		int index = 0; 
//		stelleFrage(frage, index); 
//		eingabe = holeEingabe();
//		checkEingabe(eingabe, antwort, index); 
//	}
//	
//	static void stelleFrage(String[] frage, int index){
//		System.out.println(frage[0]);
//	} 
//	static String holeEingabe() {
//		String eingabe; 
//		Scanner scan = new Scanner(System.in); 
//		eingabe = scan.next();
//		return eingabe; 
//	} 
//	static void checkEingabe(String eingabe, String[] antwort, int index) {
//		if(eingabe.equals(antwort)) {
//			System.out.println("Richtig!");
//		}else {
//			System.out.println("Falsch!");
//		}
//	} 
}
