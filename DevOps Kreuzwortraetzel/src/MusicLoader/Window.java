package MusicLoader;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window implements ActionListener {

	private JFrame frame; //Unser Frame
	private JButton btnPlay; //Unser PlayButton
	private Musicloader music; //sound

	public Window(int Width, int Height, String title) { //Wird von der Main-Methoder der Main-Klasse aufgerufen

		frame = new JFrame(title); //Initialisiert unseren Frame mit dem im Konstruktor ausgewählten title
		
		btnPlay = new JButton("PLAY"); //Initialisiert unseren PlayButton
		btnPlay.setBounds(0,0,Width,Height); //Hier werden Koordinaten, bzw. die Breite und die Höhe unseres Buttons bestimmt
		btnPlay.addActionListener(this); //Dem Button wird ein ActionListener hinzugefügt (Erkennung ob Button aktiviert wird)
		btnPlay.setVisible(true); // Der Button wird sichtbar gemacht
		
		music = new Musicloader(); //sound
		music.load();
		
		frame.setSize(Width,Height); //Bestimmt die Größe unseres Frames

		frame.setLocationRelativeTo(null); //Sorgt dafür, dass der Frame in der Mitte des Bildschirms angezeigt wird
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Schließt alles, wenn der Frame geschlossen wird

		frame.add(btnPlay); //Der Button wird dem Frame hinzugefügt

		frame.setVisible(true); //Der Frame wird sichtbar gemacht

	}



	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnPlay){ //sound
			music.play(Musicloader.sound);
		}
		
	}
}
