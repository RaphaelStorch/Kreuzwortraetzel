package JFrames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import DataLoader.Database;
import DataLoader.FragenAnzeiger;
import Logik.TestButton;

public class Schwer extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					Schwer frame = new Schwer();
					frame.setVisible(true);
			}
	

	private static JPanel contentPane=new JPanel();
	private static JButton testButton = new JButton("Testen");
	public static JTextField[][] tf = new JTextField[21][21];
	private final static int width=32; 
	private final static int height=30; 
	private final static int x = 50; 
	private final static int y = 80; 
	public static JTextField fragefeld= new JTextField();;
	private static String[][] aw = Database.getMatrix(); 
	private static String[][] eg = Database.getMatrixEg(); 
	private static String konsole =""; 
	private static JTextField textField_2 = new JTextField("Cheatcode eingeben");
	static JTextPane textPane = new JTextPane();
	static JPanel panel = new JPanel();
	static JLabel lblNewLabel_1 = new JLabel("motivation");
	static int l = 0; 
	static int p = 0;
	public static int Punktestand =0; 
	static Font buttonfont= new Font ("Arial", Font.BOLD, 20);
	static JLabel PunkteLabel = new JLabel("Punktestand: " + Punktestand);
	static JScrollPane scrollPane = new JScrollPane(textPane,  
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	static JLabel hintergrund = new JLabel("Hintergrund");
	static JButton hauptmenu = new JButton("Hauptmenu");
	
	
	/**
	 * Create the frame.
	 */
	public Schwer() {

		System.out.println("Starte auf Schwer");

		Frameassistent frameassistent = new Frameassistent(this, contentPane, textPane, 
				hauptmenu, buttonfont, fragefeld, hintergrund);
		
		contentPane.add(hauptmenu);

		PunkteLabel.setBackground(Color.BLACK);
		PunkteLabel.setForeground(Color.GREEN);
		PunkteLabel.setFont(new Font ("Comic Sans", Font.BOLD, 14));
		PunkteLabel.setBounds(668, 564, 194, 26);


		contentPane.add(PunkteLabel);
		textPane.setBackground(Color.BLACK);

		scrollPane.setBounds(668, 30, 154, 272);
		contentPane.add(scrollPane);


		lblNewLabel_1.setIcon(new ImageIcon("..\\DevOps Kreuzwortraetzel\\Bilder\\motivation.gif"));
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setBounds(668, 406, 168, 134);
		contentPane.add(lblNewLabel_1);

		
		
		textField_2.setBounds(668, 347, 96, 19);
		contentPane.add(textField_2);
		TestButton tb = new TestButton(testButton, tf, eg, aw, PunkteLabel, fragefeld, scrollPane, 
				textField_2, lblNewLabel_1, hintergrund, this, textPane,buttonfont, contentPane);

		contentPane.add(testButton);
		contentPane.add(fragefeld);
	//	testFeld();


		for(int i=0; i<21; i++) {
			for(int j=0; j<20; j++) {
				tf[i][j]= new JTextField();
				tf[i][j].setBounds(40+j*width, 70+i*height, width, height);
				contentPane.add(tf[i][j]);

				tf[i][j].setText(" ");
				frameassistent.tfListener(i, j, tf, fragefeld, testButton);
				if(aw[i][j].equals(" ")) {tf[i][j].setBackground(Color.black);tf[i][j].setEditable(false);tf[i][j].setBorder(null);contentPane.remove(tf[i][j]);}
				tf[i][j].setColumns(10);
				if(!(aw[i][j].equals(" "))) {
					tf[i][j].addFocusListener(FragenAnzeiger.fragenMittel(i*10+j+1));
				}
			}
		}
		contentPane.add(hintergrund);
	}

}
