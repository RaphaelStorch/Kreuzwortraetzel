package JFrames;

import java.awt.Color;
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

import MusicLoader.Musicloader;
import logic.Main;

public class Tutorial extends JFrame {
	private static JButton einfachButton = new JButton("Einfach");
	private static JButton mittelButton = new JButton("Mittel");
	private static JButton schwerButton = new JButton("Schwer");
	private static JButton TutorialScreenshotButton = new JButton("Tutorial Screenshot");
	private static JLabel[] spielanleitung = new JLabel[10];
	private static JLabel hintergrund = new JLabel("Hintergrundbild");
	private JPanel inhaltsbereich = new JPanel();
	 private Musicloader music = new Musicloader();

	void Standarts() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Tutorial.class.getResource("/JFrames/pics/Team STar Mario (1).png")));

		setTitle("Tutorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		this.setBackground(Color.black);

		inhaltsbereich.setBorder(new EmptyBorder(5, 5, 5, 5));
		inhaltsbereich.setLayout(null);
		setContentPane(inhaltsbereich);
	}

	public Tutorial() {
		Standarts();
		music.load();
		Tutorial.einfachButtonListener(einfachButton, music);
		einfachButton.setBounds(20,227,350,55);
		inhaltsbereich.add(einfachButton);
		
		Tutorial.mittelButtonListener(mittelButton, music);
		mittelButton.setBounds(20,292,350,55);
		inhaltsbereich.add(mittelButton);
		
		Tutorial.schwerButtonListener(schwerButton, music);
		schwerButton.setBounds(20,357,350,55);

		inhaltsbereich.add(schwerButton);
		TutorialScreenshotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TutorialPicture();
			}
		});
		TutorialScreenshotButton.setBounds(20, 20, 350, 200);
		TutorialScreenshotButton.setIcon(new ImageIcon(Tutorial.class.getResource("/JFrames/pics/tutorialicon.png")));
		inhaltsbereich.add(TutorialScreenshotButton);

	}

	void TutorialPicture() {
		JLabel TutorialBild = new JLabel();
		JFrame fenster = new JFrame();
		JPanel bildholder = new JPanel();
		fenster.setSize(1500, 800);
		fenster.setContentPane(bildholder);
		TutorialBild.setIcon(new ImageIcon(Tutorial.class.getResource("/JFrames/pics/Tutorial Bild Skaliert.jpg")));
		TutorialBild.setBounds(50, 100, 1500, 720);
		bildholder.add(TutorialBild);
		fenster.setVisible(true);
	}
	
	public static void einfachButtonListener(JButton einfachButton, Musicloader music) {
		einfachButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == einfachButton){
			    Musicloader.play(Musicloader.sound);
				}
				Einfach frame = new Einfach();
				frame.setVisible(true);

			}
		});
	}
	public static void mittelButtonListener(JButton mittelButton, Musicloader music) {
		mittelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  if(e.getSource() == mittelButton){
          Musicloader.play(Musicloader.sound);
        }
				Mittel frame = new Mittel();
				frame.setVisible(true);

			}
		});
	}
	public static void schwerButtonListener(JButton schwerButton, Musicloader music) {
		schwerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  if(e.getSource() == schwerButton){
          Musicloader.play(Musicloader.sound);
        }
				Schwer frame = new Schwer();
				frame.setVisible(true);
				Main.updater.setVisible(false);
			}
		});
	}
}
