package GUI;

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

public class Attempt extends JFrame {

	public JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Font defaultfont = new Font ("Arial", Font.PLAIN, 30);
	       UIDefaults defaults = UIManager.getLookAndFeelDefaults();
	       defaults.put("Button.font", defaultfont);
	       defaults.put("TextField.font", defaultfont);
	       defaults.put("Label.font", defaultfont);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attempt frame = new Attempt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public static JButton btn = new JButton("Testen");
	public static JTextField[][] tf = new JTextField[10][10];
	public static JLabel[][] jl = new JLabel[10][10];
	public final static int width=28; 
	public final static int height=30; 
	public final static int x = 50; 
	public final static int y = 80; 
	private JTextField textField_1;
	
	public Attempt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				}
				
				String s = tf[0][0].getText(); 
				System.out.println(s);
			}
		});
		
		
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
	}
}
