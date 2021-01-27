package JFrames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.accessibility.AccessibleContext;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import DataLoader.FragenAnzeiger;
import Logik.Main;
import Logik.TestButton;
import Logik.at;



public class Frameassistent{
	public static void font() {
		//		Font defaultfont = new Font ("Comic Sans", Font.PLAIN, 29);
		//	       UIDefaults defaults = UIManager.getLookAndFeelDefaults();
		//	       defaults.put("Button.font", defaultfont); 
		//	       defaults.put("TextField.font", defaultfont);
		//	       defaults.put("Label.font", defaultfont);
	}
	public Frameassistent(JFrame jf, JPanel contentPane, JTextPane textPane, 
			JButton hauptmenu, Font buttonfont, JTextField fragefeld, JLabel hintergrundBild, 
			JLabel PunkteLabel, JScrollPane scrollPane, JTextField[][] tf, int width, int height,
			JButton testButton, String[][] aw, JLabel motivationgif) {

		initJFrameStandards(jf, contentPane);
		initKonsole(textPane);
		inithauptMenuButton(hauptmenu, jf, buttonfont);
		initFrageFeld(fragefeld);
		initHintergrundBild(hintergrundBild);
		initPunkteLabel(PunkteLabel);
		initScrollPane(scrollPane);
		inittf(tf, width, height, contentPane, fragefeld, testButton, aw);
		initMotivationGIF(motivationgif);
	}

	public void initJFrameStandards(JFrame jf, JPanel contentPane) { 
		System.out.println("Loading Standards");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(25, 25, 900, 750);
		jf.setTitle("DevOps Kreuzworträtzel");
		System.out.println("Loading Icon");
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage(Mittel.class.getResource("/JFrames/pics/Team STar Mario (1).png")));	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jf.setContentPane(contentPane);
		contentPane.setLayout(null);


	}
	void initKonsole(JTextPane textPane) {
		textPane.setBounds(630, 62, 139, 248);
		textPane.setForeground(Color.green);
		textPane.setBackground(Color.BLACK);
		textPane.setEditable(false);
	}

	void inithauptMenuButton(JButton hauptmenu, JFrame jf, Font buttonFond) {
		hauptmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
				jf.setVisible(false);
			}
		});
		hauptmenu.setBounds(668, 670, 154, 26);
		hauptmenu.setBackground(Color.black);
		hauptmenu.setForeground(Color.green);
		hauptmenu.setFont(buttonFond);
	}

	void initHintergrundBild(JLabel hintergrund) {
		hintergrund.setIcon(new ImageIcon(Mittel.class.getResource("/JFrames/pics/hintergrund2.gif")));
		hintergrund.setBounds(0, 0, 1200, 1000);
	}

	void inittfListener(int i, int j, JTextField[][] tf, JTextField fragefeld, JButton btn) {
		tf[i][j].addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
			@Override
			public void focusLost(FocusEvent e) {
				fragefeld.setText("");
				for(int i=0; i<21; i++) {
					for(int j=0; j<20; j++) {
					}}
			}});
		tf[i][j].addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				for(char k=65; k<=122; k++) {
					String typed = ""+e.getKeyChar();
					if(typed.equals(""+k)) {
						inittfformat(e.getSource(),typed, tf);	
					}
				}
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					btn.doClick();
				}
				if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
					System.out.println("Gerückt");
					for(int i=0; i<21; i++) {
						for(int j=0; j<20; j++) {
							if(j<20 && e.getComponent().equals(tf[i][j])) {

								if(!(tf[i][j-1].getBackground().equals(Color.black))) {
									tf[i][j-1].grabFocus();}
								tf[i][j].setText(" ");
								tf[i][j-1].setText(" ");
							}
						}
					}}

				System.out.println(e.getKeyChar());

			}
			@Override
			public void keyPressed(KeyEvent e) {
				//								typed = ""+e.getKeyChar();
				//								inittfformat(e.getSource(),typed, tf);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
	}


	static String typed = "";
	void inittfformat(Object object, String s, JTextField[][] tf) {
		Font f = new Font ("Comic Sans", Font.BOLD, 16);
		for(int i=0; i<21; i++) {
			for(int j=0; j<20; j++) {
				if(object.equals(tf[i][j])) {
					if(tf[i][j].getBackground().equals(Color.black)) {return;}
					tf[i][j].setText(" "+s.substring(0,1).toUpperCase());
					tf[i][j].setFont(f);
					tf[i][j].setForeground(Color.BLACK);
					if(j<20) {
						if(!(tf[i][j+1].getBackground().equals(Color.black))) {tf[i][j+1].grabFocus();}
					}


				}
			}
		}

	}

	void initMotivationGIF(JLabel motivationgif) {
		motivationgif.setIcon(new ImageIcon(Mittel.class.getResource("/JFrames/pics/motivation.gif")));
		motivationgif.setLabelFor(motivationgif);
		motivationgif.setBounds(668, 406, 168, 134);

	}

	void initFrageFeld(JTextField fragefeld) {
		fragefeld.setBounds(31, 20, 561, 45);
		Font f = new Font ("Comic Sans", Font.BOLD, 16);
		fragefeld.setFont(f);
		fragefeld.setColumns(10);
		fragefeld.setBackground(Color.black);
		fragefeld.setForeground(Color.green);
		fragefeld.setEditable(false);
		fragefeld.setBorder(new TitledBorder(null, "Fragefeld", TitledBorder.LEADING, TitledBorder.TOP, null, Color.green));
	}

	void initPunkteLabel(JLabel PunkteLabel) {
		PunkteLabel.setBackground(Color.BLACK);
		PunkteLabel.setForeground(Color.GREEN);
		PunkteLabel.setFont(new Font ("Comic Sans", Font.BOLD, 14));
		PunkteLabel.setBounds(668, 564, 194, 26);
	}

	void initScrollPane(JScrollPane scrollPane) {
		scrollPane.setBounds(668, 30, 154, 272);
	}

	void inittf(JTextField[][] tf, int width, int height, JPanel contentPane, JTextField fragefeld, JButton testButton, String[][] aw) {
		for(int i=0; i<21; i++) {
			for(int j=0; j<20; j++) {
				Font f = new Font ("Comic Sans", Font.BOLD, 16);
				tf[i][j]= new JTextField();
				tf[i][j].setBounds(40+j*width, 70+i*height, width, height);
				contentPane.add(tf[i][j]);

				tf[i][j].setText(" ");
				tf[i][j].setFont(f);
				inittfListener(i, j, tf, fragefeld, testButton);
				if(aw[i][j].equals(" ")) {tf[i][j].setBackground(Color.black);
				tf[i][j].setEditable(false);
				tf[i][j].setBorder(null);contentPane.remove(tf[i][j]);
				}
				tf[i][j].setColumns(10);
				if(!(aw[i][j].equals(" "))) {
					tf[i][j].addFocusListener(FragenAnzeiger.fragenMittel(i*100+j+1));
					tf[i][j].addFocusListener(FragenAnzeiger.fragenEinfach(i*100+j+1));
				}
			}
		}
	}
}