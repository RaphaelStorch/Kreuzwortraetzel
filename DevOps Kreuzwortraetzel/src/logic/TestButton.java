package logic;

import JFrames.Mittel;
import JFrames.Schwer;
import JFrames.Tutorial;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class TestButton {
  /**
   * Java Doc f�r TestButton.
   * 
   * @param testButton        -> �bergabe des Buttons, soll �berpr�fen
   * @param tf                -> �bergabe des Hauptrasters f�r �berpr�fung
   * @param eg                -> �bergabe des eingaberasters
   * @param aw                -> �bergabe des antwortrasters
   * @param punkteLabel       -> �bergabe des sichtbaren Punktestandschriftzugs
   * @param fragefeld         -> �bergabe des Fragefelds
   * @param scrollPane        -> �bergabe der Konsole
   * @param testField         -> �bergabe des Cheatfelds
   * @param motivationgraphic -> �bergabe des MotivationsGIF
   * @param hintergrund       -> �bergabe des Hintergrundbildes
   * @param jf                -> �bergabe des kompletten JFrame
   * @param textPane          -> �bergabe des Konsolenfelds
   * @param buttonfont        -> �bergabe des Buttonfonts
   * @param contentPane       -> �bergabe des Hauptpanes
   * @param punktemax         -> �bergabe der H�chstpunktezahl
   */

  public TestButton(JButton testButton, JTextField[][] tf, String[][] eg, String[][] aw,
      JLabel punkteLabel, JTextField fragefeld, JScrollPane scrollPane, JTextField testField,
      JLabel motivationgraphic, JLabel hintergrund, JFrame jf, JTextPane textPane, Font buttonfont,
      JPanel contentPane, int punktemax) {

    testFeld(testField, fragefeld, contentPane, tf, aw, testButton);
    mainButton(testButton, tf, eg, aw, punkteLabel, fragefeld, scrollPane, testField,
        motivationgraphic, hintergrund, jf, textPane, buttonfont, contentPane, punktemax);

  }

  static String konsole = "";
  static int punktestand = 0;
  static int konsolenzaehler = 0;

  void mainButton(JButton testButton, JTextField[][] tf, String[][] eg, String[][] aw,
      JLabel punkteLabel, JTextField fragefeld, JScrollPane scrollPane, JTextField testFeld,
      JLabel motivationGrafic, JLabel hintergrund, JFrame jf, JTextPane textPane, Font buttonfont,
      JPanel contentPane, int punkteMax) {
    testButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        konsolenzaehler++;
        punktestand = 0;
        for (int i = 0; i < 21; i++) {
          for (int j = 0; j < 20; j++) {
            eg[i][j] = tf[i][j].getText();
            if (eg[i][j].equals(" " + aw[i][j])) {
              if (j == 0) {
                konsole = konsole + "\n---Ausgabe Nr." + konsolenzaehler + "---" + "\n";
              }
              konsole = konsole + "\n" + i + " " + j + " Richtig,  +1 ";
              tf[i][j].setText("" + eg[i][j]);
              punkteSystem(punkteLabel, punkteMax);
              tf[i][j].setBackground(Color.green);
              

            } else if (!(eg[i][j].equals(" "))) {
              konsole = konsole + "\n" + i + " " + j + " Falsch,  -1";
              punktestand -= 1;
              punkteLabel.setText("Punktestand: " + punktestand);
              tf[i][j].setBackground(Color.red);
            }
          }
        }
        textPane.setText(textPane.getText() + konsole + "\nPunktestand: " + punktestand + "\n");
      }
    });
    testButton.setBounds(668, 625, 100, 35);
    testButton.setBackground(Color.black);
    testButton.setForeground(Color.green);
    testButton.setFont(buttonfont);

  }

  void punkteSystem(JLabel punkteLabel, int punkteMax) {
    punktestand = punktestand + 1;
    punkteLabel.setText("Punktestand: " + punktestand);

    if (punktestand == punkteMax) {
      System.out.println("Volle Punktzahl");
      String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

      int n = JOptionPane.showOptionDialog(null, "GEWONNEN! Endscreen sehen?", // question
          "Volle Punktezahl!", // title
          JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, // icon
          null, yesNoOptions, yesNoOptions[0]);

      if (n == JOptionPane.YES_OPTION) {
        System.out.println("Ja gew�hlt");
        Endscreen();
      }
    }
  }

  void Endscreen() {
    JLabel TutorialBild = new JLabel();
    JFrame fenster = new JFrame();
    JPanel bildholder = new JPanel();
    fenster.setSize(1500, 800);
    fenster.setContentPane(bildholder);
    TutorialBild
        .setIcon(new ImageIcon(Mittel.class.getResource("/JFrames/pics/GeschaftFinal.png")));
    TutorialBild.setBounds(50, 100, 1500, 720);
    bildholder.add(TutorialBild);
    bildholder.setBackground(Color.black);
    fenster.setVisible(true);
  }

  static int complete;

  void testFeld(JTextField testFeld, JTextField fragefeld, JPanel contentPane, JTextField[][] tf,
      String[][] aw, JButton btn) {
    System.out.println("Hier");
    testFeld.setBounds(668, 347, 96, 19);
    testFeld.setBackground(Color.black);
    testFeld.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        testFeld.setBackground(Color.black);
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        testFeld.setBackground(Color.green);
        if (e.getSource().equals(testFeld)) {
          complete++;
          if (complete >= 5) {
            System.out.println("Cheat ausgeloest");
            for (int i = 0; i < 21; i++) {
              for (int j = 0; j < 20; j++) {
                if (!(tf[i][j].getBackground().equals(Color.black))) {
                  tf[i][j].setText(" " + aw[i][j]);
                }
                fragefeld.setText("CHEAT AUSGEL�ST");

              }
            }
            btn.doClick();
            complete = 6;
          }
          System.out.println("Triggered " + complete);
        }
      }

      @Override
      public void mouseExited(MouseEvent e) {
        testFeld.setBackground(Color.black);
      }
    });
    testFeld.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
        String s = "" + e.getKeyChar();
        fragefeld.setText(s.toUpperCase());
      }

      @Override
      public void keyPressed(KeyEvent e) {
      }

      @Override
      public void keyTyped(KeyEvent e) {
      }
    });
    testFeld.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        fragefeld.setText("Hallo Welt");
      }

      @Override
      public void focusLost(FocusEvent e) {
        testFeld.setBackground(Color.green);
        fragefeld.setText("");
      }
    });
    testFeld.setBounds(668, 347, 96, 19);

    testFeld.setColumns(10);
  }
}
