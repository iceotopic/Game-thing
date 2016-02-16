import java.util.Random;
public class Room 

{
	Enemy e1;
	Treasure t1;
	
	public Room() {
	
	int randNum = rand.nextInt(30);
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
	{
		System.out.println();
	}

}
}
