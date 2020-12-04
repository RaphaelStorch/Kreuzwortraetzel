import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 26.11.2020
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JProgressBar jProgressBar1 = new JProgressBar();
  private JTextField jTextField1 = new JTextField();
  private JLabel jLabel2 = new JLabel();
  private JButton jButton1 = new JButton();
  private JSpinner jSpinner1 = new JSpinner();
    private SpinnerNumberModel jSpinner1Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JTextField jTextField2 = new JTextField();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 757; 
    int frameHeight = 460;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(26, 15, 198, 20);
    jLabel1.setText("Das Kreuzwortraetzel!");
    cp.add(jLabel1);
    jProgressBar1.setBounds(558, 387, 150, 16);
    jProgressBar1.setValue(5);
    jProgressBar1.setStringPainted(true);
    cp.add(jProgressBar1);
    jTextField1.setBounds(272, 56, 150, 20);
    cp.add(jTextField1);
    jLabel2.setBounds(40, 56, 169, 17);
    jLabel2.setText("Synonyme für Henne");
    cp.add(jLabel2);
    jButton1.setBounds(448, 56, 129, 17);
    jButton1.setText("Bestätigen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jSpinner1.setBounds(40, 88, 89, 17);
    jSpinner1.setValue(0);
    jSpinner1.setModel(jSpinner1Model);
    cp.add(jSpinner1);

    jTextField2.setBounds(168, 88, 401, 25);
    cp.add(jTextField2);
    jLabel3.setBounds(611, 13, 110, 20);
    jLabel3.setText("100 Coins");
    cp.add(jLabel3);
    jLabel4.setBounds(479, 13, 110, 20);
    jLabel4.setText("User Login");
    cp.add(jLabel4);
    jTextField3.setBounds(88, 176, 1, 9);
    cp.add(jTextField3);
    jTextField4.setBounds(40, 160, 617, 169);
    jTextField4.setText("Hallo");
    cp.add(jTextField4);
    // Ende Komponenten
    
    cp.setBackground(Color.CYAN);
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class GUI
