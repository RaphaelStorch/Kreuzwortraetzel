package logic;

import JFrames.Tutorial;

public class Main {
  public static Tutorial updater = new Tutorial();

  public static void main(String[] args) {
    init();
  }

  static void init() {
    System.out.println("Starte Programm");
    updater.setVisible(true);
  }
}
