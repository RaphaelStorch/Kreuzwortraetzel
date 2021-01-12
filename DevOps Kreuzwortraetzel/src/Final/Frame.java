<<<<<<< HEAD
//package Final;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.TextField;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.JFormattedTextField;
//import javax.swing.LayoutStyle.ComponentPlacement;
//import javax.swing.JTextField;
//import javax.swing.UIDefaults;
//import javax.swing.UIManager;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.util.Arrays;
//import java.awt.event.ActionEvent;
//import javax.swing.ImageIcon;
//import javax.swing.JTextPane;
//
//public class Frame{
//	
//	
//	public static JFrame frame = new JFrame(); 
//	public static JButton btn = new JButton("Testen");
//	public static JTextField[][] tf = new JTextField[10][10];
//	public static JLabel[][] jl = new JLabel[10][10];
//	public final static int width=28; 
//	public final static int height=30; 
//	public final static int x = 50; 
//	public final static int y = 80; 
//	private JTextField textField_1;
//	
//	
//	
//	
//	public JPanel contentPane;
//	private JTextField textField;
//	public Frame() {
//		
//		//Große Schrift 
//		Font defaultfont = new Font ("Arial", Font.PLAIN, 30);
//	       UIDefaults defaults = UIManager.getLookAndFeelDefaults();
//	       defaults.put("Button.font", defaultfont);
//	       defaults.put("TextField.font", defaultfont);
//	       defaults.put("Label.font", defaultfont);
//	       
//	       //JFrame standarts 
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(100, 100, 844, 442);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		frame.setContentPane(contentPane);
//		contentPane.setLayout(null);
//		framecontents(); 
//		
//		//Bottumlistener
//		btn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				}
//			}
//		});
//		
//		void framecontents(){
//		btn.setBounds(400, 350, 85, 30);
//		Font ButtonFond= new Font ("Arial", Font.BOLD, 12);
//		btn.setFont(ButtonFond);
//		contentPane.add(btn);
//		
//		JTextPane textPane = new JTextPane();
//		textPane.setBounds(564, 79, 139, 248);
//		contentPane.add(textPane);
//		
//		textField_1 = new JTextField();
//		textField_1.setBounds(31, 20, 359, 19);
//		contentPane.add(textField_1);
//		textField_1.setColumns(10);
//		
//		
//		 
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//		tf[i][j]= new JTextField();
//		tf[i][j].setBounds(x+i*width, y+j*height, width, height);
//		contentPane.add(tf[i][j]);
//		tf[i][j].setColumns(10);
//			}
//		}
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//		jl[i][j]= new JLabel();
//		jl[i][j].setBounds(x+i*width, y+j*height, width, height);
//		
//		
//			}
//		}
//	}}
//
=======
package Final;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class Frame{
	
	
	public static JFrame frame = new JFrame(); 
	public static JButton btn = new JButton("Testen");
	public static JTextField[][] tf = new JTextField[10][10];
	public static JLabel[][] jl = new JLabel[10][10];
	public final static int width=28; 
	public final static int height=30; 
	public final static int x = 50; 
	public final static int y = 80; 
	private JTextField textField_1;
	
	
	
	
	public JPanel contentPane;
	private JTextField textField;
	public Frame() {
		
		//Große Schrift 
		Font defaultfont = new Font ("Arial", Font.PLAIN, 30);
	       UIDefaults defaults = UIManager.getLookAndFeelDefaults();
	       defaults.put("Button.font", defaultfont);
	       defaults.put("TextField.font", defaultfont);
	       defaults.put("Label.font", defaultfont);
	       
	       //JFrame standarts 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 844, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		framecontents(); 
		
		//Bottumlistener
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				}
			}
		});
		
		void framecontents(){
		btn.setBounds(400, 350, 85, 30);
		Font ButtonFond= new Font ("Arial", Font.BOLD, 12);
		btn.setFont(ButtonFond);
		contentPane.add(btn);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(564, 79, 139, 248);
		contentPane.add(textPane);
		
		textField_1 = new JTextField();
		textField_1.setBounds(31, 20, 359, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		 
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
		tf[i][j]= new JTextField();
		tf[i][j].setBounds(x+i*width, y+j*height, width, height);
		contentPane.add(tf[i][j]);
		tf[i][j].setColumns(10);
			}
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
		jl[i][j]= new JLabel();
		jl[i][j].setBounds(x+i*width, y+j*height, width, height);
		
		
			}
		}
	}}

>>>>>>> main
