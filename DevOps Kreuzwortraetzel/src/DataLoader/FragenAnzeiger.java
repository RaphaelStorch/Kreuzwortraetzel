package DataLoader;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextField;
import JFrames.Einfach;
import JFrames.Mittel;
import JFrames.Schwer;

public class FragenAnzeiger {
  static String line = "";
  static String[][] fragen = new String[30][2];

  static String[] values;

  public static String[][] getCSVFragen() {

    int counter = 0;
    try {
      BufferedReader br = new BufferedReader(
          new FileReader("..\\DevOps Kreuzwortraetzel\\src\\database\\MittelFragen.csv"));
      while ((line = br.readLine()) != null) {
        values = line.split(",");
        fragen[counter][0] = " " + counter + ". " + values[0];
        counter++;
        System.out.println(counter);
        System.out.println(values[0]);
        System.out.println(fragen[counter][0]);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return fragen;
  }

  static String[][] Fragen = getCSVFragen();

  public static FocusAdapter fragenMittel(int o) {
    System.out.println("Reached");
    FocusAdapter[] fa = new FocusAdapter[21];
    final String F1 = fragen[1][0];
    final String F2 = fragen[2][0];
    final String F3 = fragen[3][0];
    final String F4 = fragen[4][0];
    final String F5 = fragen[5][0];
    final String F6 = fragen[6][0];
    final String F7 = fragen[7][0];
    final String F8 = fragen[8][0];
    final String F9 = fragen[9][0];
    final String F10 = fragen[10][0];
    final String F11 = fragen[11][0];
    final String F12 = fragen[12][0];
    final String F13 = fragen[13][0];
    final String F14 = fragen[14][0];
    final String F15 = fragen[15][0];
    final String F16 = fragen[16][0];
    final String F17 = fragen[17][0];
    final String F18 = fragen[18][0];
    final String F19 = fragen[19][0];
    final String F20 = fragen[20][0];

    // Verschmelzung von zwei Dateien,"Merge" (o>=3&&o<=9)
    if (o == 7 || o == 100 + 7 || o == 200 + 7 || o == 300 + 7 || o == 400 + 7) {
      fa[1] = (FocusAdapter) new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
          ;
          Mittel.fragefeld.setText(F1);
          vertikaleReiheMarker(7, 7, 407, Color.yellow, e);
        }

        @Override
        public void focusLost(FocusEvent e) {
          Mittel.fragefeld.setText("");
          resetColor();
        }
      };
      return fa[1];
    }
    // Wenn man ein neues Verzeichnis in git haben möchte,"mkdir"
    if (o >= 1403 && o <= 1407) {
      fa[2] = (FocusAdapter) new FocusAdapter() {

  @Override
  public void focusGained(FocusEvent e) {
    Mittel.fragefeld.setText(F2);
    horizontaleReiheMarker(1403, 1407, Color.yellow, e);
  }

  @Override
        public void focusLost(FocusEvent e) {
          Mittel.fragefeld.setText("");
          resetColor();
        }
      };
      return fa[2];
    }
    // Befehl zum Anlegen einer Datei in git,"echo"
    if (o >= 1903 && o <= 1906) {
      fa[3] = (FocusAdapter) new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
          Mittel.fragefeld.setText(F3);
          horizontaleReiheMarker(1903, 1906, Color.yellow, e);
        }

        @Override
        public void focusLost(FocusEvent e) {
          Mittel.fragefeld.setText("");
          resetColor();
        }
      };
      return fa[3];
    }
  // Ein gespeicherter Zwischenstand,"Commit"
  if(o>=4&&o<=9)

  {
    fa[4] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F4);
        horizontaleReiheMarker(4, 9, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[4];
  }
  // Frueherer in Git: "Master",Main"
  if(o>=1009&&o<=1012)
  {
    fa[5] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F5);
        horizontaleReiheMarker(1009, 1012, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[5];
  }
  // Mit git ? wechselt man zu einem anderen Branch,"checkout"
  if(o==600+14||o==700+14||o==800+14||o==900+14||o==900+14||o==1000+14||o==1100+14||o==1200+14||o==1300+14)
  {
    fa[6] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F6);
        vertikaleReiheMarker(614, 14, 1314, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[6];
  }

  // ab hier von unter noch oben
  if(o>=1000+2&&o<=1000+7)
  {
    fa[7] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F7);
        horizontaleReiheMarker(1002, 1007, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[7];
  }
  // Fehler in einem Code beheben,"Bugfix"
  if(o>=400+3&&o<=400+7)
  {
    fa[8] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F8);
        horizontaleReiheMarker(403, 407, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[8];
  }
  // Befehl: Wer hat welchen Commit gemacht,"blame"
  if(o>=200+2&&o<=200+11)
  {
    fa[9] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F9);
        horizontaleReiheMarker(202, 211, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[9];
  }
  // Modell zu einer nicht agilen Softwareentwicklung,"Wasserfall"
  /* 10 */ if(o==900+16||o==1000+16||o==1100+16||o==1200+16||o==1300+16||o==1400+16||o==1500+16||o==1600+16||o==1700+16)
  {
    fa[10] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F10);
        vertikaleReiheMarker(916, 16, 1716, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[10];
  }
  // Das Vorgehen bei agiler Softwareentwicklung,"Iterativ"
  if(o>=1200+9&&o<=1200+14)
  {
    fa[11] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F11);
        horizontaleReiheMarker(1209, 1214, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[11];
  }
  // Anderes Wort fuer "Iteration",Sprint"
  if(o==400+9||o==500+9||o==600+9||o==700+9||o==800+9)
  {
    fa[12] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F12);
        vertikaleReiheMarker(409, 9, 809, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[12];
  }
  // Der Product ? ist verantwortlich fuer den Product Backlog,"Owner"
  if(o==1000+9||o==1100+9||o==1200+9||o==1300+9||o==1400+9||o==1500+9)
  {
    fa[13] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F13);
        vertikaleReiheMarker(1009, 9, 1509, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[13];
  }
  // Der Scrum ? sorgt dafuer das Scrum richtig durchgesetzt wird,"Master"
  if(o==1400+11||o==1500+11||o==1600+11||o==1700+11||o==1800+11||o==1900+11||o==2000+11)
  {
    fa[14] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F14);
        vertikaleReiheMarker(1411, 11, 2011, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[14];
  }
  // Die taegliche Besprechung in Scrum "Daily ?",Standup"
  if(o>=500+12&&o<=500+18)
  {
    fa[15] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F15);
        horizontaleReiheMarker(512, 518, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[15];
  }
  // Liste von Dingen um das Produkt zu verbessern "Product ?","Backlog"
  if(o==300+17||o==400+17||o==500+17||o==600+17||o==700+17||o==800+17||o==900+17)
  {
    fa[16] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F16);
        vertikaleReiheMarker(317, 17, 917, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[16];
  }
  // Idee von Kent Beck "User ?","Stories"
  if(o>=1700+9&&o<=1700+14)
  {
    fa[17] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F17);
        horizontaleReiheMarker(1709, 1714, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[17];
  }
  // Visualisierung und Beseitigung von Engpaessen ist die Kernidee von ?,"Kanban"
  if(o==400+4||o==500+4||o==600+4||o==700+4||o==800+4||o==900+4||o==1000+4)
  {
    fa[18] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F18);
        vertikaleReiheMarker(404, 4, 1004, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[18];
  }
  // Eine statische Analyse des Quellcodes um Probleme zu entdecken,"Linting"

  if(o==600+6||o==700+6||o==800+6||o==900+6||o==1000+6||o==1100+6||o==1200+6||o==1300+6||o==1400+6||o==1500+6||o==1600+6||o==1700+6||o==1800+6||o==1900+6||o==2000+6)
  {
    fa[19] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F19);
        vertikaleReiheMarker(606, 6, 2006, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[19];
  }
  // Aktuelles Arbeitsverzeichnis,"Working Directory"

  if(o>=700+2&&o<=700+14)
  {
    fa[20] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Mittel.fragefeld.setText(F20);
        horizontaleReiheMarker(702, 714, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Mittel.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[20];
  }
  // Letztes Meeting im Sprint "Sprint ?",Retrospective"

  return null;

  }

  static String[][] Schwerfragen = new String[30][2];
  static String[] Schwervalues;
  public static String[][] getCSVSchwerFragen() {

    line = "";
    int counter = 0;
    try {
      BufferedReader br = new BufferedReader(
          new FileReader("..\\DevOps Kreuzwortraetzel\\src\\database\\SchwerFragen.csv"));
      while ((line = br.readLine()) != null) {
        Schwervalues = line.split(",");
        Schwerfragen[counter][0] = " " + counter + ". " + Schwervalues[0];
        counter++;
        System.out.println(counter);
        System.out.println(Schwervalues[0]);
        System.out.println(Schwerfragen[counter][0]);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return Schwerfragen;
  }

  static String[][] SchwerFragen = getCSVSchwerFragen();

  public static FocusAdapter fragenSchwer(int o) {
    System.out.println("Reached");
    FocusAdapter[] fa = new FocusAdapter[21];
    final String F1 = Schwerfragen[1][0];
    final String F2 = Schwerfragen[2][0];
    final String F3 = Schwerfragen[3][0];
    final String F4 = Schwerfragen[4][0];
    final String F5 = Schwerfragen[5][0];
    final String F6 = Schwerfragen[6][0];
    final String F7 = Schwerfragen[7][0];
    final String F8 = Schwerfragen[8][0];
    final String F9 = Schwerfragen[9][0];
    final String F10 = Schwerfragen[10][0];
    final String F11 = Schwerfragen[11][0];
    final String F12 = Schwerfragen[12][0];
    final String F13 = Schwerfragen[13][0];
    final String F14 = Schwerfragen[14][0];
    final String F15 = Schwerfragen[15][0];
    final String F16 = Schwerfragen[16][0];
    final String F17 = Schwerfragen[17][0];
    final String F18 = Schwerfragen[18][0];
    final String F19 = Schwerfragen[19][0];
    final String F20 = Schwerfragen[20][0];
    final String F21 = Schwerfragen[21][0];

    JTextField[][] tfcopy = Schwer.tf;

    // "Der Inhalt eines Computer-Programms","Code"
    if (o >= 906 && o <= 909) {
      fa[1] = (FocusAdapter) new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
          ;
          Schwer.fragefeld.setText(F1);
          horizontaleReiheMarker(906, 909, Color.yellow, e);
        }

        @Override
        public void focusLost(FocusEvent e) {
          Schwer.fragefeld.setText("");
          resetColor();
        }
      };
      return fa[1];
    }
    // "Eine valide Möglichkeit Code Qualität zu bestimmen","Wtfs/Minute"
    if (o >= 703 && o <= 714) {
      fa[2] = (FocusAdapter) new FocusAdapter() {

  @Override
  public void focusGained(FocusEvent e) {
    Schwer.fragefeld.setText(F2);
    horizontaleReiheMarker(703, 714, Color.yellow, e);
  }

  @Override
        public void focusLost(FocusEvent e) {
          Schwer.fragefeld.setText("");
          resetColor();
        }
      };
      return fa[2];
    }
    // "Eine spezielle Funktion eine Software","Feature"
    if (o == 100 + 14 || o == 200 + 14 || o == 300 + 14 || o == 400 + 14 || o == 500 + 14
        || o == 500 + 14 || o == 600 + 14) {
      fa[3] = (FocusAdapter) new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
          Schwer.fragefeld.setText(F3);
          vertikaleReiheMarker(114, 14, 714, Color.yellow, e);
        }

        @Override
        public void focusLost(FocusEvent e) {
          Schwer.fragefeld.setText("");
          resetColor();
        }
      };
      return fa[3];
    }
  // "Wie bezeichnet man einen Code der gut geschrieben ist?","Clean"
  if(o==1000+6||o==1100+6||o==1200+6||o==1300+6)

  {
    fa[4] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F4);
        vertikaleReiheMarker(906, 6, 1306, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[4];
  }
  // "Wichtig in der Programmierung dass jeder Mensch bekommen hat","Namen"
  if(o==0+16||o==100+16||o==200+16||o==300+16||o==400+16)
  {
    fa[5] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F5);
        vertikaleReiheMarker(16, 16, 416, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[5];
  }
  // "Ein Unterprogramm in der objektorientierten Programmierung","Methode"
  if(o>=1608&&o<=1615)
  {
    fa[6] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F6);
        horizontaleReiheMarker(1608, 1615, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[6];
  }

  // ab hier von unter noch oben
  if(o==1600+13||o==1700+13||o==1800+13)
  {
    fa[7] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F7);
        vertikaleReiheMarker(1613, 13, 1813, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[7];
  }
  // "Häufiger Fehler, der durch Copy+Paste ausgelöst werden kann","DRY"
  if(o==500+9||o==600+9||o==700+9||o==800+9||o==900+9||o==1000+9||o==1100+9||o==1200+9||o==1300+9)
  {
    fa[8] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F8);
        vertikaleReiheMarker(509, 9, 1309, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[8];
  }
  // "Eine Erklärung im Code eines Programmes","Kommentar"
  if(o>=1102&&o<=1106)
  {
    fa[9] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F9);
        horizontaleReiheMarker(1102, 1106, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[9];
  }
  // "Ein besonderer Kommentar neben TODO","FIXME"
  /* 10 */ if(o==900+14||o==1000+14||o==1100+14||o==1200+14||o==1300+14||o==1400+14||o==1500+14||o==1600+14)
  {
    fa[10] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F10);
        vertikaleReiheMarker(914, 14, 1614, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[10];
  }
  // "Ein Platzhalter für eine Grö0ße die einem Rechenprozess Auftritt","Variable"
  if(o>=311&&o<=317)
  {
    fa[11] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F11);
        horizontaleReiheMarker(311, 317, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[11];
  }
  // "Eine neue Version einer Software","Update"
  if(o>=15&&o<=18)
  {
    fa[12] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F12);
        horizontaleReiheMarker(15, 18, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[12];
  }
  // "Wie nennt man den Test, wo Einzelteile eines Programmes getestet
  // werden?","Unit"
  if(o>=1109&&o<=1111)
  {
    fa[13] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F13);
        horizontaleReiheMarker(1109, 1111, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[13];
  }
  // "Welche Endung braucht eine Textdatei","Txt"
  if(o==300+5||o==400+5||o==500+5||o==600+5||o==700+5)
  {
    fa[14] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F14);
        vertikaleReiheMarker(305, 5, 705, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[14];
  }
  // "Das Satzzeichen womit Dateien in git ignoriert werden","Punkt"
  if(o>=1211&&o<=1215)
  {
    fa[15] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F15);
        horizontaleReiheMarker(1211, 1215, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[15];
  }
  // "Wenn man sich bei einer Website anmelden möchte","Log in"
  if(o==900+11||o==1000+11||o==1100+11||o==1200+11||o==1300+11||o==1400+11)
  {
    fa[16] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F16);
        vertikaleReiheMarker(911, 11, 1411, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[16];
  }
  // "Die Hochschul Fulda version von GitHub","GitLab"
  if(o==3||o==100+3||o==200+3||o==300+3||o==400+3||o==500+3)
  {
    fa[17] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F17);
        vertikaleReiheMarker(3, 3, 503, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[17];
  }
  // "In Git werden neue Features in einem neuen ? entwickelt","Branch"
  if(o>=509&&o<=512)
  {
    fa[18] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F18);
        horizontaleReiheMarker(509, 512, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[18];
  }
  // "Ein Prinzip um ein Problem möglichst einfach tu Lösen","KISS"

  if(o>=402&&o<=406)
  {
    fa[19] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Schwer.fragefeld.setText(F19);
        horizontaleReiheMarker(402, 406, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Schwer.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[19];
  }
  // "Das bekannteste Rahmenwerk der Agilen Softwareentwicklung","Scrum"

  return null;

  }

  static String einfachline = "";
  static String[][] einfachfragen = new String[30][2];
  static String[] einfachvalues;

  public static String[][] geteinfachCSVFragen() {

    int counter = 0;
    try {
      BufferedReader br = new BufferedReader(
          new FileReader("..\\DevOps Kreuzwortraetzel\\src\\database\\einfacheFragen.csv"));
      while ((einfachline = br.readLine()) != null) {
        einfachvalues = einfachline.split(",");
        einfachfragen[counter][0] = " " + counter + ". " + einfachvalues[0];
        counter++;
        System.out.println(counter);
        System.out.println(einfachvalues[0]);
        System.out.println(einfachfragen[counter][0]);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return einfachfragen;
  }

  static String[][] einfachFragen = geteinfachCSVFragen();

  public static FocusAdapter fragenEinfach(int o) {
    System.out.println("Reached");
    FocusAdapter[] fa = new FocusAdapter[21];
    final String F1 = einfachfragen[1][0];
    final String F2 = einfachfragen[2][0];
    final String F3 = einfachfragen[3][0];
    final String F4 = einfachfragen[4][0];
    final String F5 = einfachfragen[5][0];
    final String F6 = einfachfragen[6][0];
    final String F7 = einfachfragen[7][0];
    final String F8 = einfachfragen[8][0];
    final String F9 = einfachfragen[9][0];
    final String F10 = einfachfragen[10][0];
    final String F11 = einfachfragen[11][0];
    final String F12 = einfachfragen[12][0];
    final String F13 = einfachfragen[13][0];
    final String F14 = einfachfragen[14][0];
    final String F15 = einfachfragen[15][0];
    final String F16 = einfachfragen[16][0];
    final String F17 = einfachfragen[17][0];
    final String F18 = einfachfragen[18][0];
    final String F19 = einfachfragen[19][0];

    // Wie heisst das Team dass das Spiel erstellt hat?,"Star" (>=3&&<=9)
    if (o == 1600 + 9 || o == 1700 + 9 || o == 1800 + 9 || o == 1900 + 9) {
      fa[1] = (FocusAdapter) new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
          System.out.println(F1);
          Einfach.fragefeld.setText(F1);
          vertikaleReiheMarker(1609, 9, 1909, Color.yellow, e);
        }

        @Override
        public void focusLost(FocusEvent e) {
          Einfach.fragefeld.setText("");
          resetColor();

        }
      };
      return fa[1];
    }
    // Wie heisst Herr Storch mit Vornamen?,"Raphael"
    if (o >= 405 && o <= 411) {
      fa[2] = (FocusAdapter) new FocusAdapter() {

  @Override
  public void focusGained(FocusEvent e) {
    Einfach.fragefeld.setText(F2);
    horizontaleReiheMarker(405, 411, Color.yellow, e);

  }

  @Override
        public void focusLost(FocusEvent e) {
          Einfach.fragefeld.setText("");
          resetColor();
        }
      };
      return fa[2];
    }
    // Wie heisst Gufran mit Nachnamen?,"Oezmert"
    if (o == 700 + 12 || o == 800 + 12 || o == 900 + 12 || o == 1000 + 12 || o == 1100 + 12
        || o == 1200 + 12 || o == 1300 + 12) {
      fa[3] = (FocusAdapter) new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
          Einfach.fragefeld.setText(F3);
          vertikaleReiheMarker(712, 12, 1312, Color.yellow, e);
        }

        @Override
        public void focusLost(FocusEvent e) {
          Einfach.fragefeld.setText("");
          resetColor();
        }
      };
      return fa[3];
    }
  // Wie lautet der Doppelname von Herrn Voth,"Viktor"
  if(o>=1904&&o<=1909)

  {
    fa[4] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F4);
        horizontaleReiheMarker(1904, 1909, Color.yellow, e);

      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();

      }
    };
    return fa[4];
  }
  // Was brauchte ein Eintrag pro Vorlesung?,"Tagebuch"
  if(o==200+10||o==300+10||o==400+10||o==500+10||o==600+10||o==700+10||o==800+10||o==100+10)
  {
    fa[5] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F5);
        vertikaleReiheMarker(110, 10, 810, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[5];
  }
  // Multiple-Choice ?,"Test"
  if(o==800+1||o==900+1||o==1000+1||o==1100+1)
  {
    fa[6] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F6);
        vertikaleReiheMarker(801, 1, 1101, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[6];
  }

  // VIM: Command Mode Visual Mode und ? Mode,"Insert"
  if(o==5||o==100+5||o==200+5||o==300+5||o==400+5||o==500+5)
  {
    fa[7] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F7);
        vertikaleReiheMarker(5, 5, 505, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[7];
  }
  // VCS=Version Control ?,"System"
  if(o>=107&&o<=112)
  {
    fa[8] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F8);
        horizontaleReiheMarker(107, 112, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[8];
  }
  // Initiert wurde Git von Linus ?,"Torvalds"
  if(o>=1101&&o<=1108)
  {
    fa[9] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F9);
        horizontaleReiheMarker(1101, 1108, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[9];
  }
  // Neues Repository in Git anlegen:git ?,"init"
  /* 10 */ if(o>=502&&o<=505)
  {
    fa[10] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F10);
        horizontaleReiheMarker(502, 505, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[10];
  }
  // Bestehendes Repository in git klonen:git ?,"clone"
  if(o>=301&&o<=305)
  {
    fa[11] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F11);
        horizontaleReiheMarker(301, 305, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[11];
  }
  // Holt alle Aenderungen vom Origin:git ?,"fetch"
  if(o==1200+10||o==1300+10||o==1400+10||o==1500+10||o==1600+10)
  {
    fa[12] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F12);
        vertikaleReiheMarker(1210, 10, 1610, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[12];
  }
  // Sendet Aenderungen an entferntes Repository:git ?,"push"
  if(o>=1607&&o<=1610)
  {
    fa[13] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F13);
        horizontaleReiheMarker(1607, 1610, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[13];
  }
  // Datei in git umbennen:git ?,"mv"
  if(o>=1012&&o<=1013)
  {
    fa[14] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F14);
        horizontaleReiheMarker(1012, 1013, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[14];
  }
  // Uebersicht aller Daten die noch nicht in git gestaged wurden:git ?,"status"
  if(o>=606&&o<=611)
  {
    fa[15] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F15);
        horizontaleReiheMarker(606, 611, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[15];
  }
  // Mit welcher Frucht kann man einzelne Commits in git
  // einfuegen(englisch)","cherry"
  if(o==700+3||o==800+3||o==900+3||o==1000+3||o==1100+3||o==1200+3)
  {
    fa[16] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F16);
        vertikaleReiheMarker(703, 3, 1203, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[16];
  }
  // Letzter Commit in Git wird Rueckgaengig gemacht:git ?","revert"
  if(o>=1307&&o<=1312)
  {
    fa[17] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F17);
        horizontaleReiheMarker(1307, 1312, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[17];
  }
  // Die drei Stufen von Git Reset:Mixed Soft und ?,"hard"
  if(o==1000+5||o==1100+5||o==1200+5||o==1300+5)
  {
    fa[18] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F18);
        vertikaleReiheMarker(1005, 5, 1305, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[18];
  }
  // Was funktioniert bei den meisten Wissenarbeitern nicht,"Hierachien"

  if(o>=803&&o<=813)
  {
    fa[19] = (FocusAdapter) new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        Einfach.fragefeld.setText(F19);
        horizontaleReiheMarker(803, 813, Color.yellow, e);
      }

      @Override
      public void focusLost(FocusEvent e) {
        Einfach.fragefeld.setText("");
        resetColor();
      }
    };
    return fa[19];
  }

  return null;

  }

  static Color vorFarbe = Color.white;
  static int anfangszwischenspeicher = 0;
  static int endezwischenspeicher = 0;
  static int spaltezwischenspeicher = 0;
  static FocusEvent focuszwischenspeicher;
  static JTextField[][] tfzwischenspeicher = Mittel.tf;

  static void findDifficulty(FocusEvent e) {
    for (int x = 1; x <= 19; x++) {
      for (int y = 1; y < 20; y++) {
        if (e.getSource().equals(Einfach.tf[x][y])) {
          System.out.println("Einfach found");
          tfzwischenspeicher = Einfach.tf;
          return;
        }
        if (e.getSource().equals(Mittel.tf[x][y])) {
          System.out.println("Mittel found");
          tfzwischenspeicher = Mittel.tf;
          return;
        }
        if (e.getSource().equals(Schwer.tf[x][y])) {
          System.out.println("Schwer found");
          tfzwischenspeicher = Schwer.tf;
          return;
        }
      }
    }
  }

  static int findtf(FocusEvent e) {
    for (int x = 0; x <= 19; x++) {
      for (int y = 0; y < 20; y++) {
        if (e.getSource().equals(Einfach.tf[x][y])) {
          System.out.println("Einfach found");
          tfzwischenspeicher = Einfach.tf;
          return x * 100 + y - 1;
        }
        if (e.getSource().equals(Mittel.tf[x][y])) {
          System.out.println("Mittel found");
          tfzwischenspeicher = Mittel.tf;
          return x * 100 + y - 1;
        }
        if (e.getSource().equals(Schwer.tf[x][y])) {
          System.out.println("Schwer found");
          tfzwischenspeicher = Schwer.tf;
          return x * 100 + y - 1;
        }
      }
    }
    return 0;
  }

  static void resetColor() {
    if (spaltezwischenspeicher == -1) {
      if (vorFarbe.equals(Color.yellow))
        vorFarbe = Color.white;
      horizontaleReiheMarker(anfangszwischenspeicher, endezwischenspeicher, vorFarbe,
          focuszwischenspeicher);
    } else {
      vertikaleReiheMarker(anfangszwischenspeicher, spaltezwischenspeicher, endezwischenspeicher,
          vorFarbe, focuszwischenspeicher);
    }
  }

  static int zwa = 0;
  static int zwb = 0;
  static JTextField anfangseventholder = new JTextField();
  static int[] d = new int[20];
  static int countingstar = 0;
  static Component comp;

  static void horizontaleReiheMarker(int anfang, int ende, Color farbe, FocusEvent e) {
    anfangszwischenspeicher = anfang;
    endezwischenspeicher = ende;
    spaltezwischenspeicher = -1;
    findDifficulty(e);

    for (; anfang <= ende; anfang++) {
      if (vorFarbe.equals(tfzwischenspeicher[anfang / 100][anfang % 100 - 1].getBackground())) {
      } else {
        vorFarbe = tfzwischenspeicher[anfang / 100][anfang % 100 - 1].getBackground();
      }

      tfzwischenspeicher[anfang / 100][(anfang % 100) - 1].setBackground(farbe);
    }
  }

  static void vertikaleReiheMarker(int anfang, int spalte, int ende, Color farbe, FocusEvent e) {
    anfangszwischenspeicher = anfang;
    if (zwa == anfang || zwb == anfang)
      return;
    if (zwb == ende || zwa == ende)
      return;

    countingstar = 0;
    anfangszwischenspeicher = anfang;
    endezwischenspeicher = ende;
    spaltezwischenspeicher = spalte;
    focuszwischenspeicher = e;
    final int spaltenzw = spalte - 1;
    findDifficulty(e);
    for (; anfang <= ende; anfang = anfang + 100) {
      if (findtf(e) == (anfang / 100) * spalte - 1) {
        return;
      }
      if (findtf(e) == anfang / 100) {
        return;
      }
      if (vorFarbe.equals(tfzwischenspeicher[anfang / 100][spalte - 1].getBackground())) {
      } else {
        vorFarbe = tfzwischenspeicher[anfang / 100][spalte - 1].getBackground();
      }
      tfzwischenspeicher[anfang / 100][spaltenzw].setBackground(farbe);
    }
  }
}