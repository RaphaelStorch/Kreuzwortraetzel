package JFrames;

import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import Logik.Main;
import MusicLoader.Musicloader;

//import Logik.StartBildschirm;
//import Ressources.PicLoader;
//import Ressources.SoundLoader;

public class Tutorial extends JFrame {
	private static JButton einfachButton = new JButton("Einfach");
	private static JButton mittelButton = new JButton("Mittel");
	private static JButton schwerButton = new JButton("Schwer");
	private static JButton TutorialScreenshotButton = new JButton("Tutorial Screenshot");
	private static JLabel[] spielanleitung= new JLabel[10]; 
	private static JLabel hintergrund = new JLabel("Hintergrundbild"); 
	private JPanel inhaltsbereich = new JPanel();

	
	void Standarts(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tutorial.class.getResource("/JFrames/pics/Team STar Mario (1).png")));
		
		setTitle("Tutorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 500);
		
		inhaltsbereich.setBorder(new EmptyBorder(5, 5, 5, 5));
		inhaltsbereich.setLayout(null);
		setContentPane(inhaltsbereich);
	}
	
	
	
	public Tutorial() {
		Standarts();
		
		Tutorial.einfachButtonListener(einfachButton);
		einfachButton.setBounds(20,227,156,55);
		inhaltsbereich.add(einfachButton);
		
		Tutorial.mittelButtonListener(mittelButton);
		mittelButton.setBounds(20,292,156,55);
		inhaltsbereich.add(mittelButton);
		
		Tutorial.schwerButtonListener(schwerButton);
		schwerButton.setBounds(20,357,156,55);
		inhaltsbereich.add(schwerButton);
		TutorialScreenshotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TutorialPicture();
			}
		});
		
	//	Tutorial.TutorialScreenshotButtonListener(TutorialScreenshotButton);
		TutorialScreenshotButton.setBounds(20,20,156,197);
		inhaltsbereich.add(TutorialScreenshotButton);
		
		
		
		//hintergrund.setIcon(new ImageIcon(Tutorial.class.getResource("/JFrames/pics/iconResized.jpg")));
		//hintergrund.setBounds(0, 0, 1276, 713);
		//inhaltsbereich.add(hintergrund);
		
	}
	void TutorialPicture() {
		JLabel TutorialBild = new JLabel();
		JFrame fenster = new JFrame(); 
		JPanel bildholder = new JPanel(); 
		fenster.setSize(1260, 720);
		fenster.setContentPane(bildholder);
		TutorialBild.setIcon(new ImageIcon(Tutorial.class.getResource("/JFrames/pics/iconResized.jpg")));
		TutorialBild.setBounds(0, 0, 1260, 720);
		bildholder.add(TutorialBild);
		fenster.setVisible(true);
	}
	
	public static void einfachButtonListener(JButton einfachButton) {
		einfachButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == einfachButton){ //sound
					Musicloader.play(Musicloader.sound);

				}
				Einfach frame = new Einfach();
				frame.setVisible(true);
				
			}
		});
	}
	public static void mittelButtonListener(JButton mittelButton) {
		mittelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mittel frame = new Mittel();
				frame.setVisible(true);
				
			}
		});
	}
	public static void schwerButtonListener(JButton schwerButton) {
		schwerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schwer frame = new Schwer();
				frame.setVisible(true);
				Main.updater.setVisible(false);
			}
		});
	}
}
