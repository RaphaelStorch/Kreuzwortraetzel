package Logik;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

import JFrames.KeyAdapter;
import JFrames.KeyEvent;

public class TestButton {
	
	
	public TestButton() {
		// TODO Auto-generated constructor stub
	}
	
	static int complete;
	void testFeld() {
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_2.setBackground(Color.black);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				textField_2.setBackground(Color.green);
				if(e.getSource().equals(textField_2)) {
					complete++;
					if(complete==5) {
						System.out.println("Cheat ausgeloest");
						for(int i=0; i<21; i++) {
							for(int j=0; j<20; j++) {
								if(!(tf[i][j].getBackground().equals(Color.black)))tf[i][j].setText(" "+aw[i][j]);
								fragefeld.setText("CHEAT AUSGELÖST");

							}}
						btn.doClick();
						complete=6;
					}
					System.out.println("LOL");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textField_2.setBackground(Color.white);
			}
		});
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String s = ""+e.getKeyChar();
				fragefeld.setText(s.toUpperCase());
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fragefeld.setText("Hallo Welt");
			}
			@Override
			public void focusLost(FocusEvent e) {
				textField_2.setBackground(Color.white);
				fragefeld.setText("");
			}
		});
		textField_2.setBounds(668, 347, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
