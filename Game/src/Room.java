import java.util.Random;
public class Room 

{
	Enemy e1;
	Treasure t1;
	Random rand = new Random();
	
	public Room() {
	
	int randNum = rand.nextInt(30);
	if (randNum<=20)
	{
		t1 = new Treasure();
	}
	else if(randNum>=21)
	{
		e1= new Enemy();
	}
}
	public void runRoom()
	{
		System.out.println("You're in a room with a " + t1.toString() + " and  a " + e1);
	}
}

