package Test;

import java.awt.Font;
import java.awt.Toolkit;

import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class Frameassistent {
	static void font() {
		Font defaultfont = new Font ("Comic Sans", Font.PLAIN, 29);
	       UIDefaults defaults = UIManager.getLookAndFeelDefaults();
	       defaults.put("Button.font", defaultfont); 
	       defaults.put("TextField.font", defaultfont);
	       defaults.put("Label.font", defaultfont);
	}
	
}
