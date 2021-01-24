package JFrames;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.accessibility.AccessibleContext;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

import Logik.at;



public class Frameassistent{
	public static void font() {
//		Font defaultfont = new Font ("Comic Sans", Font.PLAIN, 29);
//	       UIDefaults defaults = UIManager.getLookAndFeelDefaults();
//	       defaults.put("Button.font", defaultfont); 
//	       defaults.put("TextField.font", defaultfont);
//	       defaults.put("Label.font", defaultfont);
	}
	public Frameassistent(JFrame jf) {
		Standards(jf);
		
	}
	
	public void Standards(JFrame jf) { 
		System.out.println("Loading Standards");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(25, 25, 900, 750);
	//	jf.setTitle("DevOps Kreuzworträtzel");
		System.out.println("Loading Icon");
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage(Mittel.class.getResource("/JFrames/pics/Team STar Mario (1).png")));
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setIcon(new ImageIcon(at.class.getResource("/JFrames/pics/icon.jpg")));
	}
	
}
