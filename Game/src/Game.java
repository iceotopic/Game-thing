import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

//main class
public class Game {
	static int randNum;
	static Random rand = new Random();
	public static void main(String[] args) { 
	
		
		Player me = new Player();
		/*
		int path = 0;
		path = JOptionPane.showInputDialog("Would you like to buy something or journey into the unknown?").toLowerCase().charAt(0);
		*/
		{
		
		}
		Room[] rooms = new Room[70];
		
		for (int i = 0; i < rooms.length; i++)
		{
			rooms[i] = new Room();
		}
		
		do 
		{
			
		} while (me.getHP() > 0);
		
	
	}
}
