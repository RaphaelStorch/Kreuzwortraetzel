package MusicLoader;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musicloader {

  public static File sound;

  public static float value;

  static Clip clip;

  public Musicloader() {
    value = 0;
  }
  public void load() {
    sound = new File("res/sounds/collect.wav");
  }
  public static void play(File sound) {
    try {
      clip = AudioSystem.getClip();
      clip.open(AudioSystem.getAudioInputStream(sound));
      clip.start();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
