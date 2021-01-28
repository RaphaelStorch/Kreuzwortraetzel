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

public class Schwer extends JFrame {

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    Schwer frame = new Schwer();
    frame.setVisible(true);
  }

  public static final int schwer = 2;
  private static JPanel contentPane = new JPanel();
  private static JButton testButton = new JButton("Testen");
  public static JTextField[][] tf = new JTextField[21][21];
  private final static int width = 32;
  private final static int height = 30;
  public static JTextField fragefeld = new JTextField();;
  private static String[][] aw = Database.getSchwerMatrix();
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
  public Schwer() {

    System.out.println("Starte auf Schwer");

    System.out.println("Starte auf Mittel");

    Frameassistent fas = new Frameassistent(this, contentPane, textPane, hauptmenu, buttonfont,
        fragefeld, hintergrund, PunkteLabel, scrollPane, tf, width, height, testButton, aw,
        motivationgif);
    fas.inittf(tf, width, height, contentPane, fragefeld, testButton, aw);
    fas.initJFrameStandards(this, contentPane);
    fas.initKonsole(textPane);
    fas.inithauptMenuButton(hauptmenu, this, buttonfont);
    fas.initFrageFeld(fragefeld);
    fas.initHintergrundBild(hintergrund);
    fas.initPunkteLabel(PunkteLabel);
    fas.initScrollPane(scrollPane);
    fas.initMotivationGIF(motivationgif);
    fas.setschwerFocusListener(aw, tf);
    contentPane.add(hauptmenu);
    contentPane.add(PunkteLabel);
    contentPane.add(scrollPane);
    contentPane.add(textField_2);
    contentPane.add(motivationgif);

    TestButton tb = new TestButton(testButton, tf, eg, aw, PunkteLabel, fragefeld, scrollPane,
        textField_2, motivationgif, hintergrund, this, textPane, buttonfont, contentPane);

    contentPane.add(testButton);
    contentPane.add(fragefeld);
    contentPane.add(hintergrund);
  }

}
