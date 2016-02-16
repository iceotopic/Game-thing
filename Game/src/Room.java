
public class Room {
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
		System.out.println("well when life gives you lemons");
}
}
