package logic;

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

import JFrames.Mittel;
import JFrames.Schwer;

public class TestButton {

    public TestButton(JButton testButton, JTextField[][] tf, String[][] eg, 
            String[][] aw, JLabel PunkteLabel,JTextField fragefeld, 
            JScrollPane scrollPane,JTextField textField_2, JLabel lblNewLabel_1,
            JLabel hintergrund, JFrame jf, JTextPane textPane, 
            Font buttonfont, JPanel contentPane) {

        testFeld(textField_2, fragefeld, contentPane, tf, aw, testButton);
        mainButton(testButton, tf, eg, aw, PunkteLabel, fragefeld, scrollPane, textField_2, lblNewLabel_1, hintergrund,
                jf, textPane, buttonfont);

    }

    static String konsole = "";
    static int Punktestand = 0;
    static int konsolenzaehler = 0;

    void mainButton(JButton testButton, JTextField[][] tf, String[][] eg, String[][] aw, JLabel PunkteLabel,
            JTextField fragefeld, JScrollPane scrollPane, JTextField textField_2, JLabel lblNewLabel_1,
            JLabel hintergrund, JFrame jf, JTextPane textPane, Font buttonfont) {
        testButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                konsolenzaehler++;
                Punktestand = 0;
                for (int i = 0; i < 21; i++) {
                    for (int j = 0; j < 20; j++) {
                        eg[i][j] = tf[i][j].getText();
                        if (eg[i][j].equals(" " + aw[i][j])) {
                            if (j == 0)
                                konsole = konsole + "\n---Ausgabe Nr." + konsolenzaehler + "---" + "\n";
                            konsole = konsole + "\n" + i + " " + j + " Richtig,  +1 ";
                            tf[i][j].setText("" + eg[i][j]);

                            tf[i][j].setBackground(Color.green);

                            Punktestand = Punktestand + 1;
                            PunkteLabel.setText("Punktestand: " + Punktestand);

                            if (Punktestand == 122) {
                                System.out.println("Volle Punktzahl");
                                String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

                                int n = JOptionPane.showOptionDialog(null, "GEWONNEN! Endscreen sehen?", // question
                                        "Ja/Nein/Abbrechen", // title
                                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, // icon
                                        null, yesNoOptions, yesNoOptions[0]);

                                if (n == JOptionPane.YES_OPTION) {
                                    System.out.println("Ja gewählt");
                                    Mittel.Punktestand = 1000;

                                    for (int k = 0; i < 21; i++) {
                                        for (int p = 0; j < 20; j++) {
                                            tf[k][p].setVisible(false);
                                        }
                                    }

                                    testButton.setVisible(false);
                                    fragefeld.setVisible(false);
                                    scrollPane.setVisible(false);
                                    textField_2.setVisible(false);
                                    lblNewLabel_1.setVisible(false);
                                    PunkteLabel.setVisible(false);
                                }
                            }

                            // //wenn man mal durchgekommen ist
                            if (Punktestand == 1000) {
                                fragefeld.setText("GESCHAFT, DU HAST DIE VOLLE PUNKTZAHL");
                                hintergrund
                                        .setIcon(new ImageIcon("..\\DevOps Kreuzwortraetzel\\Bilder\\Geschaft2.jpg"));
                                hintergrund.addFocusListener(new FocusAdapter() {
                                    @Override
                                    public void focusGained(FocusEvent e) {
                                        System.out.println("Mittel gewonnen");
                                        String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

                                        int n = JOptionPane.showOptionDialog(null, "Nächstes Level?", // question
                                                "Ja/Nein/Abbrechen", // title
                                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, // icon
                                                null, yesNoOptions, yesNoOptions[0]);

                                        if (n == JOptionPane.YES_OPTION) {
                                            System.out.println("Ja gewählt");
                                            Schwer.main(null);
                                        }
                                    }
                                });

                                hintergrund.addMouseListener(new MouseAdapter() {
                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        System.out.println("Mittel gewonnen");
                                        String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

                                        int n = JOptionPane.showOptionDialog(null, "Nächstes Level?", // question
                                                "Ja/Nein/Abbrechen", // title
                                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, // icon
                                                null, yesNoOptions, yesNoOptions[0]);

                                        if (n == JOptionPane.YES_OPTION) {
                                            System.out.println("Ja gewählt");
                                            jf.setVisible(false);
                                            Schwer.main(null);

                                        }
                                    }
                                });

                            }
                        } else if (!(eg[i][j].equals(" "))) {
                            konsole = konsole + "\n" + i + " " + j + " Falsch,  -1";
                            Punktestand -= 1;
                            PunkteLabel.setText("Punktestand: " + Punktestand);
                            // tf[i][j].setText(""+eg[i][j]);
                            tf[i][j].setBackground(Color.red);
                        } else {
                        }
                    }
                }
                textPane.setText(textPane.getText() + konsole + "\nPunktestand: " + Punktestand + "\n");
            }
        });
        testButton.setBounds(668, 625, 100, 35);

        testButton.setBackground(Color.black);
        testButton.setForeground(Color.green);
        testButton.setFont(buttonfont);

    }

    static int complete;

    void testFeld(JTextField textField_2, JTextField fragefeld, JPanel contentPane, JTextField[][] tf, String[][] aw,
            JButton btn) {
        System.out.println("Hier");
        textField_2.setBounds(668, 347, 96, 19);
        textField_2.setBackground(Color.black);
        textField_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField_2.setBackground(Color.black);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                textField_2.setBackground(Color.green);
                if (e.getSource().equals(textField_2)) {
                    complete++;
                    if (complete == 5) {
                        System.out.println("Cheat ausgeloest");
                        for (int i = 0; i < 21; i++) {
                            for (int j = 0; j < 20; j++) {
                                if (!(tf[i][j].getBackground().equals(Color.black)))
                                    tf[i][j].setText(" " + aw[i][j]);
                                fragefeld.setText("CHEAT AUSGELÖST");

                            }
                        }
                        btn.doClick();
                        complete = 6;
                    }
                    System.out.println("LOL");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                textField_2.setBackground(Color.black);
            }
        });
        textField_2.addKeyListener(new KeyAdapter() {
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
        textField_2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                fragefeld.setText("Hallo Welt");
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_2.setBackground(Color.green);
                fragefeld.setText("");
            }
        });
        textField_2.setBounds(668, 347, 96, 19);

        textField_2.setColumns(10);
    }
}
