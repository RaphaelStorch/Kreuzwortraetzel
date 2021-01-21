package Logik;

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
}
