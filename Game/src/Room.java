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
		e1 = new Enemy();
	}
	else if(randNum>=10)
	{
		t1= new Treasure();
	}
}
}

