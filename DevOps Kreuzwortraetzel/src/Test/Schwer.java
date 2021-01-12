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
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import wortcutter.Boi;

public class Schwer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schwer frame = new Schwer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static JButton btn = new JButton("Testen");
	public static JButton btn1 = new JButton("1");
	public static JButton btn2 = new JButton("2");
	public static JTextField[][] tf = new JTextField[20][20];
	//tf = Textfieldgenerator.getTextfields; 
	public static JLabel[][] jl = new JLabel[20][20];
	public final static int width=28; 
	public final static int height=30; 
	public final static int x = 50; 
	public final static int y = 80; 
	private JTextField fragefeld;
	public static String[][] aw = Boi.getMatrix(); 
	public static String[][] eg = Boi.getMatrixEg(); 
	public static String konsole =""; 
	private JTextField textField_2;
	static JTextPane textPane = new JTextPane();
	
	
	/**
	 * Create the frame.
	 */
	public Schwer() {

		System.out.println("Starte auf Schwer");
		Frameassistent.font();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 900, 750);
		setTitle("DevOps Kreuzworträtzel");
		setIconImage(Toolkit.getDefaultToolkit().getImage("..\\DevOps Kreuzwortraetzel\\Bilder\\hicon.jpg"));
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(630, 62, 139, 248);
		contentPane.add(textPane);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				konsole = "";
				for(int i=0; i<20; i++) {
					for(int j=0; j<20; j++) {
						tf[i][j].setText(""+aw[i][j]);
						eg[i][j]=tf[i][j].getText();
						if(eg[i][j].equals(" "+ aw[i][j])) {
							konsole = konsole+"\n"+i+" "+j+" Richtig";
							//tf[i][j].setText(""+eg[i][j]);
							tf[i][j].setBackground(Color.green);
						}else if(!(eg[i][j].equals(" ") )){
							konsole = konsole+"\n"+i+" "+j+" Falsch";
							tf[i][j].setText(""+eg[i][j]);
							tf[i][j].setBackground(Color.red);
						}	
						}
					}

				textPane.setText(konsole);
				}
				
			});
		
		
		btn.setBounds(630, 600, 85, 30);
		Font ButtonFond= new Font ("Arial", Font.BOLD, 12);
		btn.setFont(ButtonFond);
		contentPane.add(btn);
		
		btn1.setBounds(0, 0, 0, 0);
		btn1.setFont(ButtonFond);
		contentPane.add(btn1);
		
		
		fragefeld = new JTextField();
		fragefeld.setBounds(31, 20, 359, 30);
		contentPane.add(fragefeld);
		fragefeld.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 69, 561, 604);
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Raphael\\Desktop\\Git\\Kreuzwortraetzel\\575e53ee68_BACKGROUND_Stars_-_by_Dunkellicht2.gif"));
		lblNewLabel.setBounds(0, 0, 886, 713);
		contentPane.add(lblNewLabel);
		
		
		
		 
		for(int i=0; i<20; i++) {
			for(int j=0; j<20; j++) {
		tf[i][j]= new JTextField();
		tf[i][j].setBounds(0+j*width, 0+i*height, width, height);
		panel.add(tf[i][j]);
		tf[i][j].setText(" ");
		if(aw[i][j].equals(" "))tf[i][j].setBackground(Color.black);
		if(tf[i][j].getBackground().equals(Color.black)) {	btn1.setBounds(tf[i][j].getBounds());  btn1.setVisible(true);}
		tf[i][j].setColumns(10);
		if(!(aw[i][j].equals(" "))) {tf[i][j].addFocusListener(
				
				
				new FocusAdapter() {
		
			@Override
			public void focusGained(FocusEvent e) {
				tf[1][1].setBackground(Color.CYAN);
				fragefeld.setText("Hallo Welt");
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				tf[1][1].setBackground(Color.black);
				fragefeld.setText("");
			}
		});}
			}
		}
		for(int i=0; i<20; i++) {
			for(int j=0; j<20; j++) {
		jl[i][j]= new JLabel();
		jl[i][j].setBounds(x+i*width, y+j*height, width, height);
		
		
			}
		}
	}

}
