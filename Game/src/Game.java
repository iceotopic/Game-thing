import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

//main class
public class Game {
	static int randNum;
	static Random rand = new Random();
	public static int roomNum = 0;
	public static Room[] rooms = new Room[999];
	
	public static void main(String[] args) { 
	
		Player me = new Player();
		
		
		for (int i = 0; i < rooms.length; i++)
		{
			rooms[i] = new Room();
		}
		
		do 
		{
			
		} while (me.getHP() > 0);
		
	rooms[roomNum].runRoom();
		
	}
}
