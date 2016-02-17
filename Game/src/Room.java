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
		System.out.println("Who dares!?"); //move to class
		e1 = new Enemy();
	}
	else if(randNum>=10)
	{
		System.out.println("Well when life gives you lemons!"); //move to class
		t1= new Treasure();
	}
}
}

