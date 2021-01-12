package Test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import wortcutter.Boi;
import wortcutter.FragenAnzeiger;

public class Mittel extends JFrame {

	public static JPanel contentPane=new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mittel frame = new Mittel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static JButton btn = new JButton("Testen");
	public static JTextField[][] tf = new JTextField[21][21];
	//tf = Textfieldgenerator.getTextfields; 
	public static JLabel[][] jl = new JLabel[20][20];
	public final static int width=28; 
	public final static int height=30; 
	public final static int x = 50; 
	public final static int y = 80; 
	public static JTextField fragefeld;
	public static String[][] aw = Boi.getMatrix(); 
	public static String[][] eg = Boi.getMatrixEg(); 
	public static String konsole =""; 
	private static JTextField textField_2;
	static JTextPane textPane = new JTextPane();
	static JPanel panel = new JPanel();
	static JLabel lblNewLabel = new JLabel("HintergrundMittel");
	static int l = 0; 
	static int p = 0;
	static int Punktestand =0; 
	/**
	 * Create the frame.
	 */
	public Mittel() {
		System.out.println("Starte auf Mittel");
		Frameassistent.font();
	//	Standards();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 900, 750);
		setTitle("DevOps Kreuzworträtzel");
		setIconImage(Toolkit.getDefaultToolkit().getImage("..\\DevOps Kreuzwortraetzel\\Bilder\\hicon.jpg"));
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("motivation");
		lblNewLabel_1.setIcon(new ImageIcon("..\\DevOps Kreuzwortraetzel\\Bilder\\motivation.gif"));
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setBounds(628, 404, 168, 134);
		contentPane.add(lblNewLabel_1);
		mainTextPanes();
		mainButton();
		mainfrageFeld();		
		mainPanel();
		testFeld();
		
		
		
		lblNewLabel.setIcon(new ImageIcon("..\\DevOps Kreuzwortraetzel\\Bilder\\hintergrund2.gif"));
		lblNewLabel.setBounds(0, 0, 886, 713);
		contentPane.add(lblNewLabel);
		
		for(int i=0; i<21; i++) {
			for(int j=0; j<20; j++) {
		tf[i][j]= new JTextField();
		tf[i][j].setBounds(0+j*width, 0+i*height, width, height);
		panel.add(tf[i][j]);
		tf[i][j].setText(" ");
		if(aw[i][j].equals(" "))tf[i][j].setBackground(Color.green);
		tf[i][j].setColumns(10);
		if(!(aw[i][j].equals(" "))) {
			System.out.println("Reached");
			tf[i][j].addFocusListener(FragenAnzeiger.fragenMittel(i*10+j+1));
			System.out.println("Reached2");
		}
		
			}
			}
//		for(int i=0; i<20; i++) {
//			for(int j=0; j<20; j++) {
//		jl[i][j]= new JLabel();
//		jl[i][j].setBounds(x+i*width, y+j*height, width, height);
//		
//		
//			}
//		}
	}

	void Standards() {
		
	}
	void mainTextPanes() {
		textPane.setBounds(630, 62, 139, 248);
		contentPane.add(textPane);
		
	}
	
	void mainButton() {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				konsole = "";
//				for(int i=0; i<21; i++) {
//					for(int j=0; j<20; j++) {
//						eg[i][j]=tf[i][j].getText();
//						if(eg[i][j].equals(" "+ aw[i][j])) {
//							konsole = konsole+"\n"+i+" "+j+" Richtig";
//							tf[i][j].setText(""+eg[i][j]);
//							tf[i][j].setBackground(Color.green);
//							Punktestand = Punktestand + 5;
//							
//							
//							//wenn man mal durchgekommen ist 
//
//							if(Punktestand >100) {
//								fragefeld.setText("GESCHAFT");
//								lblNewLabel.setIcon(new ImageIcon("..\\DevOps Kreuzwortraetzel\\Bilder\\Geschaft.jpg"));
//								panel.setVisible(false);
//							
//							
//						}else if(!(eg[i][j].equals(" ") )){
//							konsole = konsole+"\n"+i+" "+j+" Falsch";
//							tf[i][j].setText(""+eg[i][j]);
//							tf[i][j].setBackground(Color.red);
//							}
//						}	
//						}
//					}
				for(int i=0; i<21; i++) {
					for(int j=0; j<20; j++) {
						eg[i][j]=tf[i][j].getText();
						if(eg[i][j].equals(" "+ aw[i][j])) {
							konsole = konsole+"\n"+i+" "+j+" Richtig, 5 Punkte";
							tf[i][j].setText(""+eg[i][j]);
							tf[i][j].setBackground(Color.green);
							
							Punktestand = Punktestand + 5;
							
//							
//							
//							//wenn man mal durchgekommen ist 

							if(Punktestand >100) {
								fragefeld.setText("GESCHAFT, DU HAST DIE VOLLE PUNKTZAHL");
								lblNewLabel.setIcon(new ImageIcon("..\\DevOps Kreuzwortraetzel\\Bilder\\Geschaft2.jpg"));
								panel.setVisible(false);}
						}else if(!(eg[i][j].equals(" ") )){
							konsole = konsole+"\n"+i+" "+j+" Falsch";
							//tf[i][j].setText(""+eg[i][j]);
							tf[i][j].setBackground(Color.red);
						}	else {}
						}
					}
				textPane.setText(konsole + "\nPunktestand: " + Punktestand);
				}
			});
		btn.setBounds(630, 600, 85, 30);
		Font ButtonFond= new Font ("Arial", Font.BOLD, 14);
		btn.setFont(ButtonFond);
		contentPane.add(btn);
	}
	
	void mainfrageFeld() {
		fragefeld = new JTextField();
		fragefeld.setBounds(31, 20, 561, 30);
		Font f = new Font ("Comic Sans", Font.BOLD, 16);
		fragefeld.setFont(f);
		contentPane.add(fragefeld);
		fragefeld.setColumns(10);
	}
	
	void mainPanel() {

		panel.setBounds(31, 69, 561, 634);
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
	}
	
	void testFeld() {
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String s = ""+e.getKeyChar();
				fragefeld.setText(s.toUpperCase());
			}
		});
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fragefeld.setText("Hallo Welt");
			}
			@Override
			public void focusLost(FocusEvent e) {

				fragefeld.setText("");
			}
		});
		textField_2.setBounds(642, 347, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
	}
}
