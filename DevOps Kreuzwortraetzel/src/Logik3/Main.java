package Logik3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Delayed;
import java.util.logging.Formatter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

import GUI.Attempt;

public class Main {
	static int x=10; 
	static int y=10; 
	static int b=2; 
	static String[][][] Raster =new String[x][y][b]; 
	static char[][][] RasterVersuch =new char[x][y][b]; 
	static String[][][] L�sung = new String[x][y][b];  
	 
	public static void main(String[] args) {
		{	   Font defaultfont = new Font ("Arial", Font.PLAIN, 30);
		       UIDefaults defaults = UIManager.getLookAndFeelDefaults();
		       defaults.put("Button.font", defaultfont);
		       defaults.put("TextField.font", defaultfont);
		       defaults.put("Label.font", defaultfont);
			
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Attempt frame = new Attempt();
						Rastereinsetzer(frame);
//						JLabel lblNewLabel = new JLabel("New label");
//						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Raphael\\Desktop\\Hintergrund.gif"));
//						lblNewLabel.setBounds(0, 0, 1820, 1405);
//						frame.contentPane.add(lblNewLabel);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		
		
		
		
		deklaration(); 
		frage();
	//	antwort();
	}
	
	static void deklaration() {
		String[] l�= new String[10];  
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
		L�sung[1][0][0] = String.format("%9s",l�[1])+String.format("%2s", " ");
		L�sung[2][0][0] = String.format("%8s",l�[2])+String.format("%2s", " ");
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
	
	
	
	static void Rastereinsetzer(Attempt frame) {
		JTextField[][] t = frame.tf;
		int width = frame.width;
		int height= frame.height;
		int x = frame.x;
		int y = frame.y;
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				t[i][j].setBounds(x+i*width, y+j*height, width, height);
				t[j][i].setText(" "+ Raster[i][j][0]);
				if(Raster[j][i][0].equals("V"))t[i][0].setBackground(Color.GREEN);
				if(Raster[j][i][0].equals(" "))t[i][j].setBackground(Color.BLACK);
				frame.contentPane.add(t[i][j]);
				t[i][j].setColumns(10);
			}
			}
		
		
		Attempt.btn.addActionListener(aL(frame, width, height, t));}
		
		
		public static ActionListener aL(Attempt frame, int width, int height, JTextField[][] t) {
			
			return new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JLabel[][] l = frame.jl;
					for(int i=0; i<10; i++) {
						for(int j=0; j<10; j++) {
							String zw="S";
							if(t[i][j].getText().equals(zw)) {
								l[i][j].setText(zw);
								t[i][j].setText("LEER");
								t[i][j].setBounds(1000, 1000, width, height);;
								frame.contentPane.remove(t[i][j]);
								l[i][j].setBackground(Color.GREEN);
								frame.contentPane.add(l[i][j]);
							}
						}
					}
					
					String s = t[0][0].getText(); 
					System.out.println(s);
				}
			};}
		
//	static String Antwort=""; 
//	static int zeile=0; 
//	static int spalte=0; 
//	static char antwortchar=' '; 
//	static void antwort() {
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Eingabemuster: zeilespalte enter Antwortchar "
//				+ "oder zeile Antwort");
//		zeile=scan.nextInt();
//		spalte=scan.nextInt();
//		Antwort = scan.next();
////		for(int i=0; i<Antwort.length(); i++) {
////		zeile = Integer.parseInt(Antwort.substring(1,2)); //zeile
////			if(Antwort.substring(3,5).equals("10")) {}//Antwort f�r ganze Zeile 
////			else {spalte= (int) Antwort.charAt(3);} //spalte
////			antwortchar=Antwort.charAt(4); 
////	}
//		System.out.println("die Eingabe war: " + zeile+ " "+ spalte + " " + Antwort);
//	}
	
}
