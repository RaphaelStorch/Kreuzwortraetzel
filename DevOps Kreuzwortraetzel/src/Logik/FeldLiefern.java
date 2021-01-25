package Logik;

public class FeldLiefern {
	public static String[] Feld=new String[10];
	//public static char[][] pos = new char[10][10]; 
//	private int x = 0; 
//	private int y = 0; 
	
	FeldLiefern(){}
	
//	public void setPos(int x, int y, char c) {
//		this.x=x; 
//		this.y=y; 
//		pos[x][y] = c;  
//	}
//	
	
	public static String[] getFeld() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				Feld[i] = Feld[i] + "| " + "X" + " ";
		}
		return Feld;
	}
	

	static void paintFeld() {
		System.out.println(getFeld());
	}
}
