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
	
	public static void backgroundmarkerhorizontal(int zahl, int laenge) {
		
	}
	public static void backgroundmarkervertical(int zahl, int spalte, Object object, int p) {
//		for(int i = spalte; i<=zahl; i=i+10)Mittel.tf[i/10][spalte-1].setBackground(Color.yellow);
		for(int i = 0; i<=fragen[p][0].length(); i++)Mittel.tf[fragen[p][0].length()][153%10+i].setBackground(Color.yellow);

		for(int i=0; i<21; i++) {
			for(int j=0; j<20; j++) {
		if(object.equals(Mittel.tf[i][j]))Mittel.tf[i][j].setBackground(Color.yellow);}}
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
		Color[] zwcolor = new Color[30]; 

		//Verschmelzung von zwei Dateien,"Merge" (o>=3&&o<=9)
		if(o == 7 || o == 17 || o == 27 || o == 37 || o == 47){
			fa[1]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					System.out.println(F1);
					Mittel.fragefeld.setText(F1);
					//for(int i = 7; i<=47; i=i+10)Mittel.tf[i/10][7-1].setBackground(Color.yellow);
					

				}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");
				//for(int i = 7; i<=47; i=i+10)Mittel.tf[i/10][7-1].setBackground(Color.white);
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
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F3);
				for(int i = 0; i<=4; i++)Mittel.tf[203/10-1][203%10+i].setBackground(Color.yellow);}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");}};
				return fa[3];}
		//Ein gespeicherter Zwischenstand,"Commit"
		if(o>=4&&o<=9) {
			fa[4]= (FocusAdapter) new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {Mittel.fragefeld.setText(F4);
				
				for(int i = 0; i<6; i++) {
					zwcolor[i] = Mittel.tf[4/10][4%10+i-1].getBackground();
					Mittel.tf[4/10][4%10+i-1].setBackground(Color.yellow);
				}
				}
				@Override
				public void focusLost(FocusEvent e) {Mittel.fragefeld.setText("");
				for(int i = 0; i<6; i++) {Mittel.tf[4/10][4%10+i-1].setBackground(zwcolor[i]);
				}
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
				public void focusGained(FocusEvent e) {
					Mittel.fragefeld.setText(F6);
						}
					
					
//				backgroundmarkervertical(o, 14, e.getComponent());
				
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

}
