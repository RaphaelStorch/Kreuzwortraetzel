package Test;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GewonnenMessage {

  public static void main(String argv[]) {
	  String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

	  int n = JOptionPane.showOptionDialog( null,
	            "Ja oder Nein?",               // question
	            "Ja/Nein/Abbrechen",           // title
	            JOptionPane.YES_NO_CANCEL_OPTION,
	            JOptionPane.QUESTION_MESSAGE,  // icon
	            null, yesNoOptions,yesNoOptions[0] );

	  if ( n == JOptionPane.YES_OPTION )
	    System.out.println("Ja gewählt");
	  Mittel.Punktestand = 123;
  }
}
