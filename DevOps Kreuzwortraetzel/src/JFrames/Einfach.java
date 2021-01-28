package JFrames;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import DataLoader.Database;
import logic.TestButton;

public class Einfach extends JFrame {

  /**
   * Launch the application.
   */

  public static void main(String[] args) {
    Einfach frame = new Einfach();
    frame.setVisible(true);
  }

  public static final int einfach = 0;
  private static JPanel contentPane = new JPanel();
  private static JButton testButton = new JButton("Testen");
  public static JTextField[][] tf = new JTextField[21][21];
  private final static int width = 32;
  private final static int height = 30;
  public static JTextField fragefeld = new JTextField();;
  private static String[][] aw = Database.geteinfachMatrix();
  private static String[][] eg = Database.getMatrixEg();
  private static JTextField textField_2 = new JTextField("Cheatcode eingeben");
  static JTextPane textPane = new JTextPane();
  static JPanel panel = new JPanel();
  static JLabel motivationgif = new JLabel("motivation");
  public static int Punktestand = 0;
  static Font buttonfont = new Font("Arial", Font.BOLD, 20);
  static JLabel PunkteLabel = new JLabel("Punktestand: " + Punktestand);
  static JScrollPane scrollPane = new JScrollPane(textPane, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
  static JLabel hintergrund = new JLabel("Hintergrund");
  static JButton hauptmenu = new JButton("Hauptmenu");

  /**
   * Create the frame.
   */
  public Einfach() {

    System.out.println("Starte auf Mittel");

    Frameassistent fae = new Frameassistent(this, contentPane, textPane, hauptmenu, buttonfont,
        fragefeld, hintergrund, PunkteLabel, scrollPane, tf, width, height, testButton, aw,
        motivationgif);
    fae.inittf(tf, width, height, contentPane, fragefeld, testButton, aw);
    fae.initJFrameStandards(this, contentPane);
    fae.initKonsole(textPane);
    fae.inithauptMenuButton(hauptmenu, this, buttonfont);
    fae.initFrageFeld(fragefeld);
    fae.initHintergrundBild(hintergrund);
    fae.initPunkteLabel(PunkteLabel);
    fae.initScrollPane(scrollPane);
    fae.initMotivationGIF(motivationgif);
    fae.seteinfachFocusListener(aw, tf);
    contentPane.add(hauptmenu);
    contentPane.add(PunkteLabel);
    contentPane.add(scrollPane);
    contentPane.add(textField_2);
    contentPane.add(motivationgif);

    new TestButton(testButton, tf, eg, aw, PunkteLabel, fragefeld, scrollPane, textField_2,
        motivationgif, hintergrund, this, textPane, buttonfont, contentPane);

    contentPane.add(testButton);
    contentPane.add(fragefeld);
    contentPane.add(hintergrund);
  }
}
