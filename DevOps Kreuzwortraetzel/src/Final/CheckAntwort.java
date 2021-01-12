package Final;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import GUI.Attempt;

public class CheckAntwort {
	
	CheckAntwort(){
		aL(null, 0, 0, null); 
	}
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
	
	CheckAntwort(String[][][] eingabe){
	
	for(int i=0; i<10; i++) {
		for(int j=0; j<10; j++) {
			String zw="S";
			if(tf[i][j].getText().equals(zw)) {
				jl[i][j].setText(zw);
				tf[i][j].setText("LEER");
				tf[i][j].setBounds(1000, 1000, width, height);;
				contentPane.remove(tf[i][j]);
				jl[i][j].setBackground(Color.GREEN);
				contentPane.add(jl[i][j]);
			}
		}
	}}
}
