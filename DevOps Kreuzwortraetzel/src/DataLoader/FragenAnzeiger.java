package DataLoader;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JTextField;

import JFrames.Einfach;
import JFrames.Mittel;

public class FragenAnzeiger {

	static String path = "..\\DevOps Kreuzwortraetzel\\res\\database\\mittelFragen.csv";
	static String line = ""; 
	static String[][] fragen= new String[30][2]; 




	static String[] values; 
	public static String[][] getCSVFragen(){

		int counter =0; 
		int zeile=0; 
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while((line = br.readLine())!= null) {
				values= line.split(",");
				fragen[counter][0] = " "+counter +". "+ values[0];
				counter++;
				System.out.println(counter);
				System.out.println(values[0]);
				System.out.println(fragen[counter][0]);
			} 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}	

		return fragen;		
	}

	static String[][] Fragen = getCSVFragen();
	public static FocusAdapter fragenMittel(int o) {
		System.out.println("Reached");
		FocusAdapter[] fa = new FocusAdapter[21]; 
		int derzeit = o; 
		int anfang = 0; 
		int ende = 0; 
		int frage = 1; 
		final String F1 = fragen[1][0];
		final String F2 = fragen[2][0];
		final String F3 = fragen[3][0];
		final String F4 = fragen[4][0];
		final String F5 = fragen[5][0];
		final String F6 = fragen[6][0];
		final String F7 = fragen[7][0];
		final String F8 = fragen[8][0];
		final String F9 = fragen[9][0];
		final String F10 = fragen[10][0];
		final String F11 = fragen[11][0];
		final String F12 = fragen[12][0];
		final String F13 = fragen[13][0];
		final String F14 = fragen[14][0];
		final String F15 = fragen[15][0];
		final String F16 = fragen[16][0];
		final String F17 = fragen[17][0];
		final String F18 = fragen[18][0];
		final String F19 = fragen[19][0];
		final String F20 = fragen[20][0];
		final String F21 = fragen[21][0];

		JTextField[][] tfcopy = Mittel.tf;

		//Verschmelzung von zwei Dateien,"Merge" (o>=3&&o<=9)
		if(o == 7 || o == 17 || o == 27 || o == 37 || o == 47){
			fa[1]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					System.out.println(F1);
					Mittel.fragefeld.setText(F1);
					for(int i = 7; i<=47; i=i+10)Mittel.tf[i/10][7-1].setBackground(Color.yellow);
				}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");
				for(int i = 7; i<=47; i=i+10)Mittel.tf[i/10][7-1].setBackground(Color.white);
				}};
				return fa[1];}
		//Wenn man ein neues Verzeichnis in git haben möchte,"mkdir"
		if(o>=153 && o<=157) {
			fa[2]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					Mittel.fragefeld.setText(F2);
					for(int i = 0; i<=4; i++)Mittel.tf[153/10-1][153%10+i].setBackground(Color.yellow);
				}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");
				for(int i = 0; i<=4; i++)Mittel.tf[153/10-1][153%10+i].setBackground(Color.white);}
				};
				return fa[2];}
		//Befehl zum Anlegen einer Datei in git,"echo"
		if(o>=203&&o<=206) {
			fa[3]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F3);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[3];}
		//Ein gespeicherter Zwischenstand,"Commit"
		if(o>=4&&o<=9) {
			fa[4]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F4);

				}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");

				}};
				return fa[4];}
		//Frueherer in Git: "Master",Main"
		if(o>=109&&o<=112) {
			fa[5]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F5);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[5];}
		//Mit git ? wechselt man zu einem anderen Branch,"checkout"
		if( o == 60 +14 || o == 70 + 14 || o== 80 +14 || o== 90 +14 
				|| o == 90 +14 || o==100+14 || o == 110 +14 || o==120+14 || o==130+14 ) {
			fa[6]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F6);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[6];}



		//ab hier von unter noch oben 	
		if(o>=110 + 2 &&o<=110 +7 ) {
			fa[7]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F7);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[7];}
		//Fehler in einem Code beheben,"Bugfix"
		if(o>=40+3&&o<=40+7) {
			fa[8]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F8);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[8];}
		//Befehl: Wer hat welchen Commit gemacht,"blame"
		if(o>=20+2&&o<=20+11) {
			fa[9]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F9);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[9];}
		//Modell zu einer nicht agilen Softwareentwicklung,"Wasserfall"
		/*10*/	if( o== 90+16 || o == 100 + 16 || o == 110+16 || o==120 + 16 || o== 130 + 16 
				|| o == 140+16 || o == 150 + 16 || o == 160+16 || o == 170+16) {
			fa[10]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F10);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[10];}
		//Das Vorgehen bei agiler Softwareentwicklung,"Iterativ"
		if(o>=120+9&&o<=120+14) {
			fa[11]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F11);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[11];}
		//Anderes Wort fuer "Iteration",Sprint"
		if( o == 40+9 || o == 50 + 9 || o== 60 +9  || o== 70+9 || o== 80 + 9) {
			fa[12]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F12);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[12];}
		//Der Product ? ist verantwortlich fuer den Product Backlog,"Owner"
		if(o == 100+ 9 || o== 110 + 9 || o== 120 + 9 || o == 130 + 9 || o==140+9 || o == 150 +9) {
			fa[13]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F13);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[13];}
		//Der Scrum ? sorgt dafuer das Scrum richtig durchgesetzt wird,"Master"
		if(o== 140 + 11 || o == 150 +11 || o==160+11 || o == 170 +11 || o == 180 +11 || o == 190 +11) {
			fa[14]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F14);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[14];}
		//Die taegliche Besprechung in Scrum "Daily ?",Standup"
		if(o>=50+12&&o<=50+18) {
			fa[15]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F15);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[15];}
		//Liste von Dingen um das Produkt zu verbessern "Product ?","Backlog"
		if(o == 30 +17 || o == 40 +17 || o == 50+17 || o== 60 + 17 || o== 70 +17 || o==80 +17 || o==90+17 ) {
			fa[16]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F16);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[16];}
		//Idee von Kent Beck "User ?","Stories"
		if(o>=170+9&&o<=170+14) {
			fa[17]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F17);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[17];}
		//Visualisierung und Beseitigung von Engpaessen ist die Kernidee von ?,"Kanban"
		if(o == 40 +4 || o == 50 +4 || o== 60 +4 || o==70 +4 || o == 80+4 || o==90+4 || o==100+4) {
			fa[18]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F18);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[18];}
		//Eine statische Analyse des Quellcodes um Probleme zu entdecken,"Linting"

		if( o == 66 || o == 76 || o == 86 || o == 96 || o == 106 || o == 116 
				|| o == 126 || o == 136 || o==146 || o == 156 || o == 166 || o == 176 || o == 186 || o == 196) {
			fa[19]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F19);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[19];}
		//Aktuelles Arbeitsverzeichnis,"Working Dierctory"


		if(o>=70+2&&o<=70+14) {
			fa[20]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F20);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[20];}
		//Letztes Meeting im Sprint "Sprint ?",Retrospective"

		return null;



	}
	
	static String einfachpath = "..\\DevOps Kreuzwortraetzel\\res\\database\\einfacheFragen.csv";
	static String einfachline = ""; 
	static String[][] einfachfragen= new String[30][2]; 
	static String[] einfachvalues; 
	public static String[][] geteinfachCSVFragen(){

		int counter =0; 
		int zeile=0; 
		try {
			BufferedReader br = new BufferedReader(new FileReader(einfachpath));
			while((einfachline = br.readLine())!= null) {
				einfachvalues= einfachline.split(",");
				einfachfragen[counter][0] = " "+counter +". "+ einfachvalues[0];
				counter++;
				System.out.println(counter);
				System.out.println(einfachvalues[0]);
				System.out.println(einfachfragen[counter][0]);
			} 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}	

		return einfachfragen;		
	}

	
	
	
	static String[][] einfachFragen = geteinfachCSVFragen();
	public static FocusAdapter fragenEinfach(int o) {
		System.out.println("Reached");
		FocusAdapter[] fa = new FocusAdapter[21]; 
		int derzeit = o; 
		int anfang = 0; 
		int ende = 0; 
		int frage = 1; 
		final String F1 = einfachfragen[1][0];
		final String F2 = einfachfragen[2][0];
		final String F3 = einfachfragen[3][0];
		final String F4 = einfachfragen[4][0];
		final String F5 = einfachfragen[5][0];
		final String F6 = einfachfragen[6][0];
		final String F7 = einfachfragen[7][0];
		final String F8 = einfachfragen[8][0];
		final String F9 = einfachfragen[9][0];
		final String F10 = einfachfragen[10][0];
		final String F11 = einfachfragen[11][0];
		final String F12 = einfachfragen[12][0];
		final String F13 = einfachfragen[13][0];
		final String F14 = einfachfragen[14][0];
		final String F15 = einfachfragen[15][0];
		final String F16 = einfachfragen[16][0];
		final String F17 = einfachfragen[17][0];
		final String F18 = einfachfragen[18][0];
		final String F19 = einfachfragen[19][0];
		final String F20 = einfachfragen[20][0];
		final String F21 = einfachfragen[21][0];


		//Wie heisst das Team dass das Spiel erstellt hat?,"Star" (>=3&&<=9)
		if( o == 1600 +9 || o == 1700 + 9 || o== 1800 +9 || o== 1900 +9 ){
			fa[1]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					System.out.println(F1);
					Einfach.fragefeld.setText(F1);
				
				}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");
				
				}};
				return fa[1];}
		//Wie heisst Herr Storch mit Vornamen?,"Raphael"
		if(o>=405 && o<=411) {
			fa[2]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					Einfach.fragefeld.setText(F2);
					
				}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");
				}
				};
				return fa[2];}
		//Wie heisst Gufran mit Nachnamen?,"Oezmert"
		if(o == 700 +12 || o == 800 + 12 || o== 900 +12 || o== 1000 +12|| o == 1100 + 12 || o== 1200 +12 || o== 1300 +12) {
			fa[3]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F3);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[3];}
		//Wie lautet der Doppelname von Herrn Voth,"Viktor"
		if(o>=1904 && o<=1909) {
			fa[4]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F4);
				
				}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");
				
				}};
				return fa[4];}
		//Was brauchte ein Eintrag pro Vorlesung?,"Tagebuch"
		if(o == 200 +10 || o == 300 + 10 || o== 400 +10 || o== 500 +10 || o == 600 +10 || o == 700 + 10 || o== 800 +10 || o== 100 +10) {
			fa[5]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F5);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[5];}
		//Multiple-Choice ?,"Test"
		if( o == 800 +1 || o == 900 + 1 || o== 1000 +1 || o== 1100 +1  ) {
			fa[6]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F6);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[6];}



		//VIM: Command Mode Visual Mode und ? Mode,"Insert" 	
		if(o == 5 || o == 100 + 5 || o== 200 +5 || o== 300 +5|| o == 400 + 5 || o== 500 +5 ) {
			fa[7]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F7);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[7];}
		//VCS=Version Control ?,"System"
		if(o>=107 && o<=112) {
			fa[8]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F8);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[8];}
		//Initiert wurde Git von Linus ?,"Torvalds"
		if(o>=1101 && o<=1108) {
			fa[9]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F9);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[9];}
		//Neues Repository in Git anlegen:git ?,"init"
		/*10*/	if( o>=502 && o<=505) {
			fa[10]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F10);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[10];}
		//Bestehendes Repository in git klonen:git ?,"clone"
		if(o>=301 && o<=305) {
			fa[11]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F11);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[11];}
		//Holt alle Aenderungen vom Origin:git ?,"fetch"
		if( o == 1200+10 || o == 1300 + 10 || o== 1400 +10  || o== 1500+10 || o== 1600 + 10) {
			fa[12]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F12);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[12];}
		//Sendet Aenderungen an entferntes Repository:git ?,"push"
		if(o>=1607 && o<=1610) {
			fa[13]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F13);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[13];}
		//Datei in git umbennen:git ?,"mv"
		if(o>=1012 && o<=1013) {
			fa[14]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F14);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[14];}
		//Uebersicht aller Daten die noch nicht in git gestaged wurden:git ?,"status"
		if(o>=606 && o<=611) {
			fa[15]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F15);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[15];}
		//Mit welcher Frucht kann man einzelne Commits in git einfuegen(englisch)","cherry"
		if(o == 700 +3 || o == 800 +3 || o == 900+3 || o== 1000 + 3 || o== 1100 +3 || o==1200 +3 ) {
			fa[16]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F16);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[16];}
		//Letzter Commit in Git wird Rueckgaengig gemacht:git ?","revert"
		if(o>=1307 && o<=1312) {
			fa[17]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F17);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[17];}
		//Die drei Stufen von Git Reset:Mixed Soft und ?,"hard"
		if(o == 1000 +5 || o == 1100 +5 || o== 1200 +5 || o==1300 +5 ) {
			fa[18]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F18);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[18];}
		//Was funktioniert bei den meisten Wissenarbeitern nicht,"Hierachien"

		if( o>=803 && o<=813) {
			fa[19]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Einfach.fragefeld.setText(F19);}
				@Override
				public void focusLost(FocusEvent e) {Einfach.fragefeld.setText("");}};
				return fa[19];}
		

		return null;



	}
	
}
