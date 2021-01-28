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

public class Mittel extends JFrame {

  /**
   * Launch the application.
   */

  public static void main(String[] args) {
    Mittel frame = new Mittel();
    frame.setVisible(true);
  }

  public static final int mittel = 1;
  private static JPanel contentPane = new JPanel();
  private static JButton testButton = new JButton("Testen");
  public static JTextField[][] tf = new JTextField[21][21];
  private final static int width = 32;
  private final static int height = 30;
  public static JTextField fragefeld = new JTextField();;
  private static String[][] aw = Database.getMatrix();
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
  public Mittel() {

    System.out.println("Starte auf Mittel");

    Frameassistent fam = new Frameassistent(this, contentPane, textPane, hauptmenu, buttonfont,
        fragefeld, hintergrund, PunkteLabel, scrollPane, tf, width, height, testButton, aw,
        motivationgif);
    fam.initmitteltf(tf, width, height, contentPane, fragefeld, testButton, aw);
    fam.initJFrameStandards(this, contentPane);
    fam.initKonsole(textPane);
    fam.inithauptMenuButton(hauptmenu, this, buttonfont);
    fam.initFrageFeld(fragefeld);
    fam.initHintergrundBild(hintergrund);
    fam.initPunkteLabel(PunkteLabel);
    fam.initScrollPane(scrollPane);
    fam.initMotivationGIF(motivationgif);
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
