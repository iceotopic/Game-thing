//main class
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
