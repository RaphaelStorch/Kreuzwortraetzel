package JFrames;

import java.awt.Toolkit;
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

//import Logik.StartBildschirm;
//import Ressources.PicLoader;
//import Ressources.SoundLoader;

public class Tutorial extends JFrame {
	private static JButton einfachButton = new JButton("Einfach");
	private static JButton mittelButton = new JButton("Mittel");
	private static JButton schwerButton = new JButton("Schwer");
	private static JLabel[] spielanleitung= new JLabel[10]; 
	private static JLabel hintergrund = new JLabel("Hintergrundbild"); 
	private JPanel inhaltsbereich = new JPanel();;

	
	void Standarts(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tutorial.class.getResource("/JFrames/pics/Team STar Mario (1).png")));
		
		setTitle("Updater");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 450);
		
		inhaltsbereich.setBorder(new EmptyBorder(5, 5, 5, 5));
		inhaltsbereich.setLayout(null);
		setContentPane(inhaltsbereich);
	}
	
	
	
	public Tutorial() {
		Standarts();
		
		Tutorial.einfachButtonListener(einfachButton);
		einfachButton.setBounds(20,20,200,20);
		inhaltsbereich.add(einfachButton);
		Tutorial.mittelButtonListener(mittelButton);
		inhaltsbereich.add(mittelButton);
		Tutorial.schwerButtonListener(schwerButton);
		inhaltsbereich.add(schwerButton);
		
		
		JLabel lblNewLabel = new JLabel("Tutorial");
		for(int i=0; i<spielanleitung.length; i++) {
			spielanleitung[i] = new JLabel(); 
			inhaltsbereich.add(spielanleitung[i]);
		}
		spielanleitung[6].setText("Tutorial");
		spielanleitung[1].setText("1. Schau dir die Fragen genau an!");
		spielanleitung[2].setText("2. Klicke in das Feld um deine Antwort einzugeben!");
		spielanleitung[3].setText("3. Navigiere mit der Tap Taste um auf das n\\u00E4chste Feld zu gehen");
		spielanleitung[4].setText("4. Klicke auf den Test-Knopf um deine Eingabe zu \\u00DCberpr\\u00FCfen");
		spielanleitung[5].setText("W\\u00E4hle Start");
		
		
		
		
		hintergrund.setIcon(new ImageIcon("C:\\Users\\Raphael\\Desktop\\Git\\DEV OPS 2\\Kreuzwortraetzel\\Logo.png"));
		hintergrund.setBounds(0, 0, 623, 406);
		inhaltsbereich.add(hintergrund);
		
		lblNewLabel.setBounds(10, 10, 100, 10);
		lblNewLabel.setVisible(true);
		inhaltsbereich.add(lblNewLabel);
		
		
	}
	
	public static void einfachButtonListener(JButton einfachButton) {
		einfachButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if(e.getSource() == einfachButton){ //sound
//					StartBildschirm.klickSound.play(SoundLoader.sound);
//				}
//				Einfach frame = new Einfach();
//				frame.setVisible(true);
//				setVisible(false);
			}
		});
	}
	public static void mittelButtonListener(JButton mittelButton) {
		mittelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Mittel frame = new Mittel();
//				frame.setVisible(true);
//				setVisible(false);
			}
		});
	}
	public static void schwerButtonListener(JButton schwerButton) {
		schwerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Schwer frame = new Schwer();
//				frame.setVisible(true);
//				setVisible(false);
			}
		});
	}
}
