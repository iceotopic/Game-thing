import javax.swing.JOptionPane;
import java.util.Random;

//main class
public class Game {
	static int randNum;
	static Random rand = new Random();
	public static void main(String[] args) {

	randNum = rand.nextInt(30);
		if (randNum<=20)
		{
			System.out.println("Who dares!?");
			e1 = new Enemy();
			t1 = null;
		}
		else if (randNum>=10)
		{
			System.out.println("I'm a treasure");
		}
		else 
			
				
int path = 0;
path = JOptionPane.showInputDialog("Are you male or female?").toLowerCase().charAt(0);
		Player me = new Player();
		
		Room[] rooms = new Room[30];
		
		for (int i = 0; i < rooms.length; i++)
		{
			rooms[i] = new Room();
		}
		
		do 
		{
			
		} while (me.getHP() > 0);
	}

}
