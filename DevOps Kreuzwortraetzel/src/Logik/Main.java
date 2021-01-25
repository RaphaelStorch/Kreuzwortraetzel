package Logik;

import JFrames.Tutorial;

public class Main {
	private static Tutorial updater = new Tutorial();
	
	public static void main(String[] args) {
		init();
	} 

	static void init() {
		System.out.println("Starte Programm");
		updater.setVisible(true);
	} 
}
