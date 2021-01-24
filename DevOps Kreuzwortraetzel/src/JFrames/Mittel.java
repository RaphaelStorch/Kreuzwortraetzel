package JFrames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ContainerOrderFocusTraversalPolicy;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Map;

import javax.swing.JScrollBar;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;

import DataLoader.Database;
import DataLoader.FragenAnzeiger;
import javax.swing.SwingConstants;


public class Mittel extends JFrame {

	public static JPanel contentPane=new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					Mittel frame = new Mittel();
					frame.setVisible(true);
	}

	public static JButton btn = new JButton("Testen");
	public static JTextField[][] tf = new JTextField[21][21];
	//tf = Textfieldgenerator.getTextfields; 
	//public static JLabel[][] jl = new JLabel[20][20];
	public final static int width=32; 
	public final static int height=30; 
	public final static int x = 50; 
	public final static int y = 80; 
	public static JTextField fragefeld;
	public static String[][] aw = Database.getMatrix(); 
	public static String[][] eg = Database.getMatrixEg(); 
	public static String konsole =""; 
	private static JTextField textField_2;
	static JTextPane textPane = new JTextPane();
	static JPanel panel = new JPanel();
	static JLabel lblNewLabel_1 = new JLabel("motivation");
	static int l = 0; 
	static int p = 0;
	static int Punktestand =0; 
	static Font ButtonFond= new Font ("Arial", Font.BOLD, 20);
	static JLabel PunkteLabel = new JLabel("Punktestand: " + Punktestand);
	static JScrollPane scrollPane = new JScrollPane(textPane,  
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	JLabel lblNewLabel = new JLabel("New label");
	/**
	 * Create the frame.
	 */
	public Mittel() {
		

		  MetalLookAndFeel.setCurrentTheme(new MyDefaultMetalTheme());
		    try {
		      UIManager.setLookAndFeel(new MetalLookAndFeel());
		    } catch (Exception e) {
		      e.printStackTrace();
		    }

		    SwingUtilities.updateComponentTreeUI(this);
		
		System.out.println("Starte auf Mittel");
		//Frameassistent.font();
		//	Standards();
		
		Frameassistent fa = new Frameassistent(this);
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(25, 25, 900, 750);
//		setTitle("DevOps Kreuzworträtzel");
//		setIconImage(Toolkit.getDefaultToolkit().getImage(Mittel.class.getResource("/JFrames/pics/Logo.png")));


		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		mainTextPanes();
		
		JButton Hauptmenu = new JButton("Hauptmenu");
		Hauptmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 Tutorial.main(null);
				setVisible(false);
			}
		});
		Hauptmenu.setBounds(668, 670, 154, 26);
		Hauptmenu.setBackground(Color.black);
		Hauptmenu.setForeground(Color.green);
		Hauptmenu.setFont(ButtonFond);
		
		contentPane.add(Hauptmenu);
		
		PunkteLabel.setBackground(Color.BLACK);
		PunkteLabel.setForeground(Color.GREEN);
		PunkteLabel.setFont(new Font ("Comic Sans", Font.BOLD, 14));
		PunkteLabel.setBounds(668, 564, 194, 26);
		
		
		contentPane.add(PunkteLabel);
		textPane.setBackground(Color.BLACK);
		
	//	scrollPane.setViewportBorder(new TitledBorder(null, "Fragefeld", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		scrollPane.setBounds(668, 30, 154, 272);
		contentPane.add(scrollPane);
		
