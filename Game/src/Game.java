import javax.swing.JOptionPane;
import java.util.Random;

//main class
public class Game {
	static int randNum;
	static Random rand = new Random();
	public static void main(String[] args) {
				

		int path = 0;
		path = JOptionPane.showInputDialog("Do you venture to the right, or brave the left?").toLowerCase().charAt(0);
		Player me = new Player();
		
	/*	Room[] rooms = new Room[30];
		
		for (int i = 0; i < rooms.length; i++)
		{
			rooms[i] = new Room();
		}
		
		do 
		{
			
		} while (me.getHP() > 0);
		*/
	}

}