//		JScrollPane scrollPane = new JScrollPane(textPane);
//		scrollPane.setBounds(10, -27, 127, -222);
//		textPane.setEditable(false);
//		panel_1.add(scrollPane);

		
		lblNewLabel_1.setIcon(new ImageIcon("..\\DevOps Kreuzwortraetzel\\Bilder\\motivation.gif"));
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setBounds(668, 406, 168, 134);
		contentPane.add(lblNewLabel_1);
	
		mainPanel();
		mainButton();
		mainfrageFeld();		
		
		testFeld();
		

		for(int i=0; i<21; i++) {
			for(int j=0; j<20; j++) {
				tf[i][j]= new JTextField();
				tf[i][j].setBounds(40+j*width, 70+i*height, width, height);
				contentPane.add(tf[i][j]);
				
				
				tf[i][j].setText(" ");
				tfListener(i, j);
				if(aw[i][j].equals(" ")) {tf[i][j].setBackground(Color.black);tf[i][j].setEditable(false);tf[i][j].setBorder(null);contentPane.remove(tf[i][j]);}
				tf[i][j].setColumns(10);
				if(!(aw[i][j].equals(" "))) {
					System.out.println("Reached");
					tf[i][j].addFocusListener(FragenAnzeiger.fragenMittel(i*10+j+1));
					System.out.println("Reached2");
				}

			}
		}
		
	}
	static String typed = "";
	void Standards(Object object, String s) {
		for(int i=0; i<21; i++) {
			for(int j=0; j<20; j++) {
				if(object.equals(tf[i][j])) {
					if(tf[i][j].getBackground().equals(Color.black)) {return;}
					tf[i][j].setText(" "+s.substring(0,1).toUpperCase());
					tf[i][j].setForeground(Color.BLACK);
					if(j<20) {
						if(!(tf[i][j+1].getBackground().equals(Color.black))) {tf[i][j+1].grabFocus();}
						}
					

				}}}
		
	}
	void mainTextPanes() {
		textPane.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {

			}
		});
		textPane.setBounds(630, 62, 139, 248);
		textPane.setForeground(Color.green);
		textPane.setEditable(false);
		//contentPane.add(textPane);
		
		
		lblNewLabel.setIcon(new ImageIcon(Mittel.class.getResource("/JFrames/pics/hintergrund2.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(0, 0, 876, 696);
		contentPane.add(lblNewLabel);

	}
static int konsolenzaehler=0; 
	void mainButton() {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				konsolenzaehler++;
				Punktestand=0;
				for(int i=0; i<21; i++) {
					for(int j=0; j<20; j++) {
						eg[i][j]=tf[i][j].getText();
						if(eg[i][j].equals(" "+ aw[i][j])) {
							if(j==0)konsole = konsole + "\n---Ausgabe Nr." +konsolenzaehler + "---" + "\n";
							konsole = konsole+"\n"+i+" "+j+" Richtig,  +1 ";
							tf[i][j].setText(""+eg[i][j]);

							tf[i][j].setBackground(Color.green);

							Punktestand = Punktestand + 1;
							PunkteLabel.setText("Punktestand: " + Punktestand);
							
							if(Punktestand==122) {
								System.out.println("Volle Punktzahl");
								String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

								  int n = JOptionPane.showOptionDialog( null,
								            "GEWONNEN! Endscreen sehen?",               // question
								            "Ja/Nein/Abbrechen",           // title
								            JOptionPane.YES_NO_CANCEL_OPTION,
								            JOptionPane.QUESTION_MESSAGE,  // icon
								            null, yesNoOptions,yesNoOptions[0] );

								  if ( n == JOptionPane.YES_OPTION ) {
								    System.out.println("Ja gewählt");
								  Mittel.Punktestand = 1000;
								  btn.setVisible(false);
								  fragefeld.setVisible(false);
								  panel.setVisible(false);
								  scrollPane.setVisible(false);
								  textField_2.setVisible(false);
								  lblNewLabel_1.setVisible(false);
								  PunkteLabel.setVisible(false);
								  }
							}
	
							//							//wenn man mal durchgekommen ist 
							if(Punktestand ==1000) {
								fragefeld.setText("GESCHAFT, DU HAST DIE VOLLE PUNKTZAHL");
								lblNewLabel.setIcon(new ImageIcon("..\\DevOps Kreuzwortraetzel\\Bilder\\Geschaft2.jpg"));
								lblNewLabel.addFocusListener(new FocusAdapter() {
									@Override
									public void focusGained(FocusEvent e) {
										System.out.println("Mittel gewonnen");
										String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

										  int n = JOptionPane.showOptionDialog( null,
										            "Nächstes Level?",               // question
										            "Ja/Nein/Abbrechen",           // title
										            JOptionPane.YES_NO_CANCEL_OPTION,
										            JOptionPane.QUESTION_MESSAGE,  // icon
										            null, yesNoOptions,yesNoOptions[0] );

										  if ( n == JOptionPane.YES_OPTION ) {
										    System.out.println("Ja gewählt");
										  	Schwer.main(null);
										  }
									}
								});
							
								lblNewLabel.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										System.out.println("Mittel gewonnen");
										String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

										  int n = JOptionPane.showOptionDialog( null,
										            "Nächstes Level?",               // question
										            "Ja/Nein/Abbrechen",           // title
										            JOptionPane.YES_NO_CANCEL_OPTION,
										            JOptionPane.QUESTION_MESSAGE,  // icon
										            null, yesNoOptions,yesNoOptions[0] );

										  if ( n == JOptionPane.YES_OPTION ) {
										    System.out.println("Ja gewählt");
										  setVisible(false);
										  	Schwer.main(null);
										  	
										  }
									}
								});
							
							}
						}else if(!(eg[i][j].equals(" ") )){
							konsole = konsole+"\n"+i+" "+j+" Falsch,  -1";
							Punktestand-=1;
							PunkteLabel.setText("Punktestand: " + Punktestand);
							//tf[i][j].setText(""+eg[i][j]);
							tf[i][j].setBackground(Color.red);
						}	else {}
					}
				}
				textPane.setText(textPane.getText() + konsole + "\nPunktestand: " + Punktestand + "\n");
			}
		});
		btn.setBounds(668, 625, 100, 35);
		Font ButtonFond= new Font ("Arial", Font.BOLD, 20);
		btn.setBackground(Color.black);
		btn.setForeground(Color.green);
		btn.setFont(ButtonFond);
		contentPane.add(btn);
	}

	void mainfrageFeld() {
		fragefeld = new JTextField();
		fragefeld.setBounds(31, 20, 561, 45);
		Font f = new Font ("Comic Sans", Font.BOLD, 16);
		fragefeld.setFont(f);
		contentPane.add(fragefeld);
		fragefeld.setColumns(10);
		fragefeld.setBackground(Color.black);
		fragefeld.setForeground(Color.green);
		fragefeld.setEditable(false);
		fragefeld.setBorder(new TitledBorder(null, "Fragefeld", TitledBorder.LEADING, TitledBorder.TOP, null, Color.green));
	}

	void mainPanel() {

		panel.setBounds(31, 69, 608, 634);
		contentPane.add(panel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 561, Short.MAX_VALUE)
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 604, Short.MAX_VALUE)
				);
		panel.setLayout(gl_panel);
		
		
		contentPane.remove(panel);
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

	//	for(int i=0; i<20; i++) {
	//		for(int j=0; j<20; j++) {
	//	jl[i][j]= new JLabel();
	//	jl[i][j].setBounds(x+i*width, y+j*height, width, height);
	//	
	//	
	//		}
	//	}
	
	void tfListener(int i, int j) {
		tf[i][j].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_2.setBackground(Color.black);
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textField_2.setBackground(Color.white);
			}});
		tf[i][j].addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
			@Override
			public void focusLost(FocusEvent e) {
				textField_2.setBackground(Color.white);
				fragefeld.setText("");
//				try {
				for(int i=0; i<21; i++) {
					for(int j=0; j<20; j++) {
//						if(e.getComponent().equals(tf[i][j]))Standards(e.getSource(), typed);
//					}}
//				}catch(Exception fehler) {
//					System.out.println("naja Fast");
//				}
			}}
		}});
		tf[i][j].addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				for(char k=65; k<=122; k++) {
					String typed = ""+e.getKeyChar();
					if(typed.equals(""+k)) {
						Standards(e.getSource(),typed);	
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
//				typed = ""+e.getKeyChar();
//				Standards(e.getSource(),typed);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
	}
	class MyDefaultMetalTheme extends DefaultMetalTheme {
//		  public ColorUIResource getWindowTitleInactiveBackground() {
//		    return new ColorUIResource(java.awt.Color.orange);
//		  }
//
//		  public ColorUIResource getWindowTitleBackground() {
//		    return new ColorUIResource(java.awt.Color.orange);
//		  }
//
//		  public ColorUIResource getPrimaryControlHighlight() {
//		    return new ColorUIResource(java.awt.Color.orange);
//		  }
//
//		  public ColorUIResource getPrimaryControlDarkShadow() {
//		    return new ColorUIResource(java.awt.Color.orange);
//		  }
//
//		  public ColorUIResource getPrimaryControl() {
//		    return new ColorUIResource(java.awt.Color.orange);
//		  }
//
//		  public ColorUIResource getControlHighlight() {
//		    return new ColorUIResource(java.awt.Color.orange);
//		  }
//
//		  public ColorUIResource getControlDarkShadow() {
//		    return new ColorUIResource(java.awt.Color.orange);
//		  }

//		  public ColorUIResource getControl() {
//		    return new ColorUIResource(java.awt.Color.green);
//		  }
		}
}
